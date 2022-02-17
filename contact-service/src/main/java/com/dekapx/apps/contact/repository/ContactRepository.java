package com.dekapx.apps.contact.repository;

import com.dekapx.apps.contact.domain.Contact;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class ContactRepository {
    public Contact save(Contact contact) {
        log.info("Contact created...");
        return contact;
    }
}
