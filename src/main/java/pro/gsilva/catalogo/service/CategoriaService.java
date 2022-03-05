package pro.gsilva.catalogo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pro.gsilva.catalogo.model.Categoria;
import pro.gsilva.catalogo.model.Musica;

public interface CategoriaService {
    Page<Categoria> findAll(Pageable pageable);
    List<Categoria> findAll();
    Categoria save(Categoria categoria);
    void excluir(long id);
    Categoria findById(long id);
}
