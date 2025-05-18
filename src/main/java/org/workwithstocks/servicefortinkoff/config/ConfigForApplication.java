package org.workwithstocks.servicefortinkoff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import ru.tinkoff.piapi.core.InvestApi;

@Configuration
public class ConfigForApplication {
    @Bean
    public OpenApi api(){
        return new InvestApi.create();

    }
}
