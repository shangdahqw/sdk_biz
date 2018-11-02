package com.zykj.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;


/**
 *
 * 基于com.google.code.gson封装的json转换工具类
 *
 */
public class JsonUtil {


        private static Gson gson = null;

        static {
            if (gson == null) {
                gson = new Gson();
            }
        }

        private JsonUtil() {
        }

        /**
         * 对象转成json
         */
        public static String toJson(Object object) {

            String gsonString = null;
            if (gson != null) {
                gsonString = gson.toJson(object);
            }
            return gsonString;
        }

        /**
         * Json转成对象
         *
         */
        public static <T> T gsonToBean(String gsonString, Class<T> c) {
            T t = null;
            if (gson != null) {
                t = gson.fromJson(gsonString, c);
            }
            return t;
        }

        /**
         * json转成list<T>
         *
         */
        public static <T> List<T> gsonToList(String gsonString, Class<T> c) {

            List<T> list = null;
            if (gson != null) {
                list = gson.fromJson(gsonString, new TypeToken<List<T>>() {}.getType());
            }
            return list;
        }

        /**
         * json转成list中有map的
         *
         */
        public static <T> List<Map<String, T>> gsonToListMaps(String gsonString) {
            List<Map<String, T>> list = null;
            if (gson != null) {
                list = gson.fromJson(gsonString, new TypeToken<List<Map<String, T>>>() {}.getType());
            }
            return list;
        }

        /**
         * json转成map
         */
        public static <T> Map<String, T> gsonToMaps(String gsonString) {

            Map<String, T> map = null;
            if (gson != null) {
                map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {}.getType());
            }
            return map;
        }
    }

