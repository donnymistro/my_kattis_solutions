import java.util.*;
public class reverse {
/**
* This file takes an input that is the number of integer elements,
* followed by a stream of elements based on that input and
* reverses their order after they are stored into an array.
*
*@author Donald Lanoux
*/
	public static void main(String[] args) {
		// Get the first line to determine the array size
		Scanner myScanner = new Scanner(System.in);
		int inputSize = myScanner.nextInt();
		// Create the array based on this size
		int[] numsArray = new int[inputSize];
		// Now get the rest of the numbers and put them into numsArray. Use a counter.
		int counter = 0;
		while(myScanner.hasNextInt()) {
			int temp = myScanner.nextInt();
			numsArray[counter] = temp;
			counter++;
		}
		// Finally, just print out the array in reverse order
		for(int i = numsArray.length - 1; i >= 0; i--) {
			System.out.println(numsArray[i]);
		}
	}
}
