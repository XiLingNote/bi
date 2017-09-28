package bi.baiqiu.mapper;

import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo.WareHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareHouseMapper {
    int countByExample(WareHouseExample example);

    int deleteByExample(WareHouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WareHouse record);

    int insertSelective(WareHouse record);

    List<WareHouse> selectByExample(WareHouseExample example);

    WareHouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WareHouse record, @Param("example") WareHouseExample example);

    int updateByExample(@Param("record") WareHouse record, @Param("example") WareHouseExample example);

    int updateByPrimaryKeySelective(WareHouse record);

    int updateByPrimaryKey(WareHouse record);
}