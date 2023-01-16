package MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.test;

import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Produto;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Tomate;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03Video93 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("23/12/2022");


        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(produto1);

    }
}
