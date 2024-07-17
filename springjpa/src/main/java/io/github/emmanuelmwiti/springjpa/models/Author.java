package io.github.emmanuelmwiti.springjpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue
            /*(
                    strategy = GenerationType.TABLE,
                    generator = "author_id_gen")
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )
    /*@SequenceGenerator(name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1,
            initialValue = 10)*/
    private Integer id;
    private String firstName;
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
