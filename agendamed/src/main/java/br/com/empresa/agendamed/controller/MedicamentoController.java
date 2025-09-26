package br.com.empresa.agendamed.controller;

import br.com.empresa.agendamed.model.Medicamento;
import br.com.empresa.agendamed.repository.MedicamentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private final MedicamentoRepository repository;

    public MedicamentoController(MedicamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Medicamento> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Medicamento salvar(@RequestBody Medicamento medicamento) {
        return repository.save(medicamento);
    }

    @GetMapping("/{id}")
    public Medicamento buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

