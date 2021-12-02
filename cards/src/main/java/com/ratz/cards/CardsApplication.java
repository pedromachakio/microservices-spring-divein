package com.ratz.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
// P.s isto não funciona para todas as propriedades. Se forem propriedades que vêm de uma base de dados, é mesmo
// preciso reiniciar o servidor
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
