package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRolloverRetrieveOutputModelRolloverInstanceReport
 */
public class BQRolloverRetrieveOutputModelRolloverInstanceReport   {
  private Object rolloverInstanceReportRecord = null;

  private String rolloverInstanceReportType = null;

  private String rolloverInstanceReportParameters = null;

  private Object rolloverInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return rolloverInstanceReportRecord
  **/

  public Object getRolloverInstanceReportRecord() {
    return rolloverInstanceReportRecord;
  }

  public void setRolloverInstanceReportRecord(Object rolloverInstanceReportRecord) {
    this.rolloverInstanceReportRecord = rolloverInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rolloverInstanceReportType
  **/

  public String getRolloverInstanceReportType() {
    return rolloverInstanceReportType;
  }

  public void setRolloverInstanceReportType(String rolloverInstanceReportType) {
    this.rolloverInstanceReportType = rolloverInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return rolloverInstanceReportParameters
  **/

  public String getRolloverInstanceReportParameters() {
    return rolloverInstanceReportParameters;
  }

  public void setRolloverInstanceReportParameters(String rolloverInstanceReportParameters) {
    this.rolloverInstanceReportParameters = rolloverInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return rolloverInstanceReport
  **/

  public Object getRolloverInstanceReport() {
    return rolloverInstanceReport;
  }

  public void setRolloverInstanceReport(Object rolloverInstanceReport) {
    this.rolloverInstanceReport = rolloverInstanceReport;
  }


}

