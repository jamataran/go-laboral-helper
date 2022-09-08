package es.gogroup.batchlaboral.entity;

import java.sql.Date;

import es.gogroup.batchlaboral.domain.RespuestaUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fos_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FosUser {

    @Id
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "n_ss")
    private String n_ss;

    @Column(name = "n_cuenta")
    private String n_cuenta;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "cp")
    private String cp;

    @Column(name = "pais")
    private String pais;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "observaciones")
    private String observaciones;

    // TODO: Resto de campos.

}
