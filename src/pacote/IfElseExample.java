package pacote;

public class IfElseExample {

    public void exemploIf(Boolean condicao) {
        if (condicao) {
            System.out.println("Sua condição é verdadeira");
        } else {
            System.out.println("Sua condição é falsa");
        }
    }

    public void exemploIfElse(Integer numero) {
        if (numero < 0) {
            System.out.println("O numero informado é negativo");
        } else if (numero % 2 == 0) {
            System.out.println("O Numero informado é Par");
        } else if (numero % 2 >= 1) {
            System.out.println("O numero informado é impar");
        }
    }
}
