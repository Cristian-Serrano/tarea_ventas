package com.example.tarea3_3ventas.controller;

import com.example.tarea3_3ventas.domain.Comercial;
import com.example.tarea3_3ventas.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class PedidoController {
    /*@Autowired
    private ComercialService comercialService;

    @GetMapping({"/comerciales", "/commercials"})
    public String listar(Model model){

        List<Comercial> listAllCli =  comercialService.listAll();
        model.addAttribute("listaComerciales", listAllCli);

        return "comerciales";
    }

    @GetMapping({"comerciales/crear","commercials/create"})
    public String crear(Model model){

        Comercial comercial = new Comercial();
        model.addAttribute("comercial", comercial);

        return "crearComercial";
    }

    @PostMapping({"comerciales/crear","commercials/create"})
    public RedirectView submitCrear(Model model, @ModelAttribute("comercial") Comercial comercial){

        comercialService.create(comercial);

        return new RedirectView("/comerciales");
    }

    @GetMapping({"/comerciales/{id}","/commercials/{id}"})
    public String detalle(Model model, @PathVariable Integer id ){
        model.addAttribute("comercial", comercialService.one(id));

        return "detalleComercial";
    }

    @GetMapping({"comerciales/editar/{id}","commercials/update/{id}"})
    public String editar(Model model, @PathVariable Integer id ){
        model.addAttribute("comercial", comercialService.one(id));

        return "editarComercial";
    }

    @PostMapping({"/comerciales/editar/{id}","/commercials/update/{id}"})
    public RedirectView submitEditar(@ModelAttribute("comercial") Comercial comercial) {

        comercialService.replace(comercial);

        return new RedirectView("/comerciales");
    }

    @PostMapping({"/comerciales/borrar/{id}","/commercials/delete/{id}"})
    public RedirectView borrar(@PathVariable Integer id) {

        comercialService.delete(id);

        return new RedirectView("/comerciales");
    }*/
}
