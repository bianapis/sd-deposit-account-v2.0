package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord   {
  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount = null;


  /**
   * Get feeTransaction
   * @return feeTransaction
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }


  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }


  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


}

