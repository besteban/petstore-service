package com.evo.petstore.service.impl;

import com.evo.petstore.service.StoreApiService;
import java.util.Map;
import com.evo.petstore.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import com.evo.api.springboot.exception.ApiException;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * A delegate to be called by the {@link StoreApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class StoreApiServiceImpl implements StoreApiService{

     @Override
    public Void deleteOrder(Long orderId) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Map<String, Integer> getInventory() throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Order getOrderById(Long orderId) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Order placeOrder(Order body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

}
