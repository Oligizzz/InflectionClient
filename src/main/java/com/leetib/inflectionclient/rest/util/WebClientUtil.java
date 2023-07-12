package com.leetib.inflectionclient.rest.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * WebClientUtil
 * @author KONGXIAO
 */
public class WebClientUtil {
    public static Mono<String> sendRequest(String url, HttpMethod method, HttpHeaders headers, String cookie) {
        WebClient webClient = WebClient.builder().baseUrl(url).defaultHeaders(httpHeaders -> {
            httpHeaders.addAll(headers);
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.add("Cookie", cookie);
        }).build();

        return webClient.method(method).retrieve().bodyToMono(String.class);
    }
}