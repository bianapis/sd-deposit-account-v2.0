package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingUpdateInputModel
 */
public class BQEarlyMaturingUpdateInputModel   {
  private String depositAccountFulfillmentArrangementInstanceReference = null;

  private String earlyMaturingInstanceReference = null;

  private BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord = null;

  private Object earlyMaturingUpdateActionTaskRecord = null;

  private String earlyMaturingUpdateActionRequest = null;


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

  public BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord getEarlyMaturingInstanceRecord() {
    return earlyMaturingInstanceRecord;
  }

  public void setEarlyMaturingInstanceRecord(BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord) {
    this.earlyMaturingInstanceRecord = earlyMaturingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return earlyMaturingUpdateActionTaskRecord
  **/

  public Object getEarlyMaturingUpdateActionTaskRecord() {
    return earlyMaturingUpdateActionTaskRecord;
  }

  public void setEarlyMaturingUpdateActionTaskRecord(Object earlyMaturingUpdateActionTaskRecord) {
    this.earlyMaturingUpdateActionTaskRecord = earlyMaturingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return earlyMaturingUpdateActionRequest
  **/

  public String getEarlyMaturingUpdateActionRequest() {
    return earlyMaturingUpdateActionRequest;
  }

  public void setEarlyMaturingUpdateActionRequest(String earlyMaturingUpdateActionRequest) {
    this.earlyMaturingUpdateActionRequest = earlyMaturingUpdateActionRequest;
  }


}

