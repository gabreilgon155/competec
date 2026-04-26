import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float abacaxi = 7.30f, maca = 2, pera = 3,total;
		int quant_aba,quant_ma,quant_pe;
		System.out.println("Insira a quantidade de frutas a serem compradas.\n");
		try {
			System.out.print("Abacaxis: ");
			quant_aba = sc.nextInt();
			System.out.print("\nMaçãs: ");
			quant_ma = sc.nextInt();
			System.out.print("\nPêras: ");
			quant_pe = sc.nextInt();
			
			if(quant_aba < 0 || quant_ma < 0 || quant_pe < 0) {
				System.out.println("Não digite numeros negativos.");
			}else {
			total = (abacaxi * quant_aba) + (maca * quant_ma) + (pera * quant_pe);
			System.out.println("\nO total ficou: " + total);
			}	
		} catch (Exception e) {
			System.out.println("\nDigite apenas números.");
		}	
	}
}
