/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DepositAccountApiService {

	SDDepositAccountActivateOutputModel activate(SDDepositAccountActivateInputModel request);
	
	SDDepositAccountConfigureOutputModel configure(String sdReferenceId, SDDepositAccountConfigureInputModel request);
	
	CRDepositAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRDepositAccountFulfillmentArrangementControlInputModel request);
	
	BQEarlyMaturingExchangeOutputModel exchangeEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingExchangeInputModel request);
	
	BQRolloverExchangeOutputModel exchangeRollover(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRolloverExchangeInputModel request);
	
	BQDepositExecuteOutputModel executeDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDDepositAccountFeedbackOutputModel feedback(String sdReferenceId, SDDepositAccountFeedbackInputModel request);
	
	CRDepositAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRDepositAccountFulfillmentArrangementInitiateInputModel request);
	
	BQEarlyMaturingRequestOutputModel requestEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingRequestInputModel request);
	
	BQRolloverRequestOutputModel requestRollover(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRolloverRequestInputModel request);
	
	CRDepositAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQDepositRetrieveOutputModel retrieveDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQEarlyMaturingRetrieveOutputModel retrieveEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRolloverRetrieveOutputModel retrieveRollover(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDDepositAccountRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDepositAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDepositAccountFulfillmentArrangementUpdateInputModel request);
	
	BQDepositUpdateOutputModel updateDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositUpdateInputModel request);
	
	BQEarlyMaturingUpdateOutputModel updateEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingUpdateInputModel request);
	
}
