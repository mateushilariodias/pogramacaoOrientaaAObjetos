/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista4;

/**
 *
 * @author mateu
 */
public class Person {
    private String name, user;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", user=" + user + '}';
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public final void setUser(String user) {
        this.user = user;
    }

    public Person(String name, String user) {
        this.setName(name);
        this.setUser(user);
    }

    public Person() {
    }
}
