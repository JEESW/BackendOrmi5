package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class EmailService {
  private final EmailSender emailSender;

  public EmailService (EmailSender emailSender) {
    this.emailSender = emailSender;
  }

  public void sendEmail(String to, String subject, String body) {
    emailSender.sendEmail(to, subject, body);
  }
}
