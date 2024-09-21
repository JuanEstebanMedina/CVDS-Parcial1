package edu.eci.cvds;

/**
 * Sistema de monitoreo de stock de productos.
 */
public class Stock 
{
    private HashMap<Product, int> products;
    private HashMap<String, Agent> agents;
    
    /**
     * Método que añade un producto al stock
     * Si el producto no existe, lo crea.
     * Si el producto existe, aumenta su cantidad.
     * @param name El nombre del producto.
     * @param count La cantidad a añadir.
     *
     * @return true si el producto fue añadido, false en otro caso.
    */
    public boolean addProduct(String name, int count){
        return false;
    }

    /**
     * Método que atualiza un producto en stock.
     * Si el producto existe, lo actualiza.
     * Si el producto no existe, lo crea.
     * @param name El nombre del producto.
     * @param count La cantidad a añadir.
     *
     * @return true si el producto fue actualizado, false en otro caso.
    */
    public boolean updateProductCount(String name, int count){
        return false;
    }

    /**
     * Método que atualiza el nombre de un producto en stock.
     * Si el producto existe, lo actualiza.
     * Si el producto no existe, lo crea.
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
     * @param name El nombre del producto.
     * @param count La cnatidad a añadir.
     *
     * @return true si el producto fue actualizado, false en otro caso.
    */
    public boolean updateProductCount(String name, int count){
        return false;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
