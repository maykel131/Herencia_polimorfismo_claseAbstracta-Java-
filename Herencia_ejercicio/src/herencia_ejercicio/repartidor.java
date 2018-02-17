
package herencia_ejercicio;


public class repartidor extends empleado {
    
    private String zona;

    public repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    
    
   
    //metodos get del hijo
   public String getZona() {
        return zona;
    }
    //metodos set del hijo
    public void setZona(String zona) {
        this.zona = zona;
    }
    
    /* en este caso con super.toString traemos el metodo de la clases padre y lo reescribimo usando @Override*/
    @Override
    public String toString() {
        return super.toString()+ " clases_repartidor{" + "zona=" + zona + '}';
    }
    
    
   
    /*este metodo es para saber si se adiciono el plus al empleado de tipo repartidor*/
    @Override
    public boolean plus() {
       if(super.getEdad()<25 && this.zona.equalsIgnoreCase("zona 3")){
           
        super.setSalario(super.getSalario()+super.PLUS);
        System.out.print("se le ha agregado el plus al empleado: "+super.getNombre() );
        return true;
       }
       return false;
    }

   
   
    
    
}
