import java.util.ArrayList;

public class Region {
    private int codigo;
    private String nombre;
    private ArrayList<Comuna> comunas = new ArrayList<>();
    public Region(int cod, String nom){
        this.codigo = cod;
        this.nombre = nom;
    }
    public int getCodigo(){return codigo;}
    public String getNombre(){return nombre;}

    public boolean addComuna(int cod, String nom){
        for(int i = 0; i<comunas.size(); i++){
            if (comunas.get(i).getCodigo() == codigo || comunas.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Error!, ya hay una comuna con ese codigo o nombre.");
                return false;
            }
        }
        System.out.println("Comuna añadida a la region exitosamente.");
        return  true;
    }
    public boolean findComunaById(int cod){
        for(int i = 0; i<comunas.size(); i++){
            if (comunas.get(i).getCodigo() == cod){
                return true;
            }
        }
        return  false;
    }
    public Comuna[] getComunas (){
        return (Comuna[]) comunas.toArray();
    }
    /* PENDIENTE
    public int getCantidadEstaciones(){}
    * */
}

