package servicios;

import entidades.empleado;
import org.springframework.stereotype.Service;
import repositorios.empleado_repositorio;

import java.util.List;

@Service
public class servicio_empleado {
    private empleado_repositorio empleadorepo;

    public List<empleado> getAllEmpleados(){
        return this.empleadorepo.findAll();
    }
}
