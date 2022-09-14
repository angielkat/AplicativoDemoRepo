package com.mintic.aplicativoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mintic.aplicativoWeb.entidades.Empresa;

public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{

}
