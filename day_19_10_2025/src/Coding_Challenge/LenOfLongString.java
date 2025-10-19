// You are given an array of strings. Your task is to determine the length of the
// longest string in the array.


package Coding_Challenge;

public class LenOfLongString {
	public static void main(String[] args) {
		String arr[] = {"welcome", "hello", "bye", "pineapple", "apple"};
		int maxlength = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > maxlength) {
				maxlength = arr[i].length();
			}
		}
		System.out.println("The length of longest string in the given array is " + maxlength);
	}
}
