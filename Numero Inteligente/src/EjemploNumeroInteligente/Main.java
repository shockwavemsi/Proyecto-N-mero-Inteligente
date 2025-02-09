package EjemploNumeroInteligente;

/**
 * Clase Principal para demostras las funcionalidades de la clase {@code NumeroInteligente}.
 * Este programa muestra cómo crear un objeto de la clase {@code NumeroInteligente} y utilizar
 * sus métodos para incrementar, decrementar y comprobar propiedades matemáticas.
 * @author shockwave
 * @version 1.0
 */

public class Main {
    /**
     * Método principal que ejecuta el programa
     * @param args argumentos de la línea de comando
     */
    public static void main(String[] args) {
        NumeroInteligente c = new NumeroInteligente();
        NumeroInteligente c2 = new NumeroInteligente();

        System.out.printf("Número inteligente: %d\n", c.getValor());
        c.incrementar(3);
        System.out.printf("Número inteligente: %d\n", c.getValor());
        c.decrementar(1);
        System.out.printf("Número inteligente: %d\n", c.getValor());

        System.out.printf("\n\n");

        // Encontraremos 20 números primos

        int primosEncontrados = 0;
        while (primosEncontrados < 20){
            if (c.esPrimo()){
                System.out.printf("Primo encontrado: %d\n", c.getValor());
                primosEncontrados++;
            }
            c.incrementar(1);
        }


        System.out.printf("\n\n");

        // Preguntamos si el número es perfecto

        c.setValor(6);

        System.out.printf("El número %d %s es perfecto",c.getValor(), c.esPerfecto() ? "si" : "no");
        System.out.println("Prueba de cambios den git");


    }
}
