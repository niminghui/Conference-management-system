package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Menu;

public interface MenuMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	int deleteByPrimaryKey(String menuId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	int insert(Menu record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	int insertSelective(Menu record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	Menu selectByPrimaryKey(String menuId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	int updateByPrimaryKeySelective(Menu record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sm_menu
	 * @mbg.generated  Tue Nov 13 15:20:27 CST 2018
	 */
	int updateByPrimaryKey(Menu record);
}