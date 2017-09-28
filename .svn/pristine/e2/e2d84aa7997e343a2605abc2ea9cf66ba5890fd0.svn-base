package bi.baiqiu.mapper;

import bi.baiqiu.pojo.BiTradeGoods;
import bi.baiqiu.pojo.BiTradeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.taobao.api.domain.Order;
@Repository
public interface BiTradeGoodsMapper {
    int countByExample(BiTradeGoodsExample example);

    int deleteByExample(BiTradeGoodsExample example);

    int insertBys(Order record);
    
    int insertBys2017(Order record);
    
    int insertBysBefore2017(Order record);
    
    int insert(BiTradeGoods record);

    int insertSelective(BiTradeGoods record);

    List<BiTradeGoods> selectByExample(BiTradeGoodsExample example);

    int updateByExampleSelective(@Param("record") BiTradeGoods record, @Param("example") BiTradeGoodsExample example);

    int updateByExample(@Param("record") BiTradeGoods record, @Param("example") BiTradeGoodsExample example);
    
    /**创建临时表
     * @return
     */
    int createTempTable();
    
    /**插入临时表数据
     * @param trade
     * @return
     */
    int insertTempTableBys(Order trade);
    
    /**临时表数据转入正式表
     * @return
     */
    int getDateFromTempTable();
}