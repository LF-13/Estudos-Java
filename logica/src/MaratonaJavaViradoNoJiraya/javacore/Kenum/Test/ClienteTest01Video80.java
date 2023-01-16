//package MaratonaJavaViradoNoJiraya.javacore.Kenum.Test;
//
//import MaratonaJavaViradoNoJiraya.javacore.Kenum.dominio.Cliente;
//import MaratonaJavaViradoNoJiraya.javacore.Kenum.dominio.TipoCliente;
//import MaratonaJavaViradoNoJiraya.javacore.Kenum.dominio.TipoPagamento;
//
//import static MaratonaJavaViradoNoJiraya.javacore.Kenum.dominio.TipoPagamento.*;
//
//public class ClienteTest01Video80 {
//    public static void main(String[] args) {
//        Cliente cliente1 = new Cliente("José", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
//        Cliente cliente2 = new Cliente("YouTube", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
//
//        System.out.println(cliente1);
//        System.out.println(cliente2);
//        System.out.println(DEBITO.calcularDesconto(100));
//        System.out.println(CREDITO.calcularDesconto(100));
//        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
//        System.out.println(tipoCliente.getNomeRelatorio());
//        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
//        System.out.println(tipoCliente2);
//    }
//}