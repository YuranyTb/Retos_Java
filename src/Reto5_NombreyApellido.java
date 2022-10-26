import java.util.Scanner;

import javax.swing.JOptionPane;

public class Reto5_NombreyApellido {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String Nombre, Apellido, Nombrecompleto;

        System.out.println("Digite su nombre");
        Nombre=leer.nextLine();

        System.out.println("Digite su apellido");
        Apellido=leer.nextLine();


        String NombrecompletoString=("si");System.out.println("Su nombre tiene "+Nombre.length()+" caracteres ");

        String NombreString=("Digite su nombre");System.out.println(Nombre.toUpperCase());
        String ApellidoString=("Digite su apellido");System.out.println(Apellido.toLowerCase());

        String NombrecString=("si");System.out.println("Su apellido tiene " +Apellido.length()+ " caracteres");

        Nombrecompleto=Nombre+Apellido;
        System.out.println("Su nombre completo es " +Nombrecompleto);

        System.out.println((Nombre.substring(0, 2))+Apellido);

    











        leer.close();
        
    }

}
