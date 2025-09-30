package br.com.booksmy.exception;

import java.util.Date;

public record ExceptionReponse(
        Date timestamp,
        String msg,
        String details
) {}
