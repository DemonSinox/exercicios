
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo !! ");

        System.out.println("Digite seu nome completo por gentileza :D :");
        String Nome = sc.next();

        System.out.println("Sua idade: ");
        Integer Idade = sc.nextInt();

        System.out.println("Seu peso: ");
        Double Peso = sc.nextDouble();

        System.out.println("Sua altura: ");
        Double Aultura = sc.nextDouble();

        System.out.println("Cadastro concluido ! ");

        Academia aluno = new Academia();
        aluno.setAluno(Nome,Idade,Peso,Aultura);

        aluno.imprimirDados();
    }
}
