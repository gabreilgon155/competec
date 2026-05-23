import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha,entrada;
		
		senha = "123";
		
		while(true) {
			System.out.println("digite a senha: ");
			entrada = sc.next();
			if (senha.equals(entrada)) {
				System.out.println("Acesso permitido");
				break;
			}
			System.err.println("Senha inválida\n");
		}

	}

}


	
