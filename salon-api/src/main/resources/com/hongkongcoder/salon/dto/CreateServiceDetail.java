package com.hongkongcoder.salon.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CreateServiceDetail {

	  @NotNull
	  @Size(min=3, message="Name is too short (at least 3 characters required)")
	  private String name;
	  
	  @NotNull
	  @Size(min=3, message="Description is too short (at least 3 characters required)")
	  private String description;

}
