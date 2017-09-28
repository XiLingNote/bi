package bi.baiqiu.mapper2;

import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo2.SysTradeBean;
import bi.baiqiu.pojo2.SysTradeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 	@author Jared
 *	@time 2017年8月22日上午9:21:14
 */
public interface SysTradeBeanMapper {
	
	List<SysTradeBean> selectByPage(Page<SysTradeBean> bean);
	
	/**根据日期分页查询
	 * @param startDate
	 * @param endDate
	 * @param pageNum:开始条数 0为第一条
	 * @param pageSize：查询条数 
	 * @return
	 */
	List<SysTradeBean> selectByModifyToPage(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

    int countByExample(SysTradeBeanExample example);

    int deleteByExample(SysTradeBeanExample example);

    int deleteByPrimaryKey(Long tid);
    
    int selectDateCount(SysTradeBean record);

    int insert(SysTradeBean record);

    int insertSelective(SysTradeBean record);

    List<SysTradeBean> selectByExampleWithBLOBs(SysTradeBeanExample example);

    List<SysTradeBean> selectByExample(SysTradeBeanExample example);

    SysTradeBean selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") SysTradeBean record, @Param("example") SysTradeBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") SysTradeBean record, @Param("example") SysTradeBeanExample example);

    int updateByExample(@Param("record") SysTradeBean record, @Param("example") SysTradeBeanExample example);

    int updateByPrimaryKeySelective(SysTradeBean record);

    int updateByPrimaryKeyWithBLOBs(SysTradeBean record);

    int updateByPrimaryKey(SysTradeBean record);
}