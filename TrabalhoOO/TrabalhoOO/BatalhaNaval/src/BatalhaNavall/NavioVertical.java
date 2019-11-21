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
public class NavioVertical extends Posicao implements Navios {

    public ArrayList alocaNavio(int tamanhoNav) {
        List<Integer> lista = new ArrayList<>();

        int linha = this.geraAleatorio(9 - tamanhoNav + 1, 1);
        int coluna = this.geraAleatorio(73, 65);

        while (!this.verificaPosV(linha, coluna, tamanhoNav)) {
            linha = this.geraAleatorio(9 - tamanhoNav, 1);
            coluna = this.geraAleatorio(73, 65);
        }
        char aux = (char) coluna;

        lista.add(this.transfLetra(coluna));
        lista.add(this.transfNum(linha));
        
        String pos = "" + aux + linha;
        this.addMap(pos, "X");
        
        for (int i = 1; i < tamanhoNav; i++) {
            linha++;
            lista.add(this.transfNum(linha));
            pos = "" + aux + linha;
            this.addMap(pos, "X");
        }
        return (ArrayList) lista;
    }

}
