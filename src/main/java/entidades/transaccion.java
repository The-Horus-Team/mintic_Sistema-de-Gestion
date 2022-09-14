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
@Table(name = "transaccion")
@AllArgsConstructor
@NoArgsConstructor
public class transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String contextoTransferencia;
    private double montoTransferencia;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private empleado usuario;
    @ManyToOne
    @JoinColumn(name = "empresa")
    private empresa empresa;
    private String createAt;
    private String updateAt;
}
