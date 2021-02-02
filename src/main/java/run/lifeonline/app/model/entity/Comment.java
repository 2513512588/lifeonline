package run.lifeonline.app.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author HHY
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("all_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;
    @TableField("related_id")
    private Long relatedId;

}
