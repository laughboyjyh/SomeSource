package com.itjyh.builder;


import com.itjyh.enmu.HttpEnum;

/**
 * @Author jiayuhang
 * @Date 16:43 2022/8/16
 * @Param
 * @return
 */
public final class ParamVoBuilder {

    private static ParamVo paramVo = new ParamVo();

    public static ParamVoBuilder builder() {
        ParamVoBuilder paramVoBuilder = new ParamVoBuilder();
        paramVo.setConnection("Connection: keep-alive");
        return paramVoBuilder;
    }

    public ParamVoBuilder url(HttpEnum httpEnum, String url) {
        paramVo.setUrl(httpEnum.getValue()+" "+ url);
        return this;
    }

    public ParamVoBuilder body(String body) {
        paramVo.setBody("\r\nparam="+body);
        paramVo.setContentLength("Content-Length:"+paramVo.getBody().length());
        return this;
    }


    public ParamVoBuilder accept(String accept) {
        paramVo.setAccept("Accept: "+accept);
        return this;
    }

    public ParamVoBuilder connection(String connection) {
        paramVo.setConnection("Connection: "+connection);
        return this;
    }

    public ParamVoBuilder contentType(String contentType) {
        paramVo.setContentType("Content-Type: "+contentType);
        return this;
    }

    public ParamVoBuilder host(String host) {
        paramVo.setHost("Host: "+host);
        return this;
    }

    public ParamVoBuilder userAgent(String userAgent) {
        paramVo.setUserAgent("User-Agent: "+userAgent);
        return this;
    }



    public ParamVo build() {
        return this.paramVo;
    }




}
