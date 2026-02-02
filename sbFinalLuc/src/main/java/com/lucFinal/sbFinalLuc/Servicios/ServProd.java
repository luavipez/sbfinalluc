package com.lucFinal.sbFinalLuc.Servicios;

import com.lucFinal.sbFinalLuc.Entidades.Producto;
import com.lucFinal.sbFinalLuc.Repositorios.RepoProd;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServProd {
    private RepoProd repoProd;
    public ServProd(RepoProd repoProd){
        this.repoProd= repoProd;
    }

    public List<Producto> productos(){
        return repoProd.findAll();
    }

    public Producto guardar(Producto p){
        return repoProd.save(p);
    }


    public Producto actualizar(Producto p){
        Producto eP = repoProd.findById(p.getId()).orElseThrow();
        eP.setNombre(p.getNombre());
        eP.setPrecio(p.getPrecio());
        repoProd.save(eP);
        return  eP;
    }

    public Producto eliminar(Producto p){
        Producto eP = repoProd.findById(p.getId()).orElseThrow();
        repoProd.delete(eP);
        return  eP;
    }


}
