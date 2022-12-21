/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Pessoa {

    protected int id;
    protected String nome;
    protected String sexo;
    protected Date dataDeNascimento;
    protected String telefone;
    protected String email;
    protected String RG;

    public Pessoa(int id, String nome, String sexo, String dataDeNascimento, String telefone, String RG) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataDeNascimento = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(dataDeNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.RG = RG;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getRG() {
        return RG;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

}
