package run.lifeonline.app.annotation;

import java.lang.annotation.*;

/**
 * 该注解用于禁止非自身请求进行删改
 * @author HHY
 * @date 2021-02-01
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DisableNonSelf {

    Class<?> value() ;

}
