package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModel
 */
public class BQServiceFeesExecuteOutputModel   {
  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private String serviceFeesExecuteActionTaskReference = null;

  private Object serviceFeesExecuteActionTaskRecord = null;

  private String serviceFeesExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance execute service call 
   * @return serviceFeesExecuteActionTaskReference
  **/

  public String getServiceFeesExecuteActionTaskReference() {
    return serviceFeesExecuteActionTaskReference;
  }

  public void setServiceFeesExecuteActionTaskReference(String serviceFeesExecuteActionTaskReference) {
    this.serviceFeesExecuteActionTaskReference = serviceFeesExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceFeesExecuteActionTaskRecord
  **/

  public Object getServiceFeesExecuteActionTaskRecord() {
    return serviceFeesExecuteActionTaskRecord;
  }

  public void setServiceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees execute transaction/record 
   * @return serviceFeesExecuteRecordReference
  **/

  public String getServiceFeesExecuteRecordReference() {
    return serviceFeesExecuteRecordReference;
  }

  public void setServiceFeesExecuteRecordReference(String serviceFeesExecuteRecordReference) {
    this.serviceFeesExecuteRecordReference = serviceFeesExecuteRecordReference;
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

