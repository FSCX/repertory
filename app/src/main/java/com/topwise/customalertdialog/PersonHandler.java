package com.topwise.customalertdialog;

import com.topwise.customalertdialog.model.Beauty;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class PersonHandler extends DefaultHandler{

    //声明一个装载Beauty类型的List
    private ArrayList<Beauty> beautyLists;
    //声明一个Beauty类型的变量
    private Beauty beauty;
    //声明一个字符串变量
    private String content;

    public PersonHandler(ArrayList<Beauty> beautyLists) {
        this.beautyLists = beautyLists;
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if("beauty".equals(localName)){
            beauty = new Beauty();//新建Beauty对象
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        content = new String(ch,start,length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if("name".equals(localName)){
            beauty.setName(content);
        }else if("age".equals(localName)){
            beauty.setAge(content);
        }else if("beauty".equals(localName)){
            beautyLists.add(beauty);//将Beauty对象加入到List中
        }
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }
}
