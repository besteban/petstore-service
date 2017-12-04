package com.evo.petstore.model;

import java.util.Objects;
import lombok.*;
import com.evo.petstore.model.Category;
import com.evo.petstore.model.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pet
 */
@Validated

@Data
@Builder
public class Pet   {
  @JsonProperty("id")
  private Long id = null;
  
  @JsonProperty("category")
  private Category category = null;
  
  @JsonProperty("name")
  private String name = null;
  
  @JsonProperty("photoUrls")
  @Valid
  @ApiModelProperty(required = true, value = "")
  private List<String> photoUrls = new ArrayList<String>();
  
  @JsonProperty("tags")
  @Valid
  @ApiModelProperty(value = "")
  private List<Tag> tags = null;
  
  /**
   * pet status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

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
  
}

