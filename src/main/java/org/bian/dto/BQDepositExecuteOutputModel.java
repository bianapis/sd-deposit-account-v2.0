package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositExecuteOutputModelDepositInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositExecuteOutputModel
 */
public class BQDepositExecuteOutputModel   {
  private BQDepositExecuteOutputModelDepositInstanceRecord depositInstanceRecord = null;

  private String depositExecuteActionTaskReference = null;

  private Object depositExecuteActionTaskRecord = null;

  private String depositExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get depositInstanceRecord
   * @return depositInstanceRecord
  **/

  public BQDepositExecuteOutputModelDepositInstanceRecord getDepositInstanceRecord() {
    return depositInstanceRecord;
  }

  public void setDepositInstanceRecord(BQDepositExecuteOutputModelDepositInstanceRecord depositInstanceRecord) {
    this.depositInstanceRecord = depositInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposit instance execute service call 
   * @return depositExecuteActionTaskReference
  **/

  public String getDepositExecuteActionTaskReference() {
    return depositExecuteActionTaskReference;
  }

  public void setDepositExecuteActionTaskReference(String depositExecuteActionTaskReference) {
    this.depositExecuteActionTaskReference = depositExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositExecuteActionTaskRecord
  **/

  public Object getDepositExecuteActionTaskRecord() {
    return depositExecuteActionTaskRecord;
  }

  public void setDepositExecuteActionTaskRecord(Object depositExecuteActionTaskRecord) {
    this.depositExecuteActionTaskRecord = depositExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposit execute transaction/record 
   * @return depositExecuteRecordReference
  **/

  public String getDepositExecuteRecordReference() {
    return depositExecuteRecordReference;
  }

  public void setDepositExecuteRecordReference(String depositExecuteRecordReference) {
    this.depositExecuteRecordReference = depositExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

