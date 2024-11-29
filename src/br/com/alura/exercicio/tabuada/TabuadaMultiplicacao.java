package br.com.alura.exercicio.tabuada;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int num) {
        for(int i = 0; i <= 10; i++){
            int total = num * i;
            System.out.println(num + " * " + i + " = " + total);
        }
    }
}
