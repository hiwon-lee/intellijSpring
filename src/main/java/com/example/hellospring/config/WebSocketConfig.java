package com.example.hellospring.config;

import lombok.RequiredArgsConstructor;

import com.example.hellospring.controller.MyWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import java.security.Security;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketConfigurer {
   @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests().anyRequest("/").permitAll();

   }
}