package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositUpdateInputModelDepositInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositUpdateOutputModel
 */
public class BQDepositUpdateOutputModel   {
  private BQDepositUpdateInputModelDepositInstanceRecord depositInstanceRecord = null;

  private String depositUpdateActionTaskReference = null;

  private Object depositUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get depositInstanceRecord
   * @return depositInstanceRecord
  **/

  public BQDepositUpdateInputModelDepositInstanceRecord getDepositInstanceRecord() {
    return depositInstanceRecord;
  }

  public void setDepositInstanceRecord(BQDepositUpdateInputModelDepositInstanceRecord depositInstanceRecord) {
    this.depositInstanceRecord = depositInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return depositUpdateActionTaskReference
  **/

  public String getDepositUpdateActionTaskReference() {
    return depositUpdateActionTaskReference;
  }

  public void setDepositUpdateActionTaskReference(String depositUpdateActionTaskReference) {
    this.depositUpdateActionTaskReference = depositUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositUpdateActionTaskRecord
  **/

  public Object getDepositUpdateActionTaskRecord() {
    return depositUpdateActionTaskRecord;
  }

  public void setDepositUpdateActionTaskRecord(Object depositUpdateActionTaskRecord) {
    this.depositUpdateActionTaskRecord = depositUpdateActionTaskRecord;
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

