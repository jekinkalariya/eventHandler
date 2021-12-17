package com.eventHandler.controller;

import javax.servlet.http.HttpServletRequest;
import com.eventHandler.service.EventHandlerService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class EventHandlerController {

    @Autowired
    public EventHandlerService eventHandlerService;

    @PostMapping("/event")
    public ResponseEntity eventHandler(HttpServletRequest request, @RequestBody String object) throws JSONException {
        //JSONObject object = new JSONObject(request. getHeader("body"));
        eventHandlerService.payLoadProcess(new JSONObject(object));
        return ResponseEntity.status(HttpStatus.OK).body("some body ");
    }

    @GetMapping("/")
    public String eventHandlerTest(){
        return "Current DateTime: "+ Calendar.getInstance().getTime();
    }
}
