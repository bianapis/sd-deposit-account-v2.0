package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule;
import org.bian.dto.CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecordAssociations;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord
 */
public class CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String depositAccountNumber = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String bankBranchLocationReference = null;

  private String depositAccountType = null;

  private String depositAccountCurrency = null;

  private String depositAccountAmount = null;

  private String depositAccountTerm = null;

  private String depositAccountInterestTerms = null;

  private String taxReference = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecordAssociations associations = null;

  private String customerCommentary = null;

  private CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordDateType dateType = null;

  private CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the deposit product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated deposit account number in any suitable format 
   * @return depositAccountNumber
  **/

  public String getDepositAccountNumber() {
    return depositAccountNumber;
  }

  public void setDepositAccountNumber(String depositAccountNumber) {
    this.depositAccountNumber = depositAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific type of deposit (e.g. term) 
   * @return depositAccountType
  **/

  public String getDepositAccountType() {
    return depositAccountType;
  }

  public void setDepositAccountType(String depositAccountType) {
    this.depositAccountType = depositAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the loan account 
   * @return depositAccountCurrency
  **/

  public String getDepositAccountCurrency() {
    return depositAccountCurrency;
  }

  public void setDepositAccountCurrency(String depositAccountCurrency) {
    this.depositAccountCurrency = depositAccountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount deposited to the account 
   * @return depositAccountAmount
  **/

  public String getDepositAccountAmount() {
    return depositAccountAmount;
  }

  public void setDepositAccountAmount(String depositAccountAmount) {
    this.depositAccountAmount = depositAccountAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The term of the fixed deposit 
   * @return depositAccountTerm
  **/

  public String getDepositAccountTerm() {
    return depositAccountTerm;
  }

  public void setDepositAccountTerm(String depositAccountTerm) {
    this.depositAccountTerm = depositAccountTerm;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The basis for interest calculations pain to the account 
   * @return depositAccountInterestTerms
  **/

  public String getDepositAccountInterestTerms() {
    return depositAccountInterestTerms;
  }

  public void setDepositAccountInterestTerms(String depositAccountInterestTerms) {
    this.depositAccountInterestTerms = depositAccountInterestTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the deposit account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get associations
   * @return associations
  **/

  public CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRDepositAccountFulfillmentArrangementUpdateInputModelDepositAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of customer correspondence/feedback 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
  }


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


  /**
   * Get statementsSchedule
   * @return statementsSchedule
  **/

  public CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }


}

