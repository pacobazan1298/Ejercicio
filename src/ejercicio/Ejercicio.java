
package ejercicio;
import java.util.Scanner;
public class Ejercicio {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        String cadena;
        String subcadena="";
        int in = 0;
        System.out.println("Introduce la cadena de M&Ms:  ");
        cadena=leer.nextLine();
        int c=cadena.length();     
        for (int i = 1; i <= c; i++) {
            if (c%i==0) {               
                int d=c/i;
                String particiones[] = new String[d];
                for (int j = 0; j < d; j++) {
                    subcadena=cadena.substring(in,in+i);
                    //System.out.println(subcadena+" ");
                    particiones[j]=subcadena;
                    in=in+i;
                }
                int cont=0;
                for (int j = 1; j < d; j++) {
                    if (particiones[0].equals(particiones[j])) {
                        cont++;
                    }
                }
                if (cont==(d-1)) {  
                    System.out.println("-------------");
                    System.out.print("Secuencia de M&Ms: ");
                    for (int j = 0; j < d; j++) {
                        System.out.print(particiones[j]+" ");
                    }
                    System.out.println(" "); 
                    System.out.println("Num. de rebanadas: "+d);
                    i=c+1;
                }
                in=0;
                }                 
            }           
    }   
}
