package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRolloverRequestInputModelRolloverInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRolloverRequestOutputModel
 */
public class BQRolloverRequestOutputModel   {
  private BQRolloverRequestInputModelRolloverInstanceRecord rolloverInstanceRecord = null;

  private String rolloverRequestActionTaskReference = null;

  private Object rolloverRequestActionTaskRecord = null;

  private String rolloverRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rollover instance request service call 
   * @return rolloverRequestActionTaskReference
  **/

  public String getRolloverRequestActionTaskReference() {
    return rolloverRequestActionTaskReference;
  }

  public void setRolloverRequestActionTaskReference(String rolloverRequestActionTaskReference) {
    this.rolloverRequestActionTaskReference = rolloverRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rollover service request record 
   * @return rolloverRequestRecordReference
  **/

  public String getRolloverRequestRecordReference() {
    return rolloverRequestRecordReference;
  }

  public void setRolloverRequestRecordReference(String rolloverRequestRecordReference) {
    this.rolloverRequestRecordReference = rolloverRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

