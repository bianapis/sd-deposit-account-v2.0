package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceReportRecord   {
  private String depositAccountFulfillmentArrangementInstanceReportReference = null;

  private String depositAccountFulfillmentArrangementInstanceReportType = null;

  private String depositAccountFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return depositAccountFulfillmentArrangementInstanceReportReference
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReportReference() {
    return depositAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportReference(String depositAccountFulfillmentArrangementInstanceReportReference) {
    this.depositAccountFulfillmentArrangementInstanceReportReference = depositAccountFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositAccountFulfillmentArrangementInstanceReportType
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReportType() {
    return depositAccountFulfillmentArrangementInstanceReportType;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportType(String depositAccountFulfillmentArrangementInstanceReportType) {
    this.depositAccountFulfillmentArrangementInstanceReportType = depositAccountFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositAccountFulfillmentArrangementInstanceReportParameters
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReportParameters() {
    return depositAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportParameters(String depositAccountFulfillmentArrangementInstanceReportParameters) {
    this.depositAccountFulfillmentArrangementInstanceReportParameters = depositAccountFulfillmentArrangementInstanceReportParameters;
  }


}

