package run.lifeonline.app.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import run.lifeonline.app.mapper.UserMapper;
import run.lifeonline.app.model.entity.User;
import run.lifeonline.app.security.model.SecurityUser;
import run.lifeonline.app.service.UserService;

/**
 * @author HHY
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService , UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", s);
        User user = baseMapper.selectOne(wrapper);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在!");
        }
        return new SecurityUser(user,null);
    }
}
