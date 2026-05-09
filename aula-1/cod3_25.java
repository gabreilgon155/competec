public class Main {
    public static void main(String[] args) {
        boolean chovendo=true,relampejando=true,macarrao=true,estrogonofe=true;
        
        if (chovendo && relampejando){
            System.out.print("Não sair\n");
        }else{
            System.out.print("Sair\n");
        }
        
        if (macarrao || estrogonofe){
            System.out.print("Estou feliz");
        }else{
            System.out.print("Não estou feliz");
        }

    }
}
