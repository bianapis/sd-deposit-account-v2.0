package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRDepositAccountFulfillmentArrangementRetrieveOutputModelDepositAccountFulfillmentArrangementInstanceReportRecord   {
  private String depositAccountFulfillmentArrangementInstanceReportData = null;

  private String depositAccountFulfillmentArrangementInstanceReportType = null;

  private Object depositAccountFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositAccountFulfillmentArrangementInstanceReportData
  **/

  public String getDepositAccountFulfillmentArrangementInstanceReportData() {
    return depositAccountFulfillmentArrangementInstanceReportData;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReportData(String depositAccountFulfillmentArrangementInstanceReportData) {
    this.depositAccountFulfillmentArrangementInstanceReportData = depositAccountFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositAccountFulfillmentArrangementInstanceReport
  **/

  public Object getDepositAccountFulfillmentArrangementInstanceReport() {
    return depositAccountFulfillmentArrangementInstanceReport;
  }

  public void setDepositAccountFulfillmentArrangementInstanceReport(Object depositAccountFulfillmentArrangementInstanceReport) {
    this.depositAccountFulfillmentArrangementInstanceReport = depositAccountFulfillmentArrangementInstanceReport;
  }


}

