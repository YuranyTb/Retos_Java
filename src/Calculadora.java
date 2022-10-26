import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception{

        Scanner leer=new Scanner(System.in);

        int op,num1,num2;

        System.out.println("Menu opciones \n 1.Suma \n 2.Resta \n 3.Multiplicación \n 4.División \n 5.Potencia \n 6.Raiz \n Ingrese el número de la opción que desea realizar");
        op=leer.nextInt();

        System.out.println("Ingrese el número 1");
        num1=leer.nextInt();

        System.out.println("Ingrese el número 2");
        num2=leer.nextInt();

        switch(op){
            case 1: 
                int total=num1+num2;
                System.out.println("El total es "+total);

            case 2: 
                total=num1-num2;
                System.out.println("El total es "+total);

            break;
            
            case 3: 
                total=num1*num2;
                System.out.println("El total es "+total);

            break;
            
            case 4: 
                total=num1/num2;
                System.out.println("El total es "+total);

            break;        

            case 5: 
            
                double potencia=Math.pow(num1, num2);
                System.out.println("La potencia del "+num1+" elevado al "+num2+" es "+potencia);  
                
            break;    

            case 6: 
                double Raiz1=Math.sqrt(num1);
                double Raiz2=Math.sqrt(num2);
                System.out.println("La Raiz cuadrada de "+num1+" es "+Raiz1);   
                System.out.println("La Raiz cuadrada de "+num2+" es "+Raiz2);
            

        }













    



        
    }
    
}
