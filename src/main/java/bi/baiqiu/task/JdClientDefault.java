package bi.baiqiu.task;

import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.internal.parser.Parser;
import com.jd.open.api.sdk.internal.parser.ParserFactory;
import com.jd.open.api.sdk.internal.util.CodecUtil;
import com.jd.open.api.sdk.internal.util.HttpUtil;
import com.jd.open.api.sdk.internal.util.StringUtil;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.request.JdUploadRequest;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**@version: v1.0.0
 * @author Jared
 *@date  Creat Time : 2017年11月15日 上午10:31:20
 * @Description: 京东接口增加超时相应报错
 */
public class JdClientDefault implements JdClient {
	public static final String CHARSET_UTF8 = "UTF-8";
	private static final String JSON_PARAM_KEY = "360buy_param_json";
	private static final String OTHER_PARAM_KEY = "other";
	private String serverUrl;
	private String accessToken;
	private int connectTimeout = 0;
	private int readTimeout = 0;

	private String appKey;

	private String fuzz;

	private String appSecret;

	public JdClientDefault(String serverUrl, String accessToken, String appKey, String appSecret) {
		this.serverUrl = serverUrl;
		this.accessToken = accessToken;
		this.appKey = appKey;
		this.appSecret = appSecret;
	}

	public JdClientDefault(String serverUrl, String accessToken, String appKey, String appSecret, String fuzz) {
		this.serverUrl = serverUrl;
		this.accessToken = accessToken;
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.fuzz = fuzz;
	}

	public JdClientDefault(String serverUrl, String accessToken, String appKey, String appSecret, int connectTimeout,
			int readTimeout) {
		this.serverUrl = serverUrl;
		this.accessToken = accessToken;
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public <T extends AbstractResponse> T execute(JdRequest<T> request) throws JdException {
		try {
			String url = buildUrl(request);

			Map<String, String> params = new HashMap();
			String json = request.getAppJsonParams();
			params.put("360buy_param_json", json);
			if (request.getOtherParams() != null) {
				params.put("other", request.getOtherParams());
			}

			String rsp = null;
			if ((request instanceof JdUploadRequest)) {
				rsp = HttpUtil.doPost(url, params, ((JdUploadRequest) request).getFileParams(), this.connectTimeout,
						this.readTimeout);
			} else {
				rsp = HttpUtil.doPost(url, params, this.connectTimeout, this.readTimeout);
			}

			AbstractResponse resp = parse(rsp, request.getResponseClass());
			StringBuffer sb = new StringBuffer();
			sb.append(url).append("&").append("360buy_param_json").append("=").append(json);

			resp.setUrl(sb.toString());

			return (T) resp;
		} catch (Exception e) {
			e.printStackTrace();
			throw new JdException("出现异常，请重试");
		}
	}

	private <T extends AbstractResponse> String buildUrl(JdRequest<T> request) throws Exception {
		Map<String, String> sysParams = request.getSysParams();

		Map<String, String> pmap = new TreeMap();
		pmap.put("360buy_param_json", request.getAppJsonParams());
		sysParams.put("method", request.getApiMethod());
		sysParams.put("access_token", this.accessToken);
		sysParams.put("app_key", this.appKey);
		if (this.fuzz != null) {
			sysParams.put("jos_result_fuzz", this.fuzz);
		}
		pmap.putAll(sysParams);
		String sign = sign(pmap, this.appSecret);

		sysParams.put("sign", sign);
		StringBuilder sb = new StringBuilder(this.serverUrl);
		sb.append("?");
		sb.append(HttpUtil.buildQuery(sysParams, "UTF-8"));
		return sb.toString();
	}

	private <T extends AbstractResponse> T parse(String rsp, Class<T> responseClass) throws JdException {
		Parser parser;
		if (this.serverUrl.endsWith("json")) {
			parser = ParserFactory.getJsonParser();
		} else {
			parser = ParserFactory.getXmlParser();
		}

		return parser.parse(rsp, responseClass);
	}

	private String sign(Map<String, String> pmap, String appSecret) throws Exception {
		StringBuilder sb = new StringBuilder(appSecret);

		for (Map.Entry<String, String> entry : pmap.entrySet()) {
			String name = (String) entry.getKey();
			String value = (String) entry.getValue();

			if (StringUtil.areNotEmpty(new String[] { name, value })) {
				sb.append(name).append(value);
			}
		}

		sb.append(appSecret);
		String result = CodecUtil.md5(sb.toString());

		return result;
	}
}
