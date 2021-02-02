package run.lifeonline.app.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import run.lifeonline.app.annotation.DisableNonSelf;


/**
 * @author HHY
 */

@Aspect
@Slf4j
@Component
public class DisableNonSelfAspect {


    @Pointcut("@annotation(run.lifeonline.app.annotation.DisableNonSelf)")
    public void pointcut(){

    }

    @Around("pointcut() && @annotation(disableNonSelf)")
    public Object around(ProceedingJoinPoint pjp,
                         DisableNonSelf disableNonSelf){
        return null;
    }


}
