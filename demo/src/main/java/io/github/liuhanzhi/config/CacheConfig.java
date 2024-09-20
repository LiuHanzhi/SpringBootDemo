package io.github.liuhanzhi.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {
    @Bean
    public KeyGenerator customKeyGenerator() {
        return new CustomKeyGenerator();
    }
}