package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingExchangeOutputModel
 */
public class BQEarlyMaturingExchangeOutputModel   {
  private String earlyMaturingExchangeActionTaskReference = null;

  private Object earlyMaturingExchangeActionTaskRecord = null;

  private String earlyMaturingExchangeActionResponse = null;

  private String earlyMaturingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Early Maturing instance exchange service call 
   * @return earlyMaturingExchangeActionTaskReference
  **/

  public String getEarlyMaturingExchangeActionTaskReference() {
    return earlyMaturingExchangeActionTaskReference;
  }

  public void setEarlyMaturingExchangeActionTaskReference(String earlyMaturingExchangeActionTaskReference) {
    this.earlyMaturingExchangeActionTaskReference = earlyMaturingExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return earlyMaturingExchangeActionTaskRecord
  **/

  public Object getEarlyMaturingExchangeActionTaskRecord() {
    return earlyMaturingExchangeActionTaskRecord;
  }

  public void setEarlyMaturingExchangeActionTaskRecord(Object earlyMaturingExchangeActionTaskRecord) {
    this.earlyMaturingExchangeActionTaskRecord = earlyMaturingExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return earlyMaturingExchangeActionResponse
  **/

  public String getEarlyMaturingExchangeActionResponse() {
    return earlyMaturingExchangeActionResponse;
  }

  public void setEarlyMaturingExchangeActionResponse(String earlyMaturingExchangeActionResponse) {
    this.earlyMaturingExchangeActionResponse = earlyMaturingExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Early Maturing instance (e.g. accepted, rejected, verified) 
   * @return earlyMaturingInstanceStatus
  **/

  public String getEarlyMaturingInstanceStatus() {
    return earlyMaturingInstanceStatus;
  }

  public void setEarlyMaturingInstanceStatus(String earlyMaturingInstanceStatus) {
    this.earlyMaturingInstanceStatus = earlyMaturingInstanceStatus;
  }


}

