package src;

import java.util.Scanner;

public class ExemploDeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeros[] = new Integer[5];
        final Integer quantidade = 5;

        Integer maiorValor=0,maiorPosicao=0;

        for (int i = 0;i < quantidade; i++){
            System.out.print("informe o "+(i+1)+"° posição");
            numeros[i]= sc.nextInt();

            if (numeros[i] == 0){
                maiorValor =  numeros[i];
                maiorPosicao = 1+i;
            } else if (numeros[i] > maiorValor) {
                maiorValor =  numeros[i];
                maiorPosicao = 1+i;
            }
        }

        System.out.println("Qual maoir valor: "+maiorValor);
        System.out.println("Qual maoir posição: "+maiorPosicao);

        System.out.println("Os valores recebidos foram: ");
        for (int i=0;i<quantidade;i++){
            System.out.println((1+i)+"° posição: "+numeros[i]);
        }
    }
}
