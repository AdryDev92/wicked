import java.util.Scanner;

public class GradoSuperior{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String nombre, titulo, prueba, bachiller, lower, titulolowercase;


    System.out.println("Introduce nombre: ");
    nombre = input.next();
    lower = nombre.toLowerCase();

    System.out.println("Introduce titulo:");
    titulo = input.next();
    titulolowercase = titulo.toLowerCase();

    if (lower.equals("prueba") || titulolowercase.equals("bachiller"))
     {
      System.out.println("Puede acceder a Grado Superior");
    }else {
      System.out.println("No puede acceder a Grado superior");
    }

  }
}
