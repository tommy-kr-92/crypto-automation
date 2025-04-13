package com.tommy.cryptoautomation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tommy.cryptoautomation.http.SlackHttpClient;
import com.tommy.cryptoautomation.http.UpbitHttpClient;
import com.tommy.cryptoautomation.service.UpbitSlackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
//    private final UpbitHttpClient upbitHttpClient;
//    private final SlackHttpClient slackHttpClient;

    private final UpbitSlackService upbitSlackService;

    @GetMapping("/api/v1/ticker/{market}")
    public void test(@PathVariable String market) {
//        upbitHttpClient.getTickerByMarket(market);
//        slackHttpClient.send("hello world");
        upbitSlackService.execute(market);
    }

}

