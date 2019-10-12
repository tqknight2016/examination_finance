package com.examination.finance.service;

import com.examination.finance.entity.GetQuestionListForm;
import com.examination.finance.entity.QuestionDTO;

import java.util.List;

public interface DataService {
    List<QuestionDTO> getQuestionList(GetQuestionListForm form);
}
