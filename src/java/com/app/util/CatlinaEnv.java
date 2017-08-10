package com.app.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mata.chauhan
 */
public class CatlinaEnv {

    private String _host = "";
    private int _port = 0;
    private String _uid = "";
    private String _pwd = "";
    private String _db = "";

    public String getHost() {
        return _host;
    }

    public void setHost(String _host) {
        this._host = _host;
    }

    public int getPort() {
        return _port;
    }

    public void setPort(int _port) {
        this._port = _port;
    }

    public String getUid() {
        return _uid;
    }

    public void setUid(String _uid) {
        this._uid = _uid;
    }

    public String getPwd() {
        return _pwd;
    }

    public void setPwd(String _pwd) {
        this._pwd = _pwd;
    }

    public String getDb() {
        return _db;
    }

    public void setDb(String _db) {
        this._db = _db;
    }
}
