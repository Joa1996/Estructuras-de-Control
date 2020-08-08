
package estructuras.de.control;
import java.io.*;
import java.util.*;

// En java  tenemos disponible diferentes clases relacionadas a la entrada  de datos por teclado  
//Estas clases son: Bufferedreader y Inputstreamreader del paquete java.io y la  clase Scanner del paquete java.util

public class EstructurasDeControl {

    public static void main(String[] args) throws IOException// con la clase Scanner no es necesario usar esta excepcion, esta excepcion se pone debido a las execpciones que realiza el metodo readLine()
    {
    /*La clase Scanner de la librería java.util es muy sencilla para 
     obtener datos de entrada del usuario, a diferencia de BufferedReader, 
     Scanner si posee un método para la lectura de números y para la lectura de 
     texto que nos ayudarán a facilitar un poco las cosas */
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingese su nombre para probar");
        String nombre=sc.nextLine();
        System.out.println("El nombre ingresado es:"+nombre);
    /*Para usar las clases Bufferedreader y Inputstreamreader primero debemos declarar  en el metodo main throws IOException, 
    esto se realiza para el manejo de exepciones,  */    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Se usan dos clases del paquete io para tratar la entrada de datos
        System.out.println("Ingese su nombre para probar las clases de entrada  Bufferedreader y Inputstreamreader");
        String nombre2=br.readLine(); //readLine siempre retorna a tipo de dato String, esa es una de las diferencias con Scanner
        System.out.println("El nombre ingresado es:"+nombre2);
        /*Como readLine siempre retorna a String, en caso de que tengamos que leer un dato entero y 
        almacenarlo en una variable entera deberemos usar el metodo  ParseInt() de la clase Integer del paquete java.Lang*/
        System.out.println("Ingrese un dato numerico");
        int numero=Integer.parseInt(br.readLine());//Le enviamos el String a la clase Integer para que este lo procese y lo pase a Int
        System.out.println("El numero que ingreso es="+numero);
        //Como vemos la opcion Scanner es mas sencillo que las otras dos
         estructurasdecontol();
         metodoswitch();
        estructura_while();
        estructurafor();
        estructuraDowhile();
    }
    static void estructurasdecontol()
    {
// A traves de las estructuras de control podemos controlar el comportamiento de un metodo o programa, es decir darle la logica al programa
//Podemos encontrar estructuras de control Selectivas ( para tomar deciciones), estas son if o switch, y las estructuras de control repetitivass cuya funcion es repetir una cierta cant. de veces alguna sentencia
Scanner sc=new Scanner(System.in);
   //Estrructura de Control if
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if(numero<0)
            System.out.println("El numero que ingresaste es menor a 0");
        else
            System.out.println("el numero que ingresaste es positivo o igual a 0");
        
    }
    static void metodoswitch()
    {
    //esta estructura de control se utiliza para seleccionar una entre varias opciones o alternativas, es ideal para por ej. un menu.
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la nota");
        String nota=sc.next();
        char n=nota.charAt(0);//Pasamos a char lo que leemos ya que switch solo soporta int,boolean,char, etc., menos String y float, solo caracteres ordinales
        
        switch(n)
        {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Notable");
                break;
            case 'C':
                System.out.println("Aprobado");
                break;
            case 'D':
                System.out.println("Suspendido");
                 break;
            case 'E':
                System.out.println("Suspendido");      
                
           default:System.out.println("Ingreso un caracter erroneo");// en caso de que se ingrese cualquier otro caracter distinto al de los case se muestra que esto es erroneo con default
        }
    }
     static void estructura_while()//La estructura while se usa para repetir una sentencia o conjunto de sentencias mientras siempre se cumpla algo, es deci, repite mientras pasa algo             
       {
         Scanner sc=new Scanner(System.in);
         
           boolean digito_leido;
           digito_leido=false;
//Usamos una estructura while para que el user ingrese caracteres de todo tipo menos un 0, es decir va ingresar datos hasta que ingrese un 0
           while(!digito_leido) //la estructura se va a ejecutar hasta que digito_leido sea verdadero
           {
               System.out.println("ingrese un caracter");
               String  nn=sc.next();
               if(nn.equalsIgnoreCase("0"))
               {
                   digito_leido=true;
               }
           }
       }
     static void estructurafor()//La estructura de contol for se usa cuando debemos repetir sentencias un numero de veces
    {
        int m=0;
//Al principio de la estructura se declara la variable i(puede ser cualquier variable), luego se coloca la cant. de veces que se repetira y finalmente si se incrementara o disminuira
        for(int i=0;i<=10000;i++)//i no necesariamente debe incrementarse de uno a uno, esto lo puede hacer de dos a dos i+=2, de 20 en 20, i+=20 y asi sucesivamente, lo mismo para decrementar con la diferencia de colocar el simbolo -
     {//Este ej. lo que hace es calcular la cant. de multiplos de 20 desde 0 hasta 10000
      if(i%20==0)//i se ira incrementando hasta 10000 y en todas esas iteacciones se dividira entre 20, se usa % ya que nos interesa conocer si el resto es igual a 0, si esto es asi es multiplo de 20 y se cumple la condiciion if y se incrementa m
      {  
       m++;   
      }
     }
        System.out.println("La cantidad de multiplos de 20 son:"+m);
   }
     static void estructuraDowhile()//A diferencia de while en esta estructua se ejecuta si o si al menos una sentencia
     {
         Scanner sc=new Scanner(System.in);
         boolean numero=false;
         int num=0;
         do{//las sentencias que se coloquen aqui se repetiran al menos una vez
             System.out.println("Ingrese un numero");
             num=sc.nextInt();
             
           }
             while(!numero);//Aqui se arma la estructura while tal como la conocemos
                 {
                 System.out.println("EL numero es Positivo");
                 if(num<0)
                 {
                     numero=true;
                 }  
              }
                     
         
     }
}
