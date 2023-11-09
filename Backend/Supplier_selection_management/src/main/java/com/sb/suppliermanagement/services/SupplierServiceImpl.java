package com.sb.suppliermanagement.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.sb.suppliermanagement.dto.SupplierDTO;
import com.sb.suppliermanagement.dto.SupplierProcessingDTO;
import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository repositorio;
	
	@Transactional(readOnly=true)
	public List<Supplier> findAll() {
		return repositorio.findAll();
	}


	@Transactional(readOnly=true)
	public Optional<Supplier> findById(Long id) {
		return repositorio.findById(id);
	}
	
	@Transactional(readOnly=true)
	public List<Supplier> findByCity(String city) {
		return (List<Supplier>) repositorio.findByCity(city);
	}
	
	@Transactional(readOnly=true)
	public List<Supplier> findByScore(int score) {
		return (List<Supplier>) repositorio.findByScore(score);
	}


	@Transactional
	public Supplier save(Supplier supplier) {
		return repositorio.save(supplier);
	}

	@Transactional
	public void deleteById(Long id) {
		repositorio.deleteById(id);

	}


	@Transactional(readOnly=true)
	public List<Supplier> getSupplierByProductid(Long productid) {
		System.out.println("Se están buscando los proveedores para este producto"+ productid);
		return repositorio.getSupplierByProductid(productid);
		
	}
	
	
	
    // Documentation: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/multipart/MultipartFile.html
    // Reads the MultipartFile and reads CSV line by line to get data
    // Data from each line is manually mapped to create Client instances and push them into a Clients list
    // Supplier list is then saved in DB
    public SupplierProcessingDTO createSuppliers(MultipartFile file) {
        SupplierProcessingDTO processInfo = new SupplierProcessingDTO();
        int newSupplierCount = 0;
        // invalidDocuments will be given to front end for information purposes
        ArrayList<Long> invalidSupplierid = new ArrayList<Long>();
        ArrayList<Long> validSupplierid = new ArrayList<Long>();
        ArrayList<Supplier> toSaveSupplier = new ArrayList<Supplier>();
        try {
            // Reads as text content from the file received as argument
            BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
            // This variable is going to have each line records as one string
            String row;
            while ((row = reader.readLine()) != null && !row.isEmpty()) {
                // Splits row string into different values
                String[] supplierData = row.split(",");
                System.out.println("Fila "+Arrays.toString(supplierData));
                // Manually mapping into a Client instance
                Supplier newSupplier = new Supplier();
                newSupplier.setSupplierid(Long.parseLong(supplierData[0]));
                // Checks if supplierId exists in db or if it is repeated in this csv file (does that by seeing if supplierid exists in validId list)
                if (repositorio.existsBySupplierid(newSupplier.getSupplierid()) || validSupplierid.contains(newSupplier.getSupplierid())==true) {
                    // If client document is already in database or processed in this csv file
                	invalidSupplierid.add(newSupplier.getSupplierid());
                }
                else {
                	//Setting propierties to the temporal newSupplier object
                	validSupplierid.add(newSupplier.getSupplierid());
                    newSupplier.setCompanyname(supplierData[1].strip());
                    newSupplier.setContact(supplierData[2].strip());
                    newSupplier.setAddress(supplierData[3].strip());
                    newSupplier.setCelphone(supplierData[4].strip());
                    newSupplier.setEmail(supplierData[5].strip());
                    newSupplier.setScore(Integer.parseInt(supplierData[6].strip()));
                    newSupplier.setCity(supplierData[7].strip());
                    toSaveSupplier.add(newSupplier);
                 }
            }
            // Number of saved clients
            newSupplierCount = repositorio.saveAll(toSaveSupplier).size();
            processInfo.setCreatedSuppliers(newSupplierCount);
            processInfo.setInvalidSupplierid(invalidSupplierid);
            System.out.println("INTERNAL PROCESS: " + newSupplierCount + " new clients were saved");
            System.out.println("INTERNAL PROCESS: " + invalidSupplierid.size() + " invalid documents found");
            return processInfo;
        } catch (IOException ex) {
            ex.printStackTrace();
            return processInfo;
        }
    }


	@Transactional
	public List<SupplierDTO> findAllasDTO() {
		List<Supplier> supplier = repositorio.findAll();
		 List<SupplierDTO> supplierDTOs = new ArrayList<>();

	        for (Supplier supplierite : supplier) {
	            SupplierDTO dto = new SupplierDTO();
	            dto.setCompanyname(supplierite.getCompanyname());
	            dto.setContact(supplierite.getContact());
	            dto.setAddress(supplierite.getAddress());
	            dto.setCelphone(supplierite.getCelphone());
	            dto.setEmail(supplierite.getEmail());
	            dto.setScore(supplierite.getScore());
	            dto.setCity(supplierite.getCity());

//	            Obtener los nombres de las relaciones
//	            if (contract.getProduct() != null) {
//	                dto.setProductName(movement.getProductid().getProductid());
//	            }
//	            if (contract.getSupplier() != null) {
//	                dto.setSupplierid(contractite.getSupplierid().getSupplierid());
//	            }

	            supplierDTOs.add(dto);
	        }

	        return supplierDTOs;
	    }

}
	
	


