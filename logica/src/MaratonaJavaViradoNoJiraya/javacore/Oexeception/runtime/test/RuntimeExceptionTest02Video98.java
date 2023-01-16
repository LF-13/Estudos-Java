package MaratonaJavaViradoNoJiraya.javacore.Oexeception.runtime.test;

public class RuntimeExceptionTest02Video98 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pose ser 0");
        }
        return a / b;
    }
}
