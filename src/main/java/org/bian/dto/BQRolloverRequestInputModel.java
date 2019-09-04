package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRequestInputModelRequestRecordType;
import org.bian.dto.BQRolloverRequestInputModelRolloverInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRolloverRequestInputModel
 */
public class BQRolloverRequestInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String rolloverInstanceReference = null;

  private BQRolloverRequestInputModelRolloverInstanceRecord rolloverInstanceRecord = null;

  private Object rolloverRequestActionTaskRecord = null;

  private BQEarlyMaturingRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get rolloverInstanceRecord
   * @return rolloverInstanceRecord
  **/

  public BQRolloverRequestInputModelRolloverInstanceRecord getRolloverInstanceRecord() {
    return rolloverInstanceRecord;
  }

  public void setRolloverInstanceRecord(BQRolloverRequestInputModelRolloverInstanceRecord rolloverInstanceRecord) {
    this.rolloverInstanceRecord = rolloverInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return rolloverRequestActionTaskRecord
  **/

  public Object getRolloverRequestActionTaskRecord() {
    return rolloverRequestActionTaskRecord;
  }

  public void setRolloverRequestActionTaskRecord(Object rolloverRequestActionTaskRecord) {
    this.rolloverRequestActionTaskRecord = rolloverRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQEarlyMaturingRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQEarlyMaturingRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

