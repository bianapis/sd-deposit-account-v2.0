package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositRetrieveOutputModelDepositInstanceRecord
 */
public class BQDepositRetrieveOutputModelDepositInstanceRecord   {
  private String depositTransactionPayerReference = null;

  private String depositTransactionPayerProductInstanceReference = null;

  private String depositTransactionPayerBankReference = null;

  private String depositTransactionAmount = null;

  private String depositTransactionCurrency = null;

  private String depositTransactionValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer 
   * @return depositTransactionPayerReference
  **/

  public String getDepositTransactionPayerReference() {
    return depositTransactionPayerReference;
  }

  public void setDepositTransactionPayerReference(String depositTransactionPayerReference) {
    this.depositTransactionPayerReference = depositTransactionPayerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account where the payment is made from 
   * @return depositTransactionPayerProductInstanceReference
  **/

  public String getDepositTransactionPayerProductInstanceReference() {
    return depositTransactionPayerProductInstanceReference;
  }

  public void setDepositTransactionPayerProductInstanceReference(String depositTransactionPayerProductInstanceReference) {
    this.depositTransactionPayerProductInstanceReference = depositTransactionPayerProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer's bank 
   * @return depositTransactionPayerBankReference
  **/

  public String getDepositTransactionPayerBankReference() {
    return depositTransactionPayerBankReference;
  }

  public void setDepositTransactionPayerBankReference(String depositTransactionPayerBankReference) {
    this.depositTransactionPayerBankReference = depositTransactionPayerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the deposit 
   * @return depositTransactionAmount
  **/

  public String getDepositTransactionAmount() {
    return depositTransactionAmount;
  }

  public void setDepositTransactionAmount(String depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency used for the deposit 
   * @return depositTransactionCurrency
  **/

  public String getDepositTransactionCurrency() {
    return depositTransactionCurrency;
  }

  public void setDepositTransactionCurrency(String depositTransactionCurrency) {
    this.depositTransactionCurrency = depositTransactionCurrency;
  }


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

