import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        HerramientasFerre herramientasFerre = new HerramientasFerre();
        
        
       
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        menu();
        opcion = sc.nextInt();
        
        while(opcion !=0){
            
          //Ingreso
            if (opcion ==1){
                System.out.println("Ingrese el nombre de la herramienta ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio ");
                Integer precio =sc.nextInt();
                System.out.println("Ingrese el codigo ");
                String codigo = sc.next();
                System.out.println("Ingrese el lugar de la ferreteria ");
                Integer lugar =sc.nextInt();
                
                
                herramientasFerre.agregarHerramientas(nombre, precio, codigo, lugar);
            }
            
            //Buscar
            if (opcion == 2){
                System.out.println("Ingrese el nombre a buscar");
                String nombre =sc.next();
                
                System.out.println(herramientasFerre.buscarHerramientas(nombre));
            }
            //Eliminar
            if (opcion == 3){
                System.out.println(herramientasFerre.obtenerListado());
                System.out.println("Ingrese el numero de herramienta a eliminar.");
                int numero = sc.nextInt();
                
                String datos =herramientasFerre.buscarHerramientas(numero);
                if (!datos.equals("Herramienta no encontrado")){
                    
                    System.out.println("Se dispone a eliminar a " + datos);
                    System.out.println("Esta seguro? [1]SI [0]NO");

                    int seguro = sc.nextInt();
                    if (seguro == 1){
                        herramientasFerre.eliminarHerramientas(numero);
                        System.out.println("Herramienta Eliminada");
                    }
                }else{
                    System.out.println(datos);
                }
                
            }
            
            
            if (opcion==4){
                System.out.println(herramientasFerre.obtenerListado());
            }
            
            menu();
            opcion=sc.nextInt();
}

        }
    public static void menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("  C O N T R O L   D E   H E R R A M I E N T A S ");
        System.out.println("-----------------------------------------------");
        System.out.println("[1] Agregar");
        System.out.println("[2] Buscar");
        System.out.println("[3] Eliminar");
        System.out.println("[4] Mostrar");
        System.out.println("[0] Salir");
        System.out.println("Eliga una opcion: ");
        
    }
    
}
