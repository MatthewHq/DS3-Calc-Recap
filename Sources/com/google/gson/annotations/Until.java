package com.google.gson.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Until {
  double value();
}


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\com\google\gson\annotations\Until.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */