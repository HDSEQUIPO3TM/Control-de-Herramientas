
public class Herramientas {
   private String nombre;
   private Integer precio;
   private String lugar;
   private Integer codigo;
   
   public Herramientas(String nombre, Integer precio, String lugar, Integer codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.lugar = lugar;
        this.codigo = codigo;
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
}