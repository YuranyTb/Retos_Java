import java.util.Scanner;

public class Reto2_DosisVacuna {
    public static void main(String[] args) {

        double Variablea=10;
        double Variableb=8;
        double Peso,Meses;
        double DosisVacuna;

        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el peso del bebé");
        Peso=leer.nextInt();

        System.out.println("Ingrese los meses del bebé");
        Meses=leer.nextInt();

        DosisVacuna=((Peso+Variablea)/(Meses*Variablea))*(Variableb);
        System.out.println("La dosis que debe aplicar son " +DosisVacuna);

        leer.close();    
        }

    }

