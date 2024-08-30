/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author aluno.saolucas
 */
public class pessoa {
    private String nome;
    private int idade;
    private String profissao;
public pessoa (String nome, int idade, String profissao){ 
   this.idade = idade;
   this.nome = nome;
   this.profissao = profissao;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
public void imprimi (){
    System.out.println(" " +nome+" "+idade+" "+profissao );
}
}
