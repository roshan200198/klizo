package com.app.klizo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter{

}
