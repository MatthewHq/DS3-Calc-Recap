package com.google.gson;

import java.lang.reflect.Type;

public interface InstanceCreator<T> {
  T createInstance(Type paramType);
}


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\com\google\gson\InstanceCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */