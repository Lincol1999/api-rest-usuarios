package com.example.apirestusuarios.pruebas;

import com.example.apirestusuarios.dao.PersonaDAO;
import com.example.apirestusuarios.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaRest {

    @Autowired
    private PersonaDAO personaDAO;

    //Registrar a la DB
    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona persona){
        personaDAO.save(persona);
    }

    @GetMapping("/listar")
    public List<Persona> listar(){
        return personaDAO.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        personaDAO.deleteById(id);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Persona persona){
        personaDAO.save(persona);
    }
}
