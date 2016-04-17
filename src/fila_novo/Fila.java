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
public class Fila {
    
    private Nodo primeiro;
    private Nodo proximo;
    private int tamanho;
    
    
    Fila(){
        this.primeiro = null;
        this.proximo = null;
        this.tamanho = 0;
        }
    
    
    public void Push(int valor){
        Nodo novo = new Nodo(valor, null);
        if (tamanho == 0){
            primeiro = novo;
            proximo = null;
        
        }
        else{
            primeiro.SetProximo(novo);
            proximo = null;
    
        }
        tamanho = tamanho + 1;    
    
    
    }
    public int GetPrimeiro (){
        return primeiro.GetValor();
    
    }

}
        

