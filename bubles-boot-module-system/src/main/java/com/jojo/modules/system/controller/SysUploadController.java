package com.jojo.modules.system.controller;

import com.jojo.common.api.vo.Result;
import com.jojo.common.util.CommonUtils;
import com.jojo.common.util.MinioUtil;
import com.jojo.common.util.oConvertUtils;
import lombok.extern.slf4j.Slf4j;
import com.jojo.modules.oss.entity.OSSFile;
import com.jojo.modules.oss.service.IOSSFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * minio文件上传示例
 */
@Slf4j
@RestController
@RequestMapping("/sys/upload")
public class SysUploadController {
    @Autowired
    private IOSSFileService ossFileService;

    /**
     * 上传
     * @param request
     */
    @PostMapping(value = "/uploadMinio")
    public Result<?> uploadMinio(HttpServletRequest request) {
        Result<?> result = new Result<>();
        String bizPath = request.getParameter("biz");
        if(oConvertUtils.isEmpty(bizPath)){
            bizPath = "";
        }
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("file");// 获取上传文件对象
        String orgName = file.getOriginalFilename();// 获取文件名
        orgName = CommonUtils.getFileName(orgName);
        String file_url =  MinioUtil.upload(file,bizPath);
        //保存文件信息
        OSSFile minioFile = new OSSFile();
        minioFile.setFileName(orgName);
        minioFile.setUrl(file_url);
        ossFileService.save(minioFile);
        result.setMessage(file_url);
        result.setSuccess(true);
        return result;
    }
}
