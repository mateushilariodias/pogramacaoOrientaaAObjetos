/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista4;

import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class Forum {

    private String name, url;
    private ArrayList<Message> messages;

    public Forum() {
        this.messages = new ArrayList();
    }

    public Forum(String name, String url) {
        this.name = name;
        this.url = url;
        this.messages = new ArrayList();
    }
    
    public Forum(String name, String url, ArrayList<Message> messages) {
        this.setName(name);
        this.setUrl(url);
        this.setMessages(messages);
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setUrl(String url) {
        this.url = url;
    }

    public final void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message mensagem) {
        this.messages.add(mensagem);
    }

    public boolean removeMessage(Message mensagem) {
        return this.messages.remove(mensagem);
    }

    @Override
    public String toString() {
        return "\nForum{" + "\nname=" + name + ",\n url=" + url + ",\n messages=" + messages + '}';
    }

}
