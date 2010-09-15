/**
 * Generated from schema type t=WrvEvent@http://model.wrv.fcc.gov
 */
package gov.fcc.wrv.model;

public class WrvEvent implements java.io.Serializable {

  private java.lang.Integer auctionId;

  public java.lang.Integer getAuctionId() {
    return this.auctionId;
  }

  public void setAuctionId(java.lang.Integer auctionId) {
    this.auctionId = auctionId;
  }

  private gov.fcc.wrv.model.BidInfo bidInfo;

  public gov.fcc.wrv.model.BidInfo getBidInfo() {
    return this.bidInfo;
  }

  public void setBidInfo(gov.fcc.wrv.model.BidInfo bidInfo) {
    this.bidInfo = bidInfo;
  }

  private gov.fcc.wrv.model.BidderInfo bidderInfo;

  public gov.fcc.wrv.model.BidderInfo getBidderInfo() {
    return this.bidderInfo;
  }

  public void setBidderInfo(gov.fcc.wrv.model.BidderInfo bidderInfo) {
    this.bidderInfo = bidderInfo;
  }

  private java.lang.Integer currentRound;

  public java.lang.Integer getCurrentRound() {
    return this.currentRound;
  }

  public void setCurrentRound(java.lang.Integer currentRound) {
    this.currentRound = currentRound;
  }

  private gov.fcc.wrv.model.EligWavierInfo eligWaiverInfo;

  public gov.fcc.wrv.model.EligWavierInfo getEligWaiverInfo() {
    return this.eligWaiverInfo;
  }

  public void setEligWaiverInfo(gov.fcc.wrv.model.EligWavierInfo eligWaiverInfo) {
    this.eligWaiverInfo = eligWaiverInfo;
  }

  private java.lang.String eventDesc;

  public java.lang.String getEventDesc() {
    return this.eventDesc;
  }

  public void setEventDesc(java.lang.String eventDesc) {
    this.eventDesc = eventDesc;
  }

  private java.lang.String eventSender;

  public java.lang.String getEventSender() {
    return this.eventSender;
  }

  public void setEventSender(java.lang.String eventSender) {
    this.eventSender = eventSender;
  }

  private java.lang.String eventType;

  public java.lang.String getEventType() {
    return this.eventType;
  }

  public void setEventType(java.lang.String eventType) {
    this.eventType = eventType;
  }

  private gov.fcc.wrv.model.ProcessInfo processInfo;

  public gov.fcc.wrv.model.ProcessInfo getProcessInfo() {
    return this.processInfo;
  }

  public void setProcessInfo(gov.fcc.wrv.model.ProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  private java.lang.Integer status;

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  private java.lang.String statusDesc;

  public java.lang.String getStatusDesc() {
    return this.statusDesc;
  }

  public void setStatusDesc(java.lang.String statusDesc) {
    this.statusDesc = statusDesc;
  }

  private java.util.Calendar timeStamp;

  public java.util.Calendar getTimeStamp() {
    return this.timeStamp;
  }

  public void setTimeStamp(java.util.Calendar timeStamp) {
    this.timeStamp = timeStamp;
  }

}
