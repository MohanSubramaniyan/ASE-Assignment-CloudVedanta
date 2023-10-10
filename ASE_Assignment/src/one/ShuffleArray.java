package one;
	import java.util.Arrays;
	import java.util.Random;

	public class ShuffleArray {
	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

	        // Shuffle the array
	        shuffleArray(myArray);

	        // Print the shuffled array
	        System.out.println("Shuffled Array: " + Arrays.toString(myArray));
	    }

	    private static void shuffleArray(int[] array) {
	        Random rand = new Random();
	        for (int i = array.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);
	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}



