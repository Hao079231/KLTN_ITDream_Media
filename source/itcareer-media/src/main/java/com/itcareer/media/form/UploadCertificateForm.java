package com.itcareer.media.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@ApiModel
public class UploadCertificateForm {
  @NotEmpty(message = "fullName cannot be null")
  @ApiModelProperty(name = "fullName", required = true)
  private String fullName;
  @NotEmpty(message = "simulationTitle cannot be null")
  @ApiModelProperty(name = "simulationTitle", required = true)
  private String simulationTitle;
}
