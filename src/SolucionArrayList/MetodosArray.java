package SolucionArrayList;
import SolucionHashMap.MetodosHashMap;

import java.util.*;

public class MetodosArray implements  Comparator<String> {
    ArrayList<String> lista = new ArrayList<>();
    public void aniadirconlista() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tTeclea un País: ");
        String pais = scanner.nextLine();
        System.out.print("\tTeclea su Capital: ");
        String capital = scanner.nextLine();
        lista.add(pais);
        lista.add(capital);
        System.out.println("\tNueva entrada incorporada\n");
    }

    public void mostrarconlista() {
        for (int elemento = 0;lista.size() > elemento; elemento += 2) {
           String  pais =  lista.get(elemento);
           String capital = lista.get(elemento + 1);
            System.out.println("Pais: " + pais + " Capital: " + capital);
        }
        System.out.println("Hay " + lista.size()/2 + " elementos en el Atlas");
    }




    public void buscarpotlista() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Teclea un Pais: ");
        String paisBuscado = scanner.nextLine();
        String capital = lista.get(lista.indexOf(paisBuscado) + 1);
        if (lista.contains(paisBuscado)) {
            System.out.println("Capital: " + capital);
        } else {
            System.out.println("De este pais no se encuentra capital");
        }

    }

    public void modificarporlista() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Teclea un Pais: ");
        String paisseleccionado = scanner.nextLine();
        if (lista.contains(paisseleccionado)) {
            System.out.print("Teclea la modificacion de capital ");
            String capitalmodificar = scanner.nextLine();
            lista.set(lista.indexOf(paisseleccionado) + 1, capitalmodificar);
        }
        else {
            System.out.println("Este pais no esta registrado");
        }
    }

    public void ordenarporlista() {
        TreeMap<String,String> alfabetico = new TreeMap<>(new MetodosHashMap());
       ArrayList<String> milista = lista;
        for (int elemento = 0;lista.size() > elemento; elemento += 2) {
            alfabetico.put(milista.get(elemento), lista.get(elemento + 1));
        }
        for (String ordenarlista: alfabetico.keySet() ){
            String valor = alfabetico.get(ordenarlista);
            System.out.println(ordenarlista +  "(" +valor +")");
        }
    }

    public void iterarporlista() {
        Iterator<String> listaiterada = lista.iterator();
        while (listaiterada.hasNext()){
            String pais = listaiterada.next();
            String capital = listaiterada.next();
            System.out.println("Pais " + pais + " Capital " + capital);
        }
        System.out.println("Hay " + lista.size()/2 + " elementos en el Atlas");
    }

    public void eliminarporlista() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Teclea un Pais: ");
        String paismodificado = scanner.nextLine();
        if (lista.contains(paismodificado)) {
            lista.remove(lista.indexOf(paismodificado));
            System.out.println(paismodificado + " eliminada del Atlas");
        }
        else {
            System.out.println("Este pais no esta registrado");
        }
    }

    public void vaciarlista() {
        lista.clear();
        System.out.println(" Eliminado el Atlas por completo");
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
