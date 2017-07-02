package com.example.user.weekendhomeworkfruitmachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.mockito.Mockito;

/**
 * Created by user on 01/07/2017.
 */

public class WheelTest {

    Wheel wheel;

    @Before
    public void before(){
    }

    @Test
    public void constructorShouldPopulateWheel(){
        Wheel wheel = new Wheel();
        assertEquals(9 ,wheel.numOfSymbols());
    }

    @Test
    public void spinWheelReturnSymbol(){
        Wheel wheel = new Wheel();
        for(int i = 0; i< 20; i++) {
            Symbol symbol = wheel.spinWheel();
            assertNotNull(symbol);
        }
    }

    @Test
    public void spinWheel(){
        Wheel wheel = new Wheel();
        Wheel spyWheel = Mockito.spy(wheel);
        Mockito.when(spyWheel.spinWheel()).thenReturn(Symbol.AUBERGINE);
        assertEquals(Symbol.AUBERGINE, spyWheel.spinWheel());
    }
}