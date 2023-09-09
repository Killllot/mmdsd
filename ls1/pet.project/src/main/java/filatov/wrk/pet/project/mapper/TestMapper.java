package filatov.wrk.pet.project.mapper;

import filatov.wrk.pet.project.dto.TestDto;
import filatov.wrk.pet.project.entity.TestEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestMapper {

    TestDto toDto(TestEntity entity);

    TestEntity toEntity(TestDto dto);
}
