package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord;
import org.bian.dto.BQEarlyMaturingRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRequestInputModel
 */
public class BQEarlyMaturingRequestInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String earlyMaturingInstanceReference = null;

  private BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord = null;

  private Object earlyMaturingRequestActionTaskRecord = null;

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
   * Get earlyMaturingInstanceRecord
   * @return earlyMaturingInstanceRecord
  **/

  public BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord getEarlyMaturingInstanceRecord() {
    return earlyMaturingInstanceRecord;
  }

  public void setEarlyMaturingInstanceRecord(BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord) {
    this.earlyMaturingInstanceRecord = earlyMaturingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return earlyMaturingRequestActionTaskRecord
  **/

  public Object getEarlyMaturingRequestActionTaskRecord() {
    return earlyMaturingRequestActionTaskRecord;
  }

  public void setEarlyMaturingRequestActionTaskRecord(Object earlyMaturingRequestActionTaskRecord) {
    this.earlyMaturingRequestActionTaskRecord = earlyMaturingRequestActionTaskRecord;
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

