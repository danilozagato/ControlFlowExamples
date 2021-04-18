package pacote;

public class WhileExample {

    public void whileExample() {
        int contador = 1;
        while (contador < 11) {
            System.out.println("O contador é: " + contador);
            contador++;
        }
    }

    public void doWhileExample() {
        int contador = 1;
        do {
            System.out.println("O contador é: " + contador);
            contador++;
        } while (contador < 11);
    }
}
