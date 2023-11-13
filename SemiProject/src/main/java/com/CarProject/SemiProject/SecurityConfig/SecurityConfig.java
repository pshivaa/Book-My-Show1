package com.CarProject.SemiProject.SecurityConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.CarProject.SemiProject.Security.JwtAuthinticationEntryPoint;
import com.CarProject.SemiProject.Security.JwtAuthonticationFilter;
import com.CarProject.SemiProject.dto.CustomUserDetailService;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private JwtAuthinticationEntryPoint jwtAuthinticationEntryPoint;
    @Autowired
    private CustomUserDetailService customUserDetailService;
    @Autowired
    private JwtAuthonticationFilter jwtAuthonticationFilter;
    
    private String []args= {("/api/login"),("/api/StoreCarInfo"),("/api/Register"),
    		("/api/book-now"),("/api/DriverStore"),("/api/finalConfirm"),
    		("/api/cars"),("/api/book-car/{id}"),("/api/drivers"),
    		("/api/ticket-details/{email}"),("/api/driver-hotel")};
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http
              .csrf()
              .disable()
              .authorizeHttpRequests()
              .antMatchers(args)
              .permitAll()
              .anyRequest()
              .authenticated()
              .and()
              .exceptionHandling().authenticationEntryPoint(this.jwtAuthinticationEntryPoint)
              .and()
              .sessionManagement()
              .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
      http.addFilterBefore(this.jwtAuthonticationFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.customUserDetailService).passwordEncoder(passwordEncoder());
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
}

