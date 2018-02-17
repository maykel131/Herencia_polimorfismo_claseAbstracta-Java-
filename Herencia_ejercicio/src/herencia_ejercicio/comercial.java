package herencia_ejercicio;


public class comercial extends empleado {
    //atributos de la clase hija
    private double comision;
    
    //constructor y llamador del constructor de la clase padre
    public comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
   // metodo set 
    public double getComision() {
        return comision;
    }
   //metodo get
    public void setComision(double comision) {
        this.comision = comision;
    }

    /* en este caso con super.toString traemos el metodo de la clases padre y lo reescribimo usando @Override*/
    @Override
    public String toString() {
        return super.toString()+ " clases_comercial{" + "comision = " + comision + '}';
    }
 
    
    
    

   
    
   /*este metodo es para saber si se adiciono el plus al empleado de tipo comercial*/
    @Override
    public boolean plus() {
        if(super.getEdad()>30 && this.comision > 200){
            
         super.setSalario(super.getSalario()+super.PLUS);
         System.out.print("se le ha agregado el plus al empleado: "+super.getNombre()+"\n");
         return true;
        }
        return false;
    }
    
    
    
    
}
