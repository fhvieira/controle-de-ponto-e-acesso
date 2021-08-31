package one.digitalinnovation.controledeponto.service;

import one.digitalinnovation.controledeponto.model.JornadaTrabalho;
import one.digitalinnovation.controledeponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    private JornadaRepository repository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return repository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> getAll() {
        return repository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
