import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minNumberStation = 0;
    private int maxNumberStation = 10;
    private int currentNumberStation = 0;
    private int numberOfLastStation;
    private int numberStation;
    private int volume;

    public Radio() {
        this.numberOfLastStation = this.maxNumberStation - 1;
    }

    public Radio(int minNumberStation, int maxNumberStation, int currentNumberStation, int numberOfLastStation, int numberStation, int volume) {
        this.numberOfLastStation = this.maxNumberStation - 1;
        this.minNumberStation = minNumberStation;
        this.maxNumberStation = maxNumberStation;
        this.currentNumberStation = currentNumberStation;
        this.numberOfLastStation = numberOfLastStation;
        this.numberStation = numberStation;
        this.volume = volume;
    }

    public int getMinNumberStation() {
        return this.minNumberStation;
    }

    public int getMaxNumberStation() {
        return this.maxNumberStation;
    }

    public int getCurrentNumberStation() {
        return this.currentNumberStation;
    }

    public int getNumberOfLastStation() {
        return this.numberOfLastStation;
    }

    public int getNumberStation() {
        return this.numberStation;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public void setNumberOfLastStation(int numberOfLastStation) {
        this.numberOfLastStation = numberOfLastStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}