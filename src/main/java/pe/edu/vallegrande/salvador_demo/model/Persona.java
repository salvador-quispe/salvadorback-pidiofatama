package pe.edu.vallegrande.salvador_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("PERSONAS")
public class Persona {

    @Id
    @Column("ID")
    private Long id;

    @Column("NOMBRE")
    private String nombre;

    @Column("APELLIDO")
    private String apellido;

    @Column("EMAIL")
    private String email;
}
