import java.util.Scanner;

public class calculoDeHorasMinutosSegundosParaSegundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe as horas: ");
        int horas = sc.nextInt();
        System.out.print("Informe os minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Informe os segundos: ");
        int segundos = sc.nextInt();
        int resultado= (horas*60*60) + (minutos*60) + segundos;
        System.out.println("Segundos: "+resultado);
    }
}
