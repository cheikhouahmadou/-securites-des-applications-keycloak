package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    public static final String ADMIN = "admin";
    public static final String USER = "user";
    private final JwtConverter jwtConverter;

    public SecurityConfig(JwtConverter jwtConverter) {
        this.jwtConverter = jwtConverter;
    }
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception{
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET, "/api/produits").permitAll() // GET: public
                        .requestMatchers(HttpMethod.POST, "/api/produits/admin").hasRole(ADMIN)// POST: public
                      //  .requestMatchers(HttpMethod.PUT, "/api/produits/update").hasRole(ADMIN)// POST: public// PUT: restricted
                      // .requestMatchers(HttpMethod.DELETE,"/api/produits/delete").hasRole(ADMIN)// POST: public // DELETE: restricted
                        .anyRequest().authenticated()) // Restrict all other requests
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtConverter )))
                .build();


    }
}
