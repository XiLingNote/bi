package bi.baiqiu.pojo;

import java.math.BigDecimal;
/**
 * @version: v1.0.0
 * @author Jared
 * @date  Creat Time : 2017年9月27日 上午9:54:56
 * @Description:事业部电视机大屏幕table显示pojo
 */
public class ShopTvShowTablePojo {
		//当月销售
		private BigDecimal gmv = BigDecimal.ZERO;
		// gmv目标
		private BigDecimal gmvTarget =BigDecimal.ZERO;
		// gmv销售完成率
		private Double gmvRate;
		//当月收账
		private BigDecimal alipay = BigDecimal.ZERO;
		// alipay目标
		private BigDecimal alipayTarget = BigDecimal.ZERO;
		// alipay收账完成率
		private Double alipayRate;
		//昨日销售
		private BigDecimal yesterdaySale= BigDecimal.ZERO;
		//今日销售
		private BigDecimal todaySale= BigDecimal.ZERO;
		
		public BigDecimal getGmv() {
			return gmv;
		}
		public void setGmv(BigDecimal gmv) {
			this.gmv = gmv;
		}
		public BigDecimal getGmvTarget() {
			return gmvTarget;
		}
		public void setGmvTarget(BigDecimal gmvTarget) {
			this.gmvTarget = gmvTarget;
		}
		public Double getGmvRate() {
			return gmvRate;
		}
		public void setGmvRate(Double gmvRate) {
			this.gmvRate = gmvRate;
		}
		public BigDecimal getAlipay() {
			return alipay;
		}
		public void setAlipay(BigDecimal alipay) {
			this.alipay = alipay;
		}
		public BigDecimal getAlipayTarget() {
			return alipayTarget;
		}
		public void setAlipayTarget(BigDecimal alipayTarget) {
			this.alipayTarget = alipayTarget;
		}
		public Double getAlipayRate() {
			return alipayRate;
		}
		public void setAlipayRate(Double alipayRate) {
			this.alipayRate = alipayRate;
		}
		public BigDecimal getYesterdaySale() {
			return yesterdaySale;
		}
		public void setYesterdaySale(BigDecimal yesterdaySale) {
			this.yesterdaySale = yesterdaySale;
		}
		public BigDecimal getTodaySale() {
			return todaySale;
		}
		public void setTodaySale(BigDecimal todaySale) {
			this.todaySale = todaySale;
		}
}
