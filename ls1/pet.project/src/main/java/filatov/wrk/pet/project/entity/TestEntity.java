package filatov.wrk.pet.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class TestEntity {

    @Id
    private Long id;
    private String test;
}

