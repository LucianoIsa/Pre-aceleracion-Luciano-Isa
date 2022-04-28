package com.alkemy.disney.disney.error.exception;

import org.springframework.validation.ObjectError;

import java.util.List;

public class ValidacionException extends RuntimeException {

    private static final long serialVersionUID = 4725137193770848720L;
    private final List<ObjectError> errores;

    public ValidacionException(List<ObjectError> errores) {
        super("Existen errores de validacion");
        this.errores = errores;
    }

    public List<ObjectError> getErrores() {
        return this.errores;
    }
}
