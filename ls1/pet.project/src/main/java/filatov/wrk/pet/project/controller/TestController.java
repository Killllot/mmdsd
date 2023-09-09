package filatov.wrk.pet.project.controller;

import filatov.wrk.pet.project.dto.TestDto;
import filatov.wrk.pet.project.entity.TestEntity;
import filatov.wrk.pet.project.mapper.TestMapper;
import filatov.wrk.pet.project.repository.TestRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test/")
public class TestController {

    private final TestRepository testRepository;

    @Autowired
    private TestMapper testMapper;

    @PostMapping("save")
    @Transactional
    public TestEntity saveTest(@RequestBody TestDto testDto){
        return testRepository.save(testMapper.toEntity(testDto));
    }
}
