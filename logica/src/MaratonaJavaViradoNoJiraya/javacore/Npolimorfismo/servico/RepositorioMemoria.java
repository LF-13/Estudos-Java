package MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico;

import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
