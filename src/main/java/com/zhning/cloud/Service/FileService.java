package com.zhning.cloud.Service;

import com.zhning.cloud.Mapper.FileMapper;
import com.zhning.cloud.Model.File;
import com.zhning.cloud.Model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.util.List;

@Service(value="fileService")
public class FileService {

	@Autowired
	private FileMapper dao;

	public  List<File> getAllFiles(Page page) throws Exception{
        page.setSearchcontent( "%"+page.getSearchcontent()+"%");
		return dao.getAllFiles(page);
	}
//
	public  int countShareFiles(String searchcontent)throws Exception{
	    searchcontent = "%"+searchcontent+"%";
		return dao.count(searchcontent);
	}
//
	public  String findFilepathById(int id) throws Exception{
		return dao.findFilepathById(id);
	}
//
	public  Integer insertFile(File file) throws Exception{
		return dao.insertFile(file);
	}

	public  List<File> getUserFiles(Page page) throws Exception {
		return dao.getUserFiles(page);
	}
//
	public  int countUserFiles(String username) throws Exception {
		return dao.countUserFiles(username);

	}
	public boolean copyFile(String file,String path){
		try {
			Files.copy(new java.io.File(file).toPath(), new java.io.File(path).toPath());
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
//
	public  void updateFileById(int canshare,int id) throws Exception{
		 dao.updateFileById(canshare,id);
	}
//
	public  void deleteFileById(int id) {
		dao.deleteFileById(id);
	}

	public  String findFilenameById(int id) {
		return dao.findFilenameById(id);
	}

}
