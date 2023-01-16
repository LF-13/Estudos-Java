package MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.test;

import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Produto;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02Video91 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 3000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("----------------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
