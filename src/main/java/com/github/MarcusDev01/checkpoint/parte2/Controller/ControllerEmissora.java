package com.github.MarcusDev01.checkpoint.parte2.Controller;


import com.github.MarcusDev01.checkpoint.parte2.model.Emissora;
import com.github.MarcusDev01.checkpoint.parte2.repository.EmissoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emissoras")
public class ControllerEmissora {

    @Autowired
    private EmissoraRepository repository;

    @PostMapping
    public Emissora salvar(@RequestBody Emissora emissora) {
        return repository.save(emissora);
    }

    @GetMapping
    public List<Emissora> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Emissora buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Emissora atualizar(@PathVariable Long id, @RequestBody Emissora emissora) {
        emissora.setId(id);
        return repository.save(emissora);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}