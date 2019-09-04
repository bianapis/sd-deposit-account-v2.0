package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRolloverRetrieveInputModelRolloverInstanceAnalysis;
import org.bian.dto.BQRolloverRetrieveInputModelRolloverInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRolloverRetrieveInputModel
 */
public class BQRolloverRetrieveInputModel   {
  private Object rolloverRetrieveActionTaskRecord = null;

  private String rolloverRetrieveActionRequest = null;

  private BQRolloverRetrieveInputModelRolloverInstanceReport rolloverInstanceReport = null;

  private BQRolloverRetrieveInputModelRolloverInstanceAnalysis rolloverInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rolloverRetrieveActionTaskRecord
  **/

  public Object getRolloverRetrieveActionTaskRecord() {
    return rolloverRetrieveActionTaskRecord;
  }

  public void setRolloverRetrieveActionTaskRecord(Object rolloverRetrieveActionTaskRecord) {
    this.rolloverRetrieveActionTaskRecord = rolloverRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rolloverRetrieveActionRequest
  **/

  public String getRolloverRetrieveActionRequest() {
    return rolloverRetrieveActionRequest;
  }

  public void setRolloverRetrieveActionRequest(String rolloverRetrieveActionRequest) {
    this.rolloverRetrieveActionRequest = rolloverRetrieveActionRequest;
  }


  /**
   * Get rolloverInstanceReport
   * @return rolloverInstanceReport
  **/

  public BQRolloverRetrieveInputModelRolloverInstanceReport getRolloverInstanceReport() {
    return rolloverInstanceReport;
  }

  public void setRolloverInstanceReport(BQRolloverRetrieveInputModelRolloverInstanceReport rolloverInstanceReport) {
    this.rolloverInstanceReport = rolloverInstanceReport;
  }


  /**
   * Get rolloverInstanceAnalysis
   * @return rolloverInstanceAnalysis
  **/

  public BQRolloverRetrieveInputModelRolloverInstanceAnalysis getRolloverInstanceAnalysis() {
    return rolloverInstanceAnalysis;
  }

  public void setRolloverInstanceAnalysis(BQRolloverRetrieveInputModelRolloverInstanceAnalysis rolloverInstanceAnalysis) {
    this.rolloverInstanceAnalysis = rolloverInstanceAnalysis;
  }


}

