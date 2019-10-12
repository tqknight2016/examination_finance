package com.examination.finance.mapper;

import com.examination.finance.entity.QuestionDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DataMapper {

    @Select("select * from finance_questions")
    List<QuestionDTO> queryFinanceQuestions();

}
