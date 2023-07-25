package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.getJson.Json;
import med.voll.api.getJson.JsonRepository;
import med.voll.api.getJson.getJson;
import med.voll.api.getJson.updateJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    private JsonRepository repository;

    @PostMapping
    @Transactional
    @RequestMapping("/create")
    public void Post(@RequestBody @Valid getJson json) {
        repository.save(new Json(json));
    }

    @GetMapping
    @RequestMapping("/read")
    public Page<Json> get(@PageableDefault(size = 10) Pageable pagination) {
        return repository.findAll(pagination);
    }

    @PutMapping
    @Transactional
    @RequestMapping("/update")
    public void put(@RequestBody @Valid updateJson data) {
        var json = repository.getReferenceById(data.id());
        json.updateData(data);
    }

    @DeleteMapping
    @Transactional
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        var json = repository.getReferenceById(id);
        json.remove();  /* this is a soft delete. */
    }

}