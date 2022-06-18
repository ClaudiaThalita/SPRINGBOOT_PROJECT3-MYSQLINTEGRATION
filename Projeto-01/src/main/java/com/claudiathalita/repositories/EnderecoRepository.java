package com.claudiathalita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudiathalita.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {

}
