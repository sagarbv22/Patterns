package com.Ineuron.ai;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 11;
		for (int i = 0; i < n; i++) {

			// S
			for (int j = 0; j < n; j++) {

				if (i == 0 && j != 0 || j == 0 && i < (n - 1) / 2 && i != 0 || i == (n - 1) / 2 && j != (n - 1) && j > 0
						|| j == (n - 1) && i < (n - 1) && i > (n - 1) / 2 || i == (n - 1) && j < (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");

			// A
			for (int j = 0; j < n; j++) {

				if (i == 0 && j != 0 && j != (n - 1) || j == 0 && i != 0 || i == (n - 1) / 2
						|| j == (n - 1) && i != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// G
			for (int j = 0; j < n; j++) {

				if (i == 0 && j != 0 || j == 0 && i != 0 && i != (n - 1) || i == (n - 1) && j <= (n - 1) / 2 && j != 0
						|| j == (n - 1) / 2 && i >= (n - 1) / 2 || j >= (n - 1) / 2 && i == (n - 1) / 2
						|| i >= (n - 1) / 2 && j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// A
			for (int j = 0; j < n; j++) {

				if (i == 0 && j != 0 && j != (n - 1) || j == 0 && i != 0 || i == (n - 1) / 2
						|| j == (n - 1) && i != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// R
			for (int j = 0; j < n; j++) {

				if (j == 0 || i == 0 && j != (n - 1) || j == (n - 1) && i < (n - 1) / 2 && i != 0
						|| i == (n - 1) / 2 && j != (n - 1) && j > n / 4
						|| i == j && i >= (n - 1) / 2 && j >= (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// i
			for (int j = 0; j < n; j++) {

				if (j == (n - 1) / 2 && i >= (n - 1) / 2 || i == n / 4 && j == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// N
			for (int j = 0; j < n; j++) {

				if (j == 0 || j == (n - 1) || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// E
			for (int j = 0; j < n; j++) {

				if (j == 0 || i == 0 && j != (n - 1) || i == (n - 1) / 2 && j < (n - 1) || i == n - 1 && j != n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// U
			for (int j = 0; j < n; j++) {

				if (j == 0 && i != (n - 1) || j == n - 1 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// R
			for (int j = 0; j < n; j++) {

				if (j == 0 || i == 0 && j != (n - 1) || j == (n - 1) && i < (n - 1) / 2 && i != 0
						|| i == (n - 1) / 2 && j != (n - 1) && j > n / 4
						|| i == j && i >= (n - 1) / 2 && j >= (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// O
			for (int j = 0; j < n; j++) {

				if (j == 0 && i != (n - 1) && i != 0 || j == n - 1 && i != n - 1 && i != 0
						|| i == n - 1 && j != 0 && j != n - 1 || i == 0 && j != 0 && j != n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			// N
			for (int j = 0; j < n; j++) {

				if (j == 0 || j == (n - 1) || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("   ");

			System.out.println();

		}

	}

}
