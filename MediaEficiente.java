import java.util.Scanner;

public class MediaEficiente{
  public static void main(String[] args) {
    int num, cont=0, suma=0;
    double media;

Scanner input = new Scanner(System.in);
    do {
      System.out.println("Introduce un numero:");
      num = input.nextInt();

      if (num !=-1) {
        cont++;
        suma=num+suma;
      if (num<0) {
          System.out.println("numero erroneo");
        }
      }
    } while (num!=-1);
    System.out.println("Has introducido " + cont + " números");
    media= suma / cont;
    System.out.println("La media es " + media);
  }
}
