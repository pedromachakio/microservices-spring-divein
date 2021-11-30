package com.ratz.loans.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "loans")
// é o prefix com que todas as propriedades começam, check respective config file no link abaixo
// https://github.com/pedromachakio/config-microservices-spring-divein/blob/main/loans.properties
@Getter
@Setter
@ToString
public class LoansServiceConfig {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;
}
