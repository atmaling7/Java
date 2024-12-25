package Strings;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {

		char[] ar = { 'a', 'b', 'c' };

		combination(ar, 0);
	}

	public static void swap(char[] ar, int i, int j) {
		char temp = ar[i];

		ar[i] = ar[j];

		ar[j] = temp;
	}

	public static void combination(char[] ar, int ref) {
		if (ref == ar.length - 1) {

			System.out.println(Arrays.toString(ar));
			return;
		}
		for (int i = ref; i < ar.length; i++) {

			swap(ar, i, ref);
			combination(ar, ref + 1);
			swap(ar, i, ref);
		}

	}

}
