public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float abacaxi = 7.30f, maca = 2, pera = 3,total;
		int quant_aba,quant_ma,quant_pe;
		
		try {
			System.out.println("Quantos abacaxis você gostaria de comprar?");
			quant_aba = sc.nextInt();
			System.out.println("Quantas maçãs você gostaria de comprar?");
			quant_ma = sc.nextInt();
			System.out.println("Quantas pêras você gostaria de comprar?");
			quant_pe = sc.nextInt();
			
			if(quant_aba < 0 || quant_ma < 0 || quant_pe < 0) {
				System.out.println("Não digite numeros negativos.");
			}else {
			total = (abacaxi * quant_aba) + (maca * quant_ma) + (pera * quant_pe);
			System.out.println("O total ficou: " + total);
			}	
		} catch (Exception e) {
			System.out.println("Digite apenas números.");
		}	
	}
}
