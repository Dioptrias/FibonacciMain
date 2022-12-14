package es.iessoterhernandez.daw.endes.fibonacciMain;

import java.util.Scanner;
//import es.iessoterhernandez.daw.endes.fibonacci.ClaseFibonacci;
import es.iessoterhernandez.daw.endes.fibonacci.ClaseFibonacci;

public class fibonacciMain 
{
	public static void main( String[] args )
    {
        ClaseFibonacci fb = new ClaseFibonacci();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca cuántos datos quiere recibir en pantalla (mínimo 2)");
        int count = sc.nextInt();
        
        System.out.print(0 + " " + 1);
        
        fb.printFibonacci(count - 2);
        
        sc.close();
    }
}
