package MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.test;

import MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.dominio.Funcionario;
import MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.dominio.LoginInvalidoException;
import MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01Video105 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
