package usantatecla.mastermind.distributed;


import usantatecla.mastermind.controllers.impl.FrameType;

import java.util.HashMap;
import java.util.Map;


public class DispatcherPrototype {

    private TCPIP tcpip;
    private Map<FrameType, Dispatcher> dispatcherMap;

    DispatcherPrototype() {
        this.tcpip = TCPIP.createServerSocket();
        this.dispatcherMap = new HashMap<>();
    }

    void add(FrameType frameType, Dispatcher dispatcher) {
        this.dispatcherMap.put(frameType, dispatcher);
        dispatcher.associate(this.tcpip);
    }

    void serve() {
        FrameType frameType;
        do {
            String string = this.tcpip.receiveLine();
            frameType = FrameType.parser(string);
            if (frameType != FrameType.CLOSE) {
                this.dispatcherMap.get(frameType).dispatch();
            }
        } while (frameType != FrameType.CLOSE);
        this.tcpip.close();
    }

}
