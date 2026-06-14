package com.amar.treading.config;

import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
    http.sessionManagement (managment -> managemert.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
            .authorizeHttpReqests(Authorizae->Authorizae.requstMatchers())
}
}
