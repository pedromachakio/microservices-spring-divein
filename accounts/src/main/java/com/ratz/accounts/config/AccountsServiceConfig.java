package com.ratz.accounts.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
@ToString
public class AccountsServiceConfig {

    // these properties correspond/map to those in the config server that this app will load (https://github.com/pedromachakio/config-microservices-spring-divein)
    // spring automatically converts properties which have hyphens in the name to camel case, as seen here
    private String msg;
    private String buildVersion;
    // key value pair
    private Map<String, String> mailDetails;
    // branches organizados por numero a começar no 0 por isso pode ser uma lista e nao um map
    private List<String> activeBranches;
}
