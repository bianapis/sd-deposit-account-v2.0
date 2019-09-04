package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction   {
  private String transactionDescription = null;

  private String transactionRateType = null;

  private String transactionInterestCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the interest transaction 
   * @return transactionDescription
  **/

  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable rate type 
   * @return transactionRateType
  **/

  public String getTransactionRateType() {
    return transactionRateType;
  }

  public void setTransactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The derived interest amount to be applied 
   * @return transactionInterestCharge
  **/

  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }


}

