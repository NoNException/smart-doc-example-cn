package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 文件上传测试
 * @author yu 2019/10/31.
 */
@RestController
public class FileUploadController {

    /**
     * 上传单个文件
     * @param userId 用户id
     * @param file 文件
     * @return
     */
    @PostMapping("/upload")
    public CommonResult upload(String userId,@RequestParam MultipartFile file) {
        return CommonResult.ok();
    }

    /**
     * 批量上传文件
     * @param file 文件
     * @return
     */
    @PostMapping("/batchUpload")
    public CommonResult batchFileUpload(MultipartFile[] file) {
        return CommonResult.ok();
    }

    /**
     * 批量上传文件2
     * @param files 批量文件
     * @return
     */
    @PostMapping("/batchUpload2")
    public CommonResult batchFileUpload2(CommonsMultipartFile[] files){
        return CommonResult.ok();
    }
}
