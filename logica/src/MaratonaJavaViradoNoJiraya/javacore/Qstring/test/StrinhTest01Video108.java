package MaratonaJavaViradoNoJiraya.javacore.Qstring.test;

public class StrinhTest01Video108 {
    public static void main(String[] args) {
        String nome = "Larissa";//String constant pool
        String nome2 = "Larissa";
        nome = nome.concat(" Fernandes");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Larissa"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

/**RESUMO: As Strings são imutáveis e precisa de cuidado para associar
 * o novo valor a variável de referência, se ñ vc ñ vai conseguir utilizar aquele valor novo**/

    }
}
