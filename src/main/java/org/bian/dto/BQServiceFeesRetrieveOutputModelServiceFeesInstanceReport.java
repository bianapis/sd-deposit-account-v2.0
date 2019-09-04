package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport
 */
public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport   {
  private Object serviceFeesInstanceReportRecord = null;

  private String serviceFeesInstanceReportType = null;

  private String serviceFeesInstanceReportParameters = null;

  private Object serviceFeesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceFeesInstanceReportRecord
  **/

  public Object getServiceFeesInstanceReportRecord() {
    return serviceFeesInstanceReportRecord;
  }

  public void setServiceFeesInstanceReportRecord(Object serviceFeesInstanceReportRecord) {
    this.serviceFeesInstanceReportRecord = serviceFeesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceFeesInstanceReportType
  **/

  public String getServiceFeesInstanceReportType() {
    return serviceFeesInstanceReportType;
  }

  public void setServiceFeesInstanceReportType(String serviceFeesInstanceReportType) {
    this.serviceFeesInstanceReportType = serviceFeesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceFeesInstanceReportParameters
  **/

  public String getServiceFeesInstanceReportParameters() {
    return serviceFeesInstanceReportParameters;
  }

  public void setServiceFeesInstanceReportParameters(String serviceFeesInstanceReportParameters) {
    this.serviceFeesInstanceReportParameters = serviceFeesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceFeesInstanceReport
  **/

  public Object getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(Object serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }


}

