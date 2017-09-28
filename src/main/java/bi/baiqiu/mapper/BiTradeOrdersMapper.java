package bi.baiqiu.mapper;

import bi.baiqiu.pojo.BiTradeOrders;
import bi.baiqiu.pojo.BiTradeOrdersExample;
import bi.baiqiu.pojo.test.TradeTemplate;

import java.util.List;
import org.apache.ibatis.annotations.Param;



public interface BiTradeOrdersMapper {
    int countByExample(BiTradeOrdersExample example);

    int deleteByExample(BiTradeOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiTradeOrders record);
    
    int insertBys(TradeTemplate trade);
    
    int insertBys2017(TradeTemplate trade);
    
    int insertBysBefore2017(TradeTemplate trade);

    int insertSelective(BiTradeOrders record);

    List<BiTradeOrders> selectByExample(BiTradeOrdersExample example);

    BiTradeOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiTradeOrders record, @Param("example") BiTradeOrdersExample example);

    int updateByExample(@Param("record") BiTradeOrders record, @Param("example") BiTradeOrdersExample example);

    int updateByPrimaryKeySelective(BiTradeOrders record);

    int updateByPrimaryKey(BiTradeOrders record);
    
    /**创建临时表
     * @return
     */
    int createTempTable();
    
    /**插入临时表数据
     * @param trade
     * @return
     */
    int insertTempTableBys(TradeTemplate trade);
    
    /**临时表数据转入正式表
     * @return
     */
    int getDateFromTempTable();
    
    /**测试临时表的数据条数
     * @return
     */
    int getTempCount();
}