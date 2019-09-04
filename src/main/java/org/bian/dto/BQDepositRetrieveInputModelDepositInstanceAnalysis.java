package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveInputModelDepositInstanceAnalysis
 */
public class BQDepositRetrieveInputModelDepositInstanceAnalysis   {
  private String depositInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositInstanceAnalysisReference
  **/

  public String getDepositInstanceAnalysisReference() {
    return depositInstanceAnalysisReference;
  }

  public void setDepositInstanceAnalysisReference(String depositInstanceAnalysisReference) {
    this.depositInstanceAnalysisReference = depositInstanceAnalysisReference;
  }


}

