/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teclado;

import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

class Tecla {
    private String color, marca, escribir, tamaño;

    public void setcolor(String color) {
        this.color = color;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void setescribir(String escribir) {
        this.escribir = escribir;
    }

    public void settamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getcolor() {
        return color;
    }

    public String getmarca() {
        return marca;
    }

    public String getescribir() {
        return escribir;
    }

    public String gettamaño() {
        return tamaño;
    }
}

class pantalla {
    private String mostrar, encender;

    public void setmostrar(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getmostrar() {
        return mostrar;
    }

    public void setencender(String encender) {
        this.encender = encender;
    }

    public String getencender() {
        return encender;
    }
}

public class Teclado {
    public static void main(String[] args) {
        Tecla tecla1 = new Tecla();
        pantalla pantalla1 = new pantalla();
        tecla1.setcolor("rojo");
        tecla1.setmarca("omega");
        JFrame frame = new JFrame("Tecla F1");
        frame.setSize(200, 100);
        frame.setUndecorated(true);
        frame.setOpacity(0f); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    Scanner entrada = new Scanner(System.in);

                    System.out.println("F1 presionada. Pantalla encendida.");
                    pantalla1.setencender("encendida");

                    System.out.println("Ingrese el tamaño del teclado:");
                    String tamaño = entrada.nextLine();
                    if (!tamaño.isEmpty()) {
                        tecla1.settamaño(tamaño);

                        System.out.println("Escriba algo:");
                        tecla1.setescribir(entrada.nextLine());

                        pantalla1.setmostrar(tecla1.getescribir());
                        System.out.print("datos ingresados \n");
                        System.out.print(".................. \n");
                        System.out.print(".................. \n");
                        System.out.println("Color del teclado: " + tecla1.getcolor());
                        System.out.println("Marca del teclado: " + tecla1.getmarca());
                        System.out.println("Imprimir texto: " + pantalla1.getmostrar());
                        System.out.println("el tamaño del teclado es: "+ tecla1.gettamaño());

                    } else {
                        System.out.println("Debe colocar un tamaño para continuar.");
                    }
                    System.exit(0);
                } else {
                    System.out.println("No presionó F1. Saliendo...");
                    System.exit(0);
                }
            }
        });

        frame.setVisible(true);
        frame.requestFocus();
    }
}

