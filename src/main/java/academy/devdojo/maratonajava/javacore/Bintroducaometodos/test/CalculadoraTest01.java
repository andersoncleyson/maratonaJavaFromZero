package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(4, 4);
        double divisao = calculadora.divideDoisNumeros(6.4, 3.5);
        System.out.println(String.format("%.2f", divisao));

        System.out.println("Finalizando CalculadoraTest01");
    }
}
