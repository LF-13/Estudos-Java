package MaratonaJavaViradoNoJiraya.javacore.Isobrescrita.Jmodificadorfinal.test;

import MaratonaJavaViradoNoJiraya.javacore.Isobrescrita.Jmodificadorfinal.dominio.Carro;
import MaratonaJavaViradoNoJiraya.javacore.Isobrescrita.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01Video77 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
