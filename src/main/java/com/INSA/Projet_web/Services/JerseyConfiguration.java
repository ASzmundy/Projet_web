package com.INSA.Projet_web.Services;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;


@Component
@ApplicationPath("rest")
@Configuration
@EnableJpaRepositories
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration(){
        register(UserResource.class);
        register(ApprenticeResource.class);
        register(LanguageResource.class);
        register(AppCriteriaResource.class);
        register(CompanyRessource.class);
        register(RecruitCriteriaResource.class);
        register(RecruiterResource.class);
    }
}
