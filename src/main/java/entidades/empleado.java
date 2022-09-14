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
@Table(name = "empleado")
@AllArgsConstructor
@NoArgsConstructor
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, name = "email")
    private String correoelectronico;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_perfil")
    private perfil perfil;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private rol rol;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private empresa empresa;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<transaccion> transaccion;
    private String createAt;
    private String updateAt;
}
