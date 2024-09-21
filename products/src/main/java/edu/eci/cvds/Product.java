package edu.eci.cvds;

/**
 * Sistema de monitoreo de stock de productos.
 */
public class Product
{

    private String id, name;

    /**
     * Constructor de la clase Product.
     * @param id El id del Producto.
     * @param name El nombre del producto.
    */
    public Product(String id, String name){
        this.id = id;
        this.name = name;
    }

    //getters y setters de la clase Producto.

    public string getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void getName(String name){
        this.name = name;
    }
}