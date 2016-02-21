package org.kata.yahtzeegame;

import java.util.HashMap;
import java.util.Map;

public enum BetSelectedEnum {
	
	ONES(1,1,"One"),
	TWOS(2,1,"Twos"),
	THREES(3,1,"Threes"),
	FOURS(4,1,"Fours"),
	FIVES(5,1,"Fives"),
	SIXES(6,1,"Sixes"),
	PAIRS(7,2,"Pairs"),
	TWO_PAIRS(8,2,"Two Pairs"),
	THREE_OF_A_KIND(9,3,"Three of a kind"),
	FOUR_OF_A_KIND(10,4,"Four of a Kind"),
	SMALL_STRAIGHT(11,1,"Small Straight"),
	LARGE_STRAIGHT(12,1,"Large Straight"),
	FULL_HOUSE(13,1,"Full house"),
	YAHTZEE(14,5,"YAHTZEE"),
	CHANCE(15,0,"CHANCE");
	
	private int selectedValue;
	private int matchingValue;
	private String displayValue;
	
	public int getSelectedValue() {
		return selectedValue;
	}


	public void setSelectedValue(int selectedValue) {
		this.selectedValue = selectedValue;
	}


	public int getMatchingValue() {
		return matchingValue;
	}


	public void setMatchingValue(int matchingValue) {
		this.matchingValue = matchingValue;
	}


	public String getDisplayValue() {
		return displayValue;
	}


	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	private BetSelectedEnum(int selectedValue, int matchingValue, String displayValue)
	{
		this.selectedValue = selectedValue;
		this.matchingValue = matchingValue;
		this.displayValue = displayValue;
	}

	private static Map <Integer, BetSelectedEnum> lookUp = new HashMap<Integer, BetSelectedEnum>();
	
	
	static {
		for(BetSelectedEnum enu :BetSelectedEnum.values())
		{
			lookUp.put(enu.getSelectedValue(),enu );
		}
	}
	
	public static BetSelectedEnum valueOf(int selectedValue)
	{
		return lookUp.get(selectedValue);
	}
	

}
