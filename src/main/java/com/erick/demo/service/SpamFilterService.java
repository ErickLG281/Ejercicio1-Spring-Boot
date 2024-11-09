package com.erick.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpamFilterService {

    private final List<String> spamDomains = List.of(
            "spam.com",
            "phishing.com",
            "malware.com"
            // Añade aquí más dominios de spam
    );

    public boolean isSpam(String url) {
        return spamDomains.stream().anyMatch(url::contains);
    }
}
