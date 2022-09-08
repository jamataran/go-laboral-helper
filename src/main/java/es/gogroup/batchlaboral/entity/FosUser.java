package es.gogroup.batchlaboral.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    private String username_canonical;

    @Column(name = "email")
    private String email;

    @Column(name = "email_canonical")
    private String email_canonical;

    @Column(name = "enabled")
    private byte enabled;

    @Column(name = "salt")
    private String salt;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    private Date last_login;

    @Column(name = "locked")
    private byte locked;

    @Column(name = "expired")
    private byte expired;

    @Column(name = "expires_at")
    private Date expires_at;

    @Column(name = "configuration_token")
    private String confirmation_token;

    @Column(name = "password_requested_at")
    private Date password_requested_at;

    @Column(name = "roles")
    private String roles;

    @Column(name = "credentials_expired")
    private byte credentials_expired;

    @Column(name = "credentials_expired_at")
    private Date credentials_expired_at;

    @Column(name = "type")
    private String type;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    private enum tipo_documento {nif,nie,cif}

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
    private int cp;

    @Column(name = "pais")
    private String pais;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "slug")
    private String slug;

    @Column(name = "id_responsable")
    private long id_responsable;

    private enum sexo {nsnc, mujer, hombre}

    @Column(name = "direccion_envio")
    private String direccion_envio;

    @Column(name = "localidad2")
    private String localidad2;

    @Column(name = "provincia2")
    private String provincia2;

    @Column(name = "cp2")
    private int cp2;

    @Column(name = "nacionalidad")
    private String naciionalidad;

    @Column(name = "telf_movil")
    private int telf_movil;

    @Column(name = "telf_otro")
    private int telf_otro;

    @Column(name = "altura")
    private float altura;

    @Column(name = "talla")
    private int talla;

    @Column(name = "medida_pecho")
    private int medida_pecho;

    @Column(name = "medida_cintura")
    private int medida_cintura;

    @Column(name = "medida_cadera")
    private int medida_cadera;

    @Column(name = "calzado")
    private int calzado;

    private enum color_ojos {marrones, verdes, azules, nsnc}

    private enum color_pelo {ruio, moreno, castanio, pelirrojo, otro, nsnc}

    @Column(name = "path_carta_presentacion")
    private String path_carta_presentacion;

    @Column(name = "path_cv")
    private String path_cv;

    @Column(name = "path_cara")
    private String path_cara;

    @Column(name = "medio_cuerpo")
    private String medio_cuerpo;

    @Column(name = "comentarios")
    private String comentarios;

    private enum exp_congresos {nsnc, si, no}

    private enum gogo {nsnc, si, no}

    private enum promociones {nsnc, si, no}

    private enum exp_traducciones {nsnc, si, no}

    private enum exp_hosteleria {nsnc, si, no}

    private enum fiestas_noche {nsnc, si, no}

    private enum animadores {nsnc, si, no}

    private enum ferias {nsnc, si, no}

    private enum patinadora {nsnc, si, no}

    private enum monitor {nsnc, si, no}

    private enum seminarios {nsnc, si, no}

    private enum bailarinas {nsnc, si, no}

    private enum maquilladora {nsnc, si, no}

    private enum guardarropa {nsnc, si, no}

    private enum telemarketing {nsnc, si, no}

    private enum reponedor {nsnc, si, no}

    private enum administrativo {nsnc, si, no}

    private enum sumiller {nsnc, si, no}

    private enum sin_experiencia {nsnc, si, no}

    @Column(name = "localidad_mov1")
    private String localidad_mov1;

    @Column(name = "localidad_mov2")
    private String localidad_mov2;

    @Column(name = "localidad_mov3")
    private String localidad_mov3;

    private enum manianas {nsnc, si, no}

    private enum tardes {nsnc, si, no}

    private enum noches {nsnc, si, no}

    private enum findesemana {nsnc, si, no}

    private enum carnet {nsnc, si, no}

    private enum vehiculo {nsnc, si, no}

    private enum desplazamiento {nsnc, si, no}

    private enum nivel_estudios {sinestudios, primaria, secundaria, profesional, diplomado, licenciado, nsnc }

    private enum est_traduccion {nsnc, si, no}

    private enum marketing {nsnc, si, no}

    private enum derecho {nsnc, si, no}

    private enum est_hosteleria {nsnc, si, no}

    private enum empresariales {nsnc, si, no}

    private enum disenio_grafico {nsnc, si, no}

    private enum relaciones_laborales {nsnc, si, no}

    private enum turismo {nsnc, si, no}

    private enum economicas {nsnc, si, no}

    private enum comunicacion {nsnc, si, no}

    private enum magisterio {nsnc, si, no}

    private enum otros_estudios {nsnc, si, no}

    private enum castellano {nsnc, si, no}

    private enum catalan {nsnc, si, no}

    private enum gallego {nsnc, si, no}

    private enum euskera {nsnc, si, no}

    private enum ingles {nsnc, si, no}

    private enum frances {nsnc, si, no}

    private enum aleman {nsnc, si, no}

    private enum italiano {nsnc, si, no}

    private enum portugues {nsnc, si, no}

    private enum ruso {nsnc, si, no}

    private enum otros_idiomas {nsnc, si, no}

    private enum word {nsnc, si, no}

    private enum excel {nsnc, si, no}

    private enum access {nsnc, si, no}

    private enum powerpoint {nsnc, si, no}

    private enum internet {nsnc, si, no}

    private enum photoshop {nsnc, si, no}

    private enum sin_informatica {nsnc, si, no}

    @Column(name = "motivo")
    private String motivo;

    private enum status {valido, invalido, incompleto}

    @Column(name = "password_cambiado")
    private byte password_cambiado;

    @Column(name = "cambios")
    private String cambios;

    private enum lunes_maniana {nsnc, si, no}

    private enum lunes_tarde {nsnc, si, no}

    private enum lunes_noche {nsnc, si, no}

    private enum martes_maniana {nsnc, si, no}

    private enum martes_tarde {nsnc, si, no}

    private enum martes_noche {nsnc, si, no}

    private enum miercoles_maniana {nsnc, si, no}

    private enum miercoles_tarde {nsnc, si, no}

    private enum miercoles_noche {nsnc, si, no}

    private enum jueves_maniana {nsnc, si, no}

    private enum jueves_tarde {nsnc, si, no}

    private enum jueves_noche {nsnc, si, no}

    private enum viernes_maniana {nsnc, si, no}

    private enum viernes_tarde {nsnc, si, no}

    private enum viernes_noche {nsnc, si, no}

    private enum sabado_maniana {nsnc, si, no}

    private enum sabado_tarde {nsnc, si, no}

    private enum sabado_noche {nsnc, si, no}

    private enum domingo_maniana {nsnc, si, no}

    private enum domingo_tarde {nsnc, si, no}

    private enum domingo_noche {nsnc, si, no}

    private enum lopd {nsnc, si, no}

    private enum acrobata {nsnc, si, no}

    private enum actor {nsnc, si, no}

    private enum bartender {nsnc, si, no}

    private enum camarero {nsnc, si, no}

    private enum coctelero {nsnc, si, no}

    private enum comico {nsnc, si, no}

    private enum equilibrista {nsnc, si, no}

    private enum escupefuegos {nsnc, si, no}

    private enum guitarrista {nsnc, si, no}

    private enum informatico {nsnc, si, no}

    private enum logistica {nsnc, si, no}

    private enum mago {nsnc, si, no}

    private enum montador {nsnc, si, no}

    private enum percusionista {nsnc, si, no}

    private enum pianista {nsnc, si, no}

    private enum promocion {nsnc, si, no}

    private enum promotor {nsnc, si, no}

    private enum relaciones_publicas {nsnc, si, no}

    private enum saxofonista {nsnc, si, no}

    private enum speakers {nsnc, si, no}

    private enum violinista {nsnc, si, no}

    private enum zancudo {nsnc, si, no}

    // TODO: Resto de campos.

}
