package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante1.imprime();
        System.out.println("----------------");
        estudante2.imprime();
    }
}
