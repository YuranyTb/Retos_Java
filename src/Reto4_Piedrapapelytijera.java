import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Reto4_Piedrapapelytijera {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);

        int Usuario;
        int Computadora;
        Computadora= (int) (Math.random()*3+1);

        System.out.println("Menu opciones \n 1.Digite esta opción para escoger Tijera \n 2.Digite esta opción para escoger Papel \n 3.Digite esta opción para escoger Piedra");
        Usuario=leer.nextInt();

        if (Usuario== 1 && Computadora== 2){
        System.out.println("Sacaste Tijera y la computadora papel..¡Ganaste!");
        }

        else if (Usuario== 2 && Computadora== 1){
        System.out.println("Sacaste Papel y la computadora Tijera..¡Perdiste!");
        }

        else if (Usuario== 1 && Computadora== 3){
        System.out.println("Sacaste Tijera y la computadora Piedra..¡Perdiste!");
        }

        else if (Usuario== 3 && Computadora== 1){
        System.out.println("Sacaste Piedra y la computadora Tijera..¡Ganaste!");
        }

        else if (Usuario== 2 && Computadora== 3){
        System.out.println("Sacaste Papel y la computadora Piedra..¡Ganaste!");
        }

        else if (Usuario== 3 && Computadora== 2){
        System.out.println("Sacaste Piedra y la computadora Papel..¡Perdiste!");
        }

        else if (Usuario== 1 && Computadora== 1 || Usuario== 2 && Computadora== 2 || Usuario== 3 && Computadora== 3){
        System.out.println("Empate!");
        }

        else{
        System.out.println("Datos incorrectos");
        }

        leer.close();

        }
    
    }
