
/**
 * imprimir los valores pares en un arreglo con for
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class D4_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
        }
        //imprimir pares
        for(int i=0;i<t;i++){
            if(arre[i]%2==0)
            System.out.print(arre[i]+" ");
        }
            
    }
}
