package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceReport
 */
public class BQInterestRetrieveOutputModelInterestInstanceReport   {
  private Object interestInstanceReportRecord = null;

  private String interestInstanceReportType = null;

  private String interestInstanceReportParameters = null;

  private Object interestInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return interestInstanceReportRecord
  **/

  public Object getInterestInstanceReportRecord() {
    return interestInstanceReportRecord;
  }

  public void setInterestInstanceReportRecord(Object interestInstanceReportRecord) {
    this.interestInstanceReportRecord = interestInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return interestInstanceReportType
  **/

  public String getInterestInstanceReportType() {
    return interestInstanceReportType;
  }

  public void setInterestInstanceReportType(String interestInstanceReportType) {
    this.interestInstanceReportType = interestInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return interestInstanceReportParameters
  **/

  public String getInterestInstanceReportParameters() {
    return interestInstanceReportParameters;
  }

  public void setInterestInstanceReportParameters(String interestInstanceReportParameters) {
    this.interestInstanceReportParameters = interestInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return interestInstanceReport
  **/

  public Object getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(Object interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }


}

