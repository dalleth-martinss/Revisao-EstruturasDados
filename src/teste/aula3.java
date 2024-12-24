package teste;

import com.dalleth.estruturadados.vetor.Vetor;

public class aula3 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("Maça");
        vetor.adiciona("Uva");
        vetor.adiciona("Pêra");
        vetor.adiciona("Goiaba");
        vetor.adiciona("Banana");
        vetor.adiciona("Banana2");

        System.out.println(vetor);

    }
}
