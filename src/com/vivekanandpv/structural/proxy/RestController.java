package com.vivekanandpv.structural.proxy;

public class RestController implements Controller {
    @Override
    public String process(String request) {
        return "REST Response: " + request;
    }
}
