public class Main {
    public static void main(String[] args) {

        fracao a = new fracao();
        a.denominador = 4;
        a.numerador = 6;

        fracao b = new fracao();
        b.denominador = 2;
        b.numerador = 3;

        System.out.println(a.numerador*b.numerador + "/" + a.denominador*b.denominador);
    }
}