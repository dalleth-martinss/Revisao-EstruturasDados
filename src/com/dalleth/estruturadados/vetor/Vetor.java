package com.dalleth.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade]; // quem criar o objeto já tem que colocar o tamanho do array
        this.tamanho = 0; // inicializado com vlr 0, e foi criado para controlar o tamanho do array
    }

    //MODO INEFICIENTE DE FAZER ADIÇÕES NO ARRAY, PQ ELE PRECISA PERCORRER TODA A LISTA E VERIFICAR UMA POR UMA
/*    public void adiciona(String elemento){
        for (int i = 0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    //MODO MELHORADO COM UM CONTADOR DE TAMANHO
    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento; //O this.tamanho esta dentro de [] porque ao invés de colocar o 0 direto usamos
            this.tamanho++;                   //o this.tamanho que vale 0 pra ele acompanhar o tamanho do array.
            return true;
        } else{
           System.out.println("A cesta já está cheia.");
        }
        return false;
    }

    @Override
    public String toString() {
        return "{ " +
                "Essa é minha lista de frutas: " + Arrays.toString(elementos) +
                ", Ela tem o tamanho " + tamanho +
                '}';
    }


    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // stringBuilder armazena uma sequencia de caracteres em um buffer
        sb.append("[ "); //append -> adiciona o conteudo ao final do buffer interno stringBuilder
        for (int i = 0; i < elementos.length; i++) {//percorre todos os elementos
            sb.append(elementos[i]);//
            if (i < elementos.length - 1) { //Esse if evita que adicione uma virgula no ultimo elemento.
                sb.append(", ");
            }
        }
        sb.append(" ]"); // fecha colchetes
        return sb.toString();//converte o stringBuilder em string
    }*/

}
