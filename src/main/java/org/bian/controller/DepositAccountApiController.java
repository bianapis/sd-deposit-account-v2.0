/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class DepositAccountApiController {

	@Autowired
	DepositAccountApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDDepositAccountActivateOutputModel> activate(@RequestBody BianRequest<SDDepositAccountActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDDepositAccountConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDepositAccountConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRDepositAccountFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDepositAccountFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("earlymaturing")
	@Fulfill.Exchange
	public BianResponse<BQEarlyMaturingExchangeOutputModel> exchangeEarlymaturing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEarlyMaturingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeEarlymaturing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("rollover")
	@Fulfill.Exchange
	public BianResponse<BQRolloverExchangeOutputModel> exchangeRollover(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRolloverExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeRollover(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposit")
	@Fulfill.Execute
	public BianResponse<BQDepositExecuteOutputModel> executeDeposit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDeposit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDDepositAccountFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDepositAccountFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRDepositAccountFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRDepositAccountFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("earlymaturing")
	@Fulfill.Request
	public BianResponse<BQEarlyMaturingRequestOutputModel> requestEarlymaturing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEarlyMaturingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestEarlymaturing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("rollover")
	@Fulfill.Request
	public BianResponse<BQRolloverRequestOutputModel> requestRollover(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRolloverRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRollover(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRDepositAccountFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("deposit")
	@Fulfill.Retrieve
	public BianResponse<BQDepositRetrieveOutputModel> retrieveDeposit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposit(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("earlymaturing")
	@Fulfill.Retrieve
	public BianResponse<BQEarlyMaturingRetrieveOutputModel> retrieveEarlymaturing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEarlymaturing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("interest")
	@Fulfill.Retrieve
	public BianResponse<BQInterestRetrieveOutputModel> retrieveInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("rollover")
	@Fulfill.Retrieve
	public BianResponse<BQRolloverRetrieveOutputModel> retrieveRollover(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRollover(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDDepositAccountRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRDepositAccountFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDepositAccountFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposit")
	@Fulfill.Update
	public BianResponse<BQDepositUpdateOutputModel> updateDeposit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDeposit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("earlymaturing")
	@Fulfill.Update
	public BianResponse<BQEarlyMaturingUpdateOutputModel> updateEarlymaturing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEarlyMaturingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateEarlymaturing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
