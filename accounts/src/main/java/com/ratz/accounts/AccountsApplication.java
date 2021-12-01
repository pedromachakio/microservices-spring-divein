package com.ratz.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
// passar a expor um endpoint do actuator /refresh que vai invocar as propriedades que foram mudadas para que estas
// sejam atualizadas sem ser preciso dar restart ao server (nao esquecer de mudar app.properties com management.endpoints.web.exposure.include=*)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
