package com.examination.finance.service.impl;

import com.examination.finance.mapper.DataMapper;
import com.examination.finance.entity.GetQuestionListForm;
import com.examination.finance.entity.QuestionDTO;
import com.examination.finance.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    private static final Logger logger = LoggerFactory.getLogger(DataServiceImpl.class);

/*    @Autowired
    private DataMapper dataMapper;*/
@Autowired
private DataMapper dataMapper;

    @Override
    public List<QuestionDTO> getQuestionList(GetQuestionListForm form) {

        List<QuestionDTO> questionDTOList = dataMapper.queryFinanceQuestions();
        return questionDTOList;
    }
}
