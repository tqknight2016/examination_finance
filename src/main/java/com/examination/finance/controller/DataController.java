package com.examination.finance.controller;

import com.examination.finance.entity.BaseDataVO;
import com.examination.finance.entity.GetQuestionListForm;
import com.examination.finance.entity.QuestionDTO;
import com.examination.finance.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private static final Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/data/getQuestionList")
    public BaseDataVO getQuestionList(@RequestBody GetQuestionListForm form){
        BaseDataVO result = new BaseDataVO();
        try {
            List<QuestionDTO> list = dataService.getQuestionList(form);
            logger.debug("getQuestionList param:[{}]; data:[{}]",form,list);
            result.setData(list);
        }catch (Exception e) {
            logger.error("getQuestionList error ! param:[{}]",form,e);
            result.setCode(BaseDataVO.ERROR);
            result.setMsg("查询出错:"+e.getMessage());
        }finally {
            return result;
        }

    }

    @RequestMapping(value = "/data/getAllQuestionList")
    public BaseDataVO getAllQuestionList(){
        BaseDataVO result = new BaseDataVO();
        try {
            List<QuestionDTO> list = dataService.getQuestionList(null);
            logger.debug("getQuestionList param:[{}]; data:[{}]",null,list);
            result.setData(list);
        }catch (Exception e) {
            logger.error("getQuestionList error ! param:[{}]",null,e);
            result.setCode(BaseDataVO.ERROR);
            result.setMsg("查询出错:"+e.getMessage());
        }finally {
            return result;
        }

    }
}
