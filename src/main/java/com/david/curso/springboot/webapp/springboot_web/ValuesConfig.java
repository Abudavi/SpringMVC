package com.david.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:values.properties") // configuracion para que agarre la configuracion perzonalizada
})
public class ValuesConfig {

}
