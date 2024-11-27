package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private String tipo;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
