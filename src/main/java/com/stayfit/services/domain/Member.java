package com.stayfit.services.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Member extends User {
    @ManyToOne
    private Goal goal;

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}
