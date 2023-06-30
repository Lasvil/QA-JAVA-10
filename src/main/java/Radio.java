public class Radio {
    // Данные по станциям
    private int numberStation;
    private int volume;

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            newNumberStation = 0;
        }
        if (newNumberStation > 9) {
            newNumberStation = 9;
        }
        numberStation = newNumberStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public int next() {
        numberStation = numberStation + 1;
        if (numberStation > 9) {
            numberStation = 0;
        }
        return numberStation;
    }

    public int prev() {
        numberStation = numberStation - 1;
        if (numberStation < 0) {
            numberStation = 9;
        }
        return numberStation;
    }

    public int plus() {
        volume = volume + 1;
        if (volume > 100) {
            volume = 100;
        }
        return volume;
    }

    public int minus() {
        volume = volume - 1;
        if (volume < 0) {
            volume = 0;
        }
        return volume;
    }
}