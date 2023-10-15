import java.util.*;

public class RomanToNumber {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roman Numeral: ");
		String roman = sc.next();
		int num = 0;
		int preVal = 0;
		int curVal = 0;
		
		for(int i=roman.length()-1;i>=0;i--) {
			switch(roman.charAt(i)) {
			case'I':
				curVal = 1;
				break;
			case'V':
				curVal = 5;
				break;
			case'X':
				curVal = 10;
				break;
			case'L':
				curVal = 50;
				break;
			case'C':
				curVal = 100;
				break;
			case'D':
				curVal = 500;
				break;
			case'M':
				curVal = 1000;
				break;
			default: throw new Exception("Invalid Roman Character");
			}
			
			if(preVal<=curVal) {
				num+=curVal;
			}else {
				num-=curVal;
			}
			
			preVal = curVal;
		}
		
		System.out.print("Output : " + num);
		sc.close();
	}
}
