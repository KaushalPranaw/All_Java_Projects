package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJoining {

	public static void main(String[] args) {
		// Create a character array
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's' };

		// Convert the character array into String
		// using Collectors.joining() method
		String chString = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());

		// Print the concatenated String
		System.out.println(chString);

		// Create a character list
		List<Character> ch1 = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');

		// Convert the character list into String
		// using Collectors.joining() method
		String chString1 = ch1.stream().map(String::valueOf).collect(Collectors.joining());

		// Print the concatenated String
		System.out.println(chString1);

		// Create a character list
		List<String> str = Arrays.asList("Geeks", "for", "Geeks");

		// Convert the character list into String
		// using Collectors.joining() method
		String chString2 = str.stream().map(String::valueOf).collect(Collectors.joining());

		// Print the concatenated String
		System.out.println(chString2);

	}
}
