/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

public class entradas {
    
   int identrada										;
   String nomProd;
   int stock;
   int idCategoria;
   Date fecha;
   int idproveedor;
   double precioE;
   double precioV;
   double total;

    public entradas() {
    }

    public entradas(int identrada, String nomProd, int stock, int idCategoria, Date fecha, int idproveedor, double precioE, double precioV, double total) {
        this.identrada = identrada;
        this.nomProd = nomProd;
        this.stock = stock;
        this.idCategoria = idCategoria;
        this.fecha = fecha;
        this.idproveedor = idproveedor;
        this.precioE = precioE;
        this.precioV = precioV;
        this.total = total;
    }

   

    public int getIdentrada() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public double getPrecioE() {
        return precioE;
    }

    public void setPrecioE(double precioE) {
        this.precioE = precioE;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }

    

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
   
   
}
