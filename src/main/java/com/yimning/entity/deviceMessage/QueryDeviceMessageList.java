package com.yimning.entity.deviceMessage;

import lombok.Data;

/**
 * @program: yimning
 * @description: 查询设备消息列表
 * @author: Yimning
 * @create: 2021-04-18 23:11
 **/
@Data
public class QueryDeviceMessageList {
    private String project_id;
    private String device_id;
}
