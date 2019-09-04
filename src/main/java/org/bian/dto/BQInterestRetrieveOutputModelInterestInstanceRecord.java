package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecord
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecord   {
  private String interestRateType = null;

  private String interestRateApplicationSchedule = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of rate calculation that can be applied 
   * @return interestRateType
  **/

  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule for applying interest rates to the account 
   * @return interestRateApplicationSchedule
  **/

  public String getInterestRateApplicationSchedule() {
    return interestRateApplicationSchedule;
  }

  public void setInterestRateApplicationSchedule(String interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
  }


  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }


}

