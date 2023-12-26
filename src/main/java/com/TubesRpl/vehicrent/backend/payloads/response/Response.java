package com.TubesRpl.vehicrent.backend.payloads.response;


public class Response {
    private int status;
    private String message;
    private Object data;

    public Response(int ok, String message, Object data) {
        this.status = ok;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    


}
