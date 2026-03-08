package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Long id) {
        return pokemonService.getPokemonById(id);
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.createPokemon(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon updatePokemon(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        return pokemonService.updatePokemon(id, pokemon);
    }

    @DeleteMapping("/{id}")
    public String deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
        return "Deleted pokemon with id: " + id;
    }

    @GetMapping("/category/{type}")
    public List<Pokemon> getByType(@PathVariable String type) {
        return pokemonService.getByType(type);
    }

    @GetMapping("/search")
    public List<Pokemon> searchByName(@RequestParam String name) {
        return pokemonService.searchByName(name);
    }
}
