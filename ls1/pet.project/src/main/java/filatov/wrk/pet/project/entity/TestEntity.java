package filatov.wrk.pet.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity@Table(name = "TestEntity")
@RequiredArgsConstructor
@Data
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String test;

    private String message;

}

