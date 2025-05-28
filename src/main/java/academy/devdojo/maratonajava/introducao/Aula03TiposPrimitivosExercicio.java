package academy.devdojo.maratonajava.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String []args){
        String name = "Anderson";
        String address = "Av. Esperança 801";
        double salary = 5000.00;
        Date date = new Date();
        String dateNow = new SimpleDateFormat("dd/MM/yyyy").format(date);


        System.out.println("Eu " + name + " morando no endereço " + address + ",");
        System.out.println("confirmo que recebi o salário de " + salary + ", na data " + dateNow);
    }
}
