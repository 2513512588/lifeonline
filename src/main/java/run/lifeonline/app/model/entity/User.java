package run.lifeonline.app.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import run.lifeonline.app.model.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HHY
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("all_user")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;
    @TableField("username")
    private String username;
    @TableField("pwd")
    private String password;
    @TableField("nickname")
    private String nickname;
    @TableField("avatar")
    private String avatar;
    @TableField("email")
    private String email;
    @TableField("phone")
    private String phone;
    @TableField("sex")
    private Short sex;
    @TableField("description")
    private Short description;
    @TableField("is_active")
    private Boolean active;
    @TableField("gmt_create")
    private Date create;
    @TableLogic
    @TableField("is_deleted")
    private Boolean deleted;
    @Version
    @TableField("gmt_modified")
    private Date modified;


}
