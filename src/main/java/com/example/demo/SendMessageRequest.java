package com.example.demo;

public class SendMessageRequest {
    /**
     *         req_body = {
     *             "open_id": open_id,
     *             "msg_type": "text",
     *             "content": {
     *                 "text": text
     *             }
     *         }
     */

    private String open_id;
    private String msg_type;
    private MsgContent content;

    public SendMessageRequest(String open_id, String msg_type, MsgContent content) {
        this.open_id = open_id;
        this.msg_type = msg_type;
        this.content = content;
    }

    public SendMessageRequest() {
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public MsgContent getContent() {
        return content;
    }

    public void setContent(MsgContent content) {
        this.content = content;
    }
}
