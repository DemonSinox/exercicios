import java.util.Scanner;

public class exemplosDeIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        Integer numeroInteiro = sc.nextInt();

        if (numeroInteiro%2 == 0){
            System.out.println("Numero "+numeroInteiro+" é par");
        }else {
            System.out.println("Numero "+numeroInteiro+" é inpar");
        }
    }
}