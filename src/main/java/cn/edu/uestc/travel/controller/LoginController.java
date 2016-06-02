/**   
 * @Title: LoginController.java    
 * @Package cn.edu.uestc.travel.controller    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年6月2日 上午10:13:20    
 * @version V1.0   
 */
package cn.edu.uestc.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.travel.entity.Account;
import cn.edu.uestc.travel.service.interfaces.AccountService;

/**   
 * @ClassName: LoginController    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年6月2日 上午10:13:20    
 *         
 */
@Controller
public class LoginController {
	@Autowired
	private AccountService accountservice;
	@RequestMapping("/login")
	public String login(HttpServletRequest req,Account account){
		
		accountservice.Login(account);
		
		return "/index";
		
	}
}
