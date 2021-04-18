package com.yimning.entity.device;

import lombok.Data;

/**
 * @program: yimning
 * @description: 冻结设备密钥请求参数
 * @author: Yimning
 * @create: 2021-04-18 20:48
 **/
@Data
public class FreezeDevice {

    String project_id;
    String device_id;
}
