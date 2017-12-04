package com.evo.petstore.api;

import com.evo.petstore.model.ModelApiResponse;
import com.evo.petstore.model.Pet;
import org.springframework.core.io.Resource;
import com.evo.petstore.service.*;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.evo.api.springboot.exception.ApiException;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class PetApiController implements PetApi {

	@Autowired
    private PetApiService service;

    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) throws ApiException{
        return new ResponseEntity<Void>(service.addPet(body), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) throws ApiException{
        return new ResponseEntity<Void>(service.deletePet(petId, apiKey), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) throws ApiException{
        return new ResponseEntity<List<Pet>>(service.findPetsByStatus(status), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) throws ApiException{
        return new ResponseEntity<List<Pet>>(service.findPetsByTags(tags), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Long petId) throws ApiException{
        return new ResponseEntity<Pet>(service.getPetById(petId), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) throws ApiException{
        return new ResponseEntity<Void>(service.updatePet(body), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Updated name of the pet") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the pet") @RequestParam(value="status", required=false)  String status) throws ApiException{
        return new ResponseEntity<Void>(service.updatePetWithForm(petId, name, status), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) throws ApiException{
        return new ResponseEntity<ModelApiResponse>(service.uploadFile(petId, additionalMetadata, file), HttpStatus.NOT_IMPLEMENTED);
    }

}
