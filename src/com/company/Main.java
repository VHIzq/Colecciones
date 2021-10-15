package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        //declaro en multilinea
        //declara tamaño del arreglo. Este tipo es estático
        /*String universidades[];
        universidades = new String[5];*/
//        String universidades[] = new String[]{"UAM", "ULA", "UADG", "IPN", "BUAP"};
        /*universidades[0] = "UAM";
        universidades[1] = "ULA";
        universidades[2] = "UADG";
        universidades[3] = "IPN";
        universidades[4] = "BUAP";*/
        /*universidades[5] = "ANAHUAC";
        universidades[6] = "iTAM";*/

        /*for( String universidad : universidades){
            System.out.println(universidad);
        }*/

        Set<String> frutas = new HashSet();
        //características de Set:
        // - no puede tener elementos duplicados
        // - rápida pero puede variar el orden de los elementos.
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
//        frutas.add("Mango"); si se duplica, lo ignora

        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("-------------------------------");
        //Treeset es más lento.
        //Treeset ordena los elementos.
        Set<String> frutas2 = new TreeSet<>();
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        for(String fruta : frutas2){
            System.out.println(fruta);
        }

        System.out.println("-------------------");
        // Más lento que hashSet
        //Almacena valores en orden de inserción
        Set<String> frutas3 = new LinkedHashSet<>( 4 );
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for(String fruta : frutas3){
            System.out.println(fruta);
        }
        System.out.println("-------ArrayList-----------------------------");

        //List sí acepta elementos duplicados
        List<String> frutas4 = new ArrayList<>();

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Melon");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }
        System.out.println("-------------Elemento de ArrayList---------------");

        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));

        System.out.println("---------LinkedList-------------------");


        //Lista de elementos doblemente enlazados.
        //Sabe qué elemento le antecede y cuál le procede.
        List<String> frutas5 = new LinkedList<>();

        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("---------MAP-------------");
        //Asocia claves con valores
        //No puede tener claves repetidas
        //Solo puede tener un valor asociado a la clave
        Map<Integer, String> universidades = new HashMap<Integer, String>();

        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");

       // System.out.println(universidades.get(4));

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }





    }
}
