
package tarea1_uh;

public class Tarea1_UH {

    public static void main(String[] args)
    {
int [][] matriz = new int [5][5];
int cont = 1;
int sum_diag_inversa = 0;
int sum_diag_principal = 0;

        for (int f = 0; f < matriz.length; f++) // filas
        {
            for (int c = 0; c <  matriz.length; c++) // columnas
            {
                matriz[f][c]= cont++;
                if(f+c ==matriz.length-1)
                {
                sum_diag_inversa+=matriz[f][c];
                } 
                if (f-c ==matriz.length-matriz.length)
                {
                sum_diag_principal+=matriz[f][c];
                }
            }       
        }
                for (int i = 0; i < matriz.length; i++) // filas
        {
            for (int j = 0; j <  matriz.length; j++) // columnas
            {
                System.out.print("  " + matriz[i][j]);  
            }   
            System.out.println(" ");
            
        }
                System.out.println("");
                 System.out.println("La suma del la diagonal inversa es: " + sum_diag_inversa);
                 System.out.println("La suma del la diagonal principal es: " + sum_diag_principal);
}
}
