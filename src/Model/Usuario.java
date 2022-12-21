/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Usuario extends Pessoa {

    private String senha;
    private String nivelDeAcesso;

    public Usuario(int id, String nome, char par1, String senha, String nivelDeAcesso, String sexo, String dataDeNascimento, String telefone, String RG) {
        super(id, nome, sexo, dataDeNascimento, telefone, RG);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario( String nome, String email,String senha, String nivelDeAcesso) {
        super(nome, email);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario( int id,String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

}
