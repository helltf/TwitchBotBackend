package com.helltf.TBBackend.Entities;

import javax.persistence.*;
import java.sql.Types;

@Entity
@Table(name = "CHANNELS")
public class Channel {
    @Id
    @Column(name = "ID")
    public int id;

    @Column(name = "CHANNEL_NAME")
    public String name;

    @Column(name = "ALLOWED")
    public byte allowed;

    @Column(name = "TIMES_CONNECTED")
    public int timesConnected;

    @Column(name = "CURR_CONNECTED")
    public byte currConnected;

    @Column(name = "FIRST_CONNECTED")
    public Long firstConnected;

    @Column(name = "ALLOWED_LIVE")
    public byte allowedLive;

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

    public void setAllowed(byte allowed) {
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

    public void setCurrConnected(byte currConnected) {
        this.currConnected = currConnected;
    }

    public Long getFirstConnected() {
        return firstConnected;
    }

    public void setFirstConnected(Long firstConnected) {
        this.firstConnected = firstConnected;
    }

    public int getAllowedLive() {
        return allowedLive;
    }

    public void setAllowedLive(byte allowedLive) {
        this.allowedLive = allowedLive;
    }
}
