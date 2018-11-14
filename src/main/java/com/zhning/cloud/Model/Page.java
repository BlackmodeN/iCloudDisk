package com.zhning.cloud.Model;

public class Page {
    private int currentpage;
    private int pagesize;
    private int startindex;
    private String filepath;
    private String searchcontent;

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getPageSize() {
        return pagesize;
    }

    public void setPageSize(int pageSize) {
        this.pagesize = pageSize;
    }

    public int getStartindex() {
        this.startindex = (this.currentpage-1)*this.pagesize;
        return startindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getSearchcontent() {
        return searchcontent;
    }

    public void setSearchcontent(String searchcontent) {
        this.searchcontent = searchcontent;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
