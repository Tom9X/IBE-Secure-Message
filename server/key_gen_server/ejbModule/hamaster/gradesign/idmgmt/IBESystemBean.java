package hamaster.gradesign.idmgmt;

import java.util.Map;

import javax.ejb.Remote;

@Remote
public interface IBESystemBean extends CommonDAO {

	void generateDemoSystem();

	/**
	 * 获取IBE系统编号和名称的对应关系
	 * @param page 分页页码 从0开始
	 * @param amount 每一页数量
	 * @return Map对象
	 */
	Map<Integer, String> list(int page, int amount);

	/**
	 * @return 当前所有的系统数量
	 */
	int totalSystems();
}
