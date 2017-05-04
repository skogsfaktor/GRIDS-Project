package se.kth.app;

import se.sics.kompics.PortType;

/**
 * Created by Barosen on 2017-05-02.
 */
public class GBEBPort extends PortType {
        {
            indication(GBEB.GBEB_Deliver.class);
            request(GBEB.GBEB_Broadcast.class);
        }

}
