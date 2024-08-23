import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**2. Um banco mantém contas de clientes armazenando o número
         * * da conta, o nome do cliente e o saldo atual da conta. Os
         * clientes podem depositar o quanto quiserem nas contas,
         * mas podem sacar somente enquanto a conta possuir saldo
         * positivo.
         */
        Banco banco = new Banco();
        System.out.println("Bem - vindo !!");

        //cadastro

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Numero da conta: ");
        Integer numeroConta = sc.nextInt();

        System.out.println("Saldo total: ");
        Double saldo = sc.nextDouble();

        //set
        banco.setNome(nome);
        banco.setNumeroConta(numeroConta);
        banco.setSaldo(saldo);

        //info
        banco.infoConta();
        

        System.out.println("Digite o numero para sua nessecidade:");
        System.out.println("----------------------------------------------------");

        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Retirar Saldo");
        System.out.println("3 - Info da sua conta");

        int i = sc.nextInt();

        if (i == 1) {
            //add saldo
            System.out.println("----------------------------------------------------");
            System.out.println("Quanto deseja adicionar em sua conta ?");
            Double addSaldo = sc.nextDouble();
            banco.addSaldo(addSaldo);

            banco.infoConta();

        } else if (i == 2) {
            //retirar saldo
            banco.infoConta();

            System.out.println("----------------------------------------------------");
            System.out.println("Quanto deseja retirar de seu saldo ?");
            Double retirar = sc.nextDouble();
            banco.retirarSaldo(retirar);

        } else {
            System.out.println("----------------------------------------------------");
            banco.infoConta();
        }
    }
}