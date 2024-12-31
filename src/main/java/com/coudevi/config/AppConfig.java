package com.coudevi.config;

import com.coudevi.services.PedidosService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PedidosService pedidosService(){
        return new PedidosService();
    }
}
