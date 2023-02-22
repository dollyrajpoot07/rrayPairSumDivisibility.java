// Given an array of integers and a number k, write a function that returns true 
// if the given array can be divided into pairs such that the sum of every pair is divisible by k.

// Input: arr[] = {9, 7, 5, 3}, k = 6 
// Output: True 

// Input: arr[] = {92, 75, 65, 48, 45, 35}, k = 10 
// Output: True 


import java.util.*;

class ArrayPairSumDivisibility {
static boolean canPairs(int nums[], int n, int k) {
	if (n % 2 == 1)
	return false;

	int count = 0;

	int vis[] = new int[n];
	Arrays.fill(vis,-1);

	for (int i = 0; i < n; i++) {
	for (int j = i + 1; j < n; j++) {
		if ((nums[i] + nums[j]) % k == 0 && vis[i] == -1 && vis[j] == -1) {
		count++;
		vis[i] = 1;
		vis[j] = 1;
		}
	}
	}

	if (count == n / 2)
	return true;

	return false;
}

public static void main (String[] args) {
	int arr[] = { 92, 75, 65, 48, 45, 35 };
	int k = 10;
	int n = arr.length;
	if(canPairs(arr, n, k)){
	System.out.println("True");
	}else{
	System.out.println("False");
	}
}
}
