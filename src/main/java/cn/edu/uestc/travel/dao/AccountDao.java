/**   
 * @Title: AccountDao.java    
 * @Package cn.edu.uestc.travel.dao    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月30日 上午11:09:50    
 * @version V1.0   
 */
package cn.edu.uestc.travel.dao;

import cn.edu.uestc.travel.entity.Account;

/**   
 * @ClassName: AccountDao    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月30日 上午11:09:50    
 *         
 */
public interface AccountDao {
	
	Account findByAccount(Account account);
	
}
