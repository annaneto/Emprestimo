package com.elastech.petshop.controller;

import com.elastech.petshop.Model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String boasVindas(){
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String informaHorario(){
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet informaPet(){
        return new Pet("Thor", "Cachorro", 3);
    }
    @GetMapping("/adotar/{nome}")
    public String adotarPet(@PathVariable String nome){
        return "Parabens! Você adotou " + nome + "!";
    }
    @GetMapping("/banho")
    public String banhoPet(@RequestParam(required = false) String pet){
        if(pet == null){
            return "Seu pet está tomando banho!";
        }
        return pet + " está tomando banho";

    }

    @GetMapping("/novo/{nome}")
    public Pet novoPet(@PathVariable String nome){
        return new Pet(nome, "Gato", 1);
    }

    @
    GetMapping("/idade-humana")
    public String idadehumana(@RequestParam int idade){
        int idadeHumana = idade * 7;
        return "A idade humana de seu pet é " + idadeHumana + " anos";
    }

    @GetMapping("/consulta")
    public String verConsulta(@RequestParam String nomePet, @RequestParam String nomeVet){
        return nomePet + " tem consulta com a Dra. " + nomeVet + "!";
    }

}
