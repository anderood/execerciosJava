public class Main {
    public static void main(String[] args) {

        Administrativo administrativo = new Administrativo("Joao", 4.789, 98765, "noite");
        administrativo.exibeDados();

        Tecnico tecnico = new Tecnico("Douglas", 2.789, 1234, 1000);
        tecnico.exibeDados();
    }
}