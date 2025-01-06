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
@RequestMapping("/service2")
public class Service2Controller {

    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(Service2Controller.class);

    @Value("${service.3.url}")
    private String serviceCUrl;

    public Service2Controller(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/process")
    public String processRequest() {
        logger.info("Service-2 received request");
        String response = restTemplate.getForObject(serviceCUrl + "/service3/process", String.class);
        logger.info("Service-2 received response from Service-3: {}", response);
        return "Service-2 -> " + response;
    }
}
