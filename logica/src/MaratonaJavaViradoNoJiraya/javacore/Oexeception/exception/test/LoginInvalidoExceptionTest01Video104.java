package MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.test;

import MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01Video104 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "super saiyan";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitado = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado)|| ! senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
