package com.JesusGalea.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String autor;
	private Date fecha;
	private double precio;
	private String disponibilidad;
	private Integer destacado;
	private String imagen;
	private String descripcion;
	@Column(insertable=false, updatable=false)
	private Integer idCategoria;
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	public Libro() {
		
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCategoria() {
		return idCategoria;
	}
	public void setCategoria(int categoria) {
		this.idCategoria = categoria;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public int getDestacado() {
		return destacado;
	}
	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", precio="
				+ precio + ", disponibilidad=" + disponibilidad + ", destacado=" + destacado + ", imagen=" + imagen
				+ ", descripcion=" + descripcion + ", categoria= " + idCategoria + "]";
	}
}
