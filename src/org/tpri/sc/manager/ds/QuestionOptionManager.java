package org.tpri.sc.manager.ds;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.tpri.sc.core.ManagerBase;
import org.tpri.sc.core.ObjectRegister;
import org.tpri.sc.core.ObjectType;
import org.tpri.sc.dao.condition.Condition;
import org.tpri.sc.dao.condition.DaoPara;
import org.tpri.sc.dao.condition.Order;
import org.tpri.sc.entity.ds.QuestionOption;

/**
 * 
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B>试题库选项管理类<BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 交通运输部规划研究院（zhaozijing）
 * @since 2017年3月13日
 */
@Repository("QuestionOptionManager")
public class QuestionOptionManager extends ManagerBase {
    static {
        ObjectRegister.registerClass(ObjectType.DS_QUESTION_OPTION, QuestionOption.class);
    }

    /**
     * 
     * <B>方法名称：</B>获取某试题下的选项<BR>
     * <B>概要说明：</B><BR>
     * 
     * @author zhaozijing
     * @since 2017年3月13日
     * @param questionId
     * @return
     */
    public List<QuestionOption> getQuestionOptionByQuestion(String questionId) {
        DaoPara daoPara = new DaoPara();
        daoPara.setClazz(QuestionOption.class);
        daoPara.addCondition(Condition.EQUAL("questionId", questionId));
        daoPara.addOrder(Order.asc("seq"));
        List list = dao.loadList(daoPara);
        return list;
    }

    /**
     * 
     * <B>方法名称：</B>根据ID获取详情<BR>
     * <B>概要说明：</B><BR>
     * 
     * @author zhaozijing
     * @since 2017年3月13日
     * @param id
     * @return
     */
    public QuestionOption getQuestionOptionById(String id) {
        return (QuestionOption) super.load(id, ObjectType.DS_QUESTION_OPTION);
    }

}
