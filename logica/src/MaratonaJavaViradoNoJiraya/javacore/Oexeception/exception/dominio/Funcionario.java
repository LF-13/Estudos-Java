package MaratonaJavaViradoNoJiraya.javacore.Oexeception.exception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionário");
    }
}
