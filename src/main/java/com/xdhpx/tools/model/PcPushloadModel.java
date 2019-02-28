package com.xdhpx.tools.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/4/24.
 */
public class PcPushloadModel {

    /**
     * 集合类型 user,clinic,all
     */
    String type = "";
    /**
     * 集合
     */
    private List<String> list;
    /**
     * 内容
     */
    String msgContent = "";
    /**
     * 当前设备号
     */
    String imei = "";


    public void add(String id) {
        list = new ArrayList<>();
        list.add(id);
    }

    public void add(String ... ids){

    }

    /*public void add(String[] arrayId) {

    }*/

    public void add(Set<String> setId) {

    }

    public void add(List<String> listId) {
        list = new ArrayList<String>();
        list.addAll(listId);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
