import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedir o nome da Universidade ao usuario
        System.out.println("Digite o nome da sua Universidade: ");

        // criacao da variaveil para armazenar o valor da resposta do usuario
        String nomeUniversidade = sc.next();

        System.out.println("Digite o nome da sua Materia : ");
        String materia = sc.next();

        // criacao da Classe Universidade, com o nome da Universidade
        Universidade universidade = new Universidade(nomeUniversidade,materia);


        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua Data de Nacimento: ");
        String dataNacimento = sc.next();

        Pessoa pessoa = new Pessoa (nome,dataNacimento);

        // mudando o valor da vareavel "nomeUniversidade" na Classe Universidade
        universidade.setUniversidade(nomeUniversidade,materia);
        pessoa.setDados(nome,dataNacimento);

        // agora vou replicara a mesma logica com a Class pessoa.
        System.out.println("Seu nome é "+pessoa.nome+", que da aula de "+universidade.materia+" na Universidade"+universidade.nomeUniversidade+", e sua data de nacimento é "+pessoa.dataNacimento+"." );


        // agora fazer as duas ultimas partes do exercicio , criar 2 outro objetos pessoas.

        // pessoa 1
        String nomeUniversidade1 = "Princeton (Nova Jersey - Estados Unidos da América)";
        String materia1= "Fisica";
        Universidade universidade1 = new Universidade(nomeUniversidade1,materia1);

        String nome1 = "Einstein";
        String dataNacimento1 = "14/03/1879";
        Pessoa pessoa1 = new Pessoa(nome1,nomeUniversidade1);

        pessoa1.setDados(nome1,dataNacimento1);
        universidade1.setUniversidade(nomeUniversidade1,materia1);

        System.out.println(pessoa1.nome+" trabalhou como professor de "+universidade1.materia+" em "+universidade1.nomeUniversidade+", e nasceu em "+pessoa1.dataNacimento);


        //pessoa 2
        String nomeUniversidade2 = "Cambridge (Inglaterra) ";
        String materia2 = "Matematica";

        Universidade universidade2 = new Universidade(nomeUniversidade2,materia2);

        String nome2 = "Newton";
        String dataNacimento2 = "04/01/1643";
        Pessoa pessoa2 = new Pessoa(nome2,nomeUniversidade2);

        pessoa2.setDados(nome2,dataNacimento2);
        universidade2.setUniversidade(nomeUniversidade2,materia2);

        System.out.println(pessoa2.nome+" trabalhou como professor de "+universidade2.materia+" em "+universidade2.nomeUniversidade+", e nasceu em "+pessoa2.dataNacimento);

    }
}