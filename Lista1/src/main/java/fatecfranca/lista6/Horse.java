/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista6;

/**
 *
 * @author mateu
 */
public class Horse extends Animal {
    private boolean competitor;

    public Horse() {
        super();
    }

    public Horse(boolean competitor, String name, Integer age) {
        super(name, age);
        this.setCompetitor(competitor);
    }

    public boolean isCompetitor() {
        return competitor;
    }

    public final void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "\nHorse{" + "\ncompetitor=" + competitor + super.toString() + '}';
    } 
    
    @Override
    public String move(){
        return "Troting";
    }
    
}
