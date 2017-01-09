import java.util.*;
public class Coc {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String tropa, hecho;
		int total, cantidad;
		
		String[] tropas = {"Barbaro","Arquera","Gigante","Mago","Dragón","Pekka","Esqueleto","Goblin","Globo","Sanadora"};
		int[] costes = {200,400,3000,3500,33000,36000,3000,100,3500,10000};
		
		
		System.out.println("#######################################");
		System.out.println("###  CALCULATOR CLASH OF CLANS  ###");
		System.out.println("#######################################");
		System.out.println("###                                 ###");
		System.out.println("###  	  Calculate costs        ###");
		System.out.println("###            of your troops            ###");
		System.out.println("###                                 ###");
		System.out.println("#######################################");
		
		
		do{
		System.out.println("\nChoose troop:\n");
		for (int i = 0; i < tropas.length; i++) {
			System.out.println(tropas[i] + " | " + costes[i]);
			}
		tropa = input.nextLine();
		
		System.out.println("\nChoose quantity:\n");
		cantidad = input.nextInt();
		
		switch (tropa) {
		case "barbaro":
			total = cantidad * 200;
			System.out.println("Coste total: " + total + " de elixir");
			break;

		case "arquera":
			total = cantidad * 400;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "gigante":
			total = cantidad * 3000;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "mago":
			total = cantidad * 3500;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "dragon":
			total = cantidad * 33000;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "pekka":
			total = cantidad * 36000;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "esqueleto":
			total = cantidad * 3000;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "goblin":
			total = cantidad * 100;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "globo":
			total = cantidad * 3500;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		case "sanadora":
			total = cantidad * 10000;
			System.out.println("Coste total: " + total + " de elixir");
			break;
			
		default:
			System.out.println("!Opción incorrecta!");
			break;
		}
		}while(tropa != "hecho");
		System.out.println("Suerte y a la batalla");
	}
}
