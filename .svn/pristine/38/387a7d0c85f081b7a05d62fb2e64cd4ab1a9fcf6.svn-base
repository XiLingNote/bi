package bi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class NewTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		String enc = "utf-8";
//		 run1(enc);
		String ss = "asa/安达市多/大时代";
		String decode = URLEncoder.encode(ss, enc);
		System.out.println(decode);

	}

	private static void run1(String enc) throws UnsupportedEncodingException {
		int port = 6379;
		String host = "192.168.0.60";
		Jedis jedis = new Jedis(host, port);
		// Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();

		Set<String> names = jedis.smembers("industryBrand");
		// int i = 0;
		for (String name : names) {
			String encode = URLEncoder.encode(name, "utf-8");
			// i++;
			set.add(encode);
		}
		// return set;

		// System.out.println("+++++++++++++++++++++++");
		//
		// for (String string : set) {
		// if (string.contains("花花")) {
		// System.out.println(string);
		// }
		// }
		// String name = URLEncoder.encode(shopName, "utf-8");
		System.out.println("+++++++++++++++++++++++");
		int j = 0;
		for (String string : set) {
			j++;
			String name2 = URLDecoder.decode(string, enc);
			System.out.println(name2);
		}
	}
}
