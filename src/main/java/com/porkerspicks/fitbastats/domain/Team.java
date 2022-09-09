package com.porkerspicks.fitbastats.domain;

import com.porkerspicks.fitbastats.domain.types.LeagueType;
import com.porkerspicks.fitbastats.domain.types.TeamInfluenceType;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Team  extends AbstractEntity {

    private String name;

    @OneToMany
    private List<TeamInfluence> teamInfluences;

    @OneToMany
    private List<Performance> performances;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }

    public List<TeamInfluence> getTeamInfluences() {
        return teamInfluences;
    }

    public void setTeamInfluences(List<TeamInfluence> teamInfluences) {
        this.teamInfluences = teamInfluences;
    }
}
