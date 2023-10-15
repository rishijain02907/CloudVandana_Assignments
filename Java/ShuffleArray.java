import java.util.*;

public class ShuffleArray {
	public static void main(String[] args) {
		ArrayList<Integer> shuffleArray = new ArrayList<Integer>();
		shuffleArray.add(1);
		shuffleArray.add(2);
		shuffleArray.add(3);
		shuffleArray.add(4);
		shuffleArray.add(5);
		shuffleArray.add(6);
		shuffleArray.add(7);
		
		Collections.shuffle(shuffleArray);
		
		System.out.print("Shuffled Array: ");
		for(Integer val:shuffleArray) {
			System.out.print(val + " ");
		}
	}
}
