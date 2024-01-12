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
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2022-10-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TIGW_DICT")
public class TtrdTigwDict extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("SRC_FIELD")
    private String srcField;

    @TableField("DST_FIELD")
    private String dstField;

    @TableField("SRC_VALUE")
    private String srcValue;

    @TableField("DST_VALUE")
    private String dstValue;


}
