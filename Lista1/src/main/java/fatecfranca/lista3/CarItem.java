/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista3;

/**
 *
 * @author mateu
 */
public class CarItem {
    private int quantity;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public CarItem(int quantity, Product product) {
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public CarItem() {
    }

    @Override
    public String toString() {
        return "\n CarItem{" + "quantity=" + quantity +
               ", product=" + product + '}';
    }
    
}
