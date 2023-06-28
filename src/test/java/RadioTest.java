import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты на выбор и управление станциями
    @Test
    public void enterNumberStation() {
        Radio enter = new Radio();
        enter.setNumberStation(4);
        int expected = 4;
        int actually = enter.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterLessMinNumberStation() {
        Radio lessMin = new Radio();
        lessMin.setNumberStation(-1);
        int expected = 0;
        int actually = lessMin.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterMoreMaxNumberStation() {
        Radio moreMax = new Radio();
        moreMax.setNumberStation(10);
        int expected = 9;
        int actually = moreMax.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void next() {
        Radio next = new Radio();
        next.setNumberStation(9);
        next.next();
        int expected = 0;
        int actually = next.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void next8() {
        Radio next8 = new Radio();
        next8.setNumberStation(8);
        next8.next();
        int expected = 9;
        int actually = next8.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void prev() {
        Radio prev = new Radio();
        prev.setNumberStation(0);
        prev.prev();
        int expected = 9;
        int actually = prev.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void prev1() {
        Radio prev1 = new Radio();
        prev1.setNumberStation(1);
        prev1.prev();
        int expected = 0;
        int actually = prev1.getNumberStation();
        Assertions.assertEquals(expected, actually);
    }

    // Тесты на выбор и управление громкостью

    @Test
    public void enterVolume() {
        Radio enter = new Radio();
        enter.setVolume(50);
        int expected = 50;
        int actually = enter.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterLessMinVolume() {
        Radio lessMin = new Radio();
        lessMin.setVolume(-20);
        int expected = 0;
        int actually = lessMin.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterMoreMaxVolume() {
        Radio moreMax = new Radio();
        moreMax.setVolume(120);
        int expected = 100;
        int actually = moreMax.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void plus() {
        Radio plus = new Radio();
        plus.setVolume(100);
        plus.plus();
        int expected = 100;
        int actually = plus.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void plus45() {
        Radio plus45 = new Radio();
        plus45.setVolume(45);
        plus45.plus();
        int expected = 46;
        int actually = plus45.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void minus() {
        Radio minus = new Radio();
        minus.setVolume(0);
        minus.minus();
        int expected = 0;
        int actually = minus.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void minus34() {
        Radio minus34 = new Radio();
        minus34.setVolume(34);
        minus34.minus();
        int expected = 33;
        int actually = minus34.getVolume();
        Assertions.assertEquals(expected, actually);
    }
}

