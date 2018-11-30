package com.ezhomesixgod.core.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


/**
 * @author ZhouXiaoBing
 * @date 2018年8月31日 上午8:41:02
 * @version 1.0
 */
@SuppressWarnings("restriction")
public class DESUtils {

	//算法名称
	public static final String KEY_ALGORITHM = "DES";
	//算法名称/加密模式/填充方式
	//DES共有四种工作模式-->>ECB：电子密码本模式、CBC：加密分组链接模式、CFB：加密反馈模式、OFB：输出反馈模式
	//public static final String CIPHER_ALGORITHM = "DES/ECB/NoPadding";
	public static final String CIPHER_ALGORITHM = "DES/ECB/PKCS5Padding";
	//KEY
	//public static final String KEY = "A1B2C3D4E5F60708";
	public static final String KEY = "A1B2C3D4E5F60708";
	/**
	 * 加密数据
	 * @param data 待加密数据
	 * @param key 密钥
	 * @return 加密后的数据
	 */
    /*public static String encrypt(String data, String key) throws Exception {
        Key deskey = keyGenerator(key);*/
	public static String encrypt(String data) {
		Key deskey = null;
		try {
			deskey = keyGenerator(KEY);

			// 实例化Cipher对象，它用于完成实际的加密操作
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			SecureRandom random = new SecureRandom();
			// 初始化Cipher对象，设置为加密模式
			cipher.init(Cipher.ENCRYPT_MODE, deskey, random);
			byte[] results = cipher.doFinal(data.getBytes("utf-8"));
			return Base64.encodeBase64String(results);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 执行加密操作。加密后的结果通常都会用Base64编码进行传输
		return null;
	}

	/**
	 * 解密数据
	 * @param data 待解密数据
	 * @param key 密钥
	 * @return 解密后的数据
	 */
    /*public static String decrypt(String data, String key) throws Exception {
    	Key deskey = keyGenerator(key);*/
	public static String decrypt(String data) {

		try{
			Key deskey = keyGenerator(KEY);
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			//初始化Cipher对象，设置为解密模式
			cipher.init(Cipher.DECRYPT_MODE, deskey);
			// 执行解密操作
			return new String(cipher.doFinal(Base64.decodeBase64(data)));
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * 生成密钥key对象
	 * @param KeyStr 密钥字符串
	 * @return 密钥对象
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 * @throws Exception
	 */
	private static SecretKey keyGenerator(String keyStr) throws Exception {
		//byte input[] = hexString2Bytes(keyStr);
		byte input[] = keyStr.getBytes();
		DESKeySpec desKey = new DESKeySpec(input);
		//创建一个密匙工厂，然后用它把DESKeySpec转换成SecretKey
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(desKey);
		return securekey;
	}

	// 从十六进制字符串到字节数组转换
	public static byte[] hexString2Bytes(String hexstr) {
		byte[] b = new byte[hexstr.length() / 2];
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			char c0 = hexstr.charAt(j++);
			char c1 = hexstr.charAt(j++);
			b[i] = (byte) ((parse(c0) << 4) | parse(c1));
		}
		return b;
	}

	private static int parse(char c) {
		if (c >= 'a') return (c - 'a' + 10) & 0x0f;
		if (c >= 'A') return (c - 'A' + 10) & 0x0f;
		return (c - '0') & 0x0f;
	}
	public static void main(String[] args) throws Exception {
		System.out.println("正在加密....");
		String encryptString = DESUtils.encrypt("root");
		String encryptString2 = DESUtils.encrypt("testdb2018!@#$%^^");
		String encryptString3 = DESUtils.encrypt("jdbc:mysql://gz-cdb-jm6bdf98.sql.tencentcdb.com:63946/db_aqp?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8");
		String encryptString4 = DESUtils.encrypt("com.mysql.jdbc.Driver");
		System.out.println("加密完成,输出加密结果:");
		System.out.println("地址:" + encryptString3);
		System.out.println("帐号:" + encryptString);
		System.out.println("密码:" + encryptString2);
		System.out.println("驱动:" + encryptString4);
		System.out.println("正在解密...");
		System.out.println("地址:" + DESUtils.decrypt(encryptString3));
		System.out.println("帐号:" + DESUtils.decrypt(encryptString));
		System.out.println("密码:" + DESUtils.decrypt(encryptString2));
		System.out.println("驱动:" + DESUtils.decrypt(encryptString4));

	}
}
