package MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio;

public class CarregadorDeArquivos implements CarregadorDeDados, RemovedorDeDados {
    @Override
    public void carregar() {
        System.out.println("Carregando dados de um arquivos");


    }

    @Override
    public void remover() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void verificarPermissão() {
        System.out.println("Checando permissões no arquivo");
    }
}
