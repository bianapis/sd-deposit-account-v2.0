package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis
 */
public class BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis   {
  private Object earlyMaturingInstanceAnalysisRecord = null;

  private String earlyMaturingInstanceAnalysisReportType = null;

  private String earlyMaturingInstanceAnalysisParameters = null;

  private Object earlyMaturingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return earlyMaturingInstanceAnalysisRecord
  **/

  public Object getEarlyMaturingInstanceAnalysisRecord() {
    return earlyMaturingInstanceAnalysisRecord;
  }

  public void setEarlyMaturingInstanceAnalysisRecord(Object earlyMaturingInstanceAnalysisRecord) {
    this.earlyMaturingInstanceAnalysisRecord = earlyMaturingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return earlyMaturingInstanceAnalysisReportType
  **/

  public String getEarlyMaturingInstanceAnalysisReportType() {
    return earlyMaturingInstanceAnalysisReportType;
  }

  public void setEarlyMaturingInstanceAnalysisReportType(String earlyMaturingInstanceAnalysisReportType) {
    this.earlyMaturingInstanceAnalysisReportType = earlyMaturingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return earlyMaturingInstanceAnalysisParameters
  **/

  public String getEarlyMaturingInstanceAnalysisParameters() {
    return earlyMaturingInstanceAnalysisParameters;
  }

  public void setEarlyMaturingInstanceAnalysisParameters(String earlyMaturingInstanceAnalysisParameters) {
    this.earlyMaturingInstanceAnalysisParameters = earlyMaturingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return earlyMaturingInstanceAnalysisReport
  **/

  public Object getEarlyMaturingInstanceAnalysisReport() {
    return earlyMaturingInstanceAnalysisReport;
  }

  public void setEarlyMaturingInstanceAnalysisReport(Object earlyMaturingInstanceAnalysisReport) {
    this.earlyMaturingInstanceAnalysisReport = earlyMaturingInstanceAnalysisReport;
  }


}

