import java.util.Random;

public class MathWork{
	
	public static void main(String[] args) {

		int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10}
		divisible(10);
		takeRandom(arr);
		countDown(35);

	}
	public int divisible(int a){
		
		for(int i = 1; i < 100; i++){
			if(i % a == 0)
				System.out.println(i);
		}
		public int takeRandom(int[] arr){
			Random r = new Random();
			int randomNr = r.nextInt(arr.length);
			return arr[randomNr];
		}
		public static void countDown(int a){
			if(a >= 0){
				System.out.println(a);
				countDown(a-1);
			}
		}




	}
}