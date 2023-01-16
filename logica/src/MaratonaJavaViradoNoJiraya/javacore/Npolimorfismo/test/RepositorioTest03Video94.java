package MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.test;


import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.repositorio.Repositorio;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico.RepositorioArquivo;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest03Video94 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);

    }
}
