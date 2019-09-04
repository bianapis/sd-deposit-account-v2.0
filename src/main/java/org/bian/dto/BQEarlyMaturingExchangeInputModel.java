package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingExchangeInputModel
 */
public class BQEarlyMaturingExchangeInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String earlyMaturingInstanceReference = null;

  private Object earlyMaturingExchangeActionTaskRecord = null;

  private BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest earlyMaturingExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Early Maturing instance 
   * @return earlyMaturingInstanceReference
  **/

  public String getEarlyMaturingInstanceReference() {
    return earlyMaturingInstanceReference;
  }

  public void setEarlyMaturingInstanceReference(String earlyMaturingInstanceReference) {
    this.earlyMaturingInstanceReference = earlyMaturingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return earlyMaturingExchangeActionTaskRecord
  **/

  public Object getEarlyMaturingExchangeActionTaskRecord() {
    return earlyMaturingExchangeActionTaskRecord;
  }

  public void setEarlyMaturingExchangeActionTaskRecord(Object earlyMaturingExchangeActionTaskRecord) {
    this.earlyMaturingExchangeActionTaskRecord = earlyMaturingExchangeActionTaskRecord;
  }


  /**
   * Get earlyMaturingExchangeActionRequest
   * @return earlyMaturingExchangeActionRequest
  **/

  public BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest getEarlyMaturingExchangeActionRequest() {
    return earlyMaturingExchangeActionRequest;
  }

  public void setEarlyMaturingExchangeActionRequest(BQEarlyMaturingExchangeInputModelEarlyMaturingExchangeActionRequest earlyMaturingExchangeActionRequest) {
    this.earlyMaturingExchangeActionRequest = earlyMaturingExchangeActionRequest;
  }


}

