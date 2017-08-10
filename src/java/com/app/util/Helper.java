package com.app.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stanfy.gsonxml.GsonXml;
import com.stanfy.gsonxml.GsonXmlBuilder;
import com.stanfy.gsonxml.XmlParserCreator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 *
 * @author mata.chauhan
 */
public class Helper {

    public static CatlinaEnv ReadCatlinaEnv() {
        XmlParserCreator parserCreator = new XmlParserCreator() {
            @Override
            public XmlPullParser createParser() {
                try {
                    return XmlPullParserFactory.newInstance().newPullParser();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };

        GsonXml gsonXml = new GsonXmlBuilder().setXmlParserCreator(parserCreator).create();

        String xml = System.getenv("CATALINA_OPTS");
        CatlinaEnv catlinaEnv = gsonXml.fromXml(xml, CatlinaEnv.class);
        return catlinaEnv;
    }
}
