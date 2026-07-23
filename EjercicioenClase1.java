import java.util.Scanner;

public class EjercicioenClase1 {
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++)
        {
            System.out.print("Ingrese un número:  ");
            numeros[i] = scan.nextInt();
        }
        
        int mayor = numeros[0];

        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] > mayor)
            {
                mayor = numeros[i];
            }
        }

        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] < menor)
            {
                menor = numeros[i];
            }
        }
    
        for(int i = 0; i < numeros.length -1; i++)
        {
            for(int j = i +1; j < numeros.length; j++)
            {
                if(numeros[i] > numeros[j])
                {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println("Rsultados");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor:  " + menor);

        System.out.println("Números Ordenados: ");

        for(int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }

        scan.close();
    }

    
  
}   