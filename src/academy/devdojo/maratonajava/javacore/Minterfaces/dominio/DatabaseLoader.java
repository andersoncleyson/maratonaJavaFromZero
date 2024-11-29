package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void load() {
        System.out.println("Carragando dados do banco de dados");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados");
    }
}
