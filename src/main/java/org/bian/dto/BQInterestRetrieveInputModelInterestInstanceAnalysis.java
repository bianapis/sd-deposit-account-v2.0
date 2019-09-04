package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveInputModelInterestInstanceAnalysis
 */
public class BQInterestRetrieveInputModelInterestInstanceAnalysis   {
  private String interestInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return interestInstanceAnalysisReference
  **/

  public String getInterestInstanceAnalysisReference() {
    return interestInstanceAnalysisReference;
  }

  public void setInterestInstanceAnalysisReference(String interestInstanceAnalysisReference) {
    this.interestInstanceAnalysisReference = interestInstanceAnalysisReference;
  }


}

