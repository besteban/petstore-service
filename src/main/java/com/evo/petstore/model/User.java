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
 * User
 */
@Validated

@Data
@Builder
public class User   {
  @JsonProperty("id")
  private Long id = null;
  
  @JsonProperty("username")
  private String username = null;
  
  @JsonProperty("firstName")
  private String firstName = null;
  
  @JsonProperty("lastName")
  private String lastName = null;
  
  @JsonProperty("email")
  private String email = null;
  
  @JsonProperty("password")
  private String password = null;
  
  @JsonProperty("phone")
  private String phone = null;
  
  @JsonProperty("userStatus")
  private Integer userStatus = null;
  
}

