package gov.fcc.wrv.model.xsd;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Wed Sep 15 11:58:02 EDT 2010 */

public class BiddingDashboardService_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements gov.fcc.wrv.model.xsd.BiddingDashboardService {

  public BiddingDashboardService_Impl() throws javax.xml.rpc.ServiceException {
    this("gov/fcc/wrv/model/xsd/BiddingDashboardService_saved_wsdl.wsdl", null);
  }
  
  public BiddingDashboardService_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public BiddingDashboardService_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://webservice.wrv.fcc.gov", "BiddingDashboardService"),
          "gov/fcc/wrv/model/xsd/BiddingDashboardService_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: BiddingDashboardServiceHttpPort 
  // Port Type: BiddingDashboardServicePortType 
  //***********************************

  gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType mvar_BiddingDashboardServiceHttpPort;

  /**
   * returns BiddingDashboardServiceHttpPort port in this service 
   */
  public gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType getBiddingDashboardServiceHttpPort() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_BiddingDashboardServiceHttpPort == null) {
      mvar_BiddingDashboardServiceHttpPort =
        new gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType_Stub(_getPort("BiddingDashboardServiceHttpPort"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_BiddingDashboardServiceHttpPort)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_BiddingDashboardServiceHttpPort;
  }

  /**
   * @deprecated  Use getBiddingDashboardServiceHttpPort(byte[] username, byte[] password)
   */
  public gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType getBiddingDashboardServiceHttpPort(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getBiddingDashboardServiceHttpPort();
  }

  public gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType getBiddingDashboardServiceHttpPort(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getBiddingDashboardServiceHttpPort();
  }
  
  
}