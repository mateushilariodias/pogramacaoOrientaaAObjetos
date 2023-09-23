/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista6;

/**
 *
 * @author mateu
 */
public abstract class Animal {
    protected String name;
    protected Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public final void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nAnimal{" + "\nname=" + name + ", age=" + age + '}';
    }
    
}
