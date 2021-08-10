package com.ashish.datastructure.dynamicprogramming;

public class House_Thieft_BottomUp {

	public int findMaxSteal(int[] wealth) {
		int dp[] = new int[wealth.length + 2]; // '+1' to handle the zero house
		dp[wealth.length] = 0; // if there are no houses, the thief can't steal anything
		for (int i = wealth.length - 1; i >= 0; i--) {
			dp[i] = Math.max(wealth[i] + dp[i + 2], dp[i + 1]);
		}
		return dp[0];
	}

	public static void main(String[] args) {
		House_Thieft_BottomUp ht = new House_Thieft_BottomUp();
		int[] HouseNetWorth = new int[20010];
		int i=0;
		while (i<20000){
			for (int j = 0 ; j <= 6;j++){
				switch (j){
					case 0:
						HouseNetWorth[i]=2;
						i++;
						break;
					case 1:
						HouseNetWorth[i]=3;
						i++;
						break;
					case 2:
						HouseNetWorth[i]=1;
						i++;
						break;
					case 3:
						HouseNetWorth[i]=1;
						i++;
						break;
					case 4:
						HouseNetWorth[i]=2;
						i++;
						break;
					case 5:
						HouseNetWorth[i]=4;
						i++;
						break;
					case 6:
						HouseNetWorth[i]=2;
						i++;
						break;
					case 7:
						HouseNetWorth[i]=0;
						i++;
						break;

				}
			}
		}
		Long start = System.currentTimeMillis();
		System.out.println(ht.findMaxSteal(HouseNetWorth));
		Long end = System.currentTimeMillis();
		System.out.println("Total time to execute: =" + (end-start)/1000F);
		HouseNetWorth = new int[] { 20, 5, 1, 13, 6, 11, 40 };
		System.out.println(ht.findMaxSteal(HouseNetWorth));
	}
}
