package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositExecuteOutputModelDepositInstanceRecord
 */
public class BQDepositExecuteOutputModelDepositInstanceRecord   {
  private String depositTransactionValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The value date for the deposit transaction 
   * @return depositTransactionValueDate
  **/

  public String getDepositTransactionValueDate() {
    return depositTransactionValueDate;
  }

  public void setDepositTransactionValueDate(String depositTransactionValueDate) {
    this.depositTransactionValueDate = depositTransactionValueDate;
  }


}

