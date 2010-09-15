package gov.fcc.wrv.util;

import gov.fcc.wrv.model.WrvEvent;
import gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType;
import gov.fcc.wrv.model.xsd.BiddingDashboardService_Impl;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;

public class WebSvcConsumer {

    public void sendEvent(WrvEvent event, List<String> wsdlLocation){
        BiddingDashboardService_Impl svc = null;
        BiddingDashboardServicePortType port = null;

        for(String str: wsdlLocation){
            System.out.println(" sending message via " + str);

            try {
                svc = new BiddingDashboardService_Impl(str);
                port = svc.getBiddingDashboardServiceHttpPort();
                port.sendEvent(event);
            } catch (Exception e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            System.out.println(" done @ " + Calendar.getInstance().getTime());
        }

    }
}