package com.example.Send_Email.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailDetailsDto {
    private String toMail;
    private String message;
    private String subject;
}
