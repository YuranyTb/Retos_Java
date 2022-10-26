import java.util.Scanner;

public class Reto1_Grados {

    public static void main(String[] args) {
    
        int Variablea=32;
        double Grados, Centigrados;
        double Variableb=1.8;

        System.out.println("Ingrese grados F°");

        Scanner leer=new Scanner(System.in);
        Grados=leer.nextInt();
        Centigrados=(Grados-Variablea)/Variableb;
        System.out.println("Los centigrados que debe usar son " +Centigrados);

        leer.close();
    }
   

}
