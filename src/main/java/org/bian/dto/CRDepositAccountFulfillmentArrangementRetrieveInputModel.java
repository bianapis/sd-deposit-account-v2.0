package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveInputModel
 */
public class CRDepositAccountFulfillmentArrangementRetrieveInputModel   {
  private Object depositAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String depositAccountFulfillmentArrangementRetrieveActionRequest = null;

  private CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord depositAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis depositAccountFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositAccountFulfillmentArrangementRetrieveActionRequest
  **/

  public String getDepositAccountFulfillmentArrangementRetrieveActionRequest() {
    return depositAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setDepositAccountFulfillmentArrangementRetrieveActionRequest(String depositAccountFulfillmentArrangementRetrieveActionRequest) {
    this.depositAccountFulfillmentArrangementRetrieveActionRequest = depositAccountFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceReportRecord
   * @return depositAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord getDepositAccountFulfillmentArrangementInstanceReportRecord() {
    return depositAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportRecord(CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord depositAccountFulfillmentArrangementInstanceReportRecord) {
    this.depositAccountFulfillmentArrangementInstanceReportRecord = depositAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceAnalysis
   * @return depositAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis getDepositAccountFulfillmentArrangementInstanceAnalysis() {
    return depositAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysis(CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis depositAccountFulfillmentArrangementInstanceAnalysis) {
    this.depositAccountFulfillmentArrangementInstanceAnalysis = depositAccountFulfillmentArrangementInstanceAnalysis;
  }


}

