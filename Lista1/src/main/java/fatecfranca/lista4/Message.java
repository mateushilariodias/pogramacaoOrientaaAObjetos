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

    public String getText() {
        return text;
    }

    public final void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public final void setPerson(Person person) {
        this.person = person;
    }

    public Message(String text, Person person) {
        this.setText(text);
        this.setPerson(person);
    }

    public Message() {
    }

}
