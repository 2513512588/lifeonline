package run.lifeonline.app.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author HHY
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("live_diary")
public class Diary {

    @TableId("id")
    private Long id;
    @TableField("title")
    private String title;
    @TableField("detail")
    private String detail;
    @TableField("user_id")
    private Long userId;
    @TableField("is_recommended")
    private Boolean recommended;
    @TableField("is_deleted")
    private Boolean deleted;
    @TableField("gmt_create")
    private Date create;
    @TableField("gmt_modified")
    private Date modified;

}
