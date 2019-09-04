package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementInitiateOutputModel
 */
public class CRDepositAccountFulfillmentArrangementInitiateOutputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String depositAccountFulfillmentArrangementInitiateActionReference = null;

  private Object depositAccountFulfillmentArrangementInitiateActionRecord = null;

  private String depositAccountFulfillmentArrangementInstanceStatus = null;

  private CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return depositAccountFulfillmentArrangementInitiateActionReference
  **/

  public String getDepositAccountFulfillmentArrangementInitiateActionReference() {
    return depositAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setDepositAccountFulfillmentArrangementInitiateActionReference(String depositAccountFulfillmentArrangementInitiateActionReference) {
    this.depositAccountFulfillmentArrangementInitiateActionReference = depositAccountFulfillmentArrangementInitiateActionReference;
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

  public CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


}

