package com.evo.petstore.service;

import com.evo.petstore.model.ModelApiResponse;
import com.evo.petstore.model.Pet;
import org.springframework.core.io.Resource;
import com.evo.api.springboot.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 * A delegate to be called by the {@link PetApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface PetApiService {

    /**
     * @see PetApi#addPet
     */
    Void addPet(Pet body) throws ApiException;

    /**
     * @see PetApi#deletePet
     */
    Void deletePet(Long petId,
        String apiKey) throws ApiException;

    /**
     * @see PetApi#findPetsByStatus
     */
    List<Pet> findPetsByStatus(List<String> status) throws ApiException;

    /**
     * @see PetApi#findPetsByTags
     */
    List<Pet> findPetsByTags(List<String> tags) throws ApiException;

    /**
     * @see PetApi#getPetById
     */
    Pet getPetById(Long petId) throws ApiException;

    /**
     * @see PetApi#updatePet
     */
    Void updatePet(Pet body) throws ApiException;

    /**
     * @see PetApi#updatePetWithForm
     */
    Void updatePetWithForm(Long petId,
        String name,
        String status) throws ApiException;

    /**
     * @see PetApi#uploadFile
     */
    ModelApiResponse uploadFile(Long petId,
        String additionalMetadata,
        MultipartFile file) throws ApiException;

}
