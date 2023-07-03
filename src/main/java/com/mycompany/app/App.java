package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
// Hola prueba hello world3 primer commit
    private final String message = "Hello World3!";
    // Prueba con commit dos y warning
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
