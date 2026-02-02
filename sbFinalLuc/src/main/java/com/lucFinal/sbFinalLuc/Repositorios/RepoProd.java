package com.lucFinal.sbFinalLuc.Repositorios;

import com.lucFinal.sbFinalLuc.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoProd extends JpaRepository<Producto, Long> {
}
