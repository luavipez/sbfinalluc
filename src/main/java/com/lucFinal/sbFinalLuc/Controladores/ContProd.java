package com.lucFinal.sbFinalLuc.Controladores;

import com.lucFinal.sbFinalLuc.Entidades.Producto;
import com.lucFinal.sbFinalLuc.Servicios.ServProd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContProd {
    private ServProd servProd;
    public ContProd(ServProd servProd){
        this.servProd = servProd;
    }

    @GetMapping("/lista")
    public String productos(Model model){
        List<Producto> lista = servProd.productos();
        model.addAttribute("lProd", lista);
        return "crudProd";
    }

    @PostMapping("/guardar")
    public String guardar(Producto p){
        servProd.guardar(p);
        return "redirect:/lista";
    }

    @PostMapping("/actualizar")
    public String actualziar(Producto p){
        servProd.actualizar(p);
        return "redirect:/lista";
    }


    @PostMapping("/eliminar")
    public String eliminar(Producto p){
        servProd.eliminar(p);
        return "redirect:/lista";
    }
}
