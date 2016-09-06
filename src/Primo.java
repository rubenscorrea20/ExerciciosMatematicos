import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numPrimo;
		int numDivisores = 0;
		
		System.out.println("Digite um numero: ");
		numPrimo = leitor.nextInt();
		
		for(int i = 1; i <= numPrimo; i++){
			if(numPrimo % i == 0){
				numDivisores++;
			}
		}

		if (numDivisores == 2) {
			System.out.println("Primo");
		
		} else {
			System.out.println("Não Primo");
		}
			
		leitor.close();
	}
}