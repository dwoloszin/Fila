/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_novo;

/**
 *
 * @author dwoloszin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Fila f1 = new Fila();
        f1.Push(10);
        f1.Push(2);
        f1.Push(3);
        
        
        System.out.println(f1.GetPrimeiro());
        
        
        
    }
    
}
