package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementUpdateInputModel
 */
public class CRDepositAccountFulfillmentArrangementUpdateInputModel   {
  private String depositAccountServicingSessionReference = null;

  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;

  private Object depositAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return depositAccountServicingSessionReference
  **/

  public String getDepositAccountServicingSessionReference() {
    return depositAccountServicingSessionReference;
  }

  public void setDepositAccountServicingSessionReference(String depositAccountServicingSessionReference) {
    this.depositAccountServicingSessionReference = depositAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposit Account Fulfillment Arrangement instance 
   * @return depositAccountFulfillmentArrangementInstanceReference
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReference() {
    return depositAccountFulfillmentArrangementInstanceReference;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReference(String depositAccountFulfillmentArrangementInstanceReference) {
    this.depositAccountFulfillmentArrangementInstanceReference = depositAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceRecord
   * @return depositAccountFulfillmentArrangementInstanceRecord
  **/

  public CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getDepositAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return depositAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setDepositAccountFulfillmentArrangementUpdateActionTaskRecord(Object depositAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.depositAccountFulfillmentArrangementUpdateActionTaskRecord = depositAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

