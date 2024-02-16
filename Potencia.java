import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);                
        int base,exponente;

        System.out.print("Digite la BASE: ");
        base=input.nextInt();
        System.out.print("Digite el exponente: ");
        exponente=input.nextInt();

        System.out.println("El resultado es: "+potencia(base,exponente));
    }
    
    public static int potencia(int base,int exponente){
        
        if(exponente == 1){
            return base;
        }
        else{
            return suma(base,potencia(base,exponente-1));
        }
        
    }
    
    public static int suma(int Nrepite,int numero){
        
        if(Nrepite==1){
            return numero;
        }
        else{
            return numero+suma(Nrepite-1,numero);
        }
    }
}