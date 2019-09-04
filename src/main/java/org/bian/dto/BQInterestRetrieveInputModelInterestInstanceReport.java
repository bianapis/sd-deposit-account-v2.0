package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveInputModelInterestInstanceReport
 */
public class BQInterestRetrieveInputModelInterestInstanceReport   {
  private String interestInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return interestInstanceReportReference
  **/

  public String getInterestInstanceReportReference() {
    return interestInstanceReportReference;
  }

  public void setInterestInstanceReportReference(String interestInstanceReportReference) {
    this.interestInstanceReportReference = interestInstanceReportReference;
  }


}

