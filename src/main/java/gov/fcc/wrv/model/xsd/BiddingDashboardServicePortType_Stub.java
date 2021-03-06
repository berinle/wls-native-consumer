package gov.fcc.wrv.model.xsd;

/**
 * Generated class, do not edit.
 *
 * This stub class was generated by weblogic
 * webservice stub gen on Wed Sep 15 11:58:02 EDT 2010 
 */

public class BiddingDashboardServicePortType_Stub 
     extends weblogic.wsee.jaxrpc.StubImpl
     implements gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType, /**/java.io.Serializable
{

  public BiddingDashboardServicePortType_Stub(weblogic.wsee.wsdl.WsdlPort port, 
                        weblogic.wsee.jaxrpc.ServiceImpl service) 
    throws javax.xml.rpc.ServiceException
  {
    super(port, gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType.class, service);
  }
  
    
  /**
   * Operation Name : {http://webservice.wrv.fcc.gov}sendTestEvent   */

  public void sendTestEvent(gov.fcc.wrv.model.WrvEvent in0) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(in0);
    
    try {
            java.lang.Object _result = _invoke("sendTestEvent", _args.toArray());
          } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void sendTestEventAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.fcc.wrv.model.WrvEvent in0) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "sendTestEvent");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "sendTestEvent");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "void");
    _args.add(in0);
    
    try {
      java.lang.Object _result = _invoke("sendTestEvent", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
        
  /**
   * Operation Name : {http://webservice.wrv.fcc.gov}sendEvent   */

  public void sendEvent(gov.fcc.wrv.model.WrvEvent in0) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(in0);
    
    try {
            java.lang.Object _result = _invoke("sendEvent", _args.toArray());
          } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void sendEventAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.fcc.wrv.model.WrvEvent in0) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "sendEvent");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "sendEvent");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "void");
    _args.add(in0);
    
    try {
      java.lang.Object _result = _invoke("sendEvent", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
        
  /**
   * Operation Name : {http://webservice.wrv.fcc.gov}verifyWS   */

  public void verifyWS() throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();

    try {
            java.lang.Object _result = _invoke("verifyWS", _args.toArray());
          } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void verifyWSAsync(weblogic.wsee.async.AsyncPreCallContext apc ) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "verifyWS");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "verifyWS");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "void");

    try {
      java.lang.Object _result = _invoke("verifyWS", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
    
  private Object writeReplace() throws java.io.ObjectStreamException {
    java.util.HashMap map = new java.util.HashMap();
            map.put("BiddingDashboardServiceHttpPort", "BiddingDashboardServiceHttpPort");
            
    return new weblogic.wsee.tools.clientgen.stubgen.StubSerialWrapper(
      "gov.fcc.wrv.model.xsd.BiddingDashboardService",
      (String)map.get(_getPortName()),
      _getUserProperties());
  }
}