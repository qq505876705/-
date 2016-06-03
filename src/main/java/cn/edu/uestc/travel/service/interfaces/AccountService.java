/**   
 * @Title: AccountService.java    
 * @Package cn.edu.uestc.travel.service.interfaces    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月30日 上午11:27:38    
 * @version V1.0   
 */
package cn.edu.uestc.travel.service.interfaces;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.edu.uestc.travel.entity.Account;

/**   
 * @ClassName: AccountService    
 * @Description: 帐号service借口
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月30日 上午11:27:38    
 *         
 */
public interface AccountService {
	
	/**   
	 * @Title: Login    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param account
	 * @param @param session
	 * @param @param request
	 * @param @return
	 * @param @throws LoginException    设定文件    
	 * @return Account    返回类型    
	 * @throws    
	 */
	Account Login(Account account, HttpSession session, HttpServletRequest request) throws LoginException;

}
