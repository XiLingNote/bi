package bi.baiqiu.request;

import java.io.IOException;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * 
 * @ClassName RestServiceUtil
 * @Description TODO
 * @author LiLei
 * @Date 2017年10月10日 下午1:39:16
 * @version 1.0.0
 */
public class RestServiceUtil {
	private static Logger logz = Logger.getLogger(RestServiceUtil.class);

	/**
	 * 调用rest接口
	 * 
	 * @param param
	 *            入参
	 * @param url
	 *            接口地址
	 * @return HttpResponse.getEntity
	 */
	public static String restService(List<NameValuePair> param, String url) {
		// 调用Rest接口
		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
		String smsUrl = url;
		HttpPost httppost = new HttpPost(smsUrl);
		String conResult = "";
		CloseableHttpResponse response = null;
		try {
			// httppost.addHeader("Content-type",
			// "application/x-www-form-urlencoded");
			httppost.setEntity(new UrlEncodedFormEntity(param, "utf-8"));
			response = httpclient.execute(httppost);
			conResult = EntityUtils.toString(response.getEntity(),"utf-8");
			logz.info("^_^" + conResult);
		} catch (ClientProtocolException e) {
			logz.error(e.getMessage());
		} catch (IOException e) {
			logz.error(e.getMessage());
		} finally {
			try {
				httppost.releaseConnection();
				if (httpclient != null)httpclient.close();
				if (response != null)response.close();
			} catch (IOException e) {
				logz.error(e.getMessage());
			}

		}
		return conResult;
	}
}
