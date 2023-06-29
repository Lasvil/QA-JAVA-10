public class Radio {
    // Данные по станциям
    private int minNumberStation = 0;
    private int maxNumberStation = 10;
    private int currentNumberStation = 0;
    private int numberOfLastStation = maxNumberStation - 1;
    private int numberStation;

    public Radio(){

    }
    public Radio(int quantityStation){
        this.maxNumberStation = minNumberStation + quantityStation;
        this.numberOfLastStation = maxNumberStation - 1;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            newNumberStation = minNumberStation;
        }
        if (newNumberStation > maxNumberStation) {
            newNumberStation = maxNumberStation;
        }
        numberStation = newNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getNumberOfLastStation(){
        return numberOfLastStation;
    }
    public int next() {
        numberStation = numberStation + 1;
        if (numberStation > maxNumberStation) {
            numberStation = minNumberStation;
        }
        return numberStation;
    }

    public int prev() {
        numberStation = numberStation - 1;
        if (numberStation < minNumberStation) {
            numberStation = maxNumberStation;
        }
        return numberStation;
    }

    // Данные по громкости
   private int volume;

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
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