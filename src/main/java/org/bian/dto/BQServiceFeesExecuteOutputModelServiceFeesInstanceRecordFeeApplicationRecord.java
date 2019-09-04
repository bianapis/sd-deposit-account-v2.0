package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord   {
  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount = null;


  /**
   * Get feeTransaction
   * @return feeTransaction
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }


  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }


  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


}

