/*
Como usuário eu gostaria de ter um menu visual que seja navegável
através de números,
O menu deve ser exibido da seguinte forma.

1-Calcular imposto
2-Depositar salário
3-sair

O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser
reiniciado a cada operação.
 */

package LogicaDeProgramacaoViradoNoJiraya.devdojo.lacosderepeticao.whiles;

/*
Exemplo DevDojo
 */
//public class menuAula03Video30 {
//    public static void main(String[] args) {
//        int opcao = 0;
//        Scanner teclado = new Scanner(System.in);
//        while (opcao != 3){
//            System.out.println("1-Calcular imposto");
//            System.out.println("2-Depositar salário");
//            System.out.println("3-sair");
//            System.out.println("Digite a sua opção");
//            opcao = teclado.nextInt();
//        }
//        System.out.println("Saída: Programa encerrado");
//    }
//}


/*
Exemplo que EU fiz
 */

//public class menuAula03Video30 {
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        String menu;
//        System.out.println("Menu informações. coloque o número 1 para Calcular imposto, 2 para Depositar salário e 3 para sair:");
//        menu = teclado.nextLine();
//        while (!menu.equalsIgnoreCase("3")) {
//            System.out.println("Você digitou " + menu);
//            switch (menu) {
//                case "1":
//                System.out.println("Calcular imposto");
//                System.out.printf(" Menu informações. coloque o número 1 para Calcular imposto, 2 para Depositar salário e 3 para sair:");
//                menu = teclado.next();
//                break;
//                case "2":
//                System.out.println("Depositar salário");
//                System.out.println("Menu informações. coloque o número 1 para Calcular imposto, 2 para Depositar salário e 3 para sair:");
//                menu = teclado.next();
//                break;
//                default:
//                    System.out.println("ERROR");
//            }
//        }
//        System.out.println("Sair");
//    }
//}


