import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        Scanner leer=new Scanner(System.in);

        final double PI=3.1416;
        double radio, area;

        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextDouble();  
        
        area=PI*radio*radio;

        System.out.println("El area del circulo con radio "+radio+" es "+area);
        leer.close();


    }
}
