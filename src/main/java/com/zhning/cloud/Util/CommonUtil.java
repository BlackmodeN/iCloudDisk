package com.zhning.cloud.Util;




public class CommonUtil {

    public static String setContentType(String returnFileName) {
        String contentType = "application/octet-stream";
        if ( returnFileName.lastIndexOf(".") < 0)
            return contentType;
        returnFileName = returnFileName .toLowerCase();
        returnFileName = returnFileName.substring(returnFileName .lastIndexOf("." ) + 1);

        if ( returnFileName.equals("html") || returnFileName.equals("htm") || returnFileName .equals("shtml" )) {
            contentType = "text/html";
        } else if ( returnFileName.equals("apk")) {
            contentType = "application/vnd.android.package-archive" ;
        } else if ( returnFileName.equals("sis")) {
            contentType = "application/vnd.symbian.install";
        } else if ( returnFileName.equals("sisx")) {
            contentType = "application/vnd.symbian.install";
        } else if ( returnFileName.equals("exe")) {
            contentType = "application/x-msdownload";
        } else if ( returnFileName.equals("msi")) {
            contentType = "application/x-msdownload";
        } else if ( returnFileName.equals("css")) {
            contentType = "text/css";
        } else if ( returnFileName.equals("xml")) {
            contentType = "text/xml";
        } else if ( returnFileName.equals("gif")) {
            contentType = "image/gif";
        } else if ( returnFileName.equals("jpeg") || returnFileName.equals("jpg")) {
            contentType = "image/jpeg";
        } else if ( returnFileName.equals("js")) {
            contentType = "application/x-javascript";
        } else if ( returnFileName.equals("atom")) {
            contentType = "application/atom+xml";
        } else if ( returnFileName.equals("rss")) {
            contentType = "application/rss+xml";
        } else if ( returnFileName.equals("mml")) {
            contentType = "text/mathml";
        } else if ( returnFileName.equals("txt")) {
            contentType = "text/plain";
        } else if ( returnFileName.equals("jad")) {
            contentType = "text/vnd.sun.j2me.app-descriptor" ;
        } else if ( returnFileName.equals("wml")) {
            contentType = "text/vnd.wap.wml";
        } else if ( returnFileName.equals("htc")) {
            contentType = "text/x-component";
        } else if ( returnFileName.equals("png")) {
            contentType = "image/png";
        } else if ( returnFileName.equals("tif") || returnFileName.equals("tiff")) {
            contentType = "image/tiff";
        } else if ( returnFileName.equals("wbmp")) {
            contentType = "image/vnd.wap.wbmp";
        } else if ( returnFileName.equals("ico")) {
            contentType = "image/x-icon";
        } else if ( returnFileName.equals("jng")) {
            contentType = "image/x-jng";
        } else if ( returnFileName.equals("bmp")) {
            contentType = "image/x-ms-bmp";
        } else if ( returnFileName.equals("svg")) {
            contentType = "image/svg+xml";
        } else if ( returnFileName.equals("jar") || returnFileName.equals("var") || returnFileName .equals("ear" )) {
            contentType = "application/java-archive";
        } else if ( returnFileName.equals("doc")) {
            contentType = "application/msword";
        } else if ( returnFileName.equals("pdf")) {
            contentType = "application/pdf";
        } else if ( returnFileName.equals("rtf")) {
            contentType = "application/rtf";
        } else if ( returnFileName.equals("xls")) {
            contentType = "application/vnd.ms-excel";
        } else if ( returnFileName.equals("ppt")) {
            contentType = "application/vnd.ms-powerpoint";
        } else if ( returnFileName.equals("7z")) {
            contentType = "application/x-7z-compressed";
        } else if ( returnFileName.equals("rar")) {
            contentType = "application/x-rar-compressed";
        } else if ( returnFileName.equals("swf")) {
            contentType = "application/x-shockwave-flash";
        } else if ( returnFileName.equals("rpm")) {
            contentType = "application/x-redhat-package-manager" ;
        } else if ( returnFileName.equals("der") || returnFileName.equals("pem") || returnFileName .equals("crt" )) {
            contentType = "application/x-x509-ca-cert";
        } else if ( returnFileName.equals("xhtml")) {
            contentType = "application/xhtml+xml";
        } else if ( returnFileName.equals("zip")) {
            contentType = "application/zip";
        } else if ( returnFileName.equals("mid") || returnFileName.equals("midi") || returnFileName .equals("kar" )) {
            contentType = "audio/midi";
        } else if ( returnFileName.equals("mp3")) {
            contentType = "audio/mpeg";
        } else if ( returnFileName.equals("ogg")) {
            contentType = "audio/ogg";
        } else if ( returnFileName.equals("m4a")) {
            contentType = "audio/x-m4a";
        } else if ( returnFileName.equals("ra")) {
            contentType = "audio/x-realaudio";
        } else if ( returnFileName.equals("3gpp") || returnFileName.equals("3gp")) {
            contentType = "video/3gpp";
        } else if ( returnFileName.equals("mp4")) {
            contentType = "video/mp4";
        } else if ( returnFileName.equals("mpeg") || returnFileName.equals("mpg")) {
            contentType = "video/mpeg";
        } else if ( returnFileName.equals("mov")) {
            contentType = "video/quicktime";
        } else if ( returnFileName.equals("flv")) {
            contentType = "video/x-flv";
        } else if ( returnFileName.equals("m4v")) {
            contentType = "video/x-m4v";
        } else if ( returnFileName.equals("mng")) {
            contentType = "video/x-mng";
        } else if ( returnFileName.equals("asx") || returnFileName.equals("asf")) {
            contentType = "video/x-ms-asf";
        } else if ( returnFileName.equals("wmv")) {
            contentType = "video/x-ms-wmv";
        } else if ( returnFileName.equals("avi")) {
            contentType = "video/x-msvideo";
        }

        return contentType;
    }

}