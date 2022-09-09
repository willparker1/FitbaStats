package com.porkerspicks.fitbastats.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Performance  extends AbstractEntity {

    private byte goals;
    private byte shotsOnTarget;
    private byte shotsOffTarget;
    private byte shotsBlocked;
    private byte shotsInsideBox;
    private byte shotsOutsideBox;
    private byte fouls;
    private byte corners;
    private byte attemptedPasses;
    private byte successfulPasses;
    private float possession;
    private float xg;

    @ManyToOne
    private Team team;
    @OneToOne(mappedBy = "match")
    private Match match;

    public byte getGoals() {
        return goals;
    }

    public void setGoals(byte goals) {
        this.goals = goals;
    }

    public byte getShotsOnTarget() {
        return shotsOnTarget;
    }

    public void setShotsOnTarget(byte shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    public byte getShotsOffTarget() {
        return shotsOffTarget;
    }

    public void setShotsOffTarget(byte shotsOffTarget) {
        this.shotsOffTarget = shotsOffTarget;
    }

    public byte getShotsBlocked() {
        return shotsBlocked;
    }

    public void setShotsBlocked(byte shotsBlocked) {
        this.shotsBlocked = shotsBlocked;
    }

    public byte getShotsInsideBox() {
        return shotsInsideBox;
    }

    public void setShotsInsideBox(byte shotsInsideBox) {
        this.shotsInsideBox = shotsInsideBox;
    }

    public byte getShotsOutsideBox() {
        return shotsOutsideBox;
    }

    public void setShotsOutsideBox(byte shotsOutsideBox) {
        this.shotsOutsideBox = shotsOutsideBox;
    }

    public byte getFouls() {
        return fouls;
    }

    public void setFouls(byte fouls) {
        this.fouls = fouls;
    }

    public byte getCorners() {
        return corners;
    }

    public void setCorners(byte corners) {
        this.corners = corners;
    }

    public byte getAttemptedPasses() {
        return attemptedPasses;
    }

    public void setAttemptedPasses(byte attemptedPasses) {
        this.attemptedPasses = attemptedPasses;
    }

    public byte getSuccessfulPasses() {
        return successfulPasses;
    }

    public void setSuccessfulPasses(byte successfulPasses) {
        this.successfulPasses = successfulPasses;
    }

    public float getPossession() {
        return possession;
    }

    public void setPossession(float possession) {
        this.possession = possession;
    }

    public float getXg() {
        return xg;
    }

    public void setXg(float xg) {
        this.xg = xg;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
