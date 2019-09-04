package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRolloverExchangeOutputModel
 */
public class BQRolloverExchangeOutputModel   {
  private String rolloverExchangeActionTaskReference = null;

  private Object rolloverExchangeActionTaskRecord = null;

  private String rolloverExchangeActionResponse = null;

  private String rolloverInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rollover instance exchange service call 
   * @return rolloverExchangeActionTaskReference
  **/

  public String getRolloverExchangeActionTaskReference() {
    return rolloverExchangeActionTaskReference;
  }

  public void setRolloverExchangeActionTaskReference(String rolloverExchangeActionTaskReference) {
    this.rolloverExchangeActionTaskReference = rolloverExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return rolloverExchangeActionTaskRecord
  **/

  public Object getRolloverExchangeActionTaskRecord() {
    return rolloverExchangeActionTaskRecord;
  }

  public void setRolloverExchangeActionTaskRecord(Object rolloverExchangeActionTaskRecord) {
    this.rolloverExchangeActionTaskRecord = rolloverExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return rolloverExchangeActionResponse
  **/

  public String getRolloverExchangeActionResponse() {
    return rolloverExchangeActionResponse;
  }

  public void setRolloverExchangeActionResponse(String rolloverExchangeActionResponse) {
    this.rolloverExchangeActionResponse = rolloverExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Rollover instance (e.g. accepted, rejected, verified) 
   * @return rolloverInstanceStatus
  **/

  public String getRolloverInstanceStatus() {
    return rolloverInstanceStatus;
  }

  public void setRolloverInstanceStatus(String rolloverInstanceStatus) {
    this.rolloverInstanceStatus = rolloverInstanceStatus;
  }


}

