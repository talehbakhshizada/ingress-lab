package az.ingress.users.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "roles")
@Getter
@Setter
@ToString
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(length = 60)
    private String name;

}
