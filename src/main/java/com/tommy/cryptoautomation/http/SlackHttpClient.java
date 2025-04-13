package com.tommy.cryptoautomation.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();
            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
