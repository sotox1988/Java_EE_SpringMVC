package com.orion.portafolio2017.service;

import java.util.List;

import com.orion.portafolio2017.entity.Permiso;
import com.orion.portafolio2017.model.PermisoModel;


public interface PermisoService {
	
	public abstract PermisoModel addPermiso(PermisoModel permisoModel);
	
	public abstract List<PermisoModel> findAllPermisoByRut(String rut);
	
	public abstract Permiso findPermisoByRut(String rut);
	
	public abstract PermisoModel findPermisoModelByRut(String rut);
	
	public abstract void removePermiso(int rut);

}