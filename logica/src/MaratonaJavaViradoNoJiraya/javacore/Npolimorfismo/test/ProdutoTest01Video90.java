package MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.test;

import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Televisao;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.dominio.Tomate;
import MaratonaJavaViradoNoJiraya.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01Video90 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Sansung 50\" ",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
