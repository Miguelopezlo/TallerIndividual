package com.sb.suppliermanagement.services.mapper;

import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import com.sb.suppliermanagement.dto.SupplierProductv1DTO;
import com.sb.suppliermanagement.model.SupplierProductv1;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SupplierProductv1Mapper {
	
	SupplierProductv1 supplierProductv1ToSupplierProductv1DTO(SupplierProductv1DTO supplierProductv1DTO);
	
	SupplierProductv1DTO supplierProductv1DTOToSupplierProductv1(SupplierProductv1 supplierProductv1);
	
	List<SupplierProductv1DTO> listoSupplierProductv1ToListSupplierProductv1DTO(List<SupplierProductv1> supplierProductv1);
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateSupplierProductv1FromSupplierProductv1DTO(SupplierProductv1DTO supplierProductv1DTO, @MappingTarget SupplierProductv1 supplierProductv1);
	
	
}
