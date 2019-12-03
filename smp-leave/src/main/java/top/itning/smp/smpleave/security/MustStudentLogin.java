package top.itning.smp.smpleave.security;

import java.lang.annotation.*;

/**
 * @author itning
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@MustLogin(role = MustLogin.ROLE.STUDENT)
public @interface MustStudentLogin {
}
