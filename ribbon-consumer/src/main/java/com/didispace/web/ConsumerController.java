package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "ribbon-consumer2",method  =RequestMethod.GET)
    public  String helloConsumer2(){
        System.out.println("ConsumerController#helloConsumer2()");
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

}