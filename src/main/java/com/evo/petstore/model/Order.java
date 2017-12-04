package com.evo.petstore.model;

import java.util.Objects;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated

@Data
@Builder
public class Order   {
  @JsonProperty("id")
  private Long id = null;
  
  @JsonProperty("petId")
  private Long petId = null;
  
  @JsonProperty("quantity")
  private Integer quantity = null;
  
  @JsonProperty("shipDate")
  private OffsetDateTime shipDate = null;
  
  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;
  
  @JsonProperty("complete")
  private Boolean complete = false;
  
}

