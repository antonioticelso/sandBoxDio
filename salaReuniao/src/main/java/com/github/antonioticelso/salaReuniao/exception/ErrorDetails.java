package com.github.antonioticelso.salaReuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ErrorDetails {

    private Date timesTamp;
    private String message;
    private String details;

}
