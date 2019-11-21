package BatalhaNavall;

import java.util.Random;
import java.util.*;

class Posicao {

    private static Map<String, String> tabuleiro;

    public Posicao() {
        tabuleiro = new HashMap<>();
        char letra = 'A';

        for (int i = 1; i <= 9; i++) {
            String pos = "" + letra + i;
            tabuleiro.put(pos, "");
            if (i == 9 && letra < 'J') {
                letra++;
                i = 0;
            }
        }
    }

    /**
     *
     * @param max
     * @param min
     * @return
     */
    public int geraAleatorio(int max, int min) {
        //10 e 1 para linhas 
        //73 e 65 para colunas | 73 = I , 65 = A

        Random random = new Random();
        int auxiliar = random.nextInt((max - min) + 1) + min;
        return auxiliar;
    }

    public int transfLetra(int numero) {
        if (numero == 73) {
            return 9;
        } else if (numero == 72) {
            return 8;
        } else if (numero == 71) {
            return 7;
        } else if (numero == 70) {
            return 6;
        } else if (numero == 69) {
            return 5;
        } else if (numero == 68) {
            return 4;
        } else if (numero == 67) {
            return 3;
        } else if (numero == 66) {
            return 2;
        } else if (numero == 65) {
            return 1;
        }
        return 0;
    }

    public int transfNum(int numero) {
        return numero - 1;
    }

    public boolean verificaPosV(int linha, int coluna, int tamanhoNav) {
        char aux = (char) coluna;
        String pos = "" + aux + linha;

        for (int i = 0; i < tamanhoNav; i++) {
            if (!tabuleiro.get(pos).equals("X")) {
                linha++;
                pos = "" + aux + linha;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean verificaPosH(int linha, int coluna, int tamanhoNav) {
        char aux = (char) coluna;
        String pos = "" + aux + linha;

        for (int i = 0; i < tamanhoNav; i++) {
            if (!tabuleiro.get(pos).equals("X")) {
                aux++;
                pos = "" + aux + linha;
            } else {
                return false;
            }
        }
        return true;
    }
    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void addMap(String pos, String x) {
        this.getTabuleiro().put(pos, x);
        //System.out.println(pos);
        //System.out.println(this.getTabuleiro().get(pos));
    }

    /**
     * @return the tabuleiro
     */
    public Map<String, String> getTabuleiro() {
        return tabuleiro;
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
