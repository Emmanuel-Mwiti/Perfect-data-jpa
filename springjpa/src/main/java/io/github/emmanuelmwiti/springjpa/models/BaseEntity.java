package io.github.emmanuelmwiti.springjpa.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
/*
* will not be saved on the table to show can be inherited by subclassess
* Cannot be queried or persisted
*/
public class BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private String createdBy;

    private String lastModifiedBy;
}
