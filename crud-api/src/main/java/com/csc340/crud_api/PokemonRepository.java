package com.csc340.crud_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    // Find by type (category)
    List<Pokemon> findByType(String type);

    // Search by name containing a substring
    @Query("SELECT p FROM Pokemon p WHERE p.name LIKE %?1%")
    List<Pokemon> findByNameContaining(String name);
}