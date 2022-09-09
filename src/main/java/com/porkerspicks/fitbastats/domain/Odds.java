package com.porkerspicks.fitbastats.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Odds extends AbstractEntity {

    private float price;
    private Date timestamp;

    @ManyToOne
    private Match match;
}
