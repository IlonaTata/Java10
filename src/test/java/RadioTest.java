import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation1() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(-2);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation2() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(9);
        int expected = 0;
        int actual = number.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio number = new Radio();
        int expected = 9;
        int actual = number.getMaxRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetMinStation() {
        Radio number = new Radio();
        int expected = 0;
        int actual = number.getMinRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetStationMore9() {
        Radio number = new Radio(12);
        number.setCurrentRadioStationNumber(11);
        int expected = 0;
        int actual = number.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLess0() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(0);
        int expected = 9;
        int actual = number.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio number = new Radio(10);
        number.setCurrentRadioStationNumber(5);
        int expected = 4;
        int actual = number.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        Radio number = new Radio();
        int expected = 9;
        int actual = number.getMaxRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountStation() {
        Radio number = new Radio();
        int expected = 10;
        int actual = number.getMaxRadioAmount();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume1() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(11);
        int expected = 11;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(-2);
        int expected = 0;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(99);
        volumeNumber.increaseVolume();
        int expected = 100;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(100);
        volumeNumber.increaseVolume();
        int expected = 100;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(110);
        volumeNumber.increaseVolumeMoreMax();
        int expected = 0;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeMoreMax1() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(100);
        volumeNumber.increaseVolumeMoreMax();
        int expected = 100;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeMoreMin() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(0);
        volumeNumber.increaseVolumeMoreMin();
        int expected = 0;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMin1() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(-2);
        volumeNumber.increaseVolumeMoreMin();
        int expected = 0/**/;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMin2() {
        Radio volumeNumber = new Radio(0, 100);
        volumeNumber.setSoundVolume(2);
        volumeNumber.increaseVolumeMoreMin();
        int expected = 2;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}
