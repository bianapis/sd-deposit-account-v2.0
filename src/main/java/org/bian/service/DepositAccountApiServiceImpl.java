/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DepositAccountApiServiceImpl implements DepositAccountApiService {

	public SDDepositAccountActivateOutputModel activate(SDDepositAccountActivateInputModel request){
		return JsonReader.read("activate-SDDepositAccountActivateOutputModel.json",new TypeReference<SDDepositAccountActivateOutputModel>(){});
	}
	
	public SDDepositAccountConfigureOutputModel configure(String sdReferenceId, SDDepositAccountConfigureInputModel request){
		return JsonReader.read("configure-SDDepositAccountConfigureOutputModel.json",new TypeReference<SDDepositAccountConfigureOutputModel>(){});
	}
	
	public CRDepositAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRDepositAccountFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRDepositAccountFulfillmentArrangementControlOutputModel.json",new TypeReference<CRDepositAccountFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQEarlyMaturingExchangeOutputModel exchangeEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingExchangeInputModel request){
		return JsonReader.read("exchange-BQEarlyMaturingExchangeOutputModel.json",new TypeReference<BQEarlyMaturingExchangeOutputModel>(){});
	}
	
	public BQRolloverExchangeOutputModel exchangeRollover(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRolloverExchangeInputModel request){
		return JsonReader.read("exchange-BQRolloverExchangeOutputModel.json",new TypeReference<BQRolloverExchangeOutputModel>(){});
	}
	
	public BQDepositExecuteOutputModel executeDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositExecuteInputModel request){
		return JsonReader.read("execute-BQDepositExecuteOutputModel.json",new TypeReference<BQDepositExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDDepositAccountFeedbackOutputModel feedback(String sdReferenceId, SDDepositAccountFeedbackInputModel request){
		return JsonReader.read("feedback-SDDepositAccountFeedbackOutputModel.json",new TypeReference<SDDepositAccountFeedbackOutputModel>(){});
	}
	
	public CRDepositAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRDepositAccountFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRDepositAccountFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRDepositAccountFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQEarlyMaturingRequestOutputModel requestEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingRequestInputModel request){
		return JsonReader.read("request-BQEarlyMaturingRequestOutputModel.json",new TypeReference<BQEarlyMaturingRequestOutputModel>(){});
	}
	
	public BQRolloverRequestOutputModel requestRollover(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRolloverRequestInputModel request){
		return JsonReader.read("request-BQRolloverRequestOutputModel.json",new TypeReference<BQRolloverRequestOutputModel>(){});
	}
	
	public CRDepositAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDepositAccountFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRDepositAccountFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDepositRetrieveOutputModel retrieveDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositRetrieveOutputModel.json",new TypeReference<BQDepositRetrieveOutputModel>(){});
	}
	
	public BQEarlyMaturingRetrieveOutputModel retrieveEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEarlyMaturingRetrieveOutputModel.json",new TypeReference<BQEarlyMaturingRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQRolloverRetrieveOutputModel retrieveRollover(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRolloverRetrieveOutputModel.json",new TypeReference<BQRolloverRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDDepositAccountRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDepositAccountRetrieveOutputModel.json",new TypeReference<SDDepositAccountRetrieveOutputModel>(){});
	}
	
	public CRDepositAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDepositAccountFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRDepositAccountFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRDepositAccountFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQDepositUpdateOutputModel updateDeposit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositUpdateInputModel request){
		return JsonReader.read("update-BQDepositUpdateOutputModel.json",new TypeReference<BQDepositUpdateOutputModel>(){});
	}
	
	public BQEarlyMaturingUpdateOutputModel updateEarlymaturing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEarlyMaturingUpdateInputModel request){
		return JsonReader.read("update-BQEarlyMaturingUpdateOutputModel.json",new TypeReference<BQEarlyMaturingUpdateOutputModel>(){});
	}
	
}
