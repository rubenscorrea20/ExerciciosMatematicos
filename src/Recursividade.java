
public class Recursividade {

	
	/* 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 + 0)*/
	public static int soma(int x) {
		if (x == 0) {
			return x;
		} else {
			System.out.println(x);
			return x + soma(x - 1);
		}
	}
	
	
	public static int potencia(int x, int e) {
		if(e == 1) {
			return x;
		} else {
			int y = x * potencia(x, e-1);
			System.out.println(y);
			return y;
		}
	}

	public static void main(String[] args) {
		//System.out.println(soma(10));
		System.out.println(potencia(3, 4));
	}

}
