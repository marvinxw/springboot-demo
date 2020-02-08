package com.example.springbootdemo.web;

import com.example.springbootdemo.bean.ItemParams;
import com.example.springbootdemo.common.ApiResponse;
import com.example.springbootdemo.services.items.ItemServices;
import com.example.springbootdemo.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private ItemServices itemServices;

    @RequestMapping(value = "/getItemContent", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ApiResponse authorStatistics(@RequestBody ItemParams itemParams) {
        Map<String, Object> data = itemServices.getItemJoinTrigger(itemParams);
        return ResponseUtil.success(data);
    }
}
