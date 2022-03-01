package com.ics.system.service;

import java.util.List;
import com.ics.system.domain.MyTest;

/**
 * ICS测试类Service接口
 * 
 * @author ics
 * @date 2021-12-20
 */
public interface IMyTestService 
{
    /**
     * 查询ICS测试类
     * 
     * @param id ICS测试类主键
     * @return ICS测试类
     */
    public MyTest selectMyTestById(Long id);

    /**
     * 查询ICS测试类列表
     * 
     * @param myTest ICS测试类
     * @return ICS测试类集合
     */
    public List<MyTest> selectMyTestList(MyTest myTest);

    /**
     * 新增ICS测试类
     * 
     * @param myTest ICS测试类
     * @return 结果
     */
    public int insertMyTest(MyTest myTest);

    /**
     * 修改ICS测试类
     * 
     * @param myTest ICS测试类
     * @return 结果
     */
    public int updateMyTest(MyTest myTest);

    /**
     * 批量删除ICS测试类
     * 
     * @param ids 需要删除的ICS测试类主键集合
     * @return 结果
     */
    public int deleteMyTestByIds(Long[] ids);

    /**
     * 删除ICS测试类信息
     * 
     * @param id ICS测试类主键
     * @return 结果
     */
    public int deleteMyTestById(Long id);
}
