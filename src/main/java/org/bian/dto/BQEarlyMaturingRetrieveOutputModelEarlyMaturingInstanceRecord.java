package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference;

import javax.validation.Valid;
  
/**
 * BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord
 */
public class BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecord   {
  private String earlyMaturingPenalty = null;

  private String correspondenceInstanceReference = null;

  private String correspondenceContent = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String documentContent = null;

  private BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference earlyMaturingSettlementPaymentTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The calculated penalty and fees due for early termination 
   * @return earlyMaturingPenalty
  **/

  public String getEarlyMaturingPenalty() {
    return earlyMaturingPenalty;
  }

  public void setEarlyMaturingPenalty(String earlyMaturingPenalty) {
    this.earlyMaturingPenalty = earlyMaturingPenalty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated and received 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Correspondence content - early termination agreement messages sent to involved parties 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Document copy/content - legal documents created & referenced 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * Get earlyMaturingSettlementPaymentTransactionReference
   * @return earlyMaturingSettlementPaymentTransactionReference
  **/

  public BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference getEarlyMaturingSettlementPaymentTransactionReference() {
    return earlyMaturingSettlementPaymentTransactionReference;
  }

  public void setEarlyMaturingSettlementPaymentTransactionReference(BQEarlyMaturingRetrieveOutputModelEarlyMaturingInstanceRecordEarlyMaturingSettlementPaymentTransactionReference earlyMaturingSettlementPaymentTransactionReference) {
    this.earlyMaturingSettlementPaymentTransactionReference = earlyMaturingSettlementPaymentTransactionReference;
  }


}

