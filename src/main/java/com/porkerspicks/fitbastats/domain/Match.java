package com.porkerspicks.fitbastats.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Match  extends AbstractEntity {

    private Date kickOffTime;

    @OneToOne
    private Performance homeTeamPerformance;

    @OneToOne
    private Performance awayTeamPerformance;

    @OneToMany
    private List<Odds> odds;

    @ManyToOne
    private League league;

    @OneToMany(fetch= FetchType.EAGER)
    private List<MatchEvent> events;

    public Date getKickOffTime() {
        return kickOffTime;
    }

    public void setKickOffTime(Date kickOffTime) {
        this.kickOffTime = kickOffTime;
    }

    public Performance getHomeTeamPerformance() {
        return homeTeamPerformance;
    }

    public void setHomeTeamPerformance(Performance homeTeamPerformance) {
        this.homeTeamPerformance = homeTeamPerformance;
    }

    public Performance getAwayTeamPerformance() {
        return awayTeamPerformance;
    }

    public void setAwayTeamPerformance(Performance awayTeamPerformance) {
        this.awayTeamPerformance = awayTeamPerformance;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public List<MatchEvent> getEvents() {
        return events;
    }

    public void setEvents(List<MatchEvent> events) {
        this.events = events;
    }

    public List<Odds> getOdds() {
        return odds;
    }

    public void setOdds(List<Odds> odds) {
        this.odds = odds;
    }
}
