package MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio;

public interface CarregadorDeDados {
    public static final int TAMANHO_MAX_DE_DADOS = 10;
    public abstract void carregar();


    public default void verificarPermissão(){
        System.out.println("Fazendo checagem de permissão");
    }

    public static void  recuperarTamanhoMaxDosDados(){
        System.out.println("Dentro do recuperarTamanhoMaxDosDados na interface");
    }

}
