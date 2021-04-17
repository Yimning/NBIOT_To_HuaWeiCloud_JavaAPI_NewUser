package com.yimning.service.deviceManagements.deviceUpgrade;

import java.util.HashMap;
import java.util.Map;

import com.yimning.utils.Constant;
import com.yimning.utils.HttpUtils;
import com.yimning.utils.JsonUtils;
import com.yimning.utils.StreamClosedHttpResponse;

/**
 * Delete Specify Package :
 * This interface is used to delete package that does not need to be used or reserved by fileId.
 */
public class DeleteSpecifyPackage {

	public static void main(String args[]) throws Exception {

        // Two-Way Authentication
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.initSSLConfigForTwoWay();

        // Authentication.get token
        String accessToken = login(httpUtils);

        //please replace the fileId, when you call this interface.
        String fileId = "8d7c459a301583ddce20ce83";
        
        //Please make sure that the following parameter values have been modified in the Constant file.
		String appId = Constant.APPID;        
        String urlDeleteSpecifyPackage = Constant.DELETE_SPECIFY_PACKAGE + "/" + fileId;
        
        Map<String, String> header = new HashMap<>();
        header.put(Constant.HEADER_APP_KEY, appId);
        header.put(Constant.HEADER_APP_AUTH, "Bearer" + " " + accessToken);

        StreamClosedHttpResponse responseDeleteSpecifyPackage = httpUtils.doDeleteWithParasGetStatusLine(urlDeleteSpecifyPackage, null, header);

        System.out.println("DeleteSpecifyPackage, response content:");
        System.out.println(responseDeleteSpecifyPackage.getStatusLine());
        System.out.println(responseDeleteSpecifyPackage.getContent());
        System.out.println();
    }

    /**
     * Authentication.get token
     */
    @SuppressWarnings("unchecked")
    public static String login(HttpUtils httpUtils) throws Exception {

        String appId = Constant.APPID;
        String secret = Constant.SECRET;
        String urlLogin = Constant.APP_AUTH;

        Map<String, String> paramLogin = new HashMap<>();
        paramLogin.put("appId", appId);
        paramLogin.put("secret", secret);

        StreamClosedHttpResponse responseLogin = httpUtils.doPostFormUrlEncodedGetStatusLine(urlLogin, paramLogin);

        System.out.println("app auth success,return accessToken:");
        System.out.println(responseLogin.getStatusLine());
        System.out.println(responseLogin.getContent());
        System.out.println();

        Map<String, String> data = new HashMap<>();
        data = JsonUtils.jsonString2SimpleObj(responseLogin.getContent(), data.getClass());
        return data.get("accessToken");
    }

}