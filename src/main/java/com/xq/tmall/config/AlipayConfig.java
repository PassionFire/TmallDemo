package com.xq.tmall.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000117610483";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCMhIQ5vwVTTU353bMJY40AfYXyUfyGbtFsAGzDYQ7Pbo601FrCjxTj8Unuo2Hluq2XR5hhHm/2t30urb1HT368ShxHnRa0XsiOiDYipgJhtjkkgRheniY+9rupffDouQAH4gYGAWl7lQVAOUdSiTDeOA4sKLkKiFBHZ1LuZR90fURRFpTl1jPwIKPNTPOP+79/FEhyI262n3tQ52MYB7KGaO2r9JuqnSo5Lqir+2IQqyE1Tjl71vRElNL06RrmNO2ZzBHWHyOW6J2ebCto0K7IFtDpNH/zG6icsYCOCsFDYT4RsXLrE4YJA/wDyblruVNP8bbvKQYtGDIUnlJcRd0zAgMBAAECggEBAIXOfrcafnC3sWQZSC7NnGx2G0IH7mb5SfUFZoyadOb0SXJKsO6KH4N7tkJHVKbVIA5pf+IjgMy4J712dkJcobuc+tb68K7rfyGy9ZIC8UuooTtwrwsSoCre+w7IPcrut+fJxKCdYZvr6OciZBdlSqKhUGWela5A5elIq8EVjGF4qcTyt2JybQLflKp4kKyZeRumR7iwJ/niTldK3kJz+VeCTWkyKTterhX0D+RqyaGnLFsKfS8aoC0c9K6OdOe6ix11TKmPyKWwYel/vCQpVeKTpcToFl9Vg+45yFEb4cN5s7O7+aih0P+ld+mcl4j6VLPuIhzrFui1oYl/vPYO1XECgYEAymoRKfHe17/6t6ccCd6t1R4+OCtVFeV7SLX3rc+eqKaG4DnVSBGjh73j1HnfI1w6wE5Zb8WkMJCxAju4Xm2Gr9vY+JpVzc0NJM2tkUfR4GvzWjer0/8RM0GG22AX6iieJRhQqB/MPXPpvcc0LpY/3zz5kCnDI7OmGDsuLFEwhfsCgYEAsbedgYrodZp+JOn0b1i/Xl5tOX6hz9CR7qB2BnEQt44+kU5N9zllf2XXf7YAoziSmSY7Vs8xdXbe3WvhrbcjLjUSsDlvIx8ZUiyQOaO+bGK4YHZAOBy784aNNmPrTiJCQxWklgWoW3NBDxyB+pGaADWHvccL0+mqLPwyu+9cuCkCgYA8tJjXMpH5tLr1r2mKUD1kKEDSybQn7/4MbX6NozHbNK5Iuy+LALdBs6KLi81vJm78U8Mg8W5vnkVn/Q8rSr/VKCMnU+od4bxqaEEAzEBWhSmjygR/fQTkkWdnjac+c9YSG/u8oGS5nXThlMfCnQ8k3X2fTdcXcv6CT+VmJyddVwKBgQChwkN3Gfykrs6KwvheMSVevAwm/QBDq9Bop11GV7ujl7GTiPamRHQCFayk7gB+kIu/InF4fnbCOER6vitYdw1qjZxJEr359eCST0WncUduWB0CkB+780uQSbRXAXO4Vq6BaT2538RyGOHq40Pb0pOeBRtcvcQiStk+wP9c2G5IoQKBgQCdhxS8MK4tfsR1lpQ67ILSPuuMFfhXAZrafjjI9m0VTmYG5BY/QogtqeOMVGbUZJmG0EOVuNr+jTVLLuhx14CeXNcBH97knrXN8TQADTZrhPPqYJEHHm34QFVlYrEVxinl6pcLBeLkDM7jPvdboKJsygja2DWWJynwYcKt87d3jg==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj2chTRatd4qcFJobnJTEQ3cNrYY22N+byaQBNiZHZ2hq6sNh3WLJ1K/XJdcVY4tNukr2lw9qS20BNHnAdRCXhZip3T9CHrxBMnzNl4xvYLY7sEisSb+YVT4xr1RKLGOxGUVTNfwQdbPuoYj/XFd629Uw+ewxIcXYXe8iUgwk2gbcdz6Tx3p2PepLBD0Zc19ulwTAD3Mi1bVn2dMYMjw1DilNDqQAHaXk1SeVv8b0U/McCqh/D3r/aWxnf7m1kHJ1Medqi6LBv4wWFtubDu2+6d0cQjyQ1L+vSGHmF5DuQTx/ygBQbCji826IZBzDSolkbDFGQkT2pyYPkwz10dH/uwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8082/tmall/order/completePay";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8082/tmall/order/pay/success";
//	public static String return_url = "http://localhost:8082/tmall/order/completePay";
	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}