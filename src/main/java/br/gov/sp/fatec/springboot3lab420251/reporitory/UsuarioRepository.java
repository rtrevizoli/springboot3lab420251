package br.gov.sp.fatec.springboot3lab420251.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springboot3lab420251.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
    
}