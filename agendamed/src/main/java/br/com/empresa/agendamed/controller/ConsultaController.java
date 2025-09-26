package br.com.empresa.agendamed.controller;

import br.com.empresa.agendamed.model.Consulta;
import br.com.empresa.agendamed.repository.ConsultaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ConsultaRepository repository;

    public ConsultaController(ConsultaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Consulta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Consulta salvar(@RequestBody Consulta consulta) {
        return repository.save(consulta);
    }

    @GetMapping("/{id}")
    public Consulta buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

