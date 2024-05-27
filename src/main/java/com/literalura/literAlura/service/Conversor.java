package com.literalura.literAlura.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class Conversor {

    private ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            throw new RuntimeException("Error converting JSON to object", e);
        }
    }
}
