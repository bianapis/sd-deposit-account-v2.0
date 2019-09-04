package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQRolloverExchangeInputModel
 */
public class BQRolloverExchangeInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String rolloverInstanceReference = null;

  private Object rolloverExchangeActionTaskRecord = null;

  private BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest rolloverExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Deposit Account Fulfillment Arrangement instance 
   * @return depositAccountFulfillmentArrangementInstanceReference
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReference() {
    return depositAccountFulfillmentArrangementInstanceReference;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReference(String depositAccountFulfillmentArrangementInstanceReference) {
    this.depositAccountFulfillmentArrangementInstanceReference = depositAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rollover instance 
   * @return rolloverInstanceReference
  **/

  public String getRolloverInstanceReference() {
    return rolloverInstanceReference;
  }

  public void setRolloverInstanceReference(String rolloverInstanceReference) {
    this.rolloverInstanceReference = rolloverInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return rolloverExchangeActionTaskRecord
  **/

  public Object getRolloverExchangeActionTaskRecord() {
    return rolloverExchangeActionTaskRecord;
  }

  public void setRolloverExchangeActionTaskRecord(Object rolloverExchangeActionTaskRecord) {
    this.rolloverExchangeActionTaskRecord = rolloverExchangeActionTaskRecord;
  }


  /**
   * Get rolloverExchangeActionRequest
   * @return rolloverExchangeActionRequest
  **/

  public BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest getRolloverExchangeActionRequest() {
    return rolloverExchangeActionRequest;
  }

  public void setRolloverExchangeActionRequest(BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest rolloverExchangeActionRequest) {
    this.rolloverExchangeActionRequest = rolloverExchangeActionRequest;
  }


}

