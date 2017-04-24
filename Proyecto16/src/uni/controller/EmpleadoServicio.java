
package uni.controller;

import java.util.List;
import uni.entity.Empleado;
import uni.model.EmpleadoDatos;

public class EmpleadoServicio {
  // campo
    private EmpleadoDatos obj;

    //constructor
    public EmpleadoServicio() {
        obj=new EmpleadoDatos();
    }
    // metodos
    public void EmpleadoAdicionar(Empleado o){
        obj.agregar(o);
    }
    
    public List<Empleado> EmpleadoListar(){
        return obj.listar();
    }
    
    public Empleado EmpleadoBuscar(String cod){
        return obj.buscar(cod);
    }
    
    public void EmpleadoActualizar(Empleado o){
       obj.modificar(o);
    }
    
    public void EmpleadoEliminar(String id){
        obj.eliminar(id);
    }
    
    
    
    
}
