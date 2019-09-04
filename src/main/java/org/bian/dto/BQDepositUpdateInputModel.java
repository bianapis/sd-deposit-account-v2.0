package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositUpdateInputModelDepositInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositUpdateInputModel
 */
public class BQDepositUpdateInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String depositInstanceReference = null;

  private BQDepositUpdateInputModelDepositInstanceRecord depositInstanceRecord = null;

  private Object depositUpdateActionTaskRecord = null;

  private String depositUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposit instance 
   * @return depositInstanceReference
  **/

  public String getDepositInstanceReference() {
    return depositInstanceReference;
  }

  public void setDepositInstanceReference(String depositInstanceReference) {
    this.depositInstanceReference = depositInstanceReference;
  }


  /**
   * Get depositInstanceRecord
   * @return depositInstanceRecord
  **/

  public BQDepositUpdateInputModelDepositInstanceRecord getDepositInstanceRecord() {
    return depositInstanceRecord;
  }

  public void setDepositInstanceRecord(BQDepositUpdateInputModelDepositInstanceRecord depositInstanceRecord) {
    this.depositInstanceRecord = depositInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositUpdateActionTaskRecord
  **/

  public Object getDepositUpdateActionTaskRecord() {
    return depositUpdateActionTaskRecord;
  }

  public void setDepositUpdateActionTaskRecord(Object depositUpdateActionTaskRecord) {
    this.depositUpdateActionTaskRecord = depositUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositUpdateActionRequest
  **/

  public String getDepositUpdateActionRequest() {
    return depositUpdateActionRequest;
  }

  public void setDepositUpdateActionRequest(String depositUpdateActionRequest) {
    this.depositUpdateActionRequest = depositUpdateActionRequest;
  }


}

