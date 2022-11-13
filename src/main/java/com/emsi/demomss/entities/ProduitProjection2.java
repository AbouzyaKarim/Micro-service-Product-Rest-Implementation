package com.emsi.demomss.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "web", types = Produit.class)
public interface ProduitProjection2 {
    String getName();

    double getPrice();
}
