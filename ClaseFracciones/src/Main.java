
public class Main {

    public static void main(String[] args){

        Fraccion a = new Fraccion(10,4);
        Fraccion b = new Fraccion(7,11);

        Fraccion resultado = a.sumar(b);
        Fraccion resultado2 = a.restar(b);
        Fraccion resultado3 = a.multiplicar(b);
        Fraccion resultado4 = a.dividir(b);


        System.out.println("Suma: " + resultado);
        System.out.println("Resta: " + resultado2);
        System.out.println("Multiplicación: " + resultado3);
        System.out.println("División: " + resultado4);

    }



}
