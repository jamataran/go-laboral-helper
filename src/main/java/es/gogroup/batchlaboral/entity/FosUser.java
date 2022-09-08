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

    @Column(name = "username_canonical")
    private String usernameCanonical;

    @Column(name = "email")
    private String email;

    @Column(name = "email_canonical")
    private String emailCanonical;

    @Column(name = "enabled")
    private byte enabled;

    @Column(name = "salt")
    private String salt;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "locked")
    private byte locked;

    @Column(name = "expired")
    private byte expired;

    @Column(name = "expires_at")
    private String expiresAt;

    @Column(name = "confirmation_token")
    private String confirmationToken;

    @Column(name = "password_requested_at")
    private String passwordRequestedAt;

    @Column(name = "roles")
    private String roles;

    @Column(name = "credentials_expired")
    private String credentialsExpired;

    @Column(name = "credentials_expire_at")
    private String credentialsExpireAt;

    @Column(name = "type")
    private String type;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "n_ss")
    private String nSs;

    @Column(name = "n_cuenta")
    private String nCuenta;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

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

    @Column(name = "slug")
    private String slug;

    @Column(name = "id_responsable")
    private String idResponsable;

    @Column(name = "direccion_envio")
    private String direccionEnvio;

    @Column(name = "localidad2")
    private String localidad2;

    @Column(name = "provincia2")
    private String provincia2;

    @Column(name = "cp2")
    private String cp2;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "telf_movil")
    private String telfMovil;

    @Column(name = "telf_otro")
    private String telfOtro;

    @Column(name = "altura")
    private String altura;

    @Column(name = "talla")
    private String talla;

    @Column(name = "medida_pecho")
    private String medidaPecho;

    @Column(name = "medida_cintura")
    private String medidaCintura;

    @Column(name = "medida_cadera")
    private String medidaCadera;

    @Column(name = "calzado")
    private String calzado;

    @Column(name = "path_carta_presentacion")
    private String pathCartaPresentacion;

    @Column(name = "path_cv")
    private String pathCv;

    @Column(name = "path_cara")
    private String pathCara;

    @Column(name = "path_medio_cuerpo")
    private String pathMedioCuerpo;

    @Column(name = "path_cuerpo")
    private String pathCuerpo;

    @Column(name = "comentarios")
    private String comentarios;

    @Column(name = "localidad_mov1")
    private String localidadMov1;

    @Column(name = "localidad_mov2")
    private String localidadMov2;

    @Column(name = "localidad_mov3")
    private String localidadMov3;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "password_cambiado")
    private String passwordCambiado;

    @Column(name = "cambios")
    private String cambios;


    // TODO: Resto de campos.

}
