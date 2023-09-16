/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista3;

import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class ShoppingCart {

    private int id;
    private ArrayList<CarItem> carItens;

    public float calculateTotal() {
        float total = 0;
        for (int i = 0; i < carItens.size(); i++){
            total += carItens.get(i).getQuantity()
                    * carItens.get(i).getProduct().getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "id=" + id + ", carItens=" + carItens + "\n Total: " +
                this.calculateTotal() +'}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }

    public void setCarItens(ArrayList<CarItem> carItens) {
        this.carItens = carItens;
    }

    public ShoppingCart(int id, ArrayList<CarItem> carItens) {
        this.id = id;
        this.carItens = carItens;
    }

    public ShoppingCart() {
        this.carItens = new ArrayList();
    }

    public void addCarItem(CarItem carItem) {
        this.carItens.add(carItem);
    }

    public boolean removeCarItem(CarItem carItem) {
        return this.carItens.remove(carItem);
    }

}
