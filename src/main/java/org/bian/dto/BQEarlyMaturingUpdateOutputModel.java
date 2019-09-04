package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingUpdateOutputModel
 */
public class BQEarlyMaturingUpdateOutputModel   {
  private BQEarlyMaturingUpdateInputModelEarlyMaturingInstanceRecord earlyMaturingInstanceRecord = null;

  private String earlyMaturingUpdateActionTaskReference = null;

  private Object earlyMaturingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return earlyMaturingUpdateActionTaskReference
  **/

  public String getEarlyMaturingUpdateActionTaskReference() {
    return earlyMaturingUpdateActionTaskReference;
  }

  public void setEarlyMaturingUpdateActionTaskReference(String earlyMaturingUpdateActionTaskReference) {
    this.earlyMaturingUpdateActionTaskReference = earlyMaturingUpdateActionTaskReference;
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

