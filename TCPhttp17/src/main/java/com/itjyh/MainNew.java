package com.itjyh;


import com.alibaba.fastjson.JSON;
import com.itjyh.builder.Param;
import com.itjyh.builder.ParamVoBuilder;
import com.itjyh.enmu.HttpEnum;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URLEncoder;
/*
 * @Author jiayuhang
 * @Date 16:42 2022/8/16
 * @Param JAVA客戶端
 * @return
 **/

public class MainNew {


    public static void main(String[] args) {


        try {//新建一个socket套接字，地址跟端口都指向springboot项目

            Socket socket = new Socket("127.0.0.1", 8080);//拼接http请求报文
            socket.setSoTimeout(3000);
            Param param = new Param();
            param.setB("bbc");
            param.setC("ccc");
            //客户端参数 encode
            String paramString = URLEncoder.encode(JSON.toJSONString(param), "UTF-8");
//            ParamVoBuilder paramVoBuilder = ParamVoBuilder.builder().url("POST http://127.0.0.1:8080/response/index.html/?a=1 HTTP/1.1")
            ParamVoBuilder builder = new ParamVoBuilder()
                    .url(HttpEnum.DELETE, "http://127.0.0.1:8080/response/index.html/?a=1 HTTP/1.1")
                    .accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .contentType("application/x-www-form-urlencoded")
                    .host("127.0.0.1:8080")
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (HTML, like Gecko) Chrome/80.0.3987.132 Safari/537.3")
                    .body(paramString);
            System.out.println("发送数据");
            String string = builder.build().toString();
            System.out.println(string);
            //返回数据
            socket.getOutputStream().write(string.getBytes());


            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                        try {
                            InputStream inputStream = socket.getInputStream();
                            int available = inputStream.available();
                            if(available>0){
                                //填充的字节要和返回来的长度一致,因为会默认分配内存空间
                                byte[] b = new byte[available];
                                int off = 0;
                                while (inputStream.read(b, off, b.length) != -1) {
                                    System.out.println("返回数据:" + new String(b));
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();

                        }

                    }

                }
            }).start();
            socket.shutdownOutput();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}