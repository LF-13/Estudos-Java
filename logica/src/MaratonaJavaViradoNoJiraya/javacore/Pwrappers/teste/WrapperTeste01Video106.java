package MaratonaJavaViradoNoJiraya.javacore.Pwrappers.teste;

public class WrapperTeste01Video106 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;


        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //AUTOBOXING
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'w';
        Boolean booleanW = false;

        int i1 = intW; //UNBOXING

/**Resumo: O Wrappers praticamente e o mesmo nome dos tipos primitivos
 * (mas com a primeira letra maiúscula). Só exceção do int q virar Integer e o char q virar Character.
 * Assim eles viraram classes e não mas tipos primitivos.
 *
 * obs: Atalho para mudar letras e palavras: ctrl + F, depois ctrl + E,
 * colocar a letra q quer mudar e ctrl + P.
 **/
/**Classes Utilitárias - Wrappers
 * AUTOBOXING: É praticamente quando ser tem um tipo primitivo e você simplesmente,
 * faz o Java transformar esse tipo primitivo em um tipo Wrappers.
 *
 * UNBOXING: É ao contrário, o java está se encarregando de transformar esse tipo BOXING,
 * em um tipo primitivo.**/


        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeira = Boolean.parseBoolean(null);
        System.out.println(verdadeira);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
