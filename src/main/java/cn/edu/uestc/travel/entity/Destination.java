/**   
 * @Title: Destination.java    
 * @Package cn.edu.uestc.travel.entity    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月30日 上午11:11:59    
 * @version V1.0   
 */
package cn.edu.uestc.travel.entity;

/**   
 * @ClassName: Destination    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月30日 上午11:11:59    
 *         
 */
public class Destination {
	private int desid;
	private String desname;
	private String address;
	private String describle;
	
	public int getDesid() {
		return desid;
	}
	public void setDesid(int desid) {
		this.desid = desid;
	}
	public String getDesname() {
		return desname;
	}
	public void setDesname(String desname) {
		this.desname = desname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
}
