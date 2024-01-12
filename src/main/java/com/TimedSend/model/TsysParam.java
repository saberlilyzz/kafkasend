package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统参数表
 * </p>
 *
 * @author gaocheng
 * @since 2023-10-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TSYS_PARAM")
public class TsysParam extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 参数代码
     */
    @TableId("P_CODE")
    private String pCode;

    /**
     * 参数值
     */
    @TableField("P_VALUE")
    private String pValue;

    /**
     * 参数类型
     */
    @TableField("P_TYPE")
    private String pType;

    /**
     * 参数类型名称
     */
    @TableField("P_TYPENAME")
    private String pTypename;

    /**
     * 备注
     */
    @TableField("P_REMARK")
    private String pRemark;


}
