package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRequestOutputModel
 */
public class BQEarlyMaturingRequestOutputModel   {
  private BQEarlyMaturingRequestInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord = null;

  private String earlyMaturingRequestActionTaskReference = null;

  private Object earlyMaturingRequestActionTaskRecord = null;

  private String earlyMaturingRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Early Maturing instance request service call 
   * @return earlyMaturingRequestActionTaskReference
  **/

  public String getEarlyMaturingRequestActionTaskReference() {
    return earlyMaturingRequestActionTaskReference;
  }

  public void setEarlyMaturingRequestActionTaskReference(String earlyMaturingRequestActionTaskReference) {
    this.earlyMaturingRequestActionTaskReference = earlyMaturingRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Early Maturing service request record 
   * @return earlyMaturingRequestRecordReference
  **/

  public String getEarlyMaturingRequestRecordReference() {
    return earlyMaturingRequestRecordReference;
  }

  public void setEarlyMaturingRequestRecordReference(String earlyMaturingRequestRecordReference) {
    this.earlyMaturingRequestRecordReference = earlyMaturingRequestRecordReference;
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

