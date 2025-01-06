package io.sd.observe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service1")
public class Service1AController {

    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(Service1AController.class);

    @Value("${service.2.url}")
    private String service2Url;

    public Service1AController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/process")
    public String processRequest() {
        logger.info("Service-1 received request");
        String response = restTemplate.getForObject(service2Url + "/service2/process", String.class);
        logger.info("Service-1 received response from Service-2: {}", response);
        return "Service-1 -> " + response;
    }
}