package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveInputModelInterestInstanceAnalysis;
import org.bian.dto.BQInterestRetrieveInputModelInterestInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveInputModel
 */
public class BQInterestRetrieveInputModel   {
  private Object interestRetrieveActionTaskRecord = null;

  private String interestRetrieveActionRequest = null;

  private BQInterestRetrieveInputModelInterestInstanceReport interestInstanceReport = null;

  private BQInterestRetrieveInputModelInterestInstanceAnalysis interestInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interestRetrieveActionTaskRecord
  **/

  public Object getInterestRetrieveActionTaskRecord() {
    return interestRetrieveActionTaskRecord;
  }

  public void setInterestRetrieveActionTaskRecord(Object interestRetrieveActionTaskRecord) {
    this.interestRetrieveActionTaskRecord = interestRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return interestRetrieveActionRequest
  **/

  public String getInterestRetrieveActionRequest() {
    return interestRetrieveActionRequest;
  }

  public void setInterestRetrieveActionRequest(String interestRetrieveActionRequest) {
    this.interestRetrieveActionRequest = interestRetrieveActionRequest;
  }


  /**
   * Get interestInstanceReport
   * @return interestInstanceReport
  **/

  public BQInterestRetrieveInputModelInterestInstanceReport getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(BQInterestRetrieveInputModelInterestInstanceReport interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }


  /**
   * Get interestInstanceAnalysis
   * @return interestInstanceAnalysis
  **/

  public BQInterestRetrieveInputModelInterestInstanceAnalysis getInterestInstanceAnalysis() {
    return interestInstanceAnalysis;
  }

  public void setInterestInstanceAnalysis(BQInterestRetrieveInputModelInterestInstanceAnalysis interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
  }


}

