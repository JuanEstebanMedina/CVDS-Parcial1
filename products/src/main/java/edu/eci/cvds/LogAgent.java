package edu.eci.cvds;


public class LogAgent implements Agent{

    /**
     * Constructor de la clase LogAgent.
    */
    public LogAgent(){
    }

    @Override
    public void log(String productName, int count){
        System.out.println(String.format("Producto: %s -> %d unidades disponibles",
                                        productName, count));
    }
    
}
