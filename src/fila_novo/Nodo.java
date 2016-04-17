/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_novo;

/**
 *
 * @author Dwoloszin
 */
public class Nodo{
    private int valor;
    private Nodo proximo;
    
    //constutor
    Nodo(int valor, Nodo proximo){
        this.valor = valor;
        this.proximo = proximo;
    }
    
    public int GetValor(){
        return valor;
    
    }
    
    public Nodo GetProximo (){
        return proximo;
    
    }
    
    public void SetValor(int valor){
        this.valor = valor;
    }
    
    public void SetProximo(Nodo proximo){
        this.proximo = proximo;
    
    }
    
    
    
    
    
}
