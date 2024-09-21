package edu.eci.cvds;


public class WarningAgent implements Agent{
    
    /**
     * Constructor de la clase WarningAgent.
    */
    public WarningAgent(){
    }

    @Override
    public void log(String productName, int count){
        if (count < 5){
            System.out.println(
                String.format("ALERTA!!! El stock del Producto: %s es muy bajo, solo quedan %d unidades.",
                            productName, count));
        }
    }
}
