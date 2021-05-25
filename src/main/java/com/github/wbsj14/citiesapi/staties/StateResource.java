package com.github.wbsj14.citiesapi.staties;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/staties")
public class StateResource {

    //@Autowired
    private final StateRepository repository;

    public StateResource(final StateRepository repository) { //Para injetar o repositorio posso usar o @Autowired ou fazer isso aqui, é a mesma coisa.
        this.repository = repository;
    }

    @GetMapping
    public Page<State> staties(Pageable page) {
        return repository.findAll(page);
    }
}