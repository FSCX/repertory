package com.topwise.customalertdialog;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.topwise.customalertdialog.model.Beauty;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class PersonActivity extends AppCompatActivity {
    private TextView mContent;

    //声明装载Beauty对象的List
    private ArrayList<Beauty> beautyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);


        //初始化beautyList链表
        if(null == beautyList){
            beautyList = new ArrayList<>();
        }

        doSAXfromXml();
        setupViews();
    }
    //使用SAX解析器解析XML文件的方法
    public void doSAXfromXml(){
        try {
            //获取AssetManager管理器对象
            AssetManager assets = getAssets();
            //通过AssetManager的open方法获取到beauties.xml文件的输入流
            InputStream stream = assets.open("beauties.xml");
            //通过获取到的InputStream来得到InputSource实例
            InputSource source = new InputSource(stream);
            //使用工厂方法初始化SAXParserFactory变量spf
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //通过SAXParserFactory得到SAXParser的实例
            SAXParser saxParser = factory.newSAXParser();
            //通过SAXParser得到XMLReader的实例
            XMLReader xmlReader = saxParser.getXMLReader();
            //初始化自定义的类PersonHandler的变量msh，将beautyList传递给它，以便装载数据
            PersonHandler personHandler = new PersonHandler(beautyList);
            //将对象personHandler传递给xmlReader
            xmlReader.setContentHandler(personHandler);

            //调用xmlReader的parse方法解析输入流
            xmlReader.parse(source);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 将解析结果输出到界面的方法
     */
    private void setupViews(){
        String result = "";

        for (Beauty b : beautyList) {
            result += b.toString()+"\n";

        }
        //String substring = result.substring(7);
        mContent = (TextView) findViewById(R.id.textView);
        mContent.setText(result);
    }
}
