package main;

import javax.swing.JOptionPane;

public class UnDuplicated {
	public static void main(String[] args) {

		// Declaring Variables
		String in = JOptionPane.showInputDialog("Please enter the text for the operation");
		String word[] = new String[in.length()];
		int count = 0;
		String longest = "";

		// Initializing the elements of the array
		for (int x = 0; x < word.length; x++)
			word[x] = "";

		// Iterate through the array and see if the current element is equal to the next element
		for (int x = 0; x < in.length(); x++) {
			if (!duplichecker(word[count], in.charAt(x)))
				word[count] += in.charAt(x);
			else {
				count++;
				x--;
			}
		}

		// Finding the longest word
		for (String x : word) {
			if (longest.length() < x.length())
				longest = x;
		}

		JOptionPane.showMessageDialog(null, "The longest substring in the given text is '" + longest + "' and it has "
				+ longest.length() + " characters");
	}

	// This method will return a boolean response if the character b is found in a string a
	private static Boolean duplichecker(String a, char b) {
		Boolean fact = false;

		for (int x = 0; x < a.length(); x++) {
			if (a.charAt(x) == b)
				fact = true;
			else
				continue;
		}

		return fact;
	}
}