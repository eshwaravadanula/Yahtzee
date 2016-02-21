package org.kata.yahtzeegame.test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import org.kata.yahtzeegame.Dice;

public class DiceTest {

	private Dice dice;

	@Before
	public void setUp() {
		dice = new Dice();
	}

	@Test
	public void testRollTheDice() {
		assertThat(dice.rollTheDice(),anyOf(is(1),is(2),is(3),is(4),is(5),is(6)));
	}
	
	@Test
	public void testInitialRollTheDice()
	{
		int[] actual = dice.initialRoll();
		assertEquals(5, actual.length);
		for(int i=0; i<5; i++)
		{
			assertThat(actual[i],anyOf(is(1),is(2),is(3),is(4),is(5),is(6)));
		}
	}
	
	@Test
	public void testDiceValues()
	{
		assertArrayEquals(dice.initialRoll(), dice.diceValues());
	}

}
