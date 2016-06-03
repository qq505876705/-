/**   
 * @Title: AccountServiceImpl.java    
 * @Package cn.edu.uestc.travel.service.impl    
 * @Description: 帐号service实现类
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月30日 上午11:28:05    
 * @version V1.0   
 */
package cn.edu.uestc.travel.service.impl;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.travel.dao.AccountDao;
import cn.edu.uestc.travel.entity.Account;
import cn.edu.uestc.travel.service.interfaces.AccountService;

/**   
 * @ClassName: AccountServiceImpl    
 * @Description: 帐号service实现类  
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月30日 上午11:28:05    
 *         
 */
@Service
public class AccountServiceImpl implements AccountService{
	/* (非 Javadoc)   
	 * <p>Title: Login</p>    
	 * <p>Description: </p>    
	 * @param account
	 * @return    
	 * @see cn.edu.uestc.travel.service.interfaces.AccountService#Login(cn.edu.uestc.travel.entity.Account)    
	 */
	@Autowired
	private AccountDao accountdao;
	@Override
	public Account Login(Account account,HttpSession session,HttpServletRequest request) throws LoginException {
		// TODO Auto-generated method stub
		Account ac =accountdao.findByAccount(account.getUsername());
		System.out.println(session.getAttribute("code1"));
		
		System.out.println(account.getCode());
		if( ac==null ){
			throw new LoginException("用户名不存在！");
		}else if(!ac.getPassword().equals(account.getPassword())){
			throw new LoginException("密码错误！请重新输入！");
		}else if(!((String) session.getAttribute("code1")).equalsIgnoreCase(account.getCode())){
			throw new LoginException("验证码错误！");
		}else{
			session.setAttribute("user", account.getUsername());
		}
		
		return ac;
	}
}
