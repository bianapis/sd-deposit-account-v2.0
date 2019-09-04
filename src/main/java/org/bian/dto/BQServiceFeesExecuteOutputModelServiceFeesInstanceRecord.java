package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord   {
  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord = null;


  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


}

