package bi.baiqiu.mapper;

import bi.baiqiu.pojo.ShopHistory;
import bi.baiqiu.pojo.ShopHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopHistoryMapper {
    int countByExample(ShopHistoryExample example);

    int deleteByExample(ShopHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopHistory record);

    int insertSelective(ShopHistory record);

    List<ShopHistory> selectByExample(ShopHistoryExample example);

    ShopHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopHistory record, @Param("example") ShopHistoryExample example);

    int updateByExample(@Param("record") ShopHistory record, @Param("example") ShopHistoryExample example);

    int updateByPrimaryKeySelective(ShopHistory record);

    int updateByPrimaryKey(ShopHistory record);
}