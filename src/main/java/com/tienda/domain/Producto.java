package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idproducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencia;
    private String rutaImagen;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    Producto producto;
      List<Producto>Productos;

    public Producto(String descripcion, String detalle, double precio, int existencia, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

    public Long getIdProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getIdproducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
  
}
