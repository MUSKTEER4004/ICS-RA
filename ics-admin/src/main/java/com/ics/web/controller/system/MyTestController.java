package com.ics.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import ch.qos.logback.core.util.DefaultInvocationGate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ics.common.annotation.Log;
import com.ics.common.core.controller.BaseController;
import com.ics.common.core.domain.AjaxResult;
import com.ics.common.enums.BusinessType;
import com.ics.system.domain.MyTest;
import com.ics.system.service.IMyTestService;
import com.ics.common.utils.poi.ExcelUtil;
import com.ics.common.core.page.TableDataInfo;

/**
 * ICS测试类Controller
 * 
 * @author ics
 * @date 2021-12-20
 */
@RestController
@RequestMapping("/test/test")
public class MyTestController extends BaseController
{
    @Autowired
    private IMyTestService myTestService;

    /**
     * 查询ICS测试类列表
     */
    @PreAuthorize("@ss.hasPermi('test:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(MyTest myTest)
    {
        startPage();
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        return getDataTable(list);
    }

    /**
     * 导出ICS测试类列表
     */
    @PreAuthorize("@ss.hasPermi('test:test:export')")
    @Log(title = "ICS测试类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MyTest myTest)
    {
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        ExcelUtil<MyTest> util = new ExcelUtil<MyTest>(MyTest.class);
        util.exportExcel(response, list, "ICS测试类数据");
    }

    /**
     * 获取ICS测试类详细信息
     */
    @PreAuthorize("@ss.hasPermi('test:test:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(myTestService.selectMyTestById(id));
    }

    /**
     * 新增ICS测试类
     */
    @PreAuthorize("@ss.hasPermi('test:test:add')")
    @Log(title = "ICS测试类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MyTest myTest)
    {
        return toAjax(myTestService.insertMyTest(myTest));
    }

    /**
     * 修改ICS测试类
     */
    @PreAuthorize("@ss.hasPermi('test:test:edit')")
    @Log(title = "ICS测试类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MyTest myTest)
    {
        return toAjax(myTestService.updateMyTest(myTest));
    }

    /**
     * 删除ICS测试类
     */
    @PreAuthorize("@ss.hasPermi('test:test:remove')")
    @Log(title = "ICS测试类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(myTestService.deleteMyTestByIds(ids));
    }

}
