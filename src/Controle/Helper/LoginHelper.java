package Controle.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    private final Login View;

    public LoginHelper(Login view) {
        this.View = view;
    }

    public Usuario obterModelo() {
        String nome = View.getjLabelUsuario().getText();
        String senha = View.getjLabelSenha().getText();

        Usuario Usuario01 = new Usuario(1, nome, senha);
        return Usuario01;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        View.getjLabelUsuario().setText(nome);
        View.getjLabelSenha().setText(senha);
    }
    
    public void limparTela(){
        View.getjLabelUsuario().setText("");
        View.getjLabelSenha().setText("");
    }
    

}
