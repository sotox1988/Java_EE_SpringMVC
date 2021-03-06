package com.orion.portafolio2017.service;

import java.util.List;

import com.orion.portafolio2017.entity.Estado;
import com.orion.portafolio2017.entity.Funcionario;
import com.orion.portafolio2017.entity.Motivo;
import com.orion.portafolio2017.entity.Permiso;
import com.orion.portafolio2017.entity.Tipo;
import com.orion.portafolio2017.model.PermisoModel;


public interface PermisoService {
	
	public abstract PermisoModel addPermiso(PermisoModel permisoModel, Funcionario funcionario, Estado estado, Motivo motivo, Tipo tipo);
	
	//NO DEBERIA IR
	public abstract Permiso addPermiso2(Permiso permiso);
	
	public abstract List<PermisoModel> findAllPermisoByRut(String rut);
	public abstract List<PermisoModel> findAllPermisoByDepartamento(int idDepartamento);
	public abstract List<PermisoModel> findAllPermiso();
	
	public abstract Permiso findPermisoByRut(String rut);
	
	public abstract PermisoModel findPermisoModelByRut(String rut);
	
	public abstract PermisoModel findPermisoModelById(int id);
	
	public abstract Permiso findPermisoById(int id);
	
	public abstract void removePermiso(int rut);

}
