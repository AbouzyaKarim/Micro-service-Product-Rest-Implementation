package com.emsi.demomss.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Produit.class)
public interface ProduitProjection {
    String getName();

}

