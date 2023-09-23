/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista6;

/**
 *
 * @author mateu
 */
public class Snake extends Animal {
    private boolean poisonous, smokes;

    public Snake() {
        super();
    }

    public Snake(boolean poisonous, boolean smokes, String name, Integer age) {
        super(name, age);
        this.setPoisonous(poisonous);
        this.setSmokes(smokes);
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public final void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public final void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    @Override
    public String toString() {
        return "Snake{" + "poisonous=" + poisonous + ", smokes=" + smokes + super.toString() + '}';
    }
    
}
