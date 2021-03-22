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
		System.out.println(arrOfInt.size());
		
	}

}
