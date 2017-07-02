package com.example.user.weekendhomeworkfruitmachine;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static junit.framework.Assert.assertEquals;
import org.mockito.Mockito;

/**
 * Created by user on 02/07/2017.
 */

public class FruitmachineTest {

    Fruitmachine fruitmachine;

    @Before
    public void before(){
        ArrayList<Wheel> wheels = new ArrayList<Wheel>(Arrays.asList(new Wheel(), new Wheel(), new Wheel()));
        fruitmachine = new Fruitmachine(wheels, 200);
    }

    @Test
    public void howMuchCreditIsInMachine() throws Exception {
        assertEquals(200, fruitmachine.getMachineCredit());
    }

    @Test
    public void playerCanPayIn() throws Exception {
        fruitmachine.increaseCredit(2);
        assertEquals(202, fruitmachine.getMachineCredit());
    }

    @Test
    public void playerWonMoney() throws Exception {
        fruitmachine.decreaseCredit(50);
        assertEquals(150, fruitmachine.getMachineCredit());
    }
}
