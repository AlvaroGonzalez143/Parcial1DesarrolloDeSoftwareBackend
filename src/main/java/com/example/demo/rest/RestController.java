package com.example.demo.rest;

import com.example.demo.DemoApplication;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.SneakyThrows;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Peticion;

import java.nio.charset.StandardCharsets;

@RestController
 class MyController {

    @SneakyThrows
    @PostMapping("/Endpoint")
    public String handlePost(HttpServletRequest data) {
        // Procesar los datos recibidos en el objeto data
        ObjectMapper objectMapper = new ObjectMapper();
        Peticion persona = objectMapper.readValue(data.getInputStream(), Peticion.class);
        int tammano = persona.dna.length;
        boolean aux = true;
        String result = "";
        for (int i = 0; i < tammano; i++) {
            int tammanoChar = persona.dna[i].length();
            if(tammano != tammanoChar ) {
                aux = false;
                break;
            }
            for (int j = 0; j < tammanoChar; j++) {
               char ax = persona.dna[i].charAt(j);
        switch(ax) {
        case 'T': ; break;
       case 'G': ; break;
       case 'C': ; break;
          case 'A': ; break;
        default: aux = false; break;
               }
               if(!aux) break;
            }
        }

    if (aux) {
        result = "Datos procesados correctamente";
        result += "\n Es mutante : " + DemoApplication.isMutant(persona.dna);
    }else
    {
        result = "La paticion no cuenta con el formato correspondiente";
    }
        return result ;
    }
}