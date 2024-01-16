import br.com.alura.numeros.primos.NumerosPrimos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumerosPrimos verificar = new NumerosPrimos();

//        System.out.println("Digite um número para verificar se é primo: ");
//        int numero = entrada.nextInt();

        verificar.listarPrimos();

//        verificar.setNum(numero);
//        verificar.verificarPrimalidade();
    }
}