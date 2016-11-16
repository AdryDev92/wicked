import java.util.Scanner;

public class Charfile {

    public static void main(String[] args) {

        // Objetos
        Scanner input = new Scanner(System.in);

        // variables
        int raza,clase;
        String respuesta, nombre;

        //arrays
        String[] clases;
        clases = new String [6];
        clases[0] = "1. Guerrero";
        clases[1] = "2. Mago";
        clases[2] = "3. Artillero";
        clases[3] = "4. Brujo";
        clases[4] = "5. Picaro";
        clases[5] = "6. Paladin";

        String[] razas;
        razas = new String [5];
        razas[0] = "1. Humano";
        razas[1] = "2. Elfo";
        razas[2] = "3. Draconiano";
        razas[3] = "4. Enano";
        razas[4] = "5. Orco";

        String[] signoDragon = {"Dragón"};
        String[] signoZorro = {"Zorro"};
        String[] signoLobo = {"Lobo"};
        String[] signoSerpiente = {"Serpiente"};
        String[] signoSombra = {"Sombra"};
        String[] signoGuardian = {"Guardián"};

        String[] habilidadesGuerrero = {"-Estocada","-Arrollar","-Intimidar"};
        String[] habilidadesMago = {"-Bola de fuego","-Curar","-Cegar"};
        String[] habilidadesArtillero = {"-Tiro","-Apuntar","-Refuerzo"};
        String[] habilidadesBrujo = {"-Invocar espiritu","-Corromper","-Drenar vida"};
        String[] habilidadesPicaro = {"-Robo","-Golpe veloz","-Escape"};
        String[] habilidadesPaladin = {"-Protección","-Golpe doble","-Ritmo"};

        String[] equipamientoGuerrero = {"-Armadura de cobre","-Espada de soldado","-Botas de cuero","-Casco de cuero"};
        String[] equipamientoMago = {"-Túnica de mago","-Bastón de madera","-Tomo común"};
        String[] equipamientoArtillero = {"-Traje de artillero","-rifle","-Bolsa de útiles"};
        String[] equipamientoBrujo = {"-Túnica de brujo","-Tomo encantado","-Cinto de cuero"};
        String[] equipamientoPicaro = {"-Robo","-Golpe veloz","-Escape"};
        String[] equipamientoPaladin = {"-Protección","-Golpe doble","-Ritmo"};

        String[] atributos = {"\nPV: ", "PM: ", "ATQ: ", "DEF: ", "RES: ", "VEL: ", "SUE: "};

        int[] atributosGuerrero = {100, 15, 70, 55, 35, 30, 30};
        int[] atributosMago = {80, 80, 15, 25, 35, 20, 50};
        int[] atributosArtillero = {90, 50, 80, 20, 40, 10, 50};
        int[] atributosBrujo = {100, 90, 10, 30, 40, 20, 30};
        int[] atributosPicaro = {40, 40, 50, 20, 20, 90, 80};
        int[] atributosPaladin = {100, 30, 50, 70, 65, 40, 25};

        // Introducción de datos
        System.out.println("¿Preparado para comenzar tu aventura?\nsi / no");
        respuesta = input.nextLine();

        if (respuesta.equals("no")) {
          System.out.println("\n!Vuelve pronto!");
          System.exit(0);
        }

        System.out.println("Introduce tu nombre: ");
          nombre = input.next();

        System.out.println("Introduce tu raza:");
        System.out.println(razas[0]);
        System.out.println(razas[1]);
        System.out.println(razas[2]);
        System.out.println(razas[3]);
        System.out.println(razas[4]);
          raza = input.nextInt();


        System.out.println("Introduce tu clase: ");
        System.out.println(clases[0]);
        System.out.println(clases[1]);
        System.out.println(clases[2]);
        System.out.println(clases[3]);
        System.out.println(clases[4]);
        System.out.println(clases[5]);
          clase = input.nextInt();


          //A partir de este punto, se muestra la información final por pantalla
        System.out.println("\n=======================");
        System.out.println("Tu nombre: " + nombre);

        //elegir raza
        if (raza==1) {
          System.out.print("Eres un humano ");
        }else if (raza==2) {
          System.out.print("Eres un elfo ");
        }else if (raza==3) {
          System.out.print("Eres un draconiano ");
        }else if (raza==4) {
          System.out.print("Eres un enano ");
        }else if (raza==5) {
          System.out.print("Eres un orco ");
        }

        //asignación de clase, habilidades y atributos
          if (clase==1) {
            System.out.print("guerrero\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesGuerrero.length ;i++ )
              System.out.println(habilidadesGuerrero[i]);
            for (int i=0;i<atributos.length ;i++ )
              System.out.println(atributos[i] + atributosGuerrero[i]);
            for (int i=0;i<signoDragon.length ;i++ )
              System.out.println("\nSigno: " + signoDragon[i]);
                System.out.println("\nEquipamiento: ");
                for (int i=0;i<equipamientoGuerrero.length ;i++ )
                System.out.println(equipamientoGuerrero[i]);
          }
          else if (clase==2){
            System.out.print("mago\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesMago.length ;i++ )
              System.out.println(habilidadesMago[i]);
            for (int x=0;x<atributos.length ;x++ )
              System.out.println(atributos[x] + atributosMago[x]);
            for (int i=0;i<signoZorro.length ;i++ )
              System.out.println("\nSigno: " + signoZorro[i]);
              System.out.println("\nEquipamiento: ");
              for (int i=0;i<equipamientoMago.length ;i++ )
              System.out.println(equipamientoMago[i]);
          }
          else if (clase==3){
            System.out.print("artillero\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesArtillero.length ;i++ )
              System.out.println(habilidadesArtillero[i]);
            for (int x=0;x<atributos.length ;x++ )
              System.out.println(atributos[x] + atributosArtillero[x]);
              for (int i=0;i<signoLobo.length ;i++ )
              System.out.println("\nSigno: " + signoLobo[i]);
              System.out.println("\nEquipamiento: ");
              for (int i=0;i<equipamientoArtillero.length ;i++ )
              System.out.println(equipamientoArtillero[i]);
          }
          else if (clase==4){
            System.out.print("brujo\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesBrujo.length ;i++ )
              System.out.println(habilidadesBrujo[i]);
            for (int i=0; i<atributos.length ;i++ )
              System.out.println(atributos[i] + atributosBrujo[i]);
              for (int i=0;i<signoSombra.length ;i++ )
              System.out.println("\nSigno: " + signoSombra[i]);
              System.out.println("\nEquipamiento: ");
              for (int i=0;i<equipamientoBrujo.length ;i++ )
              System.out.println(equipamientoBrujo[i]);
          }
          else if (clase==5){
            System.out.print("pícaro\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesPicaro.length ;i++ )
              System.out.println(habilidadesPicaro[i]);
            for (int x=0;x<atributos.length ;x++ )
              System.out.println(atributos[x] + atributosPicaro[x]);
              for (int i=0;i<signoSerpiente.length ;i++ )
              System.out.println("\nSigno: " + signoSerpiente[i]);
              System.out.println("\nEquipamiento: ");
              for (int i=0;i<equipamientoPicaro.length ;i++ )
              System.out.println(equipamientoPicaro[i]);
          }
          else if (clase==6){
            System.out.print("paladín\n");
            System.out.println("\nTus habilidades son:");
            for (int i=0;i<habilidadesPaladin.length ;i++ )
              System.out.println(habilidadesPaladin[i]);
            for (int x=0;x<atributos.length ;x++ )
              System.out.println(atributos[x] + atributosPaladin[x]);
              for (int i=0;i<signoGuardian.length ;i++ )
              System.out.println("\nSigno: " + signoGuardian[i]);
              System.out.println("\nEquipamiento: ");
              for (int i=0;i<equipamientoPaladin.length ;i++ )
              System.out.println(equipamientoPaladin[i]);
        }
          System.out.println("=======================");
    }
}
