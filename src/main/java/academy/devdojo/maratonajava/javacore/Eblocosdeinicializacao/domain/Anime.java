package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    public String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pra objeto
    // 2 - Cada atributo de classe é criado e incializado com valores default ou qualquer for passada
    // 3 - Bloco de inicialização é executada
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
