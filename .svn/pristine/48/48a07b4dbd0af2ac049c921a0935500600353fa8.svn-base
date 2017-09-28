package bi.baiqiu.mapper2;

import bi.baiqiu.pojo2.SysItemBean;
import bi.baiqiu.pojo2.SysItemBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysItemBeanMapper {
    int countByExample(SysItemBeanExample example);

    int deleteByExample(SysItemBeanExample example);

    int deleteByPrimaryKey(Long numIid);

    int insert(SysItemBean record);

    int insertSelective(SysItemBean record);

    List<SysItemBean> selectByExampleWithBLOBs(SysItemBeanExample example);

    List<SysItemBean> selectByExample(SysItemBeanExample example);

    SysItemBean selectByPrimaryKey(Long numIid);

    int updateByExampleSelective(@Param("record") SysItemBean record, @Param("example") SysItemBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") SysItemBean record, @Param("example") SysItemBeanExample example);

    int updateByExample(@Param("record") SysItemBean record, @Param("example") SysItemBeanExample example);

    int updateByPrimaryKeySelective(SysItemBean record);

    int updateByPrimaryKeyWithBLOBs(SysItemBean record);

    int updateByPrimaryKey(SysItemBean record);
}