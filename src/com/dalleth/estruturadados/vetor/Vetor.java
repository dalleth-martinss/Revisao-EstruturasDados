package com.dalleth.estruturadados.vetor;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade]; // quem criar o objeto já tem que colocar o tamanho do array
    }
    public void adiciona(String elemento){
        for (int i = 0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    @Override
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
    }

}
