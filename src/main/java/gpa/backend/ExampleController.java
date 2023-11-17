package gpa.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    private final ExampleRepository repository;

    @GetMapping("get")
    public MsUser get() {
        for (MsUser msUser : repository.findAll()) {
            var dto = new MsUserDto(msUser.getId(), msUser.getName());
            System.out.println(dto);
        }
        System.out.println("hoge");
        return repository.findById(1).orElse(null);
    }
}
