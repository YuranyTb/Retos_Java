import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Reto3_Carisellazo {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        int Moneda;
        int Computadora;
        Computadora= (int) (Math.random () *2 +1);

        System.out.println("Menu opciones \n 1.Digite esta opción para escoger Cara \n 2.Digite esta opción para escoger Sello");
        Moneda=leer.nextInt();

        if (Computadora== 1 && Moneda== 1){
        System.out.println("Salió Cara, escogiste Cara, ¡Ganaste!");
        }

        else if (Computadora== 1 && Moneda== 2){
        System.out.println("Salió Cara, escogiste Sello, ¡Perdiste!");
        }

        else if (Computadora== 2 && Moneda== 2){
        System.out.println("Salió Sello, escogiste Sello, ¡Ganaste!");
        }

        else if (Computadora== 2 && Moneda== 1){
        System.out.println("Salió Sello, escogiste Cara, ¡Perdiste!");
        }

        else if (Computadora== 1 || Moneda== 2){
        System.out.println("¡Digitaste una opción incorrecta!");
        }

        else{
        System.out.println("Datos incorrectos");
        }

        leer.close();
        
    }
}
