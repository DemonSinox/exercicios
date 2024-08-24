package src;

import java.util.Scanner;

public class comparacaoDeMaiorNumeroEntre2valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor ");
        Integer numero1 = sc.nextInt();

        System.out.println("Informe o segundo valor ");
        Integer numero2 = sc.nextInt();

        if ( numero1 > numero2 ){
            System.out.println("O numero 1: "+numero1+"é maior que numero 2 : "+numero2);
        }else if (numero1.equals(numero2)){
            System.out.println("O numero 1: "+numero1+"é igaul que numero 2 : "+numero2);
        }else{
            System.out.println("O numero 1: "+numero1+"é menor que numero 2 : "+numero2);
        }
    }
}