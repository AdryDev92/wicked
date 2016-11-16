import java.util.Scanner;

public class NumPrimo
{
    public static void main(String[] args)
    {

      Scanner input = new Scanner(System.in);

      int num;
      boolean resultado = true;

      System.out.println("Introduce un numero: ");
      num = input.nextInt();

      for (int i = 2; i < num ; i++ )
        {
          if (num % i == 0)
          {
          resultado = false;
          break;
          }
        }
      if (resultado)
      {
        System.out.println("El numero " + num + " es primo");
      }
      else
      {
        System.out.println("El numero " + num + " no es primo");
      }

    }
}
