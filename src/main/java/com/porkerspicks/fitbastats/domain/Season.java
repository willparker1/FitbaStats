package com.porkerspicks.fitbastats.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Season extends AbstractEntity {

    private byte startYear;

    @OneToMany
    private List<League> leagues;

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }

    public byte getStartYear() {
        return startYear;
    }

    public void setStartYear(byte startYear) {
        this.startYear = startYear;
    }
}
