package src;

import java.util.Scanner;

public class comparacaoDeMaiorNumeroEntre5valoresComLaco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero=0, maiorValor=0, maiorPosicao=0;

        System.out.print(" Qual vai ser a quantiedade de numeros: ");
        final Integer quantiedade = sc.nextInt();

        for (int i = 1; i <= quantiedade ;i++) {

            System.out.println("Informe o "+i+" valor ");
            numero = sc.nextInt();

            if (i==1) {
                maiorValor = numero;
                maiorPosicao = i;
            } else if (numero > maiorValor) {
                maiorValor = numero;
                maiorPosicao = i;
            }

            System.out.println("Qual maoir valor: "+maiorValor);
            System.out.println("Qual maoir posição: "+maiorPosicao);
        }
    }
}
