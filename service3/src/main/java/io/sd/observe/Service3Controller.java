package io.sd.observe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service3")
public class Service3Controller {

    private static final Logger logger = LoggerFactory.getLogger(Service3Controller.class);

    @GetMapping("/process")
    public String processRequest() {
        logger.info("Service-3 processed request");
        return "Service-3 response";
    }
}
