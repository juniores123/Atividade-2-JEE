package pro.gsilva.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import pro.gsilva.catalogo.model.Musica;

import java.util.List;

public interface CatalogoRepository extends JpaRepository<Musica, Long>, CustomCatalogoRepository {
    List<Musica> findAllByTitulo(String titulo);
    List<Musica> findAllByTituloIsLike(String titulo);

    @Query("select m from Musica m where m.titulo like :titulo")
    List<Musica> findAllWithTituloLike(String titulo);

    @Query("select m from Musica m join m.categoria c where c.nome like :categoria")
    List<Musica> findAllWithCategoriaLike(String categoria);
}
