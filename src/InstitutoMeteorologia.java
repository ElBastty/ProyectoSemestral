import java.util.ArrayList;

public class InstitutoMeteorologia{
    /*
--------- LISTOS -------------
+creaRegion(codigo : int, nombre : String) : boolean
--------- PENDIENTES ---------
+creaComuna(codigo : int, nombre : String, codigoRegion : int) : boolean
+creaEstacion(cod : String, nombre : String, lon : float, lat : float, alt : float, codRegion : int, codComuna : int) : boolean
+instalaSensor(cod : String, marca : String, modelo : String, tipo : TipoSensor, codigoEstacion : String) : boolean
+registraMedicion(fechaHora : LocalDateTime, valor : float, codEstacion : String, codSensor : String) : boolean
+listaRegiones() : String[][]
+listaComunas() : String[][]
+listaEstaciones(codigoRegion : int, codigoComuna : int) : String[][]
+listaSensores(codigoEstacion : String) : String[][]
+listaMediciones(codEstacion : String, codSensor : String, incio : LocalDateTime, fin : LocalDateTime) : String[][]
*/
    private ArrayList<Region> regiones = new ArrayList<>();

    public boolean creaRegion(int codigo, String nombre){
        for(int i = 0; i < regiones.size(); i++){
            if (regiones.get(i).getCodigo() == codigo || regiones.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Error!, ya existe una region con ese nombre o codigo.");
                return false;
            }
        }
        Region nuevaregion = new Region(codigo,nombre);
        regiones.add(nuevaregion);
        System.out.println("Region creada exitosamente");
        return  true;
    }
}