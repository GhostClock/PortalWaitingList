package com.ghostflying.portalwaitinglist.data;

import java.util.Date;

/**
 * Created by Ghost on 2014/12/4.
 */
public class EditEvent extends PortalEvent {
    String portalAddress;
    String portalAddressUrl;

    public EditEvent(String portalName,
                     OperationResult result,
                     Date date,
                     String messageId){
        super(portalName, result, date, messageId);
    }

    public EditEvent(String portalName,
                     OperationResult result,
                     Date date,
                     String messageId,
                     String portalAddress,
                     String portalAddressUrl){
        super(portalName, result, date, messageId);
    }

    public String getPortalAddress(){
        return portalAddress;
    }

    public String getPortalAddressUrl(){
        return portalAddressUrl;
    }

    @Override
    public OperationType getOperationType() {
        return OperationType.EDIT;
    }
}
