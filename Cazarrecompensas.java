import java.util.*;
public class Cazarrecompensas {
public static void main(String[] args) {
	
	String nombre;
	double horaTrabajo, hora1, hora2, hora3, hora4;
	double impuesto1, impuesto2, impuesto3, impuesto4, sueldoBruto, sueldoNeto;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Nombre: ");
	nombre = input.nextLine();
	
	System.out.println("Horas de trabajo: ");
	horaTrabajo = input.nextInt();
	
	hora2 = horaTrabajo - 50; 		 //extra
	hora1 = horaTrabajo - hora2;	//reglamentario
	hora3 = hora2 *(8.5 * 1.55);   //salario de horas extra
	hora4 = hora1 * 8.5;			//salario oficial
	
	sueldoBruto = hora3 + hora4;
	System.out.printf("Sueldo bruto: " + "%.2f", sueldoBruto);
	
	impuesto1 = sueldoBruto - 500;
	impuesto2 = sueldoBruto - impuesto1;
	impuesto3 = impuesto2 - 250;
	impuesto4 = (impuesto3 * 17)/100;

	
}
}
