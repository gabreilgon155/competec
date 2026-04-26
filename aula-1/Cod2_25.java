import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, nome_colega;
		int idade,idade_prof;
		
			System.out.print("Qual seu nome? : ");
			nome = sc.next();
			System.out.print("\nQual o nome do seu colega?: ");
			nome_colega = sc.next();
			if (nome.equals(nome_colega)) {
				System.out.println("Os nomes são iguais");
			} else {
				System.out.println("Os nome são diferentes");
			}
			
			System.out.print("\nQual a sua idade?: ");
			idade = sc.nextInt();
			System.out.print("Qual a idade do seu professor?: ");
			idade_prof = sc.nextInt();
			
			if (idade < idade_prof) {
				System.out.println("Você é mais novo que o professor.");
			}else if (idade == idade_prof) {
				System.out.println("Você tem a mesma idade do professor");
			}else {
				System.out.println("Você é mais velho que o professor");
			}
	}

}
