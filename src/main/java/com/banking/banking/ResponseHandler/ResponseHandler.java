package com.banking.banking.ResponseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
        public static ResponseEntity<Object> generateResponse( HttpStatus code,String message, Object responseObj) {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("code", code.value());
            map.put("message", message);
            map.put("data", responseObj);



            return new ResponseEntity<Object>(map, code);
        }
    }

