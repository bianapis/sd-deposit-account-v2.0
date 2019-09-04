package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport
 */
public class BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport   {
  private String earlyMaturingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return earlyMaturingInstanceReportReference
  **/

  public String getEarlyMaturingInstanceReportReference() {
    return earlyMaturingInstanceReportReference;
  }

  public void setEarlyMaturingInstanceReportReference(String earlyMaturingInstanceReportReference) {
    this.earlyMaturingInstanceReportReference = earlyMaturingInstanceReportReference;
  }


}

