package junits;

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Test
@Tag("Sanity")
@DisplayName("Negetive Test case")
public @interface CustomAnnotation {

}
