package com.campusdual.classroom;

public class TVRemote {
    public Boolean on = false;
    public Integer channel = 0;
    public Integer volume = 0;

    private String color;


    public TVRemote(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    void turnOn() {
        this.on = true;
    }

    void turnOff() {
        this.on = false;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        if (this.channel > 0) {
            this.channel--;
        }
    }

    void volumeUp() {
        this.volume++;
    }

    void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }
}
