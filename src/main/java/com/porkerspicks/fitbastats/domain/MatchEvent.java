package com.porkerspicks.fitbastats.domain;

import com.porkerspicks.fitbastats.domain.types.MatchEventType;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class MatchEvent extends AbstractEntity {

    private Date time;
    private MatchEventType eventType;
    private boolean homeTeam;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public MatchEventType getEventType() {
        return eventType;
    }

    public void setEventType(MatchEventType eventType) {
        this.eventType = eventType;
    }

    public boolean isHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(boolean homeTeam) {
        this.homeTeam = homeTeam;
    }
}
