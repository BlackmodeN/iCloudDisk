package com.zhning.cloud.Mapper;

import com.zhning.cloud.Model.File;
import com.zhning.cloud.Model.Page;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface FileMapper {

    @Select("SELECT * FROM file WHERE canshare=1 AND filename LIKE #{searchcontent} LIMIT #{startindex},#{pagesize}")
    public List<File> getAllFiles(Page page) throws Exception;

    /*统计文件数*/
    @Select("SELECT COUNT(id) totalrecord FROM file WHERE canshare=1 AND filename LIKE #{searchcontent}")
    public int count(String searchcontent) throws Exception;

    @Select("SELECT file.filepath FROM file WHERE id=#{value}")
    public String findFilepathById(int id) throws Exception;

    /*插入文件*/
    @Insert("INSERT INTO icloud.file (filename,filepath,filesize,createtime,canshare,user_id,MD5) VALUES(#{filename},#{filepath},#{filesize},#{createtime},#{canshare},#{user_id},#{MD5})")
    public Integer insertFile(File file) throws Exception;

    /* 查询用户的文件*/
    @Select("SELECT * FROM file WHERE filepath=#{filepath} order by createtime desc LIMIT #{startindex},#{pagesize}")
    public List<File> getUserFiles(Page page) throws Exception;

    /*统计用户文件*/
    @Select("SELECT COUNT(id) totalrecord FROM file WHERE filepath=#{username}")
    public int countUserFiles(String username) throws Exception;

    @Update("UPDATE FILE SET canshare=#{canshare} WHERE id=#{id}")
    public void updateFileById(int canshare, int id) throws Exception;

    @Delete("DELETE FROM FILE WHERE id=#{value}")
    public void deleteFileById(int id);

    @Select("SELECT file.filename FROM file WHERE id=#{value}")
    public String findFilenameById(int id);

}
