package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveInputModelDepositInstanceReport
 */
public class BQDepositRetrieveInputModelDepositInstanceReport   {
  private String depositInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return depositInstanceReportReference
  **/

  public String getDepositInstanceReportReference() {
    return depositInstanceReportReference;
  }

  public void setDepositInstanceReportReference(String depositInstanceReportReference) {
    this.depositInstanceReportReference = depositInstanceReportReference;
  }


}

