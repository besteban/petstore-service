package com.evo.petstore.api;

import java.util.Map;
import com.evo.petstore.model.Order;
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
public class StoreApiController implements StoreApi {

	@Autowired
    private StoreApiService service;

    public ResponseEntity<Void> deleteOrder(@Min(1)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) throws ApiException{
        return new ResponseEntity<Void>(service.deleteOrder(orderId), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, Integer>> getInventory() throws ApiException{
        return new ResponseEntity<Map<String, Integer>>(service.getInventory(), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrderById(@Min(1) @Max(10) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) throws ApiException{
        return new ResponseEntity<Order>(service.getOrderById(orderId), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) throws ApiException{
        return new ResponseEntity<Order>(service.placeOrder(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
