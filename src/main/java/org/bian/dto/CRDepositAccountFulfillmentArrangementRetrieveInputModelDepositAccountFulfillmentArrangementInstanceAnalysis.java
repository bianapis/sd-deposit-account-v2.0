package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRDepositAccountFulfillmentArrangementRetrieveInputModelDepositAccountFulfillmentArrangementInstanceAnalysis   {
  private String depositAccountFulfillmentArrangementInstanceAnalysisReference = null;

  private String depositAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private String depositAccountFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositAccountFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getDepositAccountFulfillmentArrangementInstanceAnalysisReference() {
    return depositAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysisReference(String depositAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.depositAccountFulfillmentArrangementInstanceAnalysisReference = depositAccountFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositAccountFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getDepositAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return depositAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysisReportType(String depositAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.depositAccountFulfillmentArrangementInstanceAnalysisReportType = depositAccountFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositAccountFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getDepositAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return depositAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysisParameters(String depositAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.depositAccountFulfillmentArrangementInstanceAnalysisParameters = depositAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


}

