package bl.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

import javax.inject.Qualifier;

@Target({FIELD, TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Electronic {

}
