public class Main {
    public static void main(String[] args) {
        relogio a = new relogio();
        a.acertarRelogio(4,35,40);
        System.out.println(a.lerHora());
        System.out.println(a.lerMinuto());
        System.out.println(a.lerSegundo());

    }
}