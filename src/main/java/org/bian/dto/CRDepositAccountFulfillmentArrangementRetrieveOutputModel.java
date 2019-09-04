package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveOutputModel
 */
public class CRDepositAccountFulfillmentArrangementRetrieveOutputModel   {
  private CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;

  private String depositAccountFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object depositAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String depositAccountFulfillmentArrangementRetrieveActionResponse = null;

  private CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord depositAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis depositAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get depositAccountFulfillmentArrangementInstanceRecord
   * @return depositAccountFulfillmentArrangementInstanceRecord
  **/

  public CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposit Account Fulfillment Arrangement instance retrieve service call 
   * @return depositAccountFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getDepositAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return depositAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setDepositAccountFulfillmentArrangementRetrieveActionTaskReference(String depositAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.depositAccountFulfillmentArrangementRetrieveActionTaskReference = depositAccountFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositAccountFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getDepositAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return depositAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setDepositAccountFulfillmentArrangementRetrieveActionTaskRecord(Object depositAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.depositAccountFulfillmentArrangementRetrieveActionTaskRecord = depositAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return depositAccountFulfillmentArrangementRetrieveActionResponse
  **/

  public String getDepositAccountFulfillmentArrangementRetrieveActionResponse() {
    return depositAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setDepositAccountFulfillmentArrangementRetrieveActionResponse(String depositAccountFulfillmentArrangementRetrieveActionResponse) {
    this.depositAccountFulfillmentArrangementRetrieveActionResponse = depositAccountFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceReportRecord
   * @return depositAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord getDepositAccountFulfillmentArrangementInstanceReportRecord() {
    return depositAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportRecord(CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord depositAccountFulfillmentArrangementInstanceReportRecord) {
    this.depositAccountFulfillmentArrangementInstanceReportRecord = depositAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceAnalysis
   * @return depositAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis getDepositAccountFulfillmentArrangementInstanceAnalysis() {
    return depositAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysis(CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis depositAccountFulfillmentArrangementInstanceAnalysis) {
    this.depositAccountFulfillmentArrangementInstanceAnalysis = depositAccountFulfillmentArrangementInstanceAnalysis;
  }


}

