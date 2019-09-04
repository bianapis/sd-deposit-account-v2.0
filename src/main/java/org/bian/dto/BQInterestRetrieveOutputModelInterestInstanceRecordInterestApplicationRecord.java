package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord   {
  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount = null;


  /**
   * Get interestTransaction
   * @return interestTransaction
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction) {
    this.interestTransaction = interestTransaction;
  }


  /**
   * Get interestAccrualAmount
   * @return interestAccrualAmount
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount getInterestAccrualAmount() {
    return interestAccrualAmount;
  }

  public void setInterestAccrualAmount(BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
  }


}

