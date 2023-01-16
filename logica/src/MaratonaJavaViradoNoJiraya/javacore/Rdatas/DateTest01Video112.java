package MaratonaJavaViradoNoJiraya.javacore.Rdatas;

import java.util.Date;

public class DateTest01Video112 {
    public static void main(String[] args) {
        Date date = new Date(1673901956564L); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
