package bl.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.PARAMETER;;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD, TYPE, PARAMETER})
@Qualifier
public @interface MySqlConnection {

}
