package com.demo.fluentd.fluentd.service;

import org.fluentd.logger.FluentLogger;
import org.springframework.stereotype.Component;
import java.util.Map;
@Component
public class FluentdClient {
    private static final FluentLogger logger = FluentLogger.getLogger("myapp", "localhost", 8080);

    public void send(String tag, Map<String, String> data) {
        Map<String, Object> newData = (Map) data;
        logger.log(tag, newData);
    }
}
