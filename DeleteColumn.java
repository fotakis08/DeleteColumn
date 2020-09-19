import java.util.ArrayList;
import java.util.List;


public class DeleteColumn {

	public static int minDeletionSize(String[] A) {
		// D variable will work as a counter
		int d = 0;
		// Assuming column in arr is the same...
		int len = A[0].length();
		// Nested loop through array
			for(int i = 0; i < len; i++) {
				for(int j = 1; j < len; j++) {
					// If columns in array aren't equal
					if (A[i].length() != A[j].length()) {
						// Return -1 for error
						return -1;
					}
					// If value of char at index is "greater" than the next char at index
					if (A[j-1].charAt(i) > A[j].charAt(i)) {
						// Increment counter
						d++;
						break;
					}
				}
			}
			// Return counter
			return d;
		}

	public static void main(String[] args) {

		// Ex 1
		String[] arr1 = {"cba","daf","ghi"};
		System.out.println("Example 1:");
		System.out.println("{"+minDeletionSize(arr1)+"}");

		// Ex 2
		String[] arr2 = {"a","b"};
		System.out.println("Example 2:");
		System.out.println("{"+minDeletionSize(arr2)+"}");

		// Ex 3
		String[] arr3 = {"zyx","wvu","tsr"};
		System.out.println("Example 3:");
		System.out.println("{"+minDeletionSize(arr3)+"}");

		// Ex 4
		String[] arr4 = {"Captain","Marvel","saved", "the", "Avengers"};
		System.out.println("Example 4:");
		System.out.println("{"+minDeletionSize(arr4)+"}");

	}
}