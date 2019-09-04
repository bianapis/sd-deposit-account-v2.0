package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementControlOutputModel
 */
public class CRDepositAccountFulfillmentArrangementControlOutputModel   {
  private String depositAccountFulfillmentArrangementControlActionTaskReference = null;

  private Object depositAccountFulfillmentArrangementControlActionTaskRecord = null;

  private String depositAccountFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposit Account Fulfillment Arrangement instance control processing service call 
   * @return depositAccountFulfillmentArrangementControlActionTaskReference
  **/

  public String getDepositAccountFulfillmentArrangementControlActionTaskReference() {
    return depositAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setDepositAccountFulfillmentArrangementControlActionTaskReference(String depositAccountFulfillmentArrangementControlActionTaskReference) {
    this.depositAccountFulfillmentArrangementControlActionTaskReference = depositAccountFulfillmentArrangementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return depositAccountFulfillmentArrangementControlActionResponse
  **/

  public String getDepositAccountFulfillmentArrangementControlActionResponse() {
    return depositAccountFulfillmentArrangementControlActionResponse;
  }

  public void setDepositAccountFulfillmentArrangementControlActionResponse(String depositAccountFulfillmentArrangementControlActionResponse) {
    this.depositAccountFulfillmentArrangementControlActionResponse = depositAccountFulfillmentArrangementControlActionResponse;
  }


}

