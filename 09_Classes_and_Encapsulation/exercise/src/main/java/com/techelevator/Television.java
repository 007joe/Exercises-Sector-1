package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return this.isOn;
    }
    public int getCurrentChannel() {
        return this.currentChannel;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }

    public void changeChannel (int newChannel) {
        if (this.isOn == true) {
            if (newChannel >= 3 && newChannel <= 18) {
                currentChannel = newChannel;
            }
        }
    }

    public void channelUp() {
        if (this.isOn == true) {
            currentChannel++;
            if (currentChannel > 18) {
                currentChannel = 3;
            }
        }
    }

    public void channelDown() {
        if (this.isOn == true) {
            currentChannel--;
            if (currentChannel < 3) {
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if(this.isOn == true) {
            if (currentVolume <= 10) {
               currentVolume++;
            }
        }
    }

    public void lowerVolume() {
        if(this.isOn == true) {
            if(currentVolume > 0) {
                currentVolume--;
            }
        }
    }



}
