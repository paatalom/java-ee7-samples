/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.java.ee7.jaxws.endpoint.handler;

import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.Node;

/**
 *
 * @author paata1
 */
public class MyMessageHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext messageContext) {
        try {
            Boolean isRequest = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (!isRequest) {

                SOAPMessage msg = messageContext.getMessage();
                SOAPEnvelope soapEnv = msg.getSOAPPart().getEnvelope();
                SOAPHeader soapHeader = soapEnv.getHeader();

                //if no header, add one
                if (soapHeader == null) {
                    soapHeader = soapEnv.addHeader();
                    //throw exception
                    generateSOAPErrMessage(msg, "No SOAP header.");
                }

                msg.writeTo(System.out);
                return true;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {

        System.out.println("Server : handleFault()......");

        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("Server : close()......");
    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println("Server : getHeaders()......");
        return null;
    }

    private void generateSOAPErrMessage(SOAPMessage msg, String reason) {
        try {
            SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
            SOAPFault soapFault = soapBody.addFault();
            soapFault.setFaultString(reason);
            throw new SOAPFaultException(soapFault);
        } catch (SOAPException e) {
        }
    }

}
