package Strings;

import java.util.Arrays;

public class StringCompression2 {

	public static void main(String[] args) {

		String s1 = "aababbbbacc";

		String s2 = "wwxyyxxyyyx";

		char[] ar = { 'a', 'z', 'b', 's', 'e' };

		int[] ar1 = {5,6,4,3,2,1};	

		System.out.println(Arrays.toString(mergeSort(ar1, 0, ar.length-1)));

//		System.out.println(Arrays.toString(mergeSort(ar1,0,ar.length-1)));
//		System.out.println(Arrays.toString(frequency(ar)));
	}

	public static boolean checkIsomorphic(String s1, String s2) {
		if (s1.length() == s2.length()) {

			char[] ch1 = toCharArray(s1);

			char[] ch2 = toCharArray(s2);

			char[] sorted1 = sort(ch1);

			char[] sorted2 = sort(ch2);

			for (int i = 0; i < sorted2.length; i++) {

				if (sorted1[i] != sorted2[i]) {

					return false;
				}
			}
			return true;
		}

		return false;

	}

	// frequency of a character array
	public static int[] frequency(char[] ar) {
		int[] count = new int[ar.length];

		for (int i = 0; i < ar.length - 1; i++) {

			int ct = 0;

			if (count[i] != -1) {

				for (int j = i + 1; j < ar.length; j++) {

					if (ar[i] == ar[j]) {

						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}

	// String to character array
	public static char[] toCharArray(String s) {
		char[] ch = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			ch[i] = s.charAt(i);
		}
		return ch;
	}

	// bubble sort
	public static char[] sort(char[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {

			for (int j = 0; j < ar.length - 1 - i; j++) {

				if (ar[j] > ar[j + 1]) {

					char temp = ar[j];

					ar[j] = ar[j + 1];

					ar[j + 1] = temp;
				}
			}
		}
		return ar;
	}

	public static int[] mergeSort(int[] ar, int start, int end) {
		if (start < end) {

			int mid = (start + end) / 2;

			mergeSort(ar, start, mid);
			mergeSort(ar, mid + 1, end);

			merge(ar, start, mid, end);
		}
		return ar;
	}

	public static void merge(int[] ar, int start, int mid, int end) {
		int[] ans = new int[ar.length];

		int i = start, j = mid + 1, k = start;

		while (i <= mid && j <= end) {
			
			if (ar[i] < ar[j]) {

				ans[k++] = ar[i++];
			}

			else if (ar[i] >= ar[j]) {

				ans[k++] = ar[j++];
			}

		}

		while (i <= mid) {
			ans[k++] = ar[i++];
		}

		while (j <= end) {
			ans[k++] = ar[j++];
		}

		for (int k2 = start; k2 <= end; k2++) {

			ar[k2] = ans[k2];
		}
	}
	
}
