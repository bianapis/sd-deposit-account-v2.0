package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule
 */
public class CRDepositAccountFulfillmentArrangementInitiateInputModelDepositAccountFulfillmentArrangementInstanceRecordStatementsSchedule   {
  private String statementType = null;

  private String statementTransactionType = null;

  private String statementPeriod = null;

  private Object statementReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The types of scheduled statement (e.g. balance/mini-statement/annual) 
   * @return statementType
  **/

  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The types of transactions and transaction details to be included 
   * @return statementTransactionType
  **/

  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reporting period covered by the statement 
   * @return statementPeriod
  **/

  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The statement content 
   * @return statementReport
  **/

  public Object getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(Object statementReport) {
    this.statementReport = statementReport;
  }


}

