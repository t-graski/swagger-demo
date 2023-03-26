package at.htl.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person extends PanacheEntity {

    @Column(length = 100, nullable = false)
    public String firstname;

    @Column(length = 100, nullable = false)
    public String lastname;

    @Column(length = 100, nullable = false)
    public String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "author")
    @JsonIgnore
    public List<Book> books;
}
