package com.example.springbootdemo.services.items;

import com.example.springbootdemo.bean.ItemParams;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ItemServices {

    public Map<String, Object> getItemJoinTrigger(ItemParams itemParams) {

        return Maps.newHashMap();
    }
}
