/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author tdani
 */
public interface ProductoService {
    // Se obtiene un listado de productos en un List

    public List<Producto> getproductos(boolean activos);

    public Producto getproducto(Producto producto);

    public void save(Producto producto);

    public void delete(Producto producto);
    //Lista de productos utilizando consultas con JPQL    

    public List<Producto> findPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, double preciosup);

    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, double precioSup);



}



