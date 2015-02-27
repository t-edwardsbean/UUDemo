package com.jumpinux.test;

/**
 * 开发者赚钱平台:www.uuwise.com
 * 更多函数细节：dll.uuwise.com
 * 
 */

public class Main
{


	public static void main(String[] args) throws Exception
	{
		//________________初始化接口类需要的参数，或者直接写到UUAPI。java文件里面________________
		
		UUAPI.SOFTID = 103837;
		UUAPI.SOFTKEY = "f8171bc5acc0489ea2387aa6469d3442";	//KEY 获取方式：http://dll.uuwise.com/index.php?n=ApiDoc.GetSoftIDandKEY
		UUAPI.DLLVerifyKey = "23C6E062-21DC-4735-AFB1-D96F4BBCE168";//校验API文件是否被篡改，实际上此值不参与传输，关系软件安全，高手请实现复杂的方法来隐藏此值，防止反编译,获取方式也是在后台获取软件ID和KEY一个地方
		
		UUAPI.USERNAME = "LIN2509003147";		//用户帐号和密码(非开发者帐号)，在打码之前，需要先设置好，给用户留一个输入帐号和密码的地方
		UUAPI.PASSWORD = "yq0206";

		boolean status=UUAPI.checkAPI();	//校验API，必须调用一次，校验失败，打码不成功
		
		if(!status){
			System.out.print("API文件校验失败，无法使用打码服务");
			return;
		}
		
		//________________初始化参数结束，上面的操作只需要设置一次________________
		
		
		String picPath	= "img\\v.png";	//测试图片的位置

		//识别开始
		String result[]=UUAPI.easyDecaptcha(picPath, 3005);//picPath是图片路径,1004是codeType,http://www.uuwise.com/price.html
		
		System.out.println("this img codeID:"+result[0]);
		System.out.println("return recongize Result:"+result[1]);

	}

	

}




