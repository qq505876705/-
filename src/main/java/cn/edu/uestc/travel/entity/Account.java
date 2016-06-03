/**   
 * @Title: Account.java    
 * @Package cn.edu.uestc.travel.entity    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月30日 上午11:11:37    
 * @version V1.0   
 */
package cn.edu.uestc.travel.entity;

/**   
 * @ClassName: Account    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月30日 上午11:11:37    
 *         
 */
public class Account {
	private int accountid;
	private String username;
	private String password;
	private String role;
	private String code;
	

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
