package src;

import java.util.Scanner;

public class comparacaoDeMaiorNumeroEntre5valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer maiorValor , maiorPosicao;

        System.out.println("Informe o primeiro valor: ");
        Integer numero1 = sc.nextInt();

        maiorValor = numero1;
        maiorPosicao =1;

        System.out.println("Informe o segundo valor: ");
        Integer numero2 = sc.nextInt();

        if (numero2 > maiorValor){
            maiorValor = numero2;
            maiorPosicao = 2;
        }

        System.out.println("Informe o treceiro valor: ");
        Integer numero3 = sc.nextInt();

        if (numero2 > maiorValor){
            maiorValor = numero3;
            maiorPosicao = 3;
        }

        System.out.println("Informe o quarto valor: ");
        Integer numero4 = sc.nextInt();

        if (numero2 > maiorValor){
            maiorValor = numero4;
            maiorPosicao = 4;
        }

        System.out.println("Informe o quinto valor: ");
        Integer numero5 = sc.nextInt();

        if (numero2 > maiorValor){
            maiorValor = numero5;
            maiorPosicao = 5;
        }

        System.out.println("Qual maoir valor: "+maiorValor);
        System.out.println("Qual maoir posição: "+maiorPosicao);


    }
}
