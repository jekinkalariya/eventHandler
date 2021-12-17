package com.eventHandler.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.stereotype.Service;

@Service
public class EventHandlerService {

    private static final Logger LOGGER = LogManager.getLogger(EventHandlerService.class.getName());
    public String payLoadProcess(JSONArray object){

        System.out.println("PayLoad: "+object.toString());
        LOGGER.info(object.toString());
        return object.toString();
    }
}
