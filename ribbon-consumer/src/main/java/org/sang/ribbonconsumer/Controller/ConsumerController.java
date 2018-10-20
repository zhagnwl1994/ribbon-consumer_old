package org.sang.ribbonconsumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String helloController() {
       String str =  restTemplate.getForEntity("Http://HELLO-SERVICE/hello",String.class).getBody();
        System.out.println(str);
       return str;
    }
}
