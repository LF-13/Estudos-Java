/*
Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
senha corretos devem estar armazenados em constantes no seu programa. Se o usuário
acertar, o usuário e a senha. Exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir
a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha, essa condição deve-se
repetir até que o usuário acerte a combinação.

 */
package LogicaDeProgramacaoViradoNoJiraya.devdojo.lacosderepeticao.whiles;


/*
DevDojo
 */
//import java.util.Scanner;
//
//public class exercicioLoginAula04Video31 {
//    public static void main(String[] args) {
//        final String login = "Larissa";
//        final String password = "1313";
//        boolean exibirTelaLogin = true;
//        Scanner scanner = new Scanner(System.in);
//        while (exibirTelaLogin){
//            System.out.println("Digite seu login:");
//            String loginDigitado = scanner.nextLine();
//            System.out.println("Digite sua senha");
//            String passwordDigitado = scanner.nextLine();
//            if (login.equals(loginDigitado) && password.equals(passwordDigitado)){
//                System.out.println("ACESSO CONCEDIDO");
//                exibirTelaLogin = false;
//                break;
//            }
//                System.out.println("ACESSO NEGADO");
//        }
//        System.out.println("Programa terminado");
//    }
//}


/*
Refis a atividade feita pelo professor: DevDojo
 */
//import java.util.Scanner;
//
//public class exercicioLoginAula04Video31 {
//    public static void main(String[] args) {
//        final String passoUm = "Mlkasalsf";
//        final String passoDois = "741VOVOfernandes";
//        boolean passoTres = true;
//        Scanner teclado = new Scanner(System.in);
//        while (passoTres) {
//            System.out.println("Digite o login certo: ");
//            String passoQuatro = teclado.nextLine();
//            System.out.println("Digite o senha certa: ");
//            String passoQuinto = teclado.nextLine();
//            if (passoUm.equals(passoQuatro) && passoDois.equals(passoQuinto)) {
//                System.out.println("ACESSO CONCEDIDO");
//                passoTres = false;
//                break;
//            }
//            System.out.println("ACESSO NEGADO");
//        }
//        System.out.println("Programa terminado");
//    }
//}