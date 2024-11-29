package br.com.alura.exercicio.salaretangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala é: " + perimetro);
    }
}
