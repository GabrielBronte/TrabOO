/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatalhaNavall;

import static BatalhaNavall.Menu.nome1;
import static BatalhaNavall.Menu.nome2;
import javax.swing.JOptionPane;

/**
 *
 * @author Principal
 */
class Jogadores {
    
    private static String nome1;
    private static String nome2;
    
    public static void setNomes(){
        nome1 = JOptionPane.showInputDialog(null,"Digite o nome do jogador 1");
        nome2 = JOptionPane.showInputDialog(null,"Digite o nome do jogador 2");
        
    }
    public static String getNome1(){
        return nome1;
    }
    public static String getNome2(){
        return nome2;
    }
    
    
}
