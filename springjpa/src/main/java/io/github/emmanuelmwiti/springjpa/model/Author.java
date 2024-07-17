package io.github.emmanuelmwiti.springjpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "authors")
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
    private String email;
    private int age;
}
