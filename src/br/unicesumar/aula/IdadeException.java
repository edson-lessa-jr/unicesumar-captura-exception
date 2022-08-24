package br.unicesumar.aula;

public class IdadeException extends Exception{
    public IdadeException(String message) {
        super(message);
    }

    public IdadeException() {
        super("Idade não é válida");
    }
}
