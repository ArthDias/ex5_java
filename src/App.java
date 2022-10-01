import java.util.Scanner;

public class App {

    static final byte MULTIPLICACAO_CONVERSAO = 100;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        float metro = 0f;
        float centimetros = 0f;

        System.out.print("Digite a medida em metros: ");
        metro = console.nextFloat();
        
        centimetros = metro * MULTIPLICACAO_CONVERSAO;

        System.out.println("A medida convertida em centímetros é " + centimetros + "cm");
        console.close();
    }
}
