public class Comuna {
    private int codigo;
    private String nombre;
    private Region region;
    public Comuna(int codigo, String nombre, Region region){
        this.codigo = codigo;
        this.region = region;
        this.nombre = nombre;
    }
    public int getCodigo(){return  codigo;}
    public String getNombre(){return  nombre;}
    public Region getRegion(){return  region;}
}
