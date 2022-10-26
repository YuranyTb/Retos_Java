import java.util.Scanner;

public class Ejercicio_Precioycantidad {
    public static void main(String[] args) {

        int precio, cantidad, referencias=0,subtotal,total=0;
        
        Scanner leer=new Scanner(System.in);

        for (int p=0;p<=5;p++){
        System.out.println("Ingrese el valor del producto");
        precio=leer.nextInt();

        System.out.println("Ingrese la cantidad de productos a comprar");
        cantidad=leer.nextInt();

        subtotal=precio*cantidad;
        System.out.println("Las unidades son " +cantidad+" y el precio del producto es "+precio+ " y el acomulado es "+subtotal);

        //Iniciar el contador de minutos de la compra

        referencias=referencias+1;   

        //Iniciamos acomulador para el total de la compra
        total=total+subtotal;

        }
        System.out.println("El total de su compra es "+total);
        System.out.println("La cantidad de minutos de la compra es "+referencias);
        leer.close();
    }
}
