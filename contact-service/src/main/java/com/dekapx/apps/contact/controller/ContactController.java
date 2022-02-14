package com.dekapx.apps.contact.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ContactController {
    @GetMapping(value = "/ping", produces = "application/json")
    public String ping() {
        log.info("PingController.ping() method invoked...");
        return "This URL is active...";
    }
}
