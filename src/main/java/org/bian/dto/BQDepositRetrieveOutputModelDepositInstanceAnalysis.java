package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveOutputModelDepositInstanceAnalysis
 */
public class BQDepositRetrieveOutputModelDepositInstanceAnalysis   {
  private Object depositInstanceAnalysisRecord = null;

  private String depositInstanceAnalysisReportType = null;

  private String depositInstanceAnalysisParameters = null;

  private Object depositInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositInstanceAnalysisRecord
  **/

  public Object getDepositInstanceAnalysisRecord() {
    return depositInstanceAnalysisRecord;
  }

  public void setDepositInstanceAnalysisRecord(Object depositInstanceAnalysisRecord) {
    this.depositInstanceAnalysisRecord = depositInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositInstanceAnalysisReportType
  **/

  public String getDepositInstanceAnalysisReportType() {
    return depositInstanceAnalysisReportType;
  }

  public void setDepositInstanceAnalysisReportType(String depositInstanceAnalysisReportType) {
    this.depositInstanceAnalysisReportType = depositInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositInstanceAnalysisParameters
  **/

  public String getDepositInstanceAnalysisParameters() {
    return depositInstanceAnalysisParameters;
  }

  public void setDepositInstanceAnalysisParameters(String depositInstanceAnalysisParameters) {
    this.depositInstanceAnalysisParameters = depositInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositInstanceAnalysisReport
  **/

  public Object getDepositInstanceAnalysisReport() {
    return depositInstanceAnalysisReport;
  }

  public void setDepositInstanceAnalysisReport(Object depositInstanceAnalysisReport) {
    this.depositInstanceAnalysisReport = depositInstanceAnalysisReport;
  }


}

