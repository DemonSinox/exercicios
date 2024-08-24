import java.util.Scanner;

public class calculoDeReajusteDeSalarioInformandoReajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o salario: ");
        double salario = sc.nextDouble();
        System.out.print("Informe o % de reajuste: ");
        double percReajuste = sc.nextDouble();

        double salarioReajustado= salario + (salario/100*percReajuste);

        System.out.println("Com salario de "+salario+"R$ obtendo um reajuste de "+percReajuste+"%");
        System.out.println("O valor reajustado fica "+salarioReajustado+"R$");
    }
}
