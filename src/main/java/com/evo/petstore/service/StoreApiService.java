package com.evo.petstore.service;

import java.util.Map;
import com.evo.petstore.model.Order;
import com.evo.api.springboot.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 * A delegate to be called by the {@link StoreApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface StoreApiService {

    /**
     * @see StoreApi#deleteOrder
     */
    Void deleteOrder(Long orderId) throws ApiException;

    /**
     * @see StoreApi#getInventory
     */
    Map<String, Integer> getInventory() throws ApiException;

    /**
     * @see StoreApi#getOrderById
     */
    Order getOrderById(Long orderId) throws ApiException;

    /**
     * @see StoreApi#placeOrder
     */
    Order placeOrder(Order body) throws ApiException;

}
