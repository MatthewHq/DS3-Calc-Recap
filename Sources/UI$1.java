/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JViewport;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends JViewport
/*    */ {
/*    */   protected void paintComponent(Graphics g) {
/* 79 */     super.paintComponent(g);
/* 80 */     Image img = (new ImageIcon(getClass().getResource("bigParchment.png"))).getImage();
/* 81 */     g.drawImage(img, 0, 0, this);
/*    */   }
/*    */ }


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\UI$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */