import java.util.Random;
import java.util.Scanner;

public class Reto6_SupermercadoN {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);

        int Precio, Cantidad, Valordelacompra=0, Subtotal=0, Descuento=0, Bolita, Pago=0, Total=0;
        String Repetir="si";
        do{
        System.out.println("Digite el precio del producto");
        Precio=leer.nextInt();
    
        System.out.println("Digite la cantidad de productos");
        Cantidad=leer.nextInt();
    
        Subtotal=Precio*Cantidad;
        Valordelacompra=Valordelacompra+Subtotal;
        leer.nextLine();

        if
            (Subtotal>=0){
            System.out.println("¿Desea seguir comprando? Digite si para continuar, de lo contrario oprima enter");
            Repetir=leer.nextLine();
            }

        }
        while
            (Repetir.equalsIgnoreCase("Si"));
        if
            (Valordelacompra>50000){ 
            System.out.println("¡Felicitaciones puede acceder a un descuento!");
            System.out.println("De manera aleatoria saldra el color de una bola, haciendo referencia al descuento que gano:");
            System.out.println("\n 1.Bola roja con el 10% de descuento.\n 2.Bola azul con el 30% de descuento.\n 3.Bola amarilla con el 50% de descuento.\n 4.Bola blanca, lleva la compra gratis.\n"); 
            Random Aleatorio=new Random();
            Bolita= (int) (Aleatorio.nextDouble()*4);
            System.out.println("El resultado del sorteo es la Bola " +Bolita);
            
            switch(Bolita){
                case 1:
                Descuento= (int) (Valordelacompra*0.10);
                Total=Valordelacompra-Descuento;
                System.out.println("¡Felicitaciones, tiene un 10% de descuento en su compra!\nSu valor a pagar es " +Total);
                System.out.println("Digite el valor con el que va a realizar el pago");
                Pago=leer.nextInt();
                Pago=Pago-Descuento;
                System.out.println("Su cambio es de " +Pago);
                break;

                case 2:
                Descuento= (int) (Valordelacompra*0.30);
                Total=Valordelacompra-Descuento;
                System.out.println("¡Felicitaciones, tiene un 30% de descuento en su compra!\nSu valor a pagar es " +Total);
                System.out.println("Digite el valor con el que va a realizar el pago");
                Pago=leer.nextInt();
                Pago=Pago-Descuento;
                System.out.println("Su cambio es de " +Pago);
                break;

                case 3:
                Descuento= (int) (Valordelacompra*0.50);
                Total=Valordelacompra-Descuento;
                System.out.println("¡Felicitaciones, tiene un 50% de descuento en su compra!\nSu valor a pagar es " +Total);
                System.out.println("Digite el valor con el que va a realizar el pago");
                Pago=leer.nextInt();
                Pago=Pago-Descuento;
                System.out.println("Su cambio es de " +Pago);
                break;

                case 4:
                System.out.println("¡Felicitaciones,lleva su compra completamente gratis!");
                leer.close();      

        }
        

        }
        
    }
     
}
