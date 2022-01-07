import Computadoras.*;
import clases.Persona;

import java.util.Scanner;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP=new Monitor("HP",13);
        Teclado teclado= new Teclado("bluetooth","HP");
        Mouse mouseHP= new Mouse("bluetooth","HP");
        Computadora computadoraHP = new Computadora(" pc HP",monitorHP,mouseHP,teclado);
        Monitor monitorGamer=new Monitor("Gamer",13);
        Teclado tecladoGamer= new Teclado("bluetooth","Gamer");
        Mouse mouseGamer= new Mouse("bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora(" pc Gamer",monitorGamer,mouseGamer,tecladoGamer);
        Orden orden1 = new Orden();
        orden1.addComputer(computadoraHP);
        orden1.addComputer(computadoraGamer);
        orden1.mostrarOrden();
        }
}
