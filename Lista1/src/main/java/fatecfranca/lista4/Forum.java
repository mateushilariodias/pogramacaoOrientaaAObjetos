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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public Forum(String name, String url, ArrayList<Message> messages) {
        this.setName(name);
        this.setUrl(url);
        this.setMessages(messages);
    }

    public Forum() {
    }


    
}
