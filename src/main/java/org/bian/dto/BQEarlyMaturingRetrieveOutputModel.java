package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis;
import org.bian.dto.BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord;
import org.bian.dto.BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveOutputModel
 */
public class BQEarlyMaturingRetrieveOutputModel   {
  private BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord = null;

  private String earlyMaturingRetrieveActionTaskReference = null;

  private Object earlyMaturingRetrieveActionTaskRecord = null;

  private String earlyMaturingRetrieveActionResponse = null;

  private BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport earlyMaturingInstanceReport = null;

  private BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis earlyMaturingInstanceAnalysis = null;


  /**
   * Get earlyMaturingInstanceRecord
   * @return earlyMaturingInstanceRecord
  **/

  public BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord getEarlyMaturingInstanceRecord() {
    return earlyMaturingInstanceRecord;
  }

  public void setEarlyMaturingInstanceRecord(BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord) {
    this.earlyMaturingInstanceRecord = earlyMaturingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Early Maturing instance retrieve service call 
   * @return earlyMaturingRetrieveActionTaskReference
  **/

  public String getEarlyMaturingRetrieveActionTaskReference() {
    return earlyMaturingRetrieveActionTaskReference;
  }

  public void setEarlyMaturingRetrieveActionTaskReference(String earlyMaturingRetrieveActionTaskReference) {
    this.earlyMaturingRetrieveActionTaskReference = earlyMaturingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return earlyMaturingRetrieveActionResponse
  **/

  public String getEarlyMaturingRetrieveActionResponse() {
    return earlyMaturingRetrieveActionResponse;
  }

  public void setEarlyMaturingRetrieveActionResponse(String earlyMaturingRetrieveActionResponse) {
    this.earlyMaturingRetrieveActionResponse = earlyMaturingRetrieveActionResponse;
  }


  /**
   * Get earlyMaturingInstanceReport
   * @return earlyMaturingInstanceReport
  **/

  public BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport getEarlyMaturingInstanceReport() {
    return earlyMaturingInstanceReport;
  }

  public void setEarlyMaturingInstanceReport(BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceReport earlyMaturingInstanceReport) {
    this.earlyMaturingInstanceReport = earlyMaturingInstanceReport;
  }


  /**
   * Get earlyMaturingInstanceAnalysis
   * @return earlyMaturingInstanceAnalysis
  **/

  public BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis getEarlyMaturingInstanceAnalysis() {
    return earlyMaturingInstanceAnalysis;
  }

  public void setEarlyMaturingInstanceAnalysis(BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceAnalysis earlyMaturingInstanceAnalysis) {
    this.earlyMaturingInstanceAnalysis = earlyMaturingInstanceAnalysis;
  }


}

