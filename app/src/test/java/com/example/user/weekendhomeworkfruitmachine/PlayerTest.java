package com.example.user.weekendhomeworkfruitmachine;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 02/07/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(50);
    }

    @Test
    public void howMuchDoesPlayerHave() throws Exception {
        assertEquals(50, player.getCredit());
    }

    @Test
    public void payForGame() throws Exception {
        player.buyGame(2);
        assertEquals(48, player.getCredit());
    }
}
