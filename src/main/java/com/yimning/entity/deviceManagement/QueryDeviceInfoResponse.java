package com.yimning.entity.deviceManagement;

import com.yimning.common.lang.HttpResponseResult;
import lombok.Data;

import java.util.List;

/**
 * @program: yimning
 * @description: 查询某个设备的响应结果
 * @author: Yimning
 * @create: 2021-04-18 17:17
 **/
@Data
public class QueryDeviceInfoResponse {
    private String app_id;
    private String app_name;
    private String device_id;
    private String node_id;
    private String gateway_id;
    private String device_name;
    private String node_type;
    private String description;
    private String fw_version;
    private String sw_version;
    private AuthInfo auth_info;
    private String product_id;
    private String product_name;
    private String status;
    private String create_time;
    private List<TagV5DTO> tags;
    private ExtensionInfo extension_info;
    private HttpResponseResult httpResponseResult;
}
