package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementUpdateOutputModel
 */
public class CRDepositAccountFulfillmentArrangementUpdateOutputModel   {
  private CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord = null;

  private String depositAccountFulfillmentArrangementUpdateActionTaskReference = null;

  private Object depositAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get depositAccountFulfillmentArrangementInstanceRecord
   * @return depositAccountFulfillmentArrangementInstanceRecord
  **/

  public CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord getDepositAccountFulfillmentArrangementInstanceRecord() {
    return depositAccountFulfillmentArrangementInstanceRecord;
  }

  public void setDepositAccountFulfillmentArrangementInstanceRecord(CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord depositAccountFulfillmentArrangementInstanceRecord) {
    this.depositAccountFulfillmentArrangementInstanceRecord = depositAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return depositAccountFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getDepositAccountFulfillmentArrangementUpdateActionTaskReference() {
    return depositAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setDepositAccountFulfillmentArrangementUpdateActionTaskReference(String depositAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.depositAccountFulfillmentArrangementUpdateActionTaskReference = depositAccountFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getDepositAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return depositAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setDepositAccountFulfillmentArrangementUpdateActionTaskRecord(Object depositAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.depositAccountFulfillmentArrangementUpdateActionTaskRecord = depositAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

