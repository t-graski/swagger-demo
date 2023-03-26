package at.htl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
public class Book extends PanacheEntity {

    @Column(length = 100, nullable = false)
    @Schema(example = "The Lord of the Rings", implementation = String.class, description = "The title of the book")
    public String title;

    @JoinColumn(name = "author_id")
    @Schema(example = "J.R.R. Tolkien", implementation = Person.class, description = "The author of the book")
    @ManyToOne
    public Person author;

    @Column(nullable = false)
    @Schema(example = "642", implementation = Integer.class, description = "The number of pages of the book")
    public int pages;

    @Column(nullable = false)
    @Schema(example = "true", implementation = Boolean.class, description = "Is the book available?")
    public boolean available;
}
