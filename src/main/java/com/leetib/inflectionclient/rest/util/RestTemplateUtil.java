package com.leetib.inflectionclient.rest.util;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * RestTemplate
 */
public class RestTemplateUtil {
    public static ResponseEntity<String> sendRequest(String url, HttpMethod method, Map<String, String> map, String cookie) {
        RestTemplate restTemplate = new RestTemplate();


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAll(map);
        JSONObject requestMap = new JSONObject();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String similarJSON = objectMapper.writeValueAsString(requestMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HttpEntity<JSONObject> entity = new HttpEntity<>(requestMap, httpHeaders);
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
        String body = response.getBody();
        return response;

    }
}