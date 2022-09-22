 class Main{
	public static void main(String[] args) {
		fibonacci(1, 1);
		

	}

	public static void fibonacci(int a, int b){
		//4.a
		int d = a+b;
		System.out.print("\t"+d);
		a=b;
		b=d;
		if( a<= 1000 && b<=1000){
			fibonacci(a, b);
		}
	}
}