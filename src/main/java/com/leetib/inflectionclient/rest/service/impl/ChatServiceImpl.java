package com.leetib.inflectionclient.rest.service.impl;

import com.leetib.inflectionclient.rest.dto.chatstart.StartResponse;
import com.leetib.inflectionclient.rest.service.ChatService;
import com.leetib.inflectionclient.rest.util.RestTemplateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KongXiao
 * @date 2023-07-12 13:40
 */
@Service
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final static String ACCEPT = "application/json";
    private final static String X_API_VERSION = "3";
    private final static String REFER = "https://pi.ai/talk?scr";
    private final static String CONTENT_TYPE = "application/json";

    private final static String ACCEPT_LANGUAGE = "zh-CN,zh;q=0.9";

    private final static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36";
    private final static String ORIGIN = "https://pi.ai";

    private final static String URL =  "https://pi.ai/api/chat/start";



    @Override
    public StartResponse startChat() {
        log.debug("ChatServiceImpl.startChat");
        Map<String, String> header = new HashMap<>();
        header.put("method", HttpMethod.POST.name());
        header.put("accept", ACCEPT);
        header.put("refer", REFER);
        header.put("content_type", CONTENT_TYPE);
        header.put("x-api-version", X_API_VERSION);
        header.put("accept-language",ACCEPT_LANGUAGE);
        header.put("user-agent",USER_AGENT);
        header.put("origin",ORIGIN);
        ResponseEntity<String> stringResponseEntity = RestTemplateUtil.sendRequest(URL, HttpMethod.POST, header, null);
        return null;
    }
}
