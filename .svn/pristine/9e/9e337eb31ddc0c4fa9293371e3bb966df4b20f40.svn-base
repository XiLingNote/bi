package bi.baiqiu.controller;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.alibaba.druid.pool.DruidDataSource;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.PcFlowStructureBean;
import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.impl.PcFlowStructureServiceImpl;
import bi.baiqiu.service.impl.TableTitleServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ExcelException;
import bi.baiqiu.utils.ImportExcelUtils;
import bi.baiqiu.utils.UtilTool;

/**
 * pc流量结构控制层
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("pcFlowStructure")
public class PcFlowStructureController extends BaseController {
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private PcFlowStructureServiceImpl pcFlowStructureServiceImpl;
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private TableTitleServiceImpl tableTitleServiceImpl;

	public static int num;

	@Autowired
	@Qualifier("dataSource")
	DruidDataSource dataSource;

	// @Autowired
	// private SysTradeBeanMapper sysDao;
	public synchronized static int getNum() {
		return num;
	}

	public synchronized static void setNum(int num) {
		PcFlowStructureController.num = num;
	}

	/**
	 * 删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "deletePcFlowStructure.do")
	public void deletePcFlowStructure(PcFlowStructureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		try {
			WriteObject(response, deleteSuccess + pcFlowStructureServiceImpl.deletePcFlowStructure(bean, user));
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteSuccess);
		}
	}

	/**
	 * 分页查询
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "queryPcFlowStructureByPage.do")
	public void queryByPage(PcFlowStructureBean bean, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		User user = getLoginUser();
		try {
			response.setCharacterEncoding("utf-8");
			bean.setShopId(user.getShopId().toString());
			Gson gson = new GsonBuilder().serializeNulls().create();
			Page<PcFlowStructureBean> page = pcFlowStructureServiceImpl.queryByPage(bean, pageNum, pageSize);
			String json = "{\"total\":" + page.getTotal() + ",\"rows\":" + gson.toJson(page.getResult()) + "}";
			response.getWriter().print(json);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, systemErroy);
		}
	}

	/**
	 * 更新
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "updatePcFlowStructure.do")
	public void updatePcFlowStructure(PcFlowStructureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			WriteObject(response, saveSuccess + pcFlowStructureServiceImpl.updatePcFlowStructure(bean));
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, savesErroy);
		}
	}

	/**
	 * 批量删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "deletePcFlowStructureByBatch.do")
	public void deletePcFlowStructureByBatchList(@RequestParam(value = "idArray[]") int[] idArray,
			HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		PcFlowStructureBean bean = new PcFlowStructureBean();
		try {
			bean.setIdArray(idArray);
			// 不可删除两月前的数据
			bean.setDeleteHistory(user.isHasDeleteHistoryAuthority());
			int a = pcFlowStructureServiceImpl.deletePcFlowStructureByBatchList(bean);
			WriteObject(response, deleteSuccess + a);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * pc流量结构上传
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "uploadPcFlowStructure.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void uploadPcFlowStructure(HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		// 上传文件用
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in = null;
		List<List<Object>> listob = null;
		// MultipartFile file = multipartRequest.getFile("upfile"); jquery 提交的文件
		MultipartFile file = multipartRequest.getFile("txt_file");// bootstrap获取流的方式
		try {
			if (file == null || file.isEmpty()) {
				throw new Exception("文件不存在！");
			}
			List<TableTitleBean> titleList = tableTitleServiceImpl.queryTableTitle("pcFlowStructure");
			List<PcFlowStructureBean> pcFlowStructures;
			in = file.getInputStream();
			listob = new ImportExcelUtils().getBankListByExcel(in, file.getOriginalFilename(), titleList);
			pcFlowStructures = new ArrayList<PcFlowStructureBean>();
			StringBuffer noAuthorityMsg = new StringBuffer(noDeleteHistoryAuthority);
			StringBuffer errorFormatMsg = new StringBuffer("");
			for (int i = 0; i < listob.size(); i++) {
				List<Object> lo = listob.get(i);
				String checkMsg=checkData(titleList,lo,i+2);
				if (lo.size() > 0 &&checkMsg.equals("")) {
					//不填数据防止空指针
					lo=addNull(lo, (28-lo.size()));
					
					PcFlowStructureBean pcFlowBean = new PcFlowStructureBean(String.valueOf(lo.get(0)),
							UtilTool.convertToString(String.valueOf(lo.get(1))), UtilTool.convertToString(String.valueOf(lo.get(2))), String.valueOf(lo.get(3)),
							String.valueOf(lo.get(4)), String.valueOf(lo.get(5)), String.valueOf(lo.get(6)),
							String.valueOf(lo.get(7)), String.valueOf(lo.get(8)), String.valueOf(lo.get(9)),
							String.valueOf(lo.get(10)), String.valueOf(lo.get(11)), String.valueOf(lo.get(12)),
							String.valueOf(lo.get(13)), String.valueOf(lo.get(14)), String.valueOf(lo.get(15)),
							String.valueOf(lo.get(16)), String.valueOf(lo.get(17)), String.valueOf(lo.get(18)),
							String.valueOf(lo.get(19)), String.valueOf(lo.get(20)), String.valueOf(lo.get(21)),
							String.valueOf(lo.get(22)), String.valueOf(lo.get(23)), String.valueOf(lo.get(24)),
							String.valueOf(lo.get(25)), String.valueOf(lo.get(26)), String.valueOf(lo.get(27)),
							Double.valueOf(
									String.valueOf(lo.get(28)).equals(null) || String.valueOf(lo.get(28)).equals("")
											? "0"
											: String.valueOf(lo.get(28))),
							user.getShopId().toString());
					if (!user.isHasDeleteHistoryAuthority() && DateUtils.compareMonthsAgo(String.valueOf(lo.get(0)))) {
						noAuthorityMsg = noAuthorityMsg.append(" ");
						noAuthorityMsg = noAuthorityMsg.append((i + 2));

					} else {
						pcFlowStructures.add(pcFlowBean);
					}
				} else {
					errorFormatMsg.append(checkMsg);
				}
				lo.clear();
			}
			// 错误提示信息空时将错误信息为空
			if (noAuthorityMsg.toString().equals(noDeleteHistoryAuthority)) {
				noAuthorityMsg.delete(0, noAuthorityMsg.length());
			}
			if (!errorFormatMsg.toString().equals("")) {
				WriteObject(response, errorFormatMsg);
			} else if (pcFlowStructures.size() > 0) {
				WriteObject(response, pcFlowStructureServiceImpl.insertByBatchLarge(pcFlowStructures) + noAuthorityMsg);
			} else {
				WriteObject(response, noData+noAuthorityMsg);
			}
		} catch (ExcelException excele) {
			excele.printStackTrace();
			WriteObject(response, excele.getMessage());
		} catch (Exception e) {
			WriteObject(response, savesErroy);
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
/*	@RequestMapping(value = "test_his.do")
	public String test_his(String startDate, String endDate, HttpServletRequest request, HttpServletResponse response) {
		try {
			// test();
			Date d5 = new Date();
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 1);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				log.info(startDate + "-" + startAdd);

				if (DateUtils.stringToDate(startDate).compareTo(DateUtils.stringToDate("2017-01-01")) >= 0) {
					test2017(startDate, startAdd);
				} else {
					test22(startDate, startAdd);
				}
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test1_3.do")
	public String test1_3(HttpServletRequest request, HttpServletResponse response) {
		try {

			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-01-01";
			String endDate = "2017-03-01";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test2.do")
	public String test2(HttpServletRequest request, HttpServletResponse response) {
		try {

			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-03-01";
			String endDate = "2017-05-01";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test5_6.do")
	public String test5_6(HttpServletRequest request, HttpServletResponse response) {
		try {

			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-05-01";
			String endDate = "2017-06-01";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test6_621.do")
	public String test6_621(HttpServletRequest request, HttpServletResponse response) {
		try {

			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-06-01";
			String endDate = "2017-06-21";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test621_7.do")
	public String test621_7(HttpServletRequest request, HttpServletResponse response) {
		try {

			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-06-21";
			String endDate = "2017-07-01";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}

	@Transactional
	@RequestMapping(value = "test7_8.do")
	public String test7_8(HttpServletRequest request, HttpServletResponse response) {
		try {
			Date d1 = new Date();
			// test();
			Date d2 = new Date();
			log.info("-----test Thread------runTime---------------------" + (d2.getTime() - d1.getTime()));
			Date d3 = new Date();
			String startDate = "2017-07-01";
			String endDate = "2017-08-01";
			String startAdd = startDate;
			PcFlowStructureController.num = 0;
			do {
				startDate = startAdd;
				startAdd = DateUtils.stringDateAddDay(startAdd, 3);
				// test222(startDate, startAdd);
				startAdd = DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) >= 0 ? endDate
						: startAdd;
				test22(startDate, startAdd);
				Thread.sleep(2000);
			} while (DateUtils.stringToDate(startAdd).compareTo(DateUtils.stringToDate(endDate)) != 0);
			Date d4 = new Date();
			log.error("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));

			log.info("-----test2 Thread------runTime---------------------" + (d3.getTime() - d4.getTime()));
			Date d5 = new Date();

			Date d6 = new Date();
			log.info("-----test3 Thread------runTime---------------------" + (d6.getTime() - d5.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
		return "redirect:/page/showlogin.do";
	}*/

	/*public void test22(String startDate, String endDate) throws InterruptedException {
		SqlSession session3 = sqlSessionTemplateSys.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);

		SysTradeBean bean = new SysTradeBean();
		bean.setStartDate(startDate);
		bean.setEndDate(endDate);
		int count = 100;
		try {
			// 总记录数使用真实数据
			SysTradeBeanMapper sysMapper = session3.getMapper(SysTradeBeanMapper.class);
			count = sysMapper.selectDateCount(bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session3.close();
		}
		GetDateTread gd = new GetDateTread(startDate, endDate, 0, count, sqlSessionTemplate, sqlSessionTemplateSys,
				new DataSourceTransactionManager(dataSource), dataSource);
		log.info("拉取：" + startDate + "--" + endDate + "的" + count + "条数据");
		RunGetDateTreadPagingSave ru = gd.new RunGetDateTreadPagingSave();
		taskExecutor.execute(ru);
		Thread.sleep(10);
	}

	*//**
	 * 2017多线程启动
	 * 
	 * @param startDate
	 * @param endDate
	 * @throws InterruptedException
	 *//*
	public void test2017(String startDate, String endDate) throws InterruptedException {
		SqlSession session3 = sqlSessionTemplateSys.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);

		SysTradeBean bean = new SysTradeBean();
		bean.setStartDate(startDate);
		bean.setEndDate(endDate);
		int count = 100;
		try {
			// 总记录数使用真实数据
			SysTradeBeanMapper sysMapper = session3.getMapper(SysTradeBeanMapper.class);
			count = sysMapper.selectDateCount(bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session3.close();
		}
		GetDateTread gd = new GetDateTread(startDate, endDate, 0, count, sqlSessionTemplate, sqlSessionTemplateSys,
				new DataSourceTransactionManager(dataSource), dataSource);
		log.info("2017:拉取：" + startDate + "--" + endDate + "的" + count + "条数据");
		RunGetDateTreadPagingSave2017 ru = gd.new RunGetDateTreadPagingSave2017();
		taskExecutor.execute(ru);
		Thread.sleep(10);
	}*/
}