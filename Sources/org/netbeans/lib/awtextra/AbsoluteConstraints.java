package org.netbeans.lib.awtextra;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;

public class AbsoluteConstraints implements Serializable {
  static final long serialVersionUID = 5261460716622152494L;
  
  public int x;
  
  public int y;
  
  public int width = -1;
  
  public int height = -1;
  
  public AbsoluteConstraints(Point paramPoint) {
    this(paramPoint.x, paramPoint.y);
  }
  
  public AbsoluteConstraints(int paramInt1, int paramInt2) {
    this.x = paramInt1;
    this.y = paramInt2;
  }
  
  public AbsoluteConstraints(Point paramPoint, Dimension paramDimension) {
    this.x = paramPoint.x;
    this.y = paramPoint.y;
    if (paramDimension != null) {
      this.width = paramDimension.width;
      this.height = paramDimension.height;
    } 
  }
  
  public AbsoluteConstraints(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.x = paramInt1;
    this.y = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public String toString() {
    return super.toString() + " [x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + "]";
  }
}


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\org\netbeans\lib\awtextra\AbsoluteConstraints.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */