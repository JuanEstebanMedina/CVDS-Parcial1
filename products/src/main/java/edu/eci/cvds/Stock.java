package edu.eci.cvds;

/**
 * Sistema de monitoreo de stock de productos.
 */
public class Stock 
{
    private HashMap<Product, Integer> products;
    private ArrayList<Agent> agents;
    
    /**
     * Método que añade un producto al stock
     * Si el producto no existe, lo crea.
     * Si el producto existe, aumenta su cantidad.
     * @param id El id del producto.
     * @param name El nombre del producto.
     * @param count La cantidad a añadir.
     *
     * @return true si el producto fue añadido, false en otro caso.
    */
    public boolean addProduct(String id, String name, int count){
        return false;
    }

    /**
     * Método que atualiza un producto en stock.
     * Si el producto existe, lo actualiza.
     * Si el producto no existe, lo crea.
     * @param id El id del producto.
     * @param name El nombre del producto.
     * @param count La cantidad a añadir.
     *
     * @return true si el producto fue actualizado, false en otro caso.
    */
    public boolean updateProductCount(String id, String name, int count){
        return false;
    }

    /**
     * Método que atualiza el nombre de un producto en stock.
     * Si el producto existe, lo actualiza.
     * @param id El id del producto. 
     * @param name El nombre del producto.
     *
     * @return true si el producto fue actualizado, false en otro caso.
    */
    public boolean updateProductName(String id, String name){
        return false;
    }


    /**
     * Método que añade un observador.
     * @param agent El objeto Agent.
     *
     * @return true si el observador fue añadido, false en otro caso.
    */
    public boolean addObserver(Agent agent){
        return false;
    }

    /**
     * Método que elimina un observador.
     * @param agent El objeto Agent.
     *
     * @return true si el observador fue añadido, false en otro caso.
    */
    public boolean removeObserver(Agent agent){
        return false;
    }

    /**
     * Método que notifica a todos los observadores que hubo un cambio en el 
     * stock.
    */
    public void notifyObservers(){
    }
}
