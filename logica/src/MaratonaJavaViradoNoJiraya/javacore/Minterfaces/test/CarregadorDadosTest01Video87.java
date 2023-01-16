package MaratonaJavaViradoNoJiraya.javacore.Minterfaces.test;

import MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio.CarregadorDeArquivos;
import MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio.CarregadorDeBancoDados;
import MaratonaJavaViradoNoJiraya.javacore.Minterfaces.dominio.CarregadorDeDados;

public class CarregadorDadosTest01Video87 {
    public static void main(String[] args) {
        CarregadorDeBancoDados carregadorDeBancoDados = new CarregadorDeBancoDados();
        CarregadorDeArquivos carregadorDeArquivos = new CarregadorDeArquivos();

        carregadorDeBancoDados.carregar();
        carregadorDeArquivos.carregar();


        carregadorDeBancoDados.remover();
        carregadorDeArquivos.remover();


        carregadorDeBancoDados.verificarPermissão();
        carregadorDeArquivos.verificarPermissão();

        CarregadorDeDados.recuperarTamanhoMaxDosDados();
        CarregadorDeBancoDados.recuperarTamanhoMaxDosDados();
    }
}
