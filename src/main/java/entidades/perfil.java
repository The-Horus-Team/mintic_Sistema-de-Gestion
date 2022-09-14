package entidades;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "perfil")
@AllArgsConstructor
@NoArgsConstructor
public class perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imagen;
    private String telefono;
    @OneToOne
    @JoinColumn(name = "usuario")
    private empleado usuario;
    private String createAt;
    private String updateAt;
}
