package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Pokemon getPokemonById(Long id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    public Pokemon createPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public Pokemon updatePokemon(Long id, Pokemon updatedPokemon) {
        Pokemon existing = pokemonRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedPokemon.getName());
            existing.setDescription(updatedPokemon.getDescription());
            existing.setType(updatedPokemon.getType());
            existing.setAbility(updatedPokemon.getAbility());
            return pokemonRepository.save(existing);
        }
        return null;
    }

    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    public List<Pokemon> getByType(String type) {
        return pokemonRepository.findByType(type);
    }

    public List<Pokemon> searchByName(String name) {
        return pokemonRepository.findByNameContaining(name);
    }
}