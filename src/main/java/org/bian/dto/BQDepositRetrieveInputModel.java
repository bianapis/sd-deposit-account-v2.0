package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositRetrieveInputModelDepositInstanceAnalysis;
import org.bian.dto.BQDepositRetrieveInputModelDepositInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveInputModel
 */
public class BQDepositRetrieveInputModel   {
  private Object depositRetrieveActionTaskRecord = null;

  private String depositRetrieveActionRequest = null;

  private BQDepositRetrieveInputModelDepositInstanceReport depositInstanceReport = null;

  private BQDepositRetrieveInputModelDepositInstanceAnalysis depositInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositRetrieveActionTaskRecord
  **/

  public Object getDepositRetrieveActionTaskRecord() {
    return depositRetrieveActionTaskRecord;
  }

  public void setDepositRetrieveActionTaskRecord(Object depositRetrieveActionTaskRecord) {
    this.depositRetrieveActionTaskRecord = depositRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositRetrieveActionRequest
  **/

  public String getDepositRetrieveActionRequest() {
    return depositRetrieveActionRequest;
  }

  public void setDepositRetrieveActionRequest(String depositRetrieveActionRequest) {
    this.depositRetrieveActionRequest = depositRetrieveActionRequest;
  }


  /**
   * Get depositInstanceReport
   * @return depositInstanceReport
  **/

  public BQDepositRetrieveInputModelDepositInstanceReport getDepositInstanceReport() {
    return depositInstanceReport;
  }

  public void setDepositInstanceReport(BQDepositRetrieveInputModelDepositInstanceReport depositInstanceReport) {
    this.depositInstanceReport = depositInstanceReport;
  }


  /**
   * Get depositInstanceAnalysis
   * @return depositInstanceAnalysis
  **/

  public BQDepositRetrieveInputModelDepositInstanceAnalysis getDepositInstanceAnalysis() {
    return depositInstanceAnalysis;
  }

  public void setDepositInstanceAnalysis(BQDepositRetrieveInputModelDepositInstanceAnalysis depositInstanceAnalysis) {
    this.depositInstanceAnalysis = depositInstanceAnalysis;
  }


}

