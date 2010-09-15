package gov.fcc.wrv.util;

import gov.fcc.wrv.model.*;
import gov.fcc.wrv.model.xsd.*;
import gov.fcc.wrv.util.WebSvcConsumer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tester {
    private static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
		
		try{
			BiddingDashboardService_Impl svc = new BiddingDashboardService_Impl();//"http://localhost:7777/wrv/services/DashboardService?wsdl");
			BiddingDashboardServicePortType port = svc.getBiddingDashboardServiceHttpPort();
			port.verifyWS();
			
			System.out.println(" done with verifyWS() ");
			
			WrvEvent event = new WrvEvent();
			event.setTimeStamp(Calendar.getInstance());
			
			
			port.sendTestEvent(event);
			System.out.println(" done with sendTestEvent() ");
		
			event.setEventType("ANNPOST");
			event.setEventSender("BIDDING");
			port.sendEvent(event);
            System.out.println(" done with sendEvent() ");

            
            WebSvcConsumer consumer = new WebSvcConsumer();
            list.add("http://localhost:7777/wrv/services/DashboardService?wsdl");
            consumer.sendEvent(event, list);
            System.out.println(" done sending message via WebSvcConsumer ");

		} catch(Exception e){
			e.printStackTrace();
		}
	}
}