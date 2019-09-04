package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference
 */
public class BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference   {
  private String paymentTransactionPayeeReference = null;

  private String paymentTransactionPayeeAccountReference = null;

  private String paymentTransactionPayeeBankReference = null;

  private String paymentTransactionAmount = null;

  private String paymentTransactionDate = null;

  private String paymentTransactionPaymentMechanism = null;

  private String paymentTransactionFeeCharge = null;

  private String paymentTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party to whom the payment is made 
   * @return paymentTransactionPayeeReference
  **/

  public String getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(String paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account to which the payment is made 
   * @return paymentTransactionPayeeAccountReference
  **/

  public String getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(String paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank where the payee account is held 
   * @return paymentTransactionPayeeBankReference
  **/

  public String getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(String paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount (and currency if applicable) of the payment 
   * @return paymentTransactionAmount
  **/

  public String getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(String paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The various key dates and times associated with the payment transaction 
   * @return paymentTransactionDate
  **/

  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Requested payment mechanism (e.g. Wire, ACH) 
   * @return paymentTransactionPaymentMechanism
  **/

  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The fee charge applied to the transaction 
   * @return paymentTransactionFeeCharge
  **/

  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled) 
   * @return paymentTransactionStatus
  **/

  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


}

