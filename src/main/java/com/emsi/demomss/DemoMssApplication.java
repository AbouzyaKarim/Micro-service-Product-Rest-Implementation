package com.emsi.demomss;

import com.emsi.demomss.entities.Produit;
import com.emsi.demomss.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DemoMssApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMssApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProduitRepository produitRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Produit.class);
            produitRepository.save(new Produit(null,"HP",5000,3));
            produitRepository.save(new Produit(null,"DELL",7000,13));
            produitRepository.save(new Produit(null,"Samsung",3500,6));
            produitRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }

}
