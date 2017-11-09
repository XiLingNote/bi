package bi.baiqiu.request;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.log4j.Logger;
 
 
/**
* 获取MAC地址
* @author
* 2011-12
*/
public class GetMacAddress {
	static Logger logger=Logger.getLogger(GetMacAddress.class);
	public static final String _255 = "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
	public static final Pattern pattern = Pattern.compile("^(?:" + _255 + "\\.){3}" + _255 + "$");
   public static String callCmd(String[] cmd) { 
     String result = ""; 
     String line = ""; 
     try { 
       Process proc = Runtime.getRuntime().exec(cmd); 
       InputStreamReader is = new InputStreamReader(proc.getInputStream()); 
       BufferedReader br = new BufferedReader (is); 
       while ((line = br.readLine ()) != null) { 
       result += line; 
       } 
     } 
     catch(Exception e) { 
       e.printStackTrace(); 
     } 
     return result; 
   }
    
   /** 
   * 
   * @param cmd 第一个命令 
   * @param another 第二个命令 
   * @return  第二个命令的执行结果 
   */
   public static String callCmd(String[] cmd,String[] another) { 
     String result = ""; 
     String line = ""; 
     try { 
       Runtime rt = Runtime.getRuntime(); 
       Process proc = rt.exec(cmd); 
       proc.waitFor(); //已经执行完第一个命令，准备执行第二个命令 
       proc = rt.exec(another); 
       InputStreamReader is = new InputStreamReader(proc.getInputStream()); 
       BufferedReader br = new BufferedReader (is); 
       while ((line = br.readLine ()) != null) { 
         result += line; 
       } 
     } 
     catch(Exception e) { 
       e.printStackTrace(); 
     } 
     return result; 
   }
    
    
    
   /** 
   * 
   * @param ip 目标ip,一般在局域网内 
   * @param sourceString 命令处理的结果字符串 
   * @param macSeparator mac分隔符号 
   * @return mac地址，用上面的分隔符号表示 
   */
   public static String filterMacAddress(final String ip, final String sourceString,final String macSeparator) { 
     String result = ""; 
     String regExp = "((([0-9,A-F,a-f]{1,2}" + macSeparator + "){1,5})[0-9,A-F,a-f]{1,2})"; 
     Pattern pattern = Pattern.compile(regExp); 
     Matcher matcher = pattern.matcher(sourceString); 
     while(matcher.find()){ 
       result = matcher.group(1); 
       if(sourceString.indexOf(ip) <= sourceString.lastIndexOf(matcher.group(1))) { 
         break; //如果有多个IP,只匹配本IP对应的Mac. 
       } 
     }
   
     return result; 
   }
    
    
    
   /** 
   * 
   * @param ip 目标ip 
   * @return  Mac Address 
   * 
   */
   public static String getMacInWindows(final String ip){ 
     String result = ""; 
     String[] cmd = { 
         "cmd", 
         "/c", 
         "ping " + ip 
         }; 
     String[] another = { 
         "cmd", 
         "/c", 
         "arp -a"
         }; 
   
     String cmdResult = callCmd(cmd,another); 
     result = filterMacAddress(ip,cmdResult,"-"); 
   
     return result; 
   } 
 
   /** 
   * @param ip 目标ip 
   * @return  Mac Address 
   * 
   */
   public static String getMacInLinux(final String ip){ 
     String result = ""; 
     String[] cmd = { 
         "/bin/sh", 
         "-c", 
         "ping " + ip + " -c 2 && arp -a"
         }; 
     String cmdResult = callCmd(cmd); 
     result = filterMacAddress(ip,cmdResult,":"); 
   
     return result; 
   } 
    
