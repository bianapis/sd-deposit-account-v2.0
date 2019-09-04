package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis;
import org.bian.dto.BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveInputModel
 */
public class BQEarlyMaturingRetrieveInputModel   {
  private Object earlyMaturingRetrieveActionTaskRecord = null;

  private String earlyMaturingRetrieveActionRequest = null;

  private BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport earlyMaturingInstanceReport = null;

  private BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis earlyMaturingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return earlyMaturingRetrieveActionTaskRecord
  **/

  public Object getEarlyMaturingRetrieveActionTaskRecord() {
    return earlyMaturingRetrieveActionTaskRecord;
  }

  public void setEarlyMaturingRetrieveActionTaskRecord(Object earlyMaturingRetrieveActionTaskRecord) {
    this.earlyMaturingRetrieveActionTaskRecord = earlyMaturingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return earlyMaturingRetrieveActionRequest
  **/

  public String getEarlyMaturingRetrieveActionRequest() {
    return earlyMaturingRetrieveActionRequest;
  }

  public void setEarlyMaturingRetrieveActionRequest(String earlyMaturingRetrieveActionRequest) {
    this.earlyMaturingRetrieveActionRequest = earlyMaturingRetrieveActionRequest;
  }


  /**
   * Get earlyMaturingInstanceReport
   * @return earlyMaturingInstanceReport
  **/

  public BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport getEarlyMaturingInstanceReport() {
    return earlyMaturingInstanceReport;
  }

  public void setEarlyMaturingInstanceReport(BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceReport earlyMaturingInstanceReport) {
    this.earlyMaturingInstanceReport = earlyMaturingInstanceReport;
  }


  /**
   * Get earlyMaturingInstanceAnalysis
   * @return earlyMaturingInstanceAnalysis
  **/

  public BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis getEarlyMaturingInstanceAnalysis() {
    return earlyMaturingInstanceAnalysis;
  }

  public void setEarlyMaturingInstanceAnalysis(BQEarlyMaturingRetrieveInputModelEarlyMaturingInstanceAnalysis earlyMaturingInstanceAnalysis) {
    this.earlyMaturingInstanceAnalysis = earlyMaturingInstanceAnalysis;
  }


}

