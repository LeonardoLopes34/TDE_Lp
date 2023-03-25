public class Main {
    public static void main(String[] args) {
        triangulo a = new triangulo();
        a.altura = 4;
        a.base = 2;
        System.out.println("Triângulo = " + a.calcularArea());

        quadrado b = new quadrado();
        b.lado = 6;
        System.out.println("Quadrado = " + b.calcularArea());

        circulo c = new circulo();
        c.raio = 8;
        System.out.println("Circunferência = " + c.calcularArea());

        trapezio d = new trapezio();
        d.baseMenor = 4;
        d.baseMaior = 4;
        d.altura = 6;
        System.out.println("Trapézio = " + d.calcularArea());

    }
}