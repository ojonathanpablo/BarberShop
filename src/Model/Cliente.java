/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Cliente extends Pessoa {

    private String endereco;
    private String CEP;

    public Cliente(int id, String nome, String telefone, String dataDeNascimento, String sexo, String endereco, String CEP, String RG) {
        super(id, nome, sexo, dataDeNascimento, telefone, RG);
        this.endereco = endereco;
        this.CEP = CEP;
    }

    public Cliente(String nome, String email, String endereco, String CEP) {
        super(nome, email);
        this.endereco = endereco;
        this.CEP = CEP;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

}
