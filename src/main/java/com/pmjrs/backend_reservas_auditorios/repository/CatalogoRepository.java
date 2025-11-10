package com.pmjrs.backend_reservas_auditorios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CatalogoRepository<T> extends JpaRepository<T, Long> {}
