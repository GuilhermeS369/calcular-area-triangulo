import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int g = 0;
		int d = 0;
		int comb = sc.nextInt();
		
			
		while(comb != 4  ) {
		
			if (comb == 1) {
				a++;
				comb = sc.nextInt();
			}
			
			else if (comb == 2) {
				g++;
				comb = sc.nextInt();
			}
			else if (comb == 3) {
				d++;
				comb = sc.nextInt();
			}
			
			else {
				comb = sc.nextInt();
				
			}
		
		}
	
		
		System.out.println("finalizado");
		System.out.printf("Alcool: %d%n", a);
		System.out.printf("Gasolina: %d%n",g);
		System.out.printf("Diesel: %d%n", d);
		
		sc.close();
		
	}

}
