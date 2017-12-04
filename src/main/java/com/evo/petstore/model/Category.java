package com.evo.petstore.model;

import java.util.Objects;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Category
 */
@Validated

@Data
@Builder
public class Category   {
  @JsonProperty("id")
  private Long id = null;
  
  @JsonProperty("name")
  private String name = null;
  
}

