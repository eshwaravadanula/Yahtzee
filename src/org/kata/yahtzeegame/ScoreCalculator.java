package org.kata.yahtzeegame;

import java.util.HashMap;
import java.util.Map;

public class ScoreCalculator {
	
	private static Map<Integer, Integer> result;
	
	public int calculatePoints(BetSelectedEnum betselected, int[] dice)
	{
		result = new HashMap<Integer, Integer>();
		int selectedValue = betselected.getSelectedValue();
		for(int i=0;i<5;i++)
		{
			if(result.get(dice[i]) == null)
			{
				result.put(dice[i], 1);
			}
			else
			{
				result.put(dice[i], result.get(dice[i]) + 1);
			}
		}
		if(selectedValue < 7)
		{
			if(result.get(selectedValue) != null)
			{
				return selectedValue * result.get(selectedValue);
			}
		}
		else 
		{
			int matchingValue = betselected.getMatchingValue();
			int sum = 0;
			int store = 0;
			for(Integer i : result.keySet())
			{
				if(result.get(i) != null)
				{
					if(matchingValue ==0)
					{
						sum = sum + i*result.get(i);
					}
					else if (selectedValue == 13)
					{
						if(result.keySet().size() ==  2 && (result.get(i) == 2 || result.get(i) == 3))
						{
							sum = sum + i*result.get(i);
						}
						else
						{
							return 0;
						}
					}
					else if(result.get(i) == matchingValue)
					{
						sum = sum + i*matchingValue;
						if(i>store)
						{
							store = i;
						}
					}
					
				}
			}
			if(selectedValue == 7)
			{
				return store*2;
			}
			else 
			{
				if(selectedValue == 11)
				{
					if(sum == 15)
					{
						return 15;
					}
					return 0;
				}
				else if (selectedValue == 12)
				{
					if(sum == 20)
					{
						return 20;
					}
					return 0;
				}
				else if(selectedValue == 14 && result.keySet().size() == 1)
				{
					return 50;
				}
				else
				{
					return sum;
				}
			}
		}
		return 0;
	}

}
