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
 * ModelApiResponse
 */
@Validated

@Data
@Builder
public class ModelApiResponse   {
  @JsonProperty("code")
  private Integer code = null;
  
  @JsonProperty("type")
  private String type = null;
  
  @JsonProperty("message")
  private String message = null;
  
}

