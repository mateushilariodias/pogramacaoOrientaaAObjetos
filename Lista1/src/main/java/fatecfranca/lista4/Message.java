/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista4;

/**
 *
 * @author mateu
 */
public class Message {

    private String text;
    private Person person;

    public Message() {
    }

    public Message(String text, Person person) {
        this.setText(text);
        this.setPerson(person);
    }

    public String getText() {
        return text;
    }

    public Person getPerson() {
        return person;
    }

    public final void setText(String text) {
        this.text = text;
    }

    public final void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Message{" + "text=" + text + ", person=" + person.toString() + '}';
    }

}
