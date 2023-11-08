package com.sb.suppliermanagement.services;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sb.suppliermanagement.dto.ContractDTO;
import com.sb.suppliermanagement.model.Contract;
import com.sb.suppliermanagement.repository.ContractRepository;


@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired
	private ContractRepository repositorio;

	@Transactional(readOnly=true)
	public Optional<Contract> findById(Long id) {
		return repositorio.findById(id);
	}

	@Override
	public Optional<ContractDTO> findByContractid(Long id) {
	    Optional<Contract> contract = repositorio.findById(id);

	    if (contract.isPresent()) {
	        ContractDTO dto = new ContractDTO();
	        Contract contractObj = contract.get(); // Obtenemos el contrato de Optional

	        dto.setContractId(contractObj.getContractid());
	        dto.setContractDescription(contractObj.getContractdescription());
	        dto.setStartDate(contractObj.getStartdate());
	        dto.setFinishDate(contractObj.getFinishdate());
	        dto.setContractState(contractObj.getContractstate());

	        // Obtener los IDs de las relaciones
	        if (contractObj.getProductid() != null) {
	            dto.setProductName(contractObj.getProductid().getProductname());
	        }
	        if (contractObj.getSupplierid() != null) {
	            dto.setSupplierName(contractObj.getSupplierid().getCompanyname());
	        }

	        return Optional.of(dto); // Devolvemos un Optional que contiene el DTO
	    } else {
	        return Optional.empty(); // Devolvemos un Optional vacío si no se encuentra el contrato
	    }
	}

}
