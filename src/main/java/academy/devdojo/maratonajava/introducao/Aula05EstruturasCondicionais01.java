package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 21;

        boolean isAutorizadoComprarBebida = age >= 20;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

    }
}
