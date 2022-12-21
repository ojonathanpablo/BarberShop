
package Controle;

import View.Login;


public class LoginController {

    private final Login View;

    public LoginController(Login View) {
        this.View = View;
    }
    
    public void fizTerefa(){
    System.out.print("busquei algo no banco de dados");
    
    this.View.exiberMensagem("Executei tarefa");
    }
}
