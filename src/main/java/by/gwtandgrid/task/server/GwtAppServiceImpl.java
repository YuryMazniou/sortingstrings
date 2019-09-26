package by.gwtandgrid.task.server;

import by.gwtandgrid.task.client.GwtAppServiceIntf;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GwtAppServiceImpl extends RemoteServiceServlet implements GwtAppServiceIntf {
    public String gwtAppCallServer(String data) throws IllegalArgumentException {
        return data;
    }
}
