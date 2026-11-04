public class NumberDisplay {

    private int limit;
    private int value;

    /**
     * Constructor para los objetos de la clase NumberDisplay
     * Fijar el límite para el cual avanza la visualización
     */
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }

    /**
     * Devuelve el valor actual
     *
     */
    public int getValue(){
        return value;
    }

    /**
     * Devuelve el valor de visualización (es decir, el valor
     * actual en forma de String de dos dígitos. Si el valor es
     * menor que diez, lo rellena con un cero a la izquierda).
     *
     */
    public String getDisplayValue(){
        if(value < 10){
            return "0" + value,
        }else
            return "" + value;
    }

    /**
     * Configura el valor de la pantalla con el nuevo valor especificado. Si el
     * nuevo valor es menor que cero o superior al límite, no hace nada.
     */
    public void setValue(int replacementValue {
        if(replacementValue >= 0) && (replacementValue < limit){
            value = replacementValue;
        }
    }


    public void increment(){
        value = (value + 1) % limit;
    }
}
