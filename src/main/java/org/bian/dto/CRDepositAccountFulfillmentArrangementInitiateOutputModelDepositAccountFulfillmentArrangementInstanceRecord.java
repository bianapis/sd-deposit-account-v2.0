package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord
 */
public class CRDepositAccountFulfillmentArrangementInitiateOutputModelDepositAccountFulfillmentArrangementInstanceRecord   {
  private CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

