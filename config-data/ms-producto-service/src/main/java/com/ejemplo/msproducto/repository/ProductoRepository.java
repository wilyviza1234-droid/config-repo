package com.ejemplo.msproducto.repository;

import com.ejemplo.msproducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}