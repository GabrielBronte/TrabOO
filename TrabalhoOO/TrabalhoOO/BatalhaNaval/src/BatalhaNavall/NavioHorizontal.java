/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatalhaNavall;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class NavioHorizontal extends Posicao implements Navios {

    public ArrayList alocaNavio(int tamanhoNav) {
        List<Integer> lista = new ArrayList<>();
        
        int linha = geraAleatorio(9, 1);
        int coluna = geraAleatorio(73 - tamanhoNav + 1, 65);
        
        while (!verificaPosH(linha, coluna, tamanhoNav)) {
            linha = geraAleatorio(9, 1);
            coluna = geraAleatorio(73 - tamanhoNav + 1, 65);
        }
        
        lista.add(this.transfNum(linha));
        lista.add(this.transfLetra(coluna));
        
        char aux = (char) coluna;
        String pos = "" + aux + linha;
        
        this.addMap(pos, "X");
        
        for (int i = 1; i < tamanhoNav; i++) {
            aux++;
            lista.add(this.transfLetra((int) aux));
            pos = "" + aux + linha;
            this.addMap(pos, "X");
        }
        return (ArrayList) lista;
    }
}
