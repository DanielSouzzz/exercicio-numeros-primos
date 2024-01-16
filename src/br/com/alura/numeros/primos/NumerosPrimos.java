package br.com.alura.numeros.primos;

public class NumerosPrimos {
    protected int num;
    boolean numPrimo = true;
    public void setNum(int num) {
        this.num = num;
    }
    // Verifica se o número é primo ou não.
    public void verificarPrimalidade(){
       for(int i = 2;i< num - 1; i++) {
           if (num % i == 0){
               numPrimo = false;
               break;
        }
        }
       if (numPrimo == true) {
           System.out.printf("O número %d é primo!\n", num);
       }else {
           System.out.printf("O número %d não é primo!\n", num);
       }
    }
    // Imprime todos os números primos de 2 a 100
    public void listarPrimos(){
        for (int i = 2;i<100;i++){
            setNum(i);
            verificarPrimalidade();
            numPrimo = true; // reinicia o valor
        }
    }
}
