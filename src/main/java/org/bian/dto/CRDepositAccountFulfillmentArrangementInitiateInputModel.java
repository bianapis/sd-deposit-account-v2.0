package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementInitiateInputModel
 */
public class CRDepositAccountFulfillmentArrangementInitiateInputModel   {
  private String depositAccountServicingSessionReference = null;

  private Object depositAccountFulfillmentArrangementInitiateActionRecord = null;

  private String depositAccountFulfillmentArrangementInstanceStatus = null;

  private CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositAccountFulfillmentArrangementInitiateActionRecord
  **/

  public Object getDepositAccountFulfillmentArrangementInitiateActionRecord() {
    return depositAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setDepositAccountFulfillmentArrangementInitiateActionRecord(Object depositAccountFulfillmentArrangementInitiateActionRecord) {
    this.depositAccountFulfillmentArrangementInitiateActionRecord = depositAccountFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposit Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return depositAccountFulfillmentArrangementInstanceStatus
  **/

  public String getDepositAccountFulfillmentArrangementInstanceStatus() {
    return depositAccountFulfillmentArrangementInstanceStatus;
  }

  public void setDepositAccountFulfillmentArrangementInstanceStatus(String depositAccountFulfillmentArrangementInstanceStatus) {
    this.depositAccountFulfillmentArrangementInstanceStatus = depositAccountFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get depositAccountFulfillmentArrangementInstanceRecord
   * @return depositAccountFulfillmentArrangementInstanceRecord
  **/

  public CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


}

