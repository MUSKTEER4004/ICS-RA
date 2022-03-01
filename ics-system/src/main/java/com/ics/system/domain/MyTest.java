package com.ics.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ics.common.annotation.Excel;
import com.ics.common.core.domain.BaseEntity;

/**
 * ICS测试类对象 my_test
 * 
 * @author ics
 * @date 2021-12-20
 */
public class MyTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long id;

    /** 网络地址 */
    @Excel(name = "网络地址")
    private String address;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private String type;

    /** 风险值 */
    @Excel(name = "风险值")
    private Long risk;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setRisk(Long risk) 
    {
        this.risk = risk;
    }

    public Long getRisk() 
    {
        return risk;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("address", getAddress())
            .append("name", getName())
            .append("type", getType())
            .append("risk", getRisk())
            .toString();
    }
}
