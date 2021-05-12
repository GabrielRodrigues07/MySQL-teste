package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long>{
}
