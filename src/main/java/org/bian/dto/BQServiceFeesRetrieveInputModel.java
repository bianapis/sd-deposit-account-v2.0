package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis;
import org.bian.dto.BQServiceFeesRetrieveInputModelServiceFeesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveInputModel
 */
public class BQServiceFeesRetrieveInputModel   {
  private Object serviceFeesRetrieveActionTaskRecord = null;

  private String serviceFeesRetrieveActionRequest = null;

  private BQServiceFeesRetrieveInputModelServiceFeesInstanceReport serviceFeesInstanceReport = null;

  private BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceFeesRetrieveActionTaskRecord
  **/

  public Object getServiceFeesRetrieveActionTaskRecord() {
    return serviceFeesRetrieveActionTaskRecord;
  }

  public void setServiceFeesRetrieveActionTaskRecord(Object serviceFeesRetrieveActionTaskRecord) {
    this.serviceFeesRetrieveActionTaskRecord = serviceFeesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceFeesRetrieveActionRequest
  **/

  public String getServiceFeesRetrieveActionRequest() {
    return serviceFeesRetrieveActionRequest;
  }

  public void setServiceFeesRetrieveActionRequest(String serviceFeesRetrieveActionRequest) {
    this.serviceFeesRetrieveActionRequest = serviceFeesRetrieveActionRequest;
  }


  /**
   * Get serviceFeesInstanceReport
   * @return serviceFeesInstanceReport
  **/

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceReport getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(BQServiceFeesRetrieveInputModelServiceFeesInstanceReport serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }


  /**
   * Get serviceFeesInstanceAnalysis
   * @return serviceFeesInstanceAnalysis
  **/

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis getServiceFeesInstanceAnalysis() {
    return serviceFeesInstanceAnalysis;
  }

  public void setServiceFeesInstanceAnalysis(BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis) {
    this.serviceFeesInstanceAnalysis = serviceFeesInstanceAnalysis;
  }


}

