/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controladores.Coordinador;


/**
 *
 * @author maryonday
 */
public class UsuarioVo {
    private Coordinador micoordinador;
	public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador = miCoordinador;
	}
     private String nombre, cedula, carrera, sexo, fechahora; 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
    public String getFechahora() {
        return fechahora;
    }
    
    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

   
}
