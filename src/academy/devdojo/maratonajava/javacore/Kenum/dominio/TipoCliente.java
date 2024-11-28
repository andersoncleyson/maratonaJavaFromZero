package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    //public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
     //   return 0;
    //}

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
