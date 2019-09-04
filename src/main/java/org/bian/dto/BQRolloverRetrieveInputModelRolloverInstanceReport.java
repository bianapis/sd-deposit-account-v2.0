package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRolloverRetrieveInputModelRolloverInstanceReport
 */
public class BQRolloverRetrieveInputModelRolloverInstanceReport   {
  private String rolloverInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return rolloverInstanceReportReference
  **/

  public String getRolloverInstanceReportReference() {
    return rolloverInstanceReportReference;
  }

  public void setRolloverInstanceReportReference(String rolloverInstanceReportReference) {
    this.rolloverInstanceReportReference = rolloverInstanceReportReference;
  }


}

