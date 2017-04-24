package uni.model;

import java.util.ArrayList;
import java.util.List;
import uni.entity.Empleado;

public class EmpleadoDatos {
    // campo

    private Empleado emp;
    private List<Empleado> lista;
    private static int n;
   
    // constructor
    public EmpleadoDatos() {
        lista = new ArrayList<>();
        n = 0;
    }
    // metodos

    public void agregar(Empleado r) {
        n++;
        r.setIdempleado("E00" + n);
        r.setDescuento(r.getSueldo() * 0.10);
        r.setNeto(r.getSueldo() - r.getDescuento());
        lista.add(r);
    }

    public List<Empleado> listar() {
        return lista;
    }

    public Empleado buscar(String id) {
        Empleado r = new Empleado();
        boolean sw = false;
        for (Empleado x : lista) {
            if (x.getIdempleado().equals(id)) {
                r = x;
                sw = true;
            }
        }
        return r;
    }

    public void modificar(Empleado o) {
        int pos = 0;
        for (Empleado x : lista) {
            if (x.getIdempleado().equals(o.getIdempleado())) {
                o.setDescuento(o.getSueldo() * 0.10);
                o.setNeto(o.getSueldo() - o.getDescuento());
                lista.set(pos, o);
            }
            pos++;
        }
    }

    public void eliminar(String cod) {
        int pos = 0;
        for (Empleado x : lista) {
            if (x.getIdempleado().equals(cod)) {
                lista.remove(pos);
            }
            pos++;
        }
    }
}
