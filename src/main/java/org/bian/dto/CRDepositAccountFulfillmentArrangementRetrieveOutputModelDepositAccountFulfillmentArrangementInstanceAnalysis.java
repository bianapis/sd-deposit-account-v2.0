package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceAnalysis   {
  private String depositAccountFulfillmentArrangementInstanceAnalysisData = null;

  private String depositAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object depositAccountFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositAccountFulfillmentArrangementInstanceAnalysisData
  **/

  public String getDepositAccountFulfillmentArrangementInstanceAnalysisData() {
    return depositAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysisData(String depositAccountFulfillmentArrangementInstanceAnalysisData) {
    this.depositAccountFulfillmentArrangementInstanceAnalysisData = depositAccountFulfillmentArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositAccountFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getDepositAccountFulfillmentArrangementInstanceAnalysisReport() {
    return depositAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setDepositAccountFulfillmentArrangementInstanceAnalysisReport(Object depositAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.depositAccountFulfillmentArrangementInstanceAnalysisReport = depositAccountFulfillmentArrangementInstanceAnalysisReport;
  }


}

