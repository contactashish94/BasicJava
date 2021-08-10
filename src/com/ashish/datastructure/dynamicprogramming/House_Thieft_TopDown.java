package com.ashish.datastructure.dynamicprogramming;

public class House_Thieft_TopDown {

	public int maxMoney(int[] HouseNetWorth) {
		int dp[] = new int[HouseNetWorth.length];
		return maxMoney_TopDown(dp, HouseNetWorth, 0);
	}


	private int maxMoney_TopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length)
			return 0;

		if (dp[currentIndex] == 0) {
			int stealCurrent = HouseNetWorth[currentIndex] + maxMoney_TopDown(dp, HouseNetWorth, currentIndex + 2);
			int skipCurrent = maxMoney_TopDown(dp, HouseNetWorth, currentIndex + 1);
			dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
		}
		return dp[currentIndex];
	}

	
	public static void main(String[] args) {
		House_Thieft_TopDown ht = new House_Thieft_TopDown();
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
		//int[] HouseNetWorth = {};
		Long start = System.nanoTime();
		System.out.println(ht.maxMoney(HouseNetWorth));
		Long end = System.nanoTime();
		System.out.println("Total time to execute: =" + (end-start));
		/*HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
		System.out.println(ht.maxMoney(HouseNetWorth));*/
	}
}
