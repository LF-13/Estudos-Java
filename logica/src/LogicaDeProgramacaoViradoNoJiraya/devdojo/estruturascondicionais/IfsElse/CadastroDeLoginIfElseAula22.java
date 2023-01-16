/*
Eu, como administrador do sistema, gostaria de permitir que os
próprios usuários cadastrassem o nome de usuário (login) no sistema
para agilizar o processo de migração do sistema antigo para o novo.

o usuário não pode deixar o login vazio"", ou criar um usuário com o
login "admin" ou "administrador".
se o valor da entrado for válido, o sistema deverá exibir uma mensagem
"<nome do usuário> cadastrado com sucesso"
senão o sistema devará mostrar o erro "usuário inválido"
 */

//import java.util.Scanner;
//
//public class CadastroDeLoginIfElseAula22 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Write your user name: ");
//        String user = input.next();
//        if (user.equals("") || user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador")) {
//            System.out.println("user invalid");
//        } else {
//            System.out.println(user + " registered with success");
//        }
//    }
//}



/*
EXCEMPLO LARISSA: UTILIZANDO .equals E .equalsIgnoreCase
.equals: QUANDO QUISER IGNORAR UMA PALAVRA ESPECIFICA COM A PALAVRA E A ESCRITA IQUALZINHO.
.equalsIgnoreCase: QUANDO QUISER IGNORAR UMA PALAVRA ESPECIFICA E NÃO IMPORTA COMO ELA ESTEJA ESCRITA.
 */
//import java.util.Scanner;
//
//public class CadastroDeLoginIfElseAula22 {
//    public static void main(String[] args) {
//        Scanner cadastroDeUsuario = new Scanner(System.in);
//        System.out.println("Cadastre seu nome de usuário (login) no nosso sistema: ");
//        String nomeDeUsuario = cadastroDeUsuario.next();
//        if (nomeDeUsuario.equals("") || nomeDeUsuario.equalsIgnoreCase("admin")  || nomeDeUsuario.equalsIgnoreCase("administrador") ) {
//            System.out.println("Você não pode usar esse nome, por favor coloque um nome valido");
//        } else{
//            System.out.println("Cadastrado com sucesso");
//        }
//    }
//}


/*
EXCEMPLO LARISSA 2
 */

//import java.util.Scanner;
//
//public class CadastroDeLoginIfElseAula22 {
//    public static void main(String[] args) {
//        Scanner alfabeto = new Scanner(System.in);
//        System.out.println("TESTE DE CONHECIMENTO, COLOQUE SOMENTE AS CONSOANTES DO BRASIL AQUI: ");
//        String consoantes = alfabeto.next();
//        if (consoantes.equals("aeiou") || consoantes.equalsIgnoreCase("a,e,i,o,u") || consoantes.equalsIgnoreCase("a") || consoantes.equalsIgnoreCase("e") || consoantes.equalsIgnoreCase("i") || consoantes.equalsIgnoreCase("o") || consoantes.equalsIgnoreCase("u") ) {
//            System.out.println("NÃO USER VOGAIS");
//        } else {
//            System.out.println("Consoantes: b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, z.");
//        }
//    }
//}