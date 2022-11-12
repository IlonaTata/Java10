public class Radio {
    private int size = 9;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int currentRadioStationNumber = minRadioStationNumber;
    private int soundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio(int minRadioStationNumber, int maxRadioStationNumber, int size) {
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.currentRadioStationNumber = minRadioStationNumber;
        this.size = size;
    }


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
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

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
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



