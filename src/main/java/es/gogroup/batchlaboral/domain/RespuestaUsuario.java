package es.gogroup.batchlaboral.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RespuestaUsuario {

    SI("si"),
    NO("no"),
    NO_SABE_NO_CONTESTA("nsnc");

    private String dbValue;

}
