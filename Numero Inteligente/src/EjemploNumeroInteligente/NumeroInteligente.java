package EjemploNumeroInteligente;

/**
 * La clase {@code NumeroInteligente} es un número declarado por el propio usuario.
 * Esta clase tiene varios métodos que afectan al propio número como:
 * - Incrementar
 * - Decrementar
 * - Comprobación de propiedades matemáticas
 * <p>
 *     Ejemplo de su uso:
 *     <pre>
 *         NumeroInteligente numero = new NumeroInteligente(5);
 *         numero.incrementar();
 *         System.out.println(numero.getValor()); // Imprime 6
 *     </pre>
 * </p>
 * @see java.lang.Math
 * @author shockwave
 * @version 1.0
 */

public class NumeroInteligente {
    /**
     * Valor por defecto que se asigna al número inteligente
     */
        public static final int porDefecto = 1;
    /**
     * Cantidad de incremento o decremento por defecto.
     */
    public static final int PASO = 1;

    private int valor;

    /**
     * Constructor que inicializa el número a su valor por defecto
     */
    public NumeroInteligente() {
            resetear();
        }

    /**
     * Constructor que inicializa un nuevo número inteligente con el valor proporcionado.
     * @param valor valor entero declarado por el usuario.
     */
    public NumeroInteligente(int valor) {
            setValor(valor);
        }

    /**
     *Obtiene el valor del número inteligente.
     * @return Retorna el valor actual del número inteligente.
     */
        public int getValor() {
            return valor;
        }

    /**
     * Establece un nuevo valor al número inteligente.
     * @param valor El nuevo valor a establecer
     */
        public void setValor(int valor) {
            this.valor = valor;
        }

    /**
     * Restablece el valor del número inteligente a su valor por defecto.
     */
        public void resetear() {
            setValor(porDefecto);
        }

    /**
     * Incrementa el valor del número inteligente en una unidad.
     *
     */
        public void incrementar() {
            incrementar(PASO);
        }

    /**
     * Incrementa el valor del número inteligente en una cantidad específica.
     * @param cantidad la cantidad que sumaremos al valor actual.
     */
    public void incrementar(int cantidad) {
            setValor(valor + cantidad);
        }

    /**
     * Decrementa el valor del número inteligente en una unidad.
     */
    public void decrementar() {
            decrementar(PASO);
        }

    /**
     * Decrementa el valor del número inteligente en una cantidad específica
     * @param cantidad la cantidad a restar al valor actual.
     */
    public void decrementar(int cantidad) {
            setValor(valor - cantidad);
        }

    /**
     * Comprueba si el número es primo
     *
     * @return {@code true} si el número es primo; {@code false} en caso contrario.
     */
    public boolean esPrimo () {
            if (valor <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(valor); i++){
                if (valor % i == 0){
                    return false;
                }
            }
            return true;
        }

    /**
     * Comprueba si el número es perfecto
     * @return {@code true} si el número es perfecto ; {@code false} en caso contrario.
     */
    public boolean esPerfecto(){
            if ( valor < 2){
                return false;
            }
            int suma = 0;
            for (int i = 1; i < valor; i++){
                if (valor % i == 0){
                    suma+= i;
                }
            }
            return suma == valor;
        }

    /**
     * Devuelve la información del número inteligente,
     * @return Devuelve texto con los datos de número inteligente.
     */
    public String toString(){
            return "El número inteligente es: " + valor ;
        }
}
