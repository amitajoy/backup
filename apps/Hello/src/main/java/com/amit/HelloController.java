package com.amit;

import com.amit.model.HelloResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping( method = RequestMethod.GET)
    HelloResponse sayHello() {
        HelloResponse resp = new HelloResponse();

        List<String> response = new ArrayList<String>();
        response.add("Hello Amit!");
        response.add("Hello Ajoy!");
        response.add("Hello World!");

        resp.setResponse(response);

        return resp;
    }


}
