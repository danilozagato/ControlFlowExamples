package pacote;

public class ForExample {

    public void forWithCountExample() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("O contador está em: " + i);
        }
    }

    public void forEachExample() {
        Integer[] listaValores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (Integer valor : listaValores) {
            System.out.println("O valor atual é: " + valor);
        }
    }
}
