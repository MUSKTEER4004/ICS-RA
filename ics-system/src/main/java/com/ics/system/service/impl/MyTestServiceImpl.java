package com.ics.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ics.system.mapper.MyTestMapper;
import com.ics.system.domain.MyTest;
import com.ics.system.service.IMyTestService;

/**
 * ICS测试类Service业务层处理
 * 
 * @author ics
 * @date 2021-12-20
 */
@Service
public class MyTestServiceImpl implements IMyTestService 
{
    @Autowired
    private MyTestMapper myTestMapper;

    /**
     * 查询ICS测试类
     * 
     * @param id ICS测试类主键
     * @return ICS测试类
     */
    @Override
    public MyTest selectMyTestById(Long id)
    {
        return myTestMapper.selectMyTestById(id);
    }

    /**
     * 查询ICS测试类列表
     * 
     * @param myTest ICS测试类
     * @return ICS测试类
     */
    @Override
    public List<MyTest> selectMyTestList(MyTest myTest)
    {
        return myTestMapper.selectMyTestList(myTest);
    }

    /**
     * 新增ICS测试类
     * 
     * @param myTest ICS测试类
     * @return 结果
     */
    @Override
    public int insertMyTest(MyTest myTest)
    {
        return myTestMapper.insertMyTest(myTest);
    }

    /**
     * 修改ICS测试类
     * 
     * @param myTest ICS测试类
     * @return 结果
     */
    @Override
    public int updateMyTest(MyTest myTest)
    {
        return myTestMapper.updateMyTest(myTest);
    }

    /**
     * 批量删除ICS测试类
     * 
     * @param ids 需要删除的ICS测试类主键
     * @return 结果
     */
    @Override
    public int deleteMyTestByIds(Long[] ids)
    {
        return myTestMapper.deleteMyTestByIds(ids);
    }

    /**
     * 删除ICS测试类信息
     * 
     * @param id ICS测试类主键
     * @return 结果
     */
    @Override
    public int deleteMyTestById(Long id)
    {
        return myTestMapper.deleteMyTestById(id);
    }
}
