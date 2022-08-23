package heb.esi.layouts.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private  final String message;
    private final HttpStatus httpStatus;
    private  final ZonedDateTime timesstamp;

    public ApiException(String message, HttpStatus httpStatus, ZonedDateTime timesstamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timesstamp = timesstamp;
    }

    public String getMessage() {
        return message;
    }



    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimesstamp() {
        return timesstamp;
    }
}
