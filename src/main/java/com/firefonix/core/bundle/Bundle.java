package com.firefonix.core.bundle;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by IceFonix on 2014/8/3.
 * 采用键值对形式，对应祖先查询
 * 例如
 * key: beijing/tiananmen
 */
public class Bundle  {
    private Map<String,Object> bundleMap;

    public Bundle() {
        this.bundleMap = new HashMap<String, Object>();
    }

    public Object getValue(String key){
        Object obj = null;

        return obj;
    }

    public Map<String, Object> getBundleMap() {
        return bundleMap;
    }

    public void setBundleMap(Map<String, Object> bundleMap) {
        this.bundleMap = bundleMap;
    }
}
