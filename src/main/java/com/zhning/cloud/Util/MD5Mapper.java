package com.zhning.cloud.Util;

import com.zhning.cloud.Model.File;

import java.util.concurrent.ConcurrentHashMap;

public class MD5Mapper {
    public static  final ConcurrentHashMap<String, File> MAP = new ConcurrentHashMap<>();
}
