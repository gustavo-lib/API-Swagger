package com.gortiz.swaggerapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Entity
public class Contacto implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(position = 1,  value = "id")
	private Long id;
	
	@NotBlank
	@ApiModelProperty(required = true, value = "nombre")
	private String nombre;
	@ApiModelProperty(required = true, value = "telefono")
	private String telefono;
	@ApiModelProperty(required = true, value = "email")
	private String email;
	@ApiModelProperty(required = true, value = "direccion")
	private String direccion;
	@ApiModelProperty(required = true, value = "codigopostal")
	private String codigopostal;
	@ApiModelProperty(required = true, value = "nota")
	@Column(length = 4100)
	private String nota;
	
	public Contacto() {
		
	}
	
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	
	

}
