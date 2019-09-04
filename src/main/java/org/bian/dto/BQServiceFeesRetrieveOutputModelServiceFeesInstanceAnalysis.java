package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis
 */
public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis   {
  private Object serviceFeesInstanceAnalysisRecord = null;

  private String serviceFeesInstanceAnalysisReportType = null;

  private String serviceFeesInstanceAnalysisParameters = null;

  private Object serviceFeesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceFeesInstanceAnalysisRecord
  **/

  public Object getServiceFeesInstanceAnalysisRecord() {
    return serviceFeesInstanceAnalysisRecord;
  }

  public void setServiceFeesInstanceAnalysisRecord(Object serviceFeesInstanceAnalysisRecord) {
    this.serviceFeesInstanceAnalysisRecord = serviceFeesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceFeesInstanceAnalysisReportType
  **/

  public String getServiceFeesInstanceAnalysisReportType() {
    return serviceFeesInstanceAnalysisReportType;
  }

  public void setServiceFeesInstanceAnalysisReportType(String serviceFeesInstanceAnalysisReportType) {
    this.serviceFeesInstanceAnalysisReportType = serviceFeesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceFeesInstanceAnalysisParameters
  **/

  public String getServiceFeesInstanceAnalysisParameters() {
    return serviceFeesInstanceAnalysisParameters;
  }

  public void setServiceFeesInstanceAnalysisParameters(String serviceFeesInstanceAnalysisParameters) {
    this.serviceFeesInstanceAnalysisParameters = serviceFeesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return serviceFeesInstanceAnalysisReport
  **/

  public Object getServiceFeesInstanceAnalysisReport() {
    return serviceFeesInstanceAnalysisReport;
  }

  public void setServiceFeesInstanceAnalysisReport(Object serviceFeesInstanceAnalysisReport) {
    this.serviceFeesInstanceAnalysisReport = serviceFeesInstanceAnalysisReport;
  }


}

