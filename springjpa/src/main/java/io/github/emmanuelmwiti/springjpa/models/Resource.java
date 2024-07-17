package io.github.emmanuelmwiti.springjpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

//@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
//@Builder
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Inheritance
@DiscriminatorColumn(name = "resource_type") // distincts each entity in sub class
public class Resource
//        extends BaseEntity
{

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
