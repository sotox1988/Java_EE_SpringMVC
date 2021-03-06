package converterBackup;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.orion.portafolio2017.entity.Cargo;
import com.orion.portafolio2017.entity.Departamento;
import com.orion.portafolio2017.entity.Funcionario;
import com.orion.portafolio2017.entity.HistorialCargo;

import modelBackup.CargoModel;
import modelBackup.DepartamentoModel;
import modelBackup.FuncionarioModel;
import modelBackup.HistorialCargoModel;


@Component("cargoConverter")
public class CargoConverter {
	
	@Autowired
	@Qualifier("historialcargoConverter")
	private HistorialCargoConverter historialcargoConverter;
	
	@Autowired
	@Qualifier("funcionarioConverter")
	private FuncionarioConverter funcionarioConverter;

	public Cargo convertCargoModel2Cargo(CargoModel cargoModel) {

		Cargo cargo = new Cargo();
		cargo.setIdCargo(cargoModel.getIdCargo());
		cargo.setNombreCargo(cargoModel.getNombreCargo());
		cargo.setSalario(cargoModel.getSalario());
		cargo.setHistorialCargos((Set<HistorialCargo>) historialcargoConverter.convertHistorialCargoModel2HistorialCargo((HistorialCargoModel) cargoModel.getHistorialCargos()));
		cargo.setFuncionarios((Set<Funcionario>) funcionarioConverter.convertFuncionarioModel2Funcionario((FuncionarioModel) cargoModel.getFuncionarios()));
		return cargo;
		
	}
	

	public CargoModel convertCargo2CargoModel(Cargo cargo) {
		
		CargoModel cargoModel = new CargoModel();
		cargoModel.setIdCargo(cargo.getIdCargo());
		cargoModel.setNombreCargo(cargo.getNombreCargo());
		cargoModel.setSalario(cargo.getSalario());
		cargoModel.setHistorialCargos((List<HistorialCargoModel>) historialcargoConverter.convertHistorialCargo2HistorialCargoModel((HistorialCargo) cargo.getHistorialCargos()));
		cargoModel.setFuncionarios((List<FuncionarioModel>) funcionarioConverter.convertFuncionario2FuncionarioModel((Funcionario) cargo.getFuncionarios()));
		return cargoModel;
		
	}
}
