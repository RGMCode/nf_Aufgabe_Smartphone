package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void startRadioTrue() {
        //given
        Smartphone iphone = new Smartphone();
        //boolean exp = true;
        //when
        boolean act = iphone.startRadio();
        //then
        assertTrue(act);
    }

    @Test
    void startRadioFalse() {
        //given
        Smartphone iphone = new Smartphone();
        //boolean exp = true;
        //when
        boolean act = iphone.stopRadio();
        //then
        assertFalse(act);
    }

    @Test
    void stopRadioTrue() {
        //given
        Smartphone iphone = new Smartphone();
        //when
        boolean act = iphone.stopRadio();
        //then
        assertFalse(act);
    }

    @Test
    void stopRadioFalse() {
        //given
        Smartphone iphone = new Smartphone();
        //when
        boolean act = iphone.stopRadio();
        //then
        assertFalse(act);
    }

    @Test
    void getPosition() {
        //given
        Smartphone cords = new Smartphone();
        String expectet = "Köln";
        //when
        String actual = cords.getPosition();
        //then
        assertEquals(expectet,actual);
    }
}