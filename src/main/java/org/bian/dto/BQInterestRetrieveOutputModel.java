package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceAnalysis;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecord;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModel
 */
public class BQInterestRetrieveOutputModel   {
  private BQInterestRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecord interestInstanceRecord = null;

  private String interestRetrieveActionTaskReference = null;

  private Object interestRetrieveActionTaskRecord = null;

  private String interestRetrieveActionResponse = null;

  private BQInterestRetrieveOutputModelInterestInstanceReport interestInstanceReport = null;

  private BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysis = null;


  /**
   * Get depositAccountFulfillmentArrangementInstanceRecord
   * @return depositAccountFulfillmentArrangementInstanceRecord
  **/

  public BQInterestRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(BQInterestRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get interestInstanceRecord
   * @return interestInstanceRecord
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecord getInterestInstanceRecord() {
    return interestInstanceRecord;
  }

  public void setInterestInstanceRecord(BQInterestRetrieveOutputModelInterestInstanceRecord interestInstanceRecord) {
    this.interestInstanceRecord = interestInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interest instance retrieve service call 
   * @return interestRetrieveActionTaskReference
  **/

  public String getInterestRetrieveActionTaskReference() {
    return interestRetrieveActionTaskReference;
  }

  public void setInterestRetrieveActionTaskReference(String interestRetrieveActionTaskReference) {
    this.interestRetrieveActionTaskReference = interestRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return interestRetrieveActionResponse
  **/

  public String getInterestRetrieveActionResponse() {
    return interestRetrieveActionResponse;
  }

  public void setInterestRetrieveActionResponse(String interestRetrieveActionResponse) {
    this.interestRetrieveActionResponse = interestRetrieveActionResponse;
  }


  /**
   * Get interestInstanceReport
   * @return interestInstanceReport
  **/

  public BQInterestRetrieveOutputModelInterestInstanceReport getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(BQInterestRetrieveOutputModelInterestInstanceReport interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }


  /**
   * Get interestInstanceAnalysis
   * @return interestInstanceAnalysis
  **/

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis getInterestInstanceAnalysis() {
    return interestInstanceAnalysis;
  }

  public void setInterestInstanceAnalysis(BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
  }


}

