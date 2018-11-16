/**
 * Project Name:scb.sms
 * File Name:IPositionService.java
 * Package Name:scb.dev.sms.sm.service
 * Date:2018年11月16日上午11:00:01
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service;


import javafx.geometry.Pos;
import scb.dev.sms.sm.pojo.Position;

import java.util.List;

/**
 * ClassName: IPositionService <br/>
 *
 * @author Zither.Chen
 * @version V1.0
 * @Description: 职员业务接口.
 * @Date: 2018/11/16 11:06 <br/>
 * @since JDK 1.8
 */
public interface IPositionService {
    /**
     * 用于删除职位信息，涉及级联删除，删除职位的同时会删除相关职位的员工信息
     * @param positionId 删除职位的主键
     * @return 返回删除结果；若返回true，表示删除成功；否则表示删除失败。
     */
   public String  removePosition(String positionId);

    /**
     * 添加新的职位信息
     * @param position 职位信息对象
     * @return 返回添加的结果，若返回true,表示添加成功
     */
   public String insertPosition(Position position);

    /**
     * 修改某职位信息
     * @param position 修改的职位信息
     * @return 
     */
   public String changePosition(Position position);

    /**
     * 获取所有职位名称
     * @return 
     */
   public String queryAllPosition();
}