package bi.baiqiu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;

import bi.baiqiu.controller.BaseController;
import bi.baiqiu.mapper.ShopBeanMapper;
import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.page.PageHelper;
import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo.WareHouseExample;
import bi.baiqiu.pojo.management.StoreManagerPojo;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ThrowExceptions;
import bi.baiqiu.utils.UtilTool;

@Service
@Transactional
public class ShopBeanServiceImpl {
	@Autowired
	private ShopBeanMapper shopDao;
	@Autowired 
	private WareHouseMapper warehouseDao;
	
	/** 
	 * @Function: queryByPage 
	 * @Description:使用分页插件进行分页查询
	 * @param managerPojo
	 * @param pageNum
	 * @param pageSize
	 * @return    
	 * @return Page<StoreManagerPojo> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月24日      Jared           v1.0.0              
	*/
	@SuppressWarnings("unchecked")
	public Page<StoreManagerPojo> queryByPage(StoreManagerPojo managerPojo,Integer pageNum,Integer pageSize){
	if(pageNum==null)pageNum=0;
	if(pageSize==null)pageSize=Integer.MAX_VALUE;
		PageHelper.startPage(pageNum, pageSize);
		shopDao.queryStoreManagerList(managerPojo);
		return PageHelper.endPage();
	}
	/** 
	 * @Function: SaveOrUpdateStoreMessage 
	 * @Description:店铺管理中店铺添加或者修改
	 * @return    
	 * @return int 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月25日      Jared           v1.0.0              
	*/
	public void saveOrUpdateStoreMessage(StoreManagerPojo store) throws Exception{
		//保存
		ShopBean shop=new ShopBean();
		WareHouse ware=new WareHouse();
		Byte tvState=UtilTool.StringToByte(store.getDepartmentDisplayState());
		Byte tvStatistic=UtilTool.StringToByte(store.getDepartmentStatistic());//是否统计
		 Boolean bo=UtilTool.StringToBoolean(store.getWarehouseDisplayState());
		 Boolean boStatistic=UtilTool.StringToBoolean(store.getWarehouseStatistic());//是否统计
		int shopStatus=0;
		int wareStatus=0;

		 if(StringUtils.isEmpty(store.getShopId())){
			shop.setEx(UtilTool.StringToByte(store.getStoreStatus()));
			shop.setName(store.getStoreShortName());
			shop.setNamePlat(store.getStoreName());
			shop.setScId(store.getDepartmentId());
			shop.setPlatId(store.getPlatId());
			//是否统计是否显示
			shop.setStatistic(tvStatistic);
			shop.setDisplayState(tvState);
			shop.setDisplayName(store.getDepartmentDisplayName());
			shop.setStart(DateUtils.stringToDate(store.getStoreStartDate()));
			shop.setStop(DateUtils.stringToDate(store.getStoreEndDate()));
			shopStatus=shopDao.insertSelective(shop);
		 //统计
		 ware.setFacet(boStatistic);
		//显示
		 ware.setShopName(store.getStoreName());
		 ware.setVisible(bo);
		 ware.setRepertoryName(store.getErpRepertoryName());
		 ware.setShowName(store.getWarehouseDisplayName());
		 ware.setShopId(shop.getId());
		 	wareStatus=warehouseDao.insertSelective(ware);
		}else{
			shop.setId(Integer.valueOf(store.getShopId()));
			shop.setEx(UtilTool.StringToByte(store.getStoreStatus()));
			shop.setName(store.getStoreShortName());
			shop.setNamePlat(store.getStoreName());
			//是否统计是否显示
			shop.setStatistic(tvStatistic);
			shop.setDisplayState(tvState);
			shop.setScId(store.getDepartmentId());
			shop.setPlatId(store.getPlatId());
			shop.setDisplayName(store.getDepartmentDisplayName());
			shop.setStart(DateUtils.stringToDate(store.getStoreStartDate()));
			shop.setStop(DateUtils.stringToDate(store.getStoreEndDate()));
			shopStatus=shopDao.updateByPrimaryKeySelective(shop);
			//统计
			 ware.setFacet(boStatistic);
			//显示
			 ware.setVisible(bo);
			 ware.setRepertoryName(store.getErpRepertoryName());
			 ware.setShowName(store.getWarehouseDisplayName());
			 ware.setShopId(Integer.valueOf(store.getShopId()));
			 WareHouseExample example=new WareHouseExample();
			 example.createCriteria().andShopIdEqualTo(shop.getId().intValue());
			 wareStatus=warehouseDao.updateByExampleSelective(ware, example);
		}
		if(wareStatus==0||shopStatus==0)throw new ThrowExceptions(BaseController.savesErroy);
	}
}
