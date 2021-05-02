package br.com.musicall.api.repositorios;

import br.com.musicall.api.dominios.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer> {

    @Transactional
    @Modifying
    @Query("update Instrumento i set i.instrumento = ?1 where i.idInstrumento = ?2")
    void alterarInstrumentoPorId(String instrumento, Integer idInstrumento);

    Optional<Instrumento> findByUsuarioIdUsuario(Integer idUsuario);
}
