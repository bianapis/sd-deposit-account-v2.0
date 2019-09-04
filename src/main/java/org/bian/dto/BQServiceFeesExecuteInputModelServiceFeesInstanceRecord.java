package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecord   {
  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord = null;


  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


}

