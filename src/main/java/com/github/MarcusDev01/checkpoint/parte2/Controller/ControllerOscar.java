package com.github.MarcusDev01.checkpoint.parte2.Controller;




import com.github.MarcusDev01.checkpoint.parte2.model.Oscar;
import com.github.MarcusDev01.checkpoint.parte2.repository.OscarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oscars")
public class ControllerOscar {

    @Autowired
    private OscarRepository repository;

    @PostMapping
    public Oscar salvar(@RequestBody Oscar oscar) {
        return repository.save(oscar);
    }

    @GetMapping
    public List<Oscar> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Oscar buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Oscar atualizar(@PathVariable Long id, @RequestBody Oscar oscar) {
        oscar.setId(id);
        return repository.save(oscar);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}