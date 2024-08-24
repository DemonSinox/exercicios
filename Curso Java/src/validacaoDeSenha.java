package src;

import java.util.Scanner;

public class validacaoDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final Integer senhaCorreta = 12345;
        final Integer quantidadeMaxDeTentativas = 3;
        Integer senhaDigitada = 0;
        Integer quantidadeDeTentativas = 0;

        do {
            System.out.println("Informe sua senha: ");
            senhaDigitada = sc.nextInt();
            quantidadeDeTentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta!");
                break;
            } else {
                System.out.println("A senha está incorreta");
            }

        } while (quantidadeDeTentativas < quantidadeMaxDeTentativas);

        if (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Tentativas esgotadas. Tente novamente mais tarde.");
        }

    }
}

