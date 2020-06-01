import java.util.ArrayList;

public class HerramientasFerre {
  
    private ArrayList<Herramientas> listado;

    public HerramientasFerre() {
        this.listado = new ArrayList<>();
    }
    
    public void agregarHerramientas(String nombre, Integer precio, String lugar, Integer codigo){
        Herramientas h = new Herramientas(nombre, precio, lugar, codigo);
        this.listado.add(h);
    }
    public void agregarHerramienta(Herramientas h){
        this.listado.add(h);
    }
    public String buscarHerramientas(int numero){
        numero--;
        if (numero >= this.listado.size() || numero < 0)
            return "Herramienta no encontrada";
        
        Herramientas h = this.listado.get(numero);
        return h.getNombre();
        
        
    }
    public void eliminarHerramientas(int numero){
        numero--;
        if (numero >= this.listado.size() || numero < 0)
            return;
        
        this.listado.remove(numero);
    }

    
    public String buscarHerramientas(String nombreBuscado){
        String s = "";
        for (Herramientas h : this.listado){
            //if (h.getNombre().equalsIgnoreCase(nombreBuscado)){
            if (h.getNombre().toUpperCase().contains(nombreBuscado.toUpperCase())){
                s += "\n" + h.getNombre() +": [PRECIO: "  + h.getPrecio() +"];" + "[CODIGO: " + h.getCodigo() + "]; " + "[LUGAR: " + h.getLugar() + "]";
            }
        }
        return s;
    }
    
    public String obtenerListado(){
        String s = "";
        int idx = 1;
        for (Herramientas h : this.listado){
            s += "\n(" + idx++ + ")" + h.getNombre();
        }
        return s;
    }
    
}  

