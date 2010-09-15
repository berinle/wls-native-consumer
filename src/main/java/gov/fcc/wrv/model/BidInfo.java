/**
 * Generated from schema type t=BidInfo@http://model.wrv.fcc.gov
 */
package gov.fcc.wrv.model;

public class BidInfo implements java.io.Serializable {

  private java.lang.Long amount;

  public java.lang.Long getAmount() {
    return this.amount;
  }

  public void setAmount(java.lang.Long amount) {
    this.amount = amount;
  }

  private java.lang.String bipDesc;

  public java.lang.String getBipDesc() {
    return this.bipDesc;
  }

  public void setBipDesc(java.lang.String bipDesc) {
    this.bipDesc = bipDesc;
  }

  private java.lang.String bipName;

  public java.lang.String getBipName() {
    return this.bipName;
  }

  public void setBipName(java.lang.String bipName) {
    this.bipName = bipName;
  }

  private java.lang.Integer numBids;

  public java.lang.Integer getNumBids() {
    return this.numBids;
  }

  public void setNumBids(java.lang.Integer numBids) {
    this.numBids = numBids;
  }

}
