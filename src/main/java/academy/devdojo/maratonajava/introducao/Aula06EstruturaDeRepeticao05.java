package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 3000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
