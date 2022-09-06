package es.gogroup.batchlaboral.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    // TODO: Resto de campos.

}
