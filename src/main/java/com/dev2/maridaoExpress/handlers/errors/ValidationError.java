package com.dev2.maridaoExpress.handlers.errors;

import com.dev2.maridaoExpress.handlers.FIeldMessage;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private static final long serialVersionUID = 1l;

    private List<FIeldMessage> errors = new ArrayList<>();

    public ValidationError(List<FIeldMessage> errors) {
        super();
    }

    public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);
        this.errors = errors;
    }

    public List<FIeldMessage> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String message) {
        this.errors.add(new FIeldMessage(fieldName, message));
    }
}
