import java.util.*;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		int[] array = new int[26];
		
		for(int i=0;i<str.length();i++) {
			char ascii = str.charAt(i);
			int num = ascii-65;
			array[num]++;
		}
		
		boolean flag = true;
		
		for(int i=0;i<26;i++) {
			if(array[i] == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not Pangram");
		}
		
		sc.close();
	}
}
