package io.github.emmanuelmwiti.springjpa.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@PrimaryKeyJoinColumn(name = "video_id")- WORKS WITH THE JOIN STRATEGY
//@DiscriminatorValue("V") only with single table strategy
@Polymorphism(type = PolymorphismType.EXPLICIT) // Exclude this sub class from being queried
public class Video extends Resource {
    private int length;
}
