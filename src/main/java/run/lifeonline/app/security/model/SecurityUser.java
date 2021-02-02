package run.lifeonline.app.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author HHY
 */
public class SecurityUser extends User {

    private final run.lifeonline.app.model.entity.User user;

    public SecurityUser(run.lifeonline.app.model.entity.User user, Collection<? extends GrantedAuthority> authorities) {
        super(user.getUsername(), user.getPassword(), authorities);
        this.user = user;
    }

    public run.lifeonline.app.model.entity.User getUser() {
        return user;
    }
}
