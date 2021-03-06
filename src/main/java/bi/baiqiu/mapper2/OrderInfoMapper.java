package bi.baiqiu.mapper2;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo2.OrderInfo;
import bi.baiqiu.pojo2.OrderInfoExample;

public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    /**本月发货
     * @param repertory
     * @return
     */
    int queryMonthShipmentAmount(WareHouse wareHouse);
    /**上月发货
     * @param repertory
     * @return
     */
    int queryLastMonthShipmentAmount(WareHouse wareHouse);
    /**总单量
     * @param repertory
     * @return
     */
    int queryTotalSingleAmount(WareHouse wareHouse);
    /**未转单
     * @param repertory
     * @return
     */
    int queryNotTurnAmount(WareHouse wareHouse);
    /**转单数
     * @param repertory
     * @return
     */
    int queryTurnAmount(WareHouse wareHouse);
    /**未打印
     * @param repertory
     * @return
     */
    int queryNotPrintAmount(WareHouse wareHouse);
    /**配货中(已经打印未发货)
     * @param repertory
     * @return
     */
    int queryDistributionAmount(WareHouse wareHouse);
    /**非预售发货量
     * @param repertory
     * @return
     */
    int queryTodayShippedGeneralAmount(WareHouse wareHouse);
    
    /**
     * 
     * @Function: queryTotalStepNotPayAmount 
     * @Description:预售未付尾款单量
     * @param wareHouse
     * @return    
     * @return int 
     * @throws 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------
     * 2017年10月24日      Jared           v1.0.0
     */
    int queryTotalStepNotPayAmount(WareHouse wareHouse);
    
    /**预售发货
     * @param repertory
     * @return
     */
    int queryTodayShippedPresellAmount(WareHouse wareHouse);
    /**总发货
     * @param repertory
     * @return
     */
    int queryTodayShippedAmount(WareHouse wareHouse);
   
    /** 
     * @Function: queryOaShopSaleData 
     * @Description:京东数据未完成使用oa数据库数据
     * @param startDate
     * @param endDate
     * @param sellerNick
     * @return    
     * @return Map<String,BigDecimal> 
     * @throws 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------
     * 2017年10月12日      Jared           v1.0.0              
    */
    Map<String, Object>queryOaShopSaleData(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("sellerNick")Integer sellerNick);
    
    /**未转单京东数据
     * @param repertory
     * @return
     */
    int queryNotTurnAmountJd(WareHouse wareHouse);
    /**总单量京东数据
     * @param repertory
     * @return
     */
    int queryTotalSingleAmountJd(WareHouse wareHouse);
}