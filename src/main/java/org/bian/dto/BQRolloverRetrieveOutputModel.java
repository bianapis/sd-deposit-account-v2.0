package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRolloverRetrieveOutputModelRolloverInstanceAnalysis;
import org.bian.dto.BQRolloverRetrieveOutputModelRolloverInstanceRecord;
import org.bian.dto.BQRolloverRetrieveOutputModelRolloverInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRolloverRetrieveOutputModel
 */
public class BQRolloverRetrieveOutputModel   {
  private BQRolloverRetrieveOutputModelRolloverInstanceRecord rolloverInstanceRecord = null;

  private String rolloverRetrieveActionTaskReference = null;

  private Object rolloverRetrieveActionTaskRecord = null;

  private String rolloverRetrieveActionResponse = null;

  private BQRolloverRetrieveOutputModelRolloverInstanceReport rolloverInstanceReport = null;

  private BQRolloverRetrieveOutputModelRolloverInstanceAnalysis rolloverInstanceAnalysis = null;


  /**
   * Get rolloverInstanceRecord
   * @return rolloverInstanceRecord
  **/

  public BQRolloverRetrieveOutputModelRolloverInstanceRecord getRolloverInstanceRecord() {
    return rolloverInstanceRecord;
  }

  public void setRolloverInstanceRecord(BQRolloverRetrieveOutputModelRolloverInstanceRecord rolloverInstanceRecord) {
    this.rolloverInstanceRecord = rolloverInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rollover instance retrieve service call 
   * @return rolloverRetrieveActionTaskReference
  **/

  public String getRolloverRetrieveActionTaskReference() {
    return rolloverRetrieveActionTaskReference;
  }

  public void setRolloverRetrieveActionTaskReference(String rolloverRetrieveActionTaskReference) {
    this.rolloverRetrieveActionTaskReference = rolloverRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rolloverRetrieveActionResponse
  **/

  public String getRolloverRetrieveActionResponse() {
    return rolloverRetrieveActionResponse;
  }

  public void setRolloverRetrieveActionResponse(String rolloverRetrieveActionResponse) {
    this.rolloverRetrieveActionResponse = rolloverRetrieveActionResponse;
  }


  /**
   * Get rolloverInstanceReport
   * @return rolloverInstanceReport
  **/

  public BQRolloverRetrieveOutputModelRolloverInstanceReport getRolloverInstanceReport() {
    return rolloverInstanceReport;
  }

  public void setRolloverInstanceReport(BQRolloverRetrieveOutputModelRolloverInstanceReport rolloverInstanceReport) {
    this.rolloverInstanceReport = rolloverInstanceReport;
  }


  /**
   * Get rolloverInstanceAnalysis
   * @return rolloverInstanceAnalysis
  **/

  public BQRolloverRetrieveOutputModelRolloverInstanceAnalysis getRolloverInstanceAnalysis() {
    return rolloverInstanceAnalysis;
  }

  public void setRolloverInstanceAnalysis(BQRolloverRetrieveOutputModelRolloverInstanceAnalysis rolloverInstanceAnalysis) {
    this.rolloverInstanceAnalysis = rolloverInstanceAnalysis;
  }


}

