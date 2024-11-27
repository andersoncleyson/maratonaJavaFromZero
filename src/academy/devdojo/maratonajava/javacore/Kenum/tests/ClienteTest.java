package academy.devdojo.maratonajava.javacore.Kenum.tests;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Kakashi", TipoCliente.PESSOA_FISICA);
        Cliente client2 = new Cliente("Kakashi", TipoCliente.PESSOA_FISICA);
        Cliente client3 = new Cliente("Kakashi", TipoCliente.PESSOA_FISICA);
        Cliente client4 = new Cliente("Kakashi", TipoCliente.PESSOA_JURIDICA );

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}
