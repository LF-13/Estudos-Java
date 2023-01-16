package MaratonaJavaViradoNoJiraya.javacore.Qstring.test;

public class StringBuilderTest01Video111 {
    public static void main(String[] args) {
        String nome = "Larissa Fernandes";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Larissa Fernandes");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }

}
