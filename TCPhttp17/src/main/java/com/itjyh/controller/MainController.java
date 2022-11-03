package com.itjyh.controller;

import com.alibaba.fastjson.JSONObject;
import com.itjyh.builder.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;



@RequestMapping("/response")
@Controller
public class MainController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/index.html", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @ResponseBody
    public String index(@RequestParam(value = "param", required = false) String param, HttpServletRequest request) throws UnsupportedEncodingException {
        LOG.info("请求类型:" + String.valueOf(request.getMethod()));
        LOG.info("URL:" + String.valueOf(request.getRequestURL()));
        LOG.info("Host:" + String.valueOf(request.getHeader("Host")));
        LOG.info("Accept:" + String.valueOf(request.getHeader("Accept")));

        if (!StringUtils.isEmpty(param)) {
            String decode = URLDecoder.decode(param, "UTF-8");
            Param paramObject = JSONObject.parseObject(decode, Param.class);
            LOG.info("请求内容:" + request.getQueryString() + paramObject);

        }
        return "请求内容:" + request.getQueryString() + " " + param;


    }


}

