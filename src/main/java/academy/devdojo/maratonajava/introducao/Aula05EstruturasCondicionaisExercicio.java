package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        /*Taxas
            0 - 34.712 - 9.70%
            32.712 - 68.507 - 37.35%
            68.508 - 49.50%
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salário? ");
        double salary = scan.nextDouble();
        double tax;
        double howMuchToPay;
        double restSalary;

        if (salary < 34712){
            tax = 9.70 / 100;
            howMuchToPay = salary * tax;
            restSalary = salary - howMuchToPay;

            System.out.println("Salario: $" + String.format("%.2f", salary));
            System.out.println("Desconto: %" + String.format("%.2f", tax * 100));
            System.out.println("Taxa a pagar: $" + String.format("%.2f", howMuchToPay));
            System.out.println("O que sobra do salário: $" + String.format("%.2f", restSalary));

        } else if (salary >= 37712 && salary < 68507) {
            tax = 37.35 / 100;
            howMuchToPay = salary * tax;
            restSalary = salary - howMuchToPay;

            System.out.println("Salario: $" + String.format("%.2f", salary));
            System.out.println("Desconto: %" + String.format("%.2f", tax * 100));
            System.out.println("Taxa a pagar: $" + String.format("%.2f", howMuchToPay));
            System.out.println("O que sobra do salário: $" + String.format("%.2f", restSalary));
        } else {
            tax = 49.50 / 100;
            howMuchToPay = salary * tax;
            restSalary = salary - howMuchToPay;

            System.out.println("Salario: $" + String.format("%.2f", salary));
            System.out.println("Desconto: %" + String.format("%.2f", tax * 100));
            System.out.println("Taxa a pagar: $" + String.format("%.2f", howMuchToPay));
            System.out.println("O que sobra do salário: $" + String.format("%.2f", restSalary));
        }


    }
}
