package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do carro?");
        double valorCarro = scan.nextDouble();
        System.out.println("Valor das parcelas?");
        double valorParcela = scan.nextDouble();
        double totalParcela = 0;

        int count = 0;

        for(int i = 1; i <= valorCarro; i++){
            double parcela = valorCarro / i;
            if(parcela < valorParcela){
                break;
            }
            count++;
            System.out.println("Parcela " + i + " - $" + String.format("%.2f", parcela));
        }
        System.out.println("Número de parcelas: " + count);
    }
}
