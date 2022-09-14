package repositorios;

import entidades.empleado;

import java.util.List;

public interface empleado_repositorio {
    List<empleado> findAll();
}
