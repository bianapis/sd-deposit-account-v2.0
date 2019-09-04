package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceAnalysis
 */
public class BQInterestRetrieveOutputModelInterestInstanceAnalysis   {
  private Object interestInstanceAnalysisRecord = null;

  private String interestInstanceAnalysisReportType = null;

  private String interestInstanceAnalysisParameters = null;

  private Object interestInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return interestInstanceAnalysisRecord
  **/

  public Object getInterestInstanceAnalysisRecord() {
    return interestInstanceAnalysisRecord;
  }

  public void setInterestInstanceAnalysisRecord(Object interestInstanceAnalysisRecord) {
    this.interestInstanceAnalysisRecord = interestInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return interestInstanceAnalysisReportType
  **/

  public String getInterestInstanceAnalysisReportType() {
    return interestInstanceAnalysisReportType;
  }

  public void setInterestInstanceAnalysisReportType(String interestInstanceAnalysisReportType) {
    this.interestInstanceAnalysisReportType = interestInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return interestInstanceAnalysisParameters
  **/

  public String getInterestInstanceAnalysisParameters() {
    return interestInstanceAnalysisParameters;
  }

  public void setInterestInstanceAnalysisParameters(String interestInstanceAnalysisParameters) {
    this.interestInstanceAnalysisParameters = interestInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return interestInstanceAnalysisReport
  **/

  public Object getInterestInstanceAnalysisReport() {
    return interestInstanceAnalysisReport;
  }

  public void setInterestInstanceAnalysisReport(Object interestInstanceAnalysisReport) {
    this.interestInstanceAnalysisReport = interestInstanceAnalysisReport;
  }


}

