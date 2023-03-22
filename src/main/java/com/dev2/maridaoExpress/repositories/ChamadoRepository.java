package com.dev2.maridaoExpress.repositories;

import com.dev2.maridaoExpress.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
    
    @Query("SELECT * FROM chamado WHERE prioridade = :prioridade")
    public List<Chamado> getChamadosByPrioridade(@Param("prioridade") Integer prioridade);

}
