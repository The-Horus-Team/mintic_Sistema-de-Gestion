package entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
public class empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private Integer idEmpresa;
    @Column(unique = true)
    private String nombre;
    @Column(unique = true)
    private String documento;
    private String telefono;
    private String direccion;
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<empleado> usuario;
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<transaccion> transaccion;
    private String createAt;
    private String updateAt;
}
