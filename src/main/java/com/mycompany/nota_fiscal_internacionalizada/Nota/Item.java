/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nota_fiscal_internacionalizada.Nota;

import javax.swing.SwingUtilities;

/**
 *
 * @author Aluno
 */
public class Item {
    
    public enum unidadeDeVenda{ 
        UNIDADE("unidade"), LITRO("litro"), KILO("kilo");
    int selecionar;
    String selecionarString;
    private unidadeDeVenda(int selecionar){
        this.selecionar = selecionar;
    }
    private unidadeDeVenda(String selecionar){
        this.selecionarString = selecionar;
    }
    public unidadeDeVenda getUnidade(){        
        int i = 1;        
        for (unidadeDeVenda unidade : unidadeDeVenda.values()) {
            if (i == selecionar || selecionarString.equalsIgnoreCase(unidade.toString()))
                return unidade;
            i++;
        }
        return null;
    }
};
    float preco;
    String nome;
    unidadeDeVenda unidade;
    String _unidade;
    
    public Item(String nome, float preco, String unidade){
        this.nome = nome;
        this.preco = preco;
        //this.unidade = unidadeDeVenda.valueOf(unidade);
        this._unidade = unidade;
    }
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {        
        return "Nome : " + nome + " R$ " + preco + " Unidade : " + unidade + "\n";
    }
    
    
}
