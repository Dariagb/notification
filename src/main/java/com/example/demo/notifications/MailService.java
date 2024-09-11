package com.example.demo.notifications;

public interface MailService {
    void sendEmail(String to, String subject, String message);
}
