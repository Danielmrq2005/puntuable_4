package SolucionHashMap;
import java.util.*;
import java.util.Comparator;
public class MetodosHashMap implements Comparator<String> {
    HashMap<String, String> map = new HashMap();
    public void aniadircondiccionario() {
        Scanner scanner = new Scanner(System.in);
        String pais;
        String capital;
        System.out.print("\tTeclea un País: ");
        pais = scanner.nextLine();
        System.out.print("\tTeclea su Capital: ");
        capital = scanner.nextLine();

        map.put(pais, capital);
        System.out.println("\tNueva entrada incorporada\n");
    }

    public  void mostrarcondiccionario() {
        for (Map.Entry<String,String> entrada: map.entrySet()) {
            String paisiterado = entrada.getKey();
            String capitaliterada = entrada.getValue();
            System.out.print("\tPais: " + paisiterado + " capital: " + capitaliterada + "\n");
        }
        System.out.println("Hay " + map.size() + " elementos en el ATLAS");
    }
    public void buscarcondiccionario() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Teclea un Pais: ");
            String busqueda = scanner.nextLine();
            if (map.containsKey(busqueda)) {
                System.out.println("Capital: " + map.get(busqueda));
            } else{
                System.out.println("De este pais no se encuentra capital");
            }
    }
    public void modficarpordiccionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Teclea un Pais: ");
        String cambio = scanner.nextLine();
        if (map.containsKey(cambio)) {
            System.out.print("Teclea modificacion de capital: ");
            String modificacion = scanner.nextLine();
            map.put(cambio,modificacion);
        } else {
            System.out.println("Este pais no esta registrado");
        }

}
    public void ordenarpordiccionario() {
        TreeMap<String,String> alfabetico = new TreeMap<>(new MetodosHashMap());
        HashMap<String,String> midicc = map;
        alfabetico.putAll(midicc);
        for (String ordendicc: alfabetico.keySet() ){
           String valor = alfabetico.get(ordendicc);
            System.out.println( ordendicc  + "(" + valor + ")");
        }
        }

    public void iterarpordiccionario() {
        Iterator<String> iterador = map.keySet().iterator();
        while (iterador.hasNext()){
            String clave = iterador.next();
            String valor = map.get(clave);
            System.out.println("Pais: " + clave + " Capital: " +  valor);
        }
        System.out.println("Hay " + map.size() + " elementos en el ATLAS");
    }
    public void eliminarpordiccionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Teclea un Pais a eliminar: ");
        String eliminacion = scanner.nextLine();
        if (map.containsKey(eliminacion)) {
            map.remove(eliminacion);
            System.out.println(eliminacion +  " eliminada del Atlas");
        } else {
            System.out.println("Este pais no esta registrado");
        }
    }
    public void vaciarpordiccionario (){
        map.clear();
        System.out.println("Eliminado el Atlas por completo");
    }


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}