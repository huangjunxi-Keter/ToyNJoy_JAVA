package pers.keter.toynjoy.entity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ServiceResult {

    public ServiceResult(boolean state) {
        object = new JSONObject();
        array = new JSONArray();
    }

    private JSONObject object;
    private JSONArray array;

    private boolean state;
    private String message;
    private String data;

    public boolean getState() { return state; }

    public void setState(boolean state) { this.state = state; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(Object data, boolean needToJSON, boolean isList) {
        if (needToJSON) {
            if (isList)
                this.data = array.fromObject(data).toString();
            else
                this.data = object.fromObject(data).toString();
        }
        else {
            this.data = data.toString();
        }
    }

}
