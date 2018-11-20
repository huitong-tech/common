package com.pivaiot.common.lang.util;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class JsonUtilTest {

    @Test
    public void toMap() {

        String json = "{\"data\":{\"did\":\"31\",\"sampled_time\":\"2018-10-27T04:08:12.000+0800\",\"type\":\"CNC\",\"status\":4,\"parts_no_all\":0,\"prog_main\":\"SAMPLE\",\"prog_seq\":\"N00000\",\"spindle_load\":0,\"spindle_rate\":50,\"spindle_atc_speed\":0,\"svero_feed_speed\":0,\"svero_feed_rate\":254,\"door_open\":false,\"door_close\":false,\"chuck_clamp\":false,\"chuck_free\":false,\"feed_sig\":false,\"cut_sig\":false,\"alarm\":[{\"alarm_type\":\"SW0\",\"alarm_no\":\"100\",\"alarm_msg\":\"参数写入开关处于打开\"},{\"alarm_type\":\"SW0\",\"alarm_no\":\"100\",\"alarm_msg\":\"参数写入开关处于打开\"}]}}";

        Map<String, Object> map = JsonUtil.toMap(json);
        assertTrue(!map.isEmpty());
    }
}
