package org.kata.yahtzeegame.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.kata.yahtzeegame.BetSelectedEnum;
import org.kata.yahtzeegame.ScoreCalculator;

import static org.junit.Assert.*;

		
public class ScoreCalculatorTest {
	
	private ScoreCalculator scoreCalculator;
	
	@Before
	public void setUp()
	{
		scoreCalculator = new ScoreCalculator();
	}
	
	@Test
	public void testCalulatePointsOnes()
	{
		int[] dice = {1,2,3,1,2};
		assertEquals(2,scoreCalculator.calculatePoints(BetSelectedEnum.ONES, dice));
		dice[0] = 2;
		dice[3] = 6;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.ONES, dice));
	}
	
	@Test
	public void testCalulatePointsTwos()
	{
		int[] dice = {1,2,3,1,2};
		assertEquals(4,scoreCalculator.calculatePoints(BetSelectedEnum.TWOS, dice));
		dice[1] = 3;
		dice[4] = 6;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.TWOS, dice));
	}
	
	@Test
	public void testCalulatePointsThrees()
	{
		int[] dice = {1,3,3,1,2};
		assertEquals(6,scoreCalculator.calculatePoints(BetSelectedEnum.THREES, dice));
		dice[1] = 6;
		dice[2] = 6;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.THREES, dice));
	}
	
	@Test
	public void testCalulatePointsFours()
	{
		int[] dice = {1,4,3,4,2};
		assertEquals(8,scoreCalculator.calculatePoints(BetSelectedEnum.FOURS, dice));
		dice[1] = 3;
		dice[3] = 6;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.FOURS, dice));
	}
	
	@Test
	public void testCalulatePointsFives()
	{
		int[] dice = {1,5,5,5,2};
		assertEquals(15,scoreCalculator.calculatePoints(BetSelectedEnum.FIVES, dice));
		dice[1] = 3;
		dice[2] = 1;
		dice[3] = 6;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.FIVES, dice));
	}
	
	@Test
	public void testCalulatePointsSixes()
	{
		int[] dice = {1,6,6,6,6};
		assertEquals(24,scoreCalculator.calculatePoints(BetSelectedEnum.SIXES, dice));
		dice[1] = 3;
		dice[2] = 1;
		dice[3] = 1;
		dice[4] = 1;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.SIXES, dice));
	}
	
	@Test
	public void testCalculatePointsPairs()
	{
		int[] dice = {1,6,6,5,5};
		assertEquals(12,scoreCalculator.calculatePoints(BetSelectedEnum.PAIRS, dice));
		dice[1] = 3;
		assertEquals(10,scoreCalculator.calculatePoints(BetSelectedEnum.PAIRS, dice));
		dice[3] = 2;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.PAIRS, dice));
	}
	
	@Test
	public void testCalculatePointsTwoPairs()
	{
		int[] dice = {1,6,6,5,5};
		assertEquals(22,scoreCalculator.calculatePoints(BetSelectedEnum.TWO_PAIRS, dice));
		dice[1] =3;
		dice[3] =4;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.TWO_PAIRS, dice));
	}
	
	@Test
	public void testCalculatePointsThreeOfAKind()
	{
		int[] dice = {1,6,6,6,5};
		assertEquals(18,scoreCalculator.calculatePoints(BetSelectedEnum.THREE_OF_A_KIND, dice));
		dice[1] =3;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.THREE_OF_A_KIND, dice));
	}
	
	@Test
	public void testCalculatePointsFourOfAKind()
	{
		int[] dice = {1,6,6,6,6};
		assertEquals(24,scoreCalculator.calculatePoints(BetSelectedEnum.FOUR_OF_A_KIND, dice));
		dice[1] =3;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.FOUR_OF_A_KIND, dice));
	}
	
	@Test
	public void testCalculatePointsSmallStraight()
	{
		int[] dice = {1,2,3,4,5};
		assertEquals(15,scoreCalculator.calculatePoints(BetSelectedEnum.SMALL_STRAIGHT, dice));
		dice[1] =3;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.SMALL_STRAIGHT, dice));
	}
	
	@Test
	public void testCalculatePointsLargeStraight()
	{
		int[] dice = {2,3,4,5,6};
		assertEquals(20,scoreCalculator.calculatePoints(BetSelectedEnum.LARGE_STRAIGHT, dice));
		dice[1] =4;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.LARGE_STRAIGHT, dice));
	}
	
	@Test
	public void testCalculatePointsFullHouse()
	{
		int[] dice = {3,3,4,4,4};
		assertEquals(18,scoreCalculator.calculatePoints(BetSelectedEnum.FULL_HOUSE, dice));
		dice[1] =2;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.FULL_HOUSE, dice));
	}
	
	@Test
	public void testCalculatePointsYahtzee()
	{
		int[] dice = {4,4,4,4,4};
		assertEquals(50,scoreCalculator.calculatePoints(BetSelectedEnum.YAHTZEE, dice));
		dice[1] =2;
		assertEquals(0,scoreCalculator.calculatePoints(BetSelectedEnum.YAHTZEE, dice));
	}
	
	@Test
	public void testCalculatePointsChance()
	{
		int[] dice = {2,4,2,5,3};
		assertEquals(16,scoreCalculator.calculatePoints(BetSelectedEnum.CHANCE, dice));
		dice[1] =2;
		assertEquals(14,scoreCalculator.calculatePoints(BetSelectedEnum.CHANCE, dice));
	}

}
