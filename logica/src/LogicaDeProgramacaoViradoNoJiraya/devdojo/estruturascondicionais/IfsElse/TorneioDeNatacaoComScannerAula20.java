/*
Eu como usário gostaria de ter o nome e a idade de participantes de um
torneio de natação e que o sistema imprimisse da seguinte forma.
Menor que 10 anos: <Nome> participará da categoria Infatil.
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil.
Entre 16 e 19 anos: <Nome> participará da categoria Pré - adulto.
Acima de 20 anos: <Nome> participará da categoria Adulto.
Para que eu possa rapidamente classificar todos os participantes.

DESAFIO: COLOCAR O SCANNER PARA OS PARTICIPANTES COLOCAR SEUS NOMES E IDADE.
 */

//
//import java.util.Scanner;
//
//public class TorneioDeNatacaoComScannerAula20 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        String nome = input.next();
//        System.out.println("Digite a sua idade: ");
//        int idade = input.nextInt();
//        if (idade <= 10) {
//            System.out.println(nome + " participará da categoria Infatil");
//        } else if (idade >= 11 && idade < 15) {
//            System.out.println(nome + " participará da categoria Juvenil");
//        } else if (idade >= 16 && idade <= 19) {
//            System.out.println(nome + " participará da categoria Pré - adulto");
//        } else {
//            System.out.println(nome + " participará da categoria adulto");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class TorneioDeNatacaoComScannerAula20 {
//    public static void main(String[] args) {
//        Scanner torneioDeNatacao = new Scanner(System.in);
//        System.out.println("BEM-VINDO PARTICIPANTE, COLOQUE SEU PRIMEIRO NOME AQUI:  ");
//        String nome = torneioDeNatacao.next();
//        System.out.println("AGORA COLOQUE SUA IDADE AQUI: ");
//        int idade = torneioDeNatacao.nextInt();
//        if (idade <= 10){
//            System.out.println(nome + " participará da categoria Infatil.");
//        } else if (idade >= 11 && idade <= 15){
//            System.out.println(nome + " participará da categoria Juvenil");
//        } else if (idade >= 16 && idade <= 19){
//            System.out.println(nome + " participará da categoria Pré - adulto.");
//        }else{
//            System.out.println(nome + " participará da categoria Adulto.");
//        }
//    }
//}