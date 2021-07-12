package com.helltf.TBBackend.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHANNELS")
public class Channel {
    @Id
    @Column(name = "ID")
    public int id;

    @Column(name = "CHANNEL_NAME")
    public String name;

    @Column(name = "ALLOWED")
    public int allowed;

    @Column(name = "TIMES_CONNECTED")
    public int timesConnected;

    @Column(name = "CURR_CONNECTED")
    public int currConnected;

    @Column(name = "FIRST_CONNECTED")
    public int firstConnected;

    @Column(name = "ALLOWED_LIVE")
    public int allowedLive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAllowed() {
        return allowed;
    }

    public void setAllowed(int allowed) {
        this.allowed = allowed;
    }

    public int getTimesConnected() {
        return timesConnected;
    }

    public void setTimesConnected(int timesConnected) {
        this.timesConnected = timesConnected;
    }

    public int getCurrConnected() {
        return currConnected;
    }

    public void setCurrConnected(int currConnected) {
        this.currConnected = currConnected;
    }

    public int getFirstConnected() {
        return firstConnected;
    }

    public void setFirstConnected(int firstConnected) {
        this.firstConnected = firstConnected;
    }

    public int getAllowedLive() {
        return allowedLive;
    }

    public void setAllowedLive(int allowedLive) {
        this.allowedLive = allowedLive;
    }
}
