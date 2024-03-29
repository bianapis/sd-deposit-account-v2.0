package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis
 */
public class BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis   {
  private String earlyMaturingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return earlyMaturingInstanceAnalysisReference
  **/

  public String getEarlyMaturingInstanceAnalysisReference() {
    return earlyMaturingInstanceAnalysisReference;
  }

  public void setEarlyMaturingInstanceAnalysisReference(String earlyMaturingInstanceAnalysisReference) {
    this.earlyMaturingInstanceAnalysisReference = earlyMaturingInstanceAnalysisReference;
  }


}