   /**
   * 获取MAC地址 
   * @return 返回MAC地址
   */
   public static String getMacAddress(String ip){
     String macAddress = "";
     macAddress = getMacInWindows(ip).trim();
     if(macAddress==null||"".equals(macAddress)){
       macAddress = getMacInLinux(ip).trim();
     }
     return macAddress;
   }
   public static String getIpAddress(HttpServletRequest request) {  
       String ip = request.getHeader("x-forwarded-for");  
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           ip = request.getHeader("Proxy-Client-IP");  
       }  
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           ip = request.getHeader("WL-Proxy-Client-IP");  
       }  
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           ip = request.getHeader("HTTP_CLIENT_IP");  
       }  
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
       }  
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           ip = request.getRemoteAddr();  
       }  
       return ip;  
   }  
   public final static String getIpAddress2(HttpServletRequest request)   {  
       // 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址  
 
       String ip = request.getHeader("X-Forwarded-For");  
       if (logger.isInfoEnabled()) {  
           logger.info("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);  
       }  
 
       if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
               ip = request.getHeader("Proxy-Client-IP");  
               if (logger.isInfoEnabled()) {  
                   logger.info("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);  
               }  
           }  
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
               ip = request.getHeader("WL-Proxy-Client-IP");  
               if (logger.isInfoEnabled()) {  
                   logger.info("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);  
               }  
           }  
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
               ip = request.getHeader("HTTP_CLIENT_IP");  
               if (logger.isInfoEnabled()) {  
                   logger.info("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" + ip);  
               }  
           }  
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
               ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
               if (logger.isInfoEnabled()) {  
                   logger.info("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);  
               }  
           }  
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
               ip = request.getRemoteAddr();  
               if (logger.isInfoEnabled()) {  
                   logger.info("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);  
               }  
           }  
       } else if (ip.length() > 15) {  
           String[] ips = ip.split(",");  
           for (int index = 0; index < ips.length; index++) {  
               String strIp = (String) ips[index];  
               if (!("unknown".equalsIgnoreCase(strIp))) {  
                   ip = strIp;  
                   break;  
               }  
           }  
       }  
       return ip;  
   }  
   public static String getIpAddressByRequest(HttpServletRequest request) {  
	   String ip2=getIpAddress2(request);
	   String ip=getIpAddress( request);
	   String ip3=getIpFromRequest(request);
	   
	   String mac=getMacAddress(ip);
	   String mac2=getMacAddress(ip2);
	   String mac3=getMacAddress(ip3);

	   logger.info("===========获取mac地址===================");
	   logger.info("ip:"+ip);
	   logger.info("mac:"+mac);
	   logger.info("ip2:"+ip2);
	   logger.info("mac2:"+mac2);
	   logger.info("ip3:"+ip3);
	   logger.info("mac3:"+mac3);
	   logger.info("==============================");
	   return mac;
   }


		public static String longToIpV4(long longIp) {
			int octet3 = (int) ((longIp >> 24) % 256);
			int octet2 = (int) ((longIp >> 16) % 256);
			int octet1 = (int) ((longIp >> 8) % 256);
			int octet0 = (int) ((longIp) % 256);
			return octet3 + "." + octet2 + "." + octet1 + "." + octet0;
		}

		public static long ipV4ToLong(String ip) {
			String[] octets = ip.split("\\.");
			return (Long.parseLong(octets[0]) << 24) + (Integer.parseInt(octets[1]) << 16)
					+ (Integer.parseInt(octets[2]) << 8) + Integer.parseInt(octets[3]);
		}

		public static boolean isIPv4Private(String ip) {
			long longIp = ipV4ToLong(ip);
			return (longIp >= ipV4ToLong("10.0.0.0") && longIp <= ipV4ToLong("10.255.255.255"))
					|| (longIp >= ipV4ToLong("172.16.0.0") && longIp <= ipV4ToLong("172.31.255.255"))
					|| longIp >= ipV4ToLong("192.168.0.0") && longIp <= ipV4ToLong("192.168.255.255");
		}

		public static boolean isIPv4Valid(String ip) {
			return pattern.matcher(ip).matches();
		}

		public static String getIpFromRequest(HttpServletRequest request) {
			String ip;
			boolean found = false;
			if ((ip = request.getHeader("x-forwarded-for")) != null) {
				StrTokenizer tokenizer = new StrTokenizer(ip, ",");
				while (tokenizer.hasNext()) {
					ip = tokenizer.nextToken().trim();
					if (isIPv4Valid(ip) && !isIPv4Private(ip)) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				ip = request.getRemoteAddr();
			}
			return ip;
		}

   
   //做个测试
   public static void main(String[] args) {      
     System.out.println(getMacAddress("101.37.17.224"));
   }
   
   
}