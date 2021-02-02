package run.lifeonline.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import run.lifeonline.app.model.entity.User;

/**
 * @author HHY
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {



}
