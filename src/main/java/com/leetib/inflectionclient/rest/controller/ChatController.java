package com.leetib.inflectionclient.rest.controller;

import com.leetib.inflectionclient.rest.dto.chatstart.StartResponse;
import com.leetib.inflectionclient.rest.dto.common.BizResult;
import com.leetib.inflectionclient.rest.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author KongXiao
 * @date 2023-07-12 12:35
 */
@RestController
public class ChatController {

    @Resource
    private ChatService chatService;

    @PostMapping("/chat/start")
    public BizResult<StartResponse> startChat() {
        return BizResult.success(chatService.startChat());
    }
}
