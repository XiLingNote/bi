package bi.baiqiu.datasource;


/**数据库切换
 * 	@author Jared
 *	@time 2017年8月23日上午11:52:22
 */
public class DataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDbType() {
		return ((String) contextHolder.get());
	}

	public static void clearDbType() {
		contextHolder.remove();
	}
}
