package com.porkerspicks.fitbastats.domain;

import com.porkerspicks.fitbastats.domain.types.LeagueType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class League extends AbstractEntity {

    private LeagueType name;

    @ManyToOne
    private Season season;

    @OneToMany
    private List<Match> matches;

    public LeagueType getName() {
        return name;
    }

    public void setName(LeagueType name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
