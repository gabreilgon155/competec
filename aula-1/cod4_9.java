import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código da fruta: ");
        int codigo = sc.nextInt();
        
        switch(codigo){
            case 1:
                System.out.print("Abacaxi : R$ 8,50");
                break;
            
            case 2:
                System.out.print("Goiaba : R$ 2,00");
                break;
            
            case 3:
                System.out.print("Laranja : R$ 1,30");
                break;
            default:
                System.out.print("Invalido");
        }
    }
}
