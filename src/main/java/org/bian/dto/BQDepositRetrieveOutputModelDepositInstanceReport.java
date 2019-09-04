package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveOutputModelDepositInstanceReport
 */
public class BQDepositRetrieveOutputModelDepositInstanceReport   {
  private Object depositInstanceReportRecord = null;

  private String depositInstanceReportType = null;

  private String depositInstanceReportParameters = null;

  private Object depositInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositInstanceReportRecord
  **/

  public Object getDepositInstanceReportRecord() {
    return depositInstanceReportRecord;
  }

  public void setDepositInstanceReportRecord(Object depositInstanceReportRecord) {
    this.depositInstanceReportRecord = depositInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositInstanceReportType
  **/

  public String getDepositInstanceReportType() {
    return depositInstanceReportType;
  }

  public void setDepositInstanceReportType(String depositInstanceReportType) {
    this.depositInstanceReportType = depositInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositInstanceReportParameters
  **/

  public String getDepositInstanceReportParameters() {
    return depositInstanceReportParameters;
  }

  public void setDepositInstanceReportParameters(String depositInstanceReportParameters) {
    this.depositInstanceReportParameters = depositInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositInstanceReport
  **/

  public Object getDepositInstanceReport() {
    return depositInstanceReport;
  }

  public void setDepositInstanceReport(Object depositInstanceReport) {
    this.depositInstanceReport = depositInstanceReport;
  }


}

