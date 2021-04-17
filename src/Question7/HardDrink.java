/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author 16055
 */
public enum HardDrink {
    MANSSIONHOUSE("ManssionHouse", "Balayya"), JAMESON("Jameson", "Venkat");
    private String title;
    private String consumer;

    private HardDrink(String title, String consumer) {
        this.title = title;
        this.consumer = consumer;
    }

    public String getTitle() {
        return title;
    }

    public String getConsumer() {
        return consumer;
    }

    @Override
    public String toString() {
        return title;
    }

}
