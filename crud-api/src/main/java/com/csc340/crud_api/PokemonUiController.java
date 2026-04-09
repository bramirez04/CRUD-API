package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pokemon")
public class PokemonUiController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping({"", "/"})
    public String getAllPokemon(Model model) {
        model.addAttribute("pokemonList", pokemonService.getAllPokemon());
        model.addAttribute("title", "All Pokemon");
        return "pokemon-list";
    }

    @GetMapping("/{id}")
    public String getPokemonById(@PathVariable Long id, Model model) {
        Pokemon pokemon = pokemonService.getPokemonById(id);
        if (pokemon != null) {
            model.addAttribute("pokemon", pokemon);
            model.addAttribute("title", "Pokemon Details");
        } else {
            model.addAttribute("errorMessage", "Pokemon not found");
            model.addAttribute("title", "Error");
            return "error";
        }
        return "pokemon-details";
    }

    @GetMapping("/add")
    public String showAddPokemonForm(Model model) {
        model.addAttribute("pokemon", new Pokemon());
        model.addAttribute("title", "Add New Pokemon");
        return "pokemon-form";
    }

    @PostMapping("/add")
    public String addPokemon(Pokemon pokemon) {
        Pokemon newPokemon = pokemonService.createPokemon(pokemon);
        return "redirect:/pokemon/" + newPokemon.getCharacterId();
    }

    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Pokemon pokemon = pokemonService.getPokemonById(id);
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("title", "Update Pokemon: " + id);
        return "pokemon-update";
    }

    @PostMapping("/update/{id}")
    public String updatePokemon(@PathVariable Long id, Pokemon pokemon) {
        pokemonService.updatePokemon(id, pokemon);
        return "redirect:/pokemon/" + id;
    }

    @GetMapping("/delete/{id}")
    public String deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
        return "redirect:/pokemon/";
    }

    @GetMapping("/category/{type}")
    public String getByType(@PathVariable String type, Model model) {
        model.addAttribute("pokemonList", pokemonService.getByType(type));
        model.addAttribute("title", "Pokemon of type: " + type);
        return "pokemon-list";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam String name, Model model) {
        model.addAttribute("pokemonList", pokemonService.searchByName(name));
        model.addAttribute("title", "Search Results for: " + name);
        return "pokemon-list";
    }
}
