package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecord   {
  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile = null;

  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord = null;


  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


}

