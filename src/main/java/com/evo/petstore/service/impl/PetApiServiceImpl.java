package com.evo.petstore.service.impl;

import com.evo.petstore.service.PetApiService;
import com.evo.petstore.model.ModelApiResponse;
import com.evo.petstore.model.Pet;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import com.evo.api.springboot.exception.ApiException;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * A delegate to be called by the {@link PetApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class PetApiServiceImpl implements PetApiService{

     @Override
    public Void addPet(Pet body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void deletePet(Long petId,
        String apiKey) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public List<Pet> findPetsByStatus(List<String> status) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public List<Pet> findPetsByTags(List<String> tags) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Pet getPetById(Long petId) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void updatePet(Pet body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void updatePetWithForm(Long petId,
        String name,
        String status) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public ModelApiResponse uploadFile(Long petId,
        String additionalMetadata,
        MultipartFile file) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

}
