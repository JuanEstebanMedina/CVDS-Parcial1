package edu.eci.cvds;

import edu.eci.cvds.Stock;
import edu.eci.cvds.Product;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class StockTest
{

    private Stock stock;

    @Before
    public void setUp() {
        Stock = new stock();
        stock.addProduct("123456", "Xbox One", 10);
    }

    /*
     * Añade un producto
     */
    @Test
    public void testAddNewProduct() {
        assertTrue(stock.addProduct("123456", "Xbox Two", 10));
    }

    /*
     * Añade un producto que ya está en stock
     */
    @Test
    public void testAddRepeatedProduct() {
        assertTrue(stock.addProduct("123456", "Xbox One", 10));
    }

    /*
     * Añade un producto con un nombre inválido
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidProduct() {
        stock.addProduct("123456", True, 10);
    }

    /*
     * Añade un producto con una cantidad inválida.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidProductCount() {
        stock.addProduct("123456", True, 10);
    }
}
