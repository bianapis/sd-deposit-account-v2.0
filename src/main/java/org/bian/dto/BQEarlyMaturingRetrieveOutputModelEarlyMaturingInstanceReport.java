package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport
 */
public class BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport   {
  private Object earlyMaturingInstanceReportRecord = null;

  private String earlyMaturingInstanceReportType = null;

  private String earlyMaturingInstanceReportParameters = null;

  private Object earlyMaturingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return earlyMaturingInstanceReportRecord
  **/

  public Object getEarlyMaturingInstanceReportRecord() {
    return earlyMaturingInstanceReportRecord;
  }

  public void setEarlyMaturingInstanceReportRecord(Object earlyMaturingInstanceReportRecord) {
    this.earlyMaturingInstanceReportRecord = earlyMaturingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return earlyMaturingInstanceReportType
  **/

  public String getEarlyMaturingInstanceReportType() {
    return earlyMaturingInstanceReportType;
  }

  public void setEarlyMaturingInstanceReportType(String earlyMaturingInstanceReportType) {
    this.earlyMaturingInstanceReportType = earlyMaturingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return earlyMaturingInstanceReportParameters
  **/

  public String getEarlyMaturingInstanceReportParameters() {
    return earlyMaturingInstanceReportParameters;
  }

  public void setEarlyMaturingInstanceReportParameters(String earlyMaturingInstanceReportParameters) {
    this.earlyMaturingInstanceReportParameters = earlyMaturingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return earlyMaturingInstanceReport
  **/

  public Object getEarlyMaturingInstanceReport() {
    return earlyMaturingInstanceReport;
  }

  public void setEarlyMaturingInstanceReport(Object earlyMaturingInstanceReport) {
    this.earlyMaturingInstanceReport = earlyMaturingInstanceReport;
  }


}

