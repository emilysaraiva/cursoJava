
package tiposprimitivosjava;

import java.util.Scanner;


public class TiposPrimitivosJava {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
       
        System.out.format("A nota de %s é %.1f \n ",nome, nota);
    }
    
}
