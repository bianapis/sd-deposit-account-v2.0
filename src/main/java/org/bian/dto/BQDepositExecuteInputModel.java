package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositExecuteInputModelDepositInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDepositExecuteInputModel
 */
public class BQDepositExecuteInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String depositInstanceReference = null;

  private BQDepositExecuteInputModelDepositInstanceRecord depositInstanceRecord = null;

  private Object depositExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQDepositExecuteInputModelDepositInstanceRecord getDepositInstanceRecord() {
    return depositInstanceRecord;
  }

  public void setDepositInstanceRecord(BQDepositExecuteInputModelDepositInstanceRecord depositInstanceRecord) {
    this.depositInstanceRecord = depositInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositExecuteActionTaskRecord
  **/

  public Object getDepositExecuteActionTaskRecord() {
    return depositExecuteActionTaskRecord;
  }

  public void setDepositExecuteActionTaskRecord(Object depositExecuteActionTaskRecord) {
    this.depositExecuteActionTaskRecord = depositExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

