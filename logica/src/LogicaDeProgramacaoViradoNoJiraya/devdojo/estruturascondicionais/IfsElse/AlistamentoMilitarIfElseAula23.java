/*
As secretary of military enlistment, I would like my system
to accept the following parameters so I can speed up the registration process:
sex, counting only M or F and age.
If the gender is Male and the age is greater than or equal to 18,
the system should print "Mandatory enlistment".
If the sex is Male and the age is less than 18 the system must print,
"Enlistment not allowed".
If the gender is female and the age is 18 years or older, the system should ask
if the person "Want to enlist".
If the gender is female and the age is less than 18 the system should print,
"Enlistment not allowed".

Como secretária de alistamento militar, gostaria que meu sistema
para aceitar os seguintes parâmetros para que eu possa acelerar o processo de registro:
sexo, contando apenas M ou F e idade.
Se o sexo for Masculino e a idade for maior ou igual a 18 anos,
o sistema deve imprimir "Alistamento obrigatório".
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir,
"Alistamento não permitido".
Se o sexo for feminino e a idade for 18 anos ou mais, o sistema deve perguntar
se a pessoa "Quer se alistar".
Se o sexo for feminino e a idade for menor que 18 o sistema deve imprimir,
"Alistamento não permitido".
 */

/*
ex: DevDojo
 */
//public class AlistamentoMilitarIfElseAula23 {
//    public static void main(String[] args) {
//        char genero = 'F';
//        int idade = 18;
//        if ((genero == 'M' || genero == 'F') && idade <= 17 ){
//            System.out.println("Alistamento não permitido");
//        }else if (genero == 'M' && idade >= 18){
//            System.out.println("Alistamento obrigatório");
//        }else if (genero == 'F' && idade >= 18){
//            System.out.println("Quer se alistar?");
//        }
//    }
//}



/*
EX: USEI O EXMPLO DO DEVDOJO COM A FUNÇÃO SCANNER
 */
//import java.util.Scanner;
//
//public class AlistamentoMilitarIfElseAula23 {
//    public static void main(String[] args) {
//        Scanner systemaMilitar = new Scanner(System.in);
//        System.out.println("QUAL É SEU GÊNERO MASCULINO OU FEMININO? ");
//        String sexo = systemaMilitar.next();
//        System.out.println("SUA IDADE? ");
//        int idade = systemaMilitar.nextInt();
//        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("MASCULINO") && idade >= 18) {
//            System.out.println("Alistamento obrigatório");
//        } else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("FEMININO") && idade >= 18) {
//            System.out.println("Quer se alistar?");
//        } else {
//            System.out.println("Alistamento não permitido");
//        }
//    }
//}


/*
ex: larissa
 */
//import java.util.Scanner;
//
//public class AlistamentoMilitarIfElseAula23 {
//    public static void main(String[] args) {
//        Scanner alistamento = new Scanner(System.in);
//        System.out.println("QUAL O SEU GÊNERO ENTRE MASCULINO OU FEMININO? COLOQUE M OU F: ");
//        String genero = alistamento.next();
//        System.out.println("AGORA, INFORME SUA IDADE: ");
//        int idade = alistamento.nextInt();
//        if (genero.equalsIgnoreCase("M") && idade >= 18 ) {
//            System.out.println("Alistamento obrigatório");
//        }else if ( genero.equalsIgnoreCase("F") && idade >= 18 ){
//            System.out.println("Quer se alistar?");
//        }else{
//            System.out.println("Alistamento não permitido");
//        }
//    }
//}


/*
ex: DevDojo
 */
//import java.util.Scanner;
//public class AlistamentoMilitarIfElseAula23 {
//    public static void main(String[]args){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your gender F or M: ");
//        String gender=input.next();
//        System.out.println("Enter your age: ");
//        int age=Integer.parseInt(input.next());
//        if(gender.equalsIgnoreCase("M")&&age>=18){
//            System.out.println("Mandatory enlistment");
//        }else if(gender.equalsIgnoreCase("M")&&age< 18){
//            System.out.println("Enlistment not allowed");
//        }else if(gender.equalsIgnoreCase("F")&&age>=18){
//            System.out.println("Want to enlist yes or no: ");
//            String enlistment=input.next();
//        }else if(gender.equalsIgnoreCase("F")&&age< 18){
//            System.out.println("Enlistment not allowed");
//        }else{
//            System.out.println("Incorrect answer, verify and try again.");
//        }
//    }
//}
