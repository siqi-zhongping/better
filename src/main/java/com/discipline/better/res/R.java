package com.discipline.better.res;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一结果.
 *
 * @author yzd
 * @version 1.0.0
 * CreateDate
 */
public class R extends HashMap<String, Object> implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法.
     */
    public R() {
        put("code", 0);
        put("msg", "操作成功");
    }

    /**
     * 错误返回.
     * @return 错误结果
     */
    public static R error() {
        return error(1, "操作失败");
    }

    /**
     * 错误返回.
     * @param msg 描述内容.
     * @return 错误结果
     */
    public static R error(String msg) {
        return error(500, msg);
    }

    /**
     * 错误返回.
     * @param code 错误码
     * @param msg 描述内容.
     * @return 错误结果
     */
    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    /**
     * 成功返回.
     * @param msg 描述内容
     * @return 成功结果
     */
    public static R ok(String msg) {
        R r = new R();
        r.put("code", 0);
        r.put("msg", msg);
        return r;
    }

    /**
     * 成功返回.
     * @param data 返回结果
     * @return 成功结果
     */
    public static R ok(Object data) {
        R r = new R();
        r.put("data", data);
        r.put("code", 0);
        r.put("msg", "操作成功");
        return r;
    }

    /**
     * 成功返回.
     * @param map 返回结果内容
     * @return 成功结果
     */
    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.put("code", 0);
        r.putAll(map);
        return r;
    }

    /**
     * 成功返回.
     * @return 成功结果
     */
    public static R ok() {
        return new R();
    }

    /**
     * .
     * @param key
     * @param value
     * @return
     */
    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
