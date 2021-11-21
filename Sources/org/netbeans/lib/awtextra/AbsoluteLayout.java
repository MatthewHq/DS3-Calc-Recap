package org.netbeans.lib.awtextra;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;

public class AbsoluteLayout implements LayoutManager2, Serializable {
  static final long serialVersionUID = -1919857869177070440L;
  
  protected Hashtable constraints = new Hashtable();
  
  public void addLayoutComponent(String paramString, Component paramComponent) {
    throw new IllegalArgumentException();
  }
  
  public void removeLayoutComponent(Component paramComponent) {
    this.constraints.remove(paramComponent);
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    int i = 0;
    int j = 0;
    Enumeration enumeration = this.constraints.keys();
    while (enumeration.hasMoreElements()) {
      Component component = enumeration.nextElement();
      AbsoluteConstraints absoluteConstraints = (AbsoluteConstraints)this.constraints.get(component);
      Dimension dimension = component.getPreferredSize();
      int k = absoluteConstraints.getWidth();
      if (k == -1)
        k = dimension.width; 
      int m = absoluteConstraints.getHeight();
      if (m == -1)
        m = dimension.height; 
      if (absoluteConstraints.x + k > i)
        i = absoluteConstraints.x + k; 
      if (absoluteConstraints.y + m > j)
        j = absoluteConstraints.y + m; 
    } 
    return new Dimension(i, j);
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    int i = 0;
    int j = 0;
    Enumeration enumeration = this.constraints.keys();
    while (enumeration.hasMoreElements()) {
      Component component = enumeration.nextElement();
      AbsoluteConstraints absoluteConstraints = (AbsoluteConstraints)this.constraints.get(component);
      Dimension dimension = component.getMinimumSize();
      int k = absoluteConstraints.getWidth();
      if (k == -1)
        k = dimension.width; 
      int m = absoluteConstraints.getHeight();
      if (m == -1)
        m = dimension.height; 
      if (absoluteConstraints.x + k > i)
        i = absoluteConstraints.x + k; 
      if (absoluteConstraints.y + m > j)
        j = absoluteConstraints.y + m; 
    } 
    return new Dimension(i, j);
  }
  
  public void layoutContainer(Container paramContainer) {
    Enumeration enumeration = this.constraints.keys();
    while (enumeration.hasMoreElements()) {
      Component component = enumeration.nextElement();
      AbsoluteConstraints absoluteConstraints = (AbsoluteConstraints)this.constraints.get(component);
      Dimension dimension = component.getPreferredSize();
      int i = absoluteConstraints.getWidth();
      if (i == -1)
        i = dimension.width; 
      int j = absoluteConstraints.getHeight();
      if (j == -1)
        j = dimension.height; 
      component.setBounds(absoluteConstraints.x, absoluteConstraints.y, i, j);
    } 
  }
  
  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    if (!(paramObject instanceof AbsoluteConstraints))
      throw new IllegalArgumentException(); 
    this.constraints.put(paramComponent, paramObject);
  }
  
  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }
  
  public float getLayoutAlignmentX(Container paramContainer) {
    return 0.0F;
  }
  
  public float getLayoutAlignmentY(Container paramContainer) {
    return 0.0F;
  }
  
  public void invalidateLayout(Container paramContainer) {}
}


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\org\netbeans\lib\awtextra\AbsoluteLayout.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */