import java.util.ArrayList;
import java.util.Random;

public class small_game {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 50; i++) {
			int x = rd.nextInt(3);
			//System.out.println(x);
			arrOfInt.add(x);
		}
		System.out.println(arrOfInt);
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		for (int y = 0; y < arrOfInt.size(); y++) {
			if (arrOfInt.get(y) == 0) {
				num0 = num0 + 1;
			}else if (arrOfInt.get(y) == 1) {
				num1 = num1 + 1;
			}else if (arrOfInt.get(y) == 2) {
				num2 = num2 + 1;
			}
			
		}
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
