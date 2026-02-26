package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name= "compras_productos")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPk id;

    private int cantidad;
    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "estado", nullable = false)
    private int estado;


    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public ComprasProductoPk getId() {
        return id;
    }

    public void setId(ComprasProductoPk id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
