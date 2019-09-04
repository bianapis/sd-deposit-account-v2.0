package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRolloverRetrieveOutputModelRolloverInstanceAnalysis
 */
public class BQRolloverRetrieveOutputModelRolloverInstanceAnalysis   {
  private Object rolloverInstanceAnalysisRecord = null;

  private String rolloverInstanceAnalysisReportType = null;

  private String rolloverInstanceAnalysisParameters = null;

  private Object rolloverInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return rolloverInstanceAnalysisRecord
  **/

  public Object getRolloverInstanceAnalysisRecord() {
    return rolloverInstanceAnalysisRecord;
  }

  public void setRolloverInstanceAnalysisRecord(Object rolloverInstanceAnalysisRecord) {
    this.rolloverInstanceAnalysisRecord = rolloverInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return rolloverInstanceAnalysisReportType
  **/

  public String getRolloverInstanceAnalysisReportType() {
    return rolloverInstanceAnalysisReportType;
  }

  public void setRolloverInstanceAnalysisReportType(String rolloverInstanceAnalysisReportType) {
    this.rolloverInstanceAnalysisReportType = rolloverInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return rolloverInstanceAnalysisParameters
  **/

  public String getRolloverInstanceAnalysisParameters() {
    return rolloverInstanceAnalysisParameters;
  }

  public void setRolloverInstanceAnalysisParameters(String rolloverInstanceAnalysisParameters) {
    this.rolloverInstanceAnalysisParameters = rolloverInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return rolloverInstanceAnalysisReport
  **/

  public Object getRolloverInstanceAnalysisReport() {
    return rolloverInstanceAnalysisReport;
  }

  public void setRolloverInstanceAnalysisReport(Object rolloverInstanceAnalysisReport) {
    this.rolloverInstanceAnalysisReport = rolloverInstanceAnalysisReport;
  }


}

