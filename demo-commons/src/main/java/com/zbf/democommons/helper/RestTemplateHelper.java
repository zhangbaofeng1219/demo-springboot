package com.zbf.democommons.helper;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baofeng.zhang
 * @date 2022-05-23 17:17
 */
public class RestTemplateHelper {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/other/demo/get?name={name}";
        Map<String, Object> uriVariables = new HashMap<>(8);
        uriVariables.put("name","test11");
        ResponseEntity<String> res = exchange(restTemplate,HttpMethod.GET,url,uriVariables,null,null);
        System.out.println(res.getStatusCode());
    }




    public static ResponseEntity<String> exchange(RestTemplate restTemplate, HttpMethod method, String url, Map<String, Object> uriVariables, HttpHeaders headers, Map<String, Object> bodyMap) {
        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(bodyMap, headers);

        return restTemplate.exchange(url, method, httpEntity, String.class, uriVariables);
    }


}