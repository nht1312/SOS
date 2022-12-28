package com.itnhtu.sos;
public class MessageModal {

    //string t store our message and sender
    private String message;
    private String sender;
//    private String cnt;
//
//    public MessageModal(String cnt) {
//        this.cnt = cnt;
//    }
//
//    public String getCnt() {
//        return cnt;
//    }
//
//    public void setCnt(String cnt) {
//        this.cnt = cnt;
//    }

    //constructor.
    public MessageModal(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    //getter and setter methods.
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}