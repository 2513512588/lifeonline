package run.lifeonline.app.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import run.lifeonline.app.model.BaseRelated;

import java.io.Serializable;

/**
 * @author HHY
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("all_classify_related")
@EqualsAndHashCode(callSuper = true)
public class ClassifyRelated extends BaseRelated<Classify,User> implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;
    @TableField("classify_id")
    private Long classifyId;
    @TableField("related_id")
    private Long relatedId;
    @TableField("related_type")
    private Short relatedType;


}
