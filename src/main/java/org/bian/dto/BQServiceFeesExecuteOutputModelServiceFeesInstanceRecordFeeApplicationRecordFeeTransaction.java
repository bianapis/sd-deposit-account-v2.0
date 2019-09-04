package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction   {
  private String transactionFeeCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The derived fee amount applied 
   * @return transactionFeeCharge
  **/

  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }


}

