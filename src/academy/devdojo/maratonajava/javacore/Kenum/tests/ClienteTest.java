package academy.devdojo.maratonajava.javacore.Kenum.tests;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Kakashi", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente client2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa Física");
        System.out.println(tipoCliente);

    }
}
