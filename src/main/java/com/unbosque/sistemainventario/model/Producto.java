package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idProducto;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "precioVenta")
    private double precioVenta;
    @Column (name = "precioCompra")
    private double precioCompra;
    @Column (name = "cantidadDisponible")
    private int cantidadDisponible;

}