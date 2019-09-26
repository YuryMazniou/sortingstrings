package by.gwtandgrid.task.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtAppServiceIntfAsync {
    void gwtAppCallServer(String data, AsyncCallback<String> async);
}
