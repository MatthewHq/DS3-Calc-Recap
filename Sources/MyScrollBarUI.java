/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ import java.awt.Rectangle;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.plaf.ComponentUI;
/*    */ import javax.swing.plaf.basic.BasicScrollBarUI;
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
/*    */ public class MyScrollBarUI
/*    */   extends BasicScrollBarUI
/*    */ {
/* 29 */   private final Dimension d = new Dimension();
/*    */   
/*    */   public static ComponentUI createUI(JComponent c) {
/* 32 */     return new MyScrollBarUI();
/*    */   }
/*    */ 
/*    */   
/*    */   protected JButton createDecreaseButton(int orientation) {
/* 37 */     return new JButton()
/*    */       {
/*    */         public Dimension getPreferredSize() {
/* 40 */           return MyScrollBarUI.this.d;
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   protected JButton createIncreaseButton(int orientation) {
/* 47 */     return new JButton()
/*    */       {
/*    */         public Dimension getPreferredSize() {
/* 50 */           return MyScrollBarUI.this.d;
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
/* 57 */     Image img = (new ImageIcon(getClass().getResource("thumb.png"))).getImage();
/* 58 */     g.drawImage(img, 1, 1, null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
/* 64 */     Image img = (new ImageIcon(getClass().getResource("scroll.png"))).getImage();
/*    */ 
/*    */ 
/*    */     
/* 68 */     g.drawImage(img, r.x, r.y, r.x + r.width, r.y + r.height, r.x, r.y, r.x + r.width, r.y + r.height, c);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void setThumbBounds(int x, int y, int width, int height) {
/* 76 */     super.setThumbBounds(x, y, width, height);
/* 77 */     this.scrollbar.repaint();
/*    */   }
/*    */ }


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\MyScrollBarUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */