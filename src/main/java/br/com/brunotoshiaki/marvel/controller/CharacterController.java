package br.com.brunotoshiaki.marvel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunotoshiaki.marvel.service.CharacterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "CharacterEndpoint")
@RequestMapping("character")
public class CharacterController {

    @Autowired
    CharacterService service;

    @Operation(summary = "Find all Character")
    @GetMapping(value = "/v1/characters", produces = { "application/json", "application/xml" })
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok().body(service.getCharacters());
    }

}
