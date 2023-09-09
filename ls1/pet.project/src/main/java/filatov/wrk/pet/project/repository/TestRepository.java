package filatov.wrk.pet.project.repository;

import filatov.wrk.pet.project.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository  extends JpaRepository<TestEntity, Long> {
}
