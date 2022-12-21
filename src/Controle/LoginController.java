
package Controle;

import Controle.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {
    private final Login View;
    private LoginHelper helper;
    
    public LoginController(Login View) {
        this.View = View;
        this.helper = new LoginHelper(View);
    }
        
    public void entraNoSistema(){
        //pegar usuario da view
        Usuario usuario = helper.obterModelo();

        //pesquisa usuario no banco
        //se o usuario da view tiver o mesmo usuario do banco -> redirenciona para o menu principal
        //se não vou mostra uma mensagem "Usuario ou senha invalido"
        
    }
    
    public void fizTerefa(){
        System.out.print("busquei algo no banco de dados");
    
        this.View.exiberMensagem("Executei tarefa");
    }
}
