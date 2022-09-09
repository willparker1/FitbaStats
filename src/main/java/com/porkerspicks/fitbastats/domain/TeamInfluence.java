package com.porkerspicks.fitbastats.domain;

import com.porkerspicks.fitbastats.domain.types.TeamInfluenceType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class TeamInfluence extends AbstractEntity {

    private TeamInfluenceType influenceType;
    private Date timestamp;

    @ManyToOne
    private Team team;

    public TeamInfluenceType getInfluenceType() {
        return influenceType;
    }

    public void setInfluenceType(TeamInfluenceType influenceType) {
        this.influenceType = influenceType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
