package com.literalura.literAlura.repository;

import com.literalura.literAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByLanguagesContaining(String language);

}