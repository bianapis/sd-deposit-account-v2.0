package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementControlInputModelDepositAccountFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementControlInputModel
 */
public class CRDepositAccountFulfillmentArrangementControlInputModel   {
  private String depositAccountServicingSessionReference = null;

  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private Object depositAccountFulfillmentArrangementControlActionTaskRecord = null;

  private CRDepositAccountFulfillmentArrangementControlInputModelDepositAccountFulfillmentArrangementControlActionRequest depositAccountFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return depositAccountFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getDepositAccountFulfillmentArrangementControlActionTaskRecord() {
    return depositAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setDepositAccountFulfillmentArrangementControlActionTaskRecord(Object depositAccountFulfillmentArrangementControlActionTaskRecord) {
    this.depositAccountFulfillmentArrangementControlActionTaskRecord = depositAccountFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get depositAccountFulfillmentArrangementControlActionRequest
   * @return depositAccountFulfillmentArrangementControlActionRequest
  **/

  public CRDepositAccountFulfillmentArrangementControlInputModelDepositAccountFulfillmentArrangementControlActionRequest getDepositAccountFulfillmentArrangementControlActionRequest() {
    return depositAccountFulfillmentArrangementControlActionRequest;
  }

  public void setDepositAccountFulfillmentArrangementControlActionRequest(CRDepositAccountFulfillmentArrangementControlInputModelDepositAccountFulfillmentArrangementControlActionRequest depositAccountFulfillmentArrangementControlActionRequest) {
    this.depositAccountFulfillmentArrangementControlActionRequest = depositAccountFulfillmentArrangementControlActionRequest;
  }


}

