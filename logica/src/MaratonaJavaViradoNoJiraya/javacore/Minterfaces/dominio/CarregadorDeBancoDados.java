package MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio;

public class CarregadorDeBancoDados implements CarregadorDeDados, RemovedorDeDados {
    //  private -> default -> protectec -> public
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void verificarPermissão() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void recuperarTamanhoMaxDosDados() {
        System.out.println("Dentro do recuperarTamanhoMaxDosDados na classe CarregadorDeBancoDados");
    }

}
