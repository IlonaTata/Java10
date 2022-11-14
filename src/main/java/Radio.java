public class Radio {
    private int size = 10;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int currentRadioStationNumber=minRadioStationNumber;
    private int soundVolume;
    private int maxSoundVolume;
    private int minSoundVolume;

    public Radio(int size) {
        this.currentRadioStationNumber = minRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxRadioStationNumber = size - 1;

    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber <= minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return this.maxRadioStationNumber;
    }
    public int getMinRadioStationNumber() {
        return this.minRadioStationNumber;
    }
    public int nextStation() {
        if (currentRadioStationNumber >= maxRadioStationNumber) {
            return minRadioStationNumber;
        }
        return currentRadioStationNumber = currentRadioStationNumber + 1;
    }

    public int prevStation() {
        if (currentRadioStationNumber <= minRadioStationNumber) {
            return maxRadioStationNumber;
        }
        return currentRadioStationNumber = currentRadioStationNumber - 1;
    }
    public Radio() {
        this.currentRadioStationNumber = this.minRadioStationNumber;
        this.minRadioStationNumber = this.minRadioStationNumber;
        this.maxRadioStationNumber = this.maxRadioStationNumber;
        this.currentRadioStationNumber = this.minRadioStationNumber;
        this.size = this.size;
    }

    public int getMaxRadioAmount() {
        return maxRadioStationNumber = maxRadioStationNumber + 1;
    }


    public Radio(int minSoundVolume, int maxSoundVolume) {
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.soundVolume = minSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void increaseVolumeMoreMax() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = maxSoundVolume;
        }
    }

    public void increaseVolumeMoreMin() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = minSoundVolume;
        }
    }
}



