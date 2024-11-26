package org.example;

public class Message {
    private String sender;
    private String content;
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public String toString() {
        return "Content: " + this.content + " Sender: " + this.sender;
    }
}
