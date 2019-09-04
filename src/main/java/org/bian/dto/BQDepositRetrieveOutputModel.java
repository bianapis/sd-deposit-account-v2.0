package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositRetrieveOutputModelDepositInstanceAnalysis;
import org.bian.dto.BQDepositRetrieveOutputModelDepositInstanceRecord;
import org.bian.dto.BQDepositRetrieveOutputModelDepositInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveOutputModel
 */
public class BQDepositRetrieveOutputModel   {
  private BQDepositRetrieveOutputModelDepositInstanceRecord depositInstanceRecord = null;

  private String depositRetrieveActionTaskReference = null;

  private Object depositRetrieveActionTaskRecord = null;

  private String depositRetrieveActionResponse = null;

  private BQDepositRetrieveOutputModelDepositInstanceReport depositInstanceReport = null;

  private BQDepositRetrieveOutputModelDepositInstanceAnalysis depositInstanceAnalysis = null;


  /**
   * Get depositInstanceRecord
   * @return depositInstanceRecord
  **/

  public BQDepositRetrieveOutputModelDepositInstanceRecord getDepositInstanceRecord() {
    return depositInstanceRecord;
  }

  public void setDepositInstanceRecord(BQDepositRetrieveOutputModelDepositInstanceRecord depositInstanceRecord) {
    this.depositInstanceRecord = depositInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposit instance retrieve service call 
   * @return depositRetrieveActionTaskReference
  **/

  public String getDepositRetrieveActionTaskReference() {
    return depositRetrieveActionTaskReference;
  }

  public void setDepositRetrieveActionTaskReference(String depositRetrieveActionTaskReference) {
    this.depositRetrieveActionTaskReference = depositRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return depositRetrieveActionResponse
  **/

  public String getDepositRetrieveActionResponse() {
    return depositRetrieveActionResponse;
  }

  public void setDepositRetrieveActionResponse(String depositRetrieveActionResponse) {
    this.depositRetrieveActionResponse = depositRetrieveActionResponse;
  }


  /**
   * Get depositInstanceReport
   * @return depositInstanceReport
  **/

  public BQDepositRetrieveOutputModelDepositInstanceReport getDepositInstanceReport() {
    return depositInstanceReport;
  }

  public void setDepositInstanceReport(BQDepositRetrieveOutputModelDepositInstanceReport depositInstanceReport) {
    this.depositInstanceReport = depositInstanceReport;
  }


  /**
   * Get depositInstanceAnalysis
   * @return depositInstanceAnalysis
  **/

  public BQDepositRetrieveOutputModelDepositInstanceAnalysis getDepositInstanceAnalysis() {
    return depositInstanceAnalysis;
  }

  public void setDepositInstanceAnalysis(BQDepositRetrieveOutputModelDepositInstanceAnalysis depositInstanceAnalysis) {
    this.depositInstanceAnalysis = depositInstanceAnalysis;
  }


}

