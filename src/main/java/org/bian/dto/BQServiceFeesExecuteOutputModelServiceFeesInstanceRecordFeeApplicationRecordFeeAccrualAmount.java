package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount   {
  private String accrualFeeCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The accrued amount of fees 
   * @return accrualFeeCharge
  **/

  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


}

