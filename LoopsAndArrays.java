package mini1;

import java.util.Arrays;

/**
 * 
 * @author Jonathon Schnell
 * @version 1.0
 * @since 10-21-2019 COM S 227 mini homework1
 *
 */

//import java.util.Arrays;

public class LoopsAndArrays {

	public static void main(String[] args) {
		System.out.println(countMatches("abcde", "xbydcazzz"));
		System.out.println("return 2");
		System.out.println("---------------------------");

		System.out.println(numFirstChar("computer science"));
		System.out.println("3");
		System.out.println("---------------------------");

		System.out.println(countSubstringsWithOverlap("aa", "aaaaa"));
		System.out.println("4");
		System.out.println("---------------------------");

		int a[] = { 1, 2, 3, 4 };
		System.out.println(arrayToString(a));
		System.out.println("4321 (String)");
		System.out.println("---------------------------");

		int b[] = { 3, 6, 9 };
		System.out.println(isArithmetic(b));
		System.out.println("true");
		System.out.println("---------------------------");

		System.out.println(Arrays.toString(collatz(7, 3)));
		System.out.println("[7, 22, 11, 34]");
		System.out.println("---------------------------");

		int c[] = { 1, 2, 3 };
		int d[] = { 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(interleaveArray(c, d)));
		System.out.println("[1, 4, 2, 5, 3, 6, 7, 8]");
		System.out.println("---------------------------");

		int e[] = { 1, 2, 3 };
		System.out.println(isAscending(e));
		System.out.println("true");
		System.out.println("---------------------------");

	}

	public static int countMatches(String s, String t) {
		int count = 0, i = 0;
		while (i < Math.min(s.length(), t.length())) {
			if (s.charAt(i) == t.charAt(i)) {
				count++;
				i++;
			} else {
				i++;
			}
		}
		return count;
	}

	public static int numFirstChar(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int count = 0, i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(0)) {
				count++;
				i++;
			} else {
				i++;
			}
		}
		return count;
	}

	public static int countSubstringsWithOverlap(String t, String s) {
		int count = 0, i = 0;
		while (i < s.length() - t.length() + 1) {
			if (t.equals(s.substring(i, i + (t.length())))) {
				count++;
				i++;
			} else {
				i++;
			}
		}
		return count;
	}

	public static String arrayToString(int[] array) {
		String string = "";
		int i = array.length - 1;
		while (i >= 0) {
			string = string + array[i];
			i--;
		}

		return string;
	}

	public static boolean isArithmetic(int[] array) {
		if (array.length <= 2) {
			return true;
		}
		int gap = array[2] - array[1];
		int i = 0;
		boolean a = false;
		while (i < array.length - 1) {
			if (array[i] + gap == array[i + 1]) {
				a = true;
			} else {
				return false;
			}
			i++;
		}
		return a;
	}

	public static int[] collatz(int start, int numIterations) {
		int n = start, num = numIterations;
		int[] arr = new int[num + 1];
		arr[0] = start;
		int i = 1;
		while (i <= num) {
			if (n % 2 == 0) {
				n = n / 2;

			} else {
				n = 3 * n + 1;
			}
			arr[i] = n;
			i++;
		}
		return arr;
	}

	public static int[] interleaveArray(int[] a, int[] b) {
		int[] arr = new int[a.length + b.length];
		int i = 0, ia = 0, ib = 0;
		while (i <= Math.min(a.length, b.length) + Math.min(a.length, b.length) - 1) {
			arr[i] = a[ia];
			arr[i + 1] = b[ib];
			i += 2;
			ia++;
			ib++;
		}
		if (a.length < b.length) {
			i = 2 * a.length;
			ia = a.length;
			while (i <= (b.length + a.length) - 1) {
				arr[i] = b[ia];
				i++;
				ia++;
			}

		}
		if (b.length < a.length) {
			i = 2 * b.length;
			ib = b.length;
			while (i <= (a.length + b.length) - 1) {
				arr[i] = a[ib];
				i++;
				ib++;
			}
		}

		return arr;
	}

	public static boolean isAscending(int[] a) {
		if (a.length == 1) {
			return true;
		}
		int i = 0;
		boolean bool = false;
		while (i < a.length - 1) {
			if (a[i] + 1 <= a[i + 1]) {
				bool = true;
				i++;
			} else {
				return false;
			}

		}

		return bool;

	}
}
