/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseMotionAdapter;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JTextPane;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.CompoundBorder;
/*     */ import javax.swing.text.AttributeSet;
/*     */ import javax.swing.text.BadLocationException;
/*     */ import javax.swing.text.Element;
/*     */ import javax.swing.text.Style;
/*     */ import javax.swing.text.StyledDocument;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class UI extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JDialog jDialog1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   
/*     */   public UI() {
/*  45 */     UIManager.put("ScrollBarUI", MyScrollBarUI.class.getName());
/*  46 */     setIconImage((new ImageIcon(getClass().getResource("DS3CalcIcon1.png"))).getImage());
/*  47 */     initComponents();
/*  48 */     setTitle("Portalz DS3 Calculator " + Main.version);
/*  49 */     this.jTextField1.setBackground(new Color(0, 0, 0, 0));
/*  50 */     this.jTextField1.setBorder((Border)null);
/*     */ 
/*     */     
/*  53 */     this.jTextField3.setToolTipText((String)null);
/*  54 */     this.jTextField2.setBackground(new Color(0, 0, 0, 0));
/*  55 */     this.jTextField3.setBackground(new Color(0, 0, 0, 0));
/*  56 */     this.jTextField2.setBorder((Border)null);
/*  57 */     this.jTextField3.setBorder((Border)null);
/*  58 */     this.jTextField4.setBackground(new Color(0, 0, 0, 0));
/*  59 */     this.jTextField4.setBorder((Border)null);
/*  60 */     this.jTextField4.setToolTipText((String)null);
/*  61 */     this.jButton1.setBorder((Border)null);
/*  62 */     this.jButton1.setBackground(new Color(0, 0, 0, 0));
/*  63 */     this.jButton1.setContentAreaFilled(false);
/*  64 */     this.jButton2.setBorder((Border)null);
/*  65 */     this.jButton2.setBackground(new Color(0, 0, 0, 0));
/*  66 */     this.jButton2.setContentAreaFilled(false);
/*  67 */     this.jButton3.setBorder((Border)null);
/*  68 */     this.jButton3.setBackground(new Color(0, 0, 0, 0));
/*  69 */     this.jButton3.setContentAreaFilled(false);
/*  70 */     this.jButton4.setBorder((Border)null);
/*  71 */     this.jButton4.setBackground(new Color(0, 0, 0, 0));
/*  72 */     this.jButton4.setContentAreaFilled(false);
/*     */     
/*  74 */     this.jScrollPane1.setVisible(false);
/*     */     
/*  76 */     JViewport viewport = new JViewport()
/*     */       {
/*     */         protected void paintComponent(Graphics g) {
/*  79 */           super.paintComponent(g);
/*  80 */           Image img = (new ImageIcon(getClass().getResource("bigParchment.png"))).getImage();
/*  81 */           g.drawImage(img, 0, 0, this);
/*     */         }
/*     */       };
/*  84 */     this.jScrollPane1.setViewport(viewport);
/*  85 */     this.jScrollPane1.setViewportView(this.jTextPane1);
/*     */     
/*  87 */     Border line = BorderFactory.createLineBorder(new Color(0, 0, 0, 0));
/*  88 */     Border empty = new EmptyBorder(15, 15, 15, 15);
/*  89 */     CompoundBorder border = new CompoundBorder(line, empty);
/*  90 */     this.jTextPane1.setBorder(border);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     this.jLabel6.setVisible(false);
/*     */   }
/*     */   private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JScrollPane jScrollPane1; private JTextField jTextField1; private JTextField jTextField2; private JTextField jTextField3; private JTextField jTextField4; private JTextPane jTextPane1;
/*     */   public void insertLink(JTextPane pane, String look, String link) {
/* 110 */     StyledDocument doc = pane.getStyledDocument();
/* 111 */     Style regularBlue = doc.addStyle("regularBlue", StyleContext.getDefaultStyleContext().getStyle("default"));
/* 112 */     StyleConstants.setForeground(regularBlue, Color.BLUE);
/* 113 */     StyleConstants.setUnderline(regularBlue, true);
/* 114 */     regularBlue.addAttribute("linkact", new ChatLinkListener(link));
/*     */     try {
/* 116 */       doc.insertString(doc.getLength(), look, regularBlue);
/* 117 */     } catch (BadLocationException ex) {
/* 118 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void insertText(JTextPane pane, String text) {
/* 124 */     StyledDocument doc = pane.getStyledDocument();
/*     */     try {
/* 126 */       doc.insertString(doc.getLength(), text, doc.getStyle("default"));
/* 127 */     } catch (BadLocationException ex) {
/* 128 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void formatInfo(JTextPane pane, String info) {
/* 135 */     pane.setText("");
/* 136 */     int flag = 0;
/* 137 */     String look = "";
/* 138 */     String link = "";
/* 139 */     String text = "";
/* 140 */     char[] inf = info.toCharArray();
/*     */     
/* 142 */     for (int i = 0; i < inf.length; i++) {
/* 143 */       if (flag == 0) {
/* 144 */         if (inf[i] == '[') {
/*     */           
/* 146 */           insertText(pane, text);
/* 147 */           flag = 1;
/* 148 */           look = "";
/* 149 */         } else if (inf[i] == '(' && inf[i - 1] == ']') {
/* 150 */           flag = 2;
/* 151 */           link = "";
/*     */         } else {
/* 153 */           text = text + inf[i];
/*     */         }
/*     */       
/* 156 */       } else if (flag == 1) {
/* 157 */         if (inf[i] == ']') {
/* 158 */           flag = 0;
/* 159 */           text = "";
/*     */         } else {
/* 161 */           look = look + inf[i];
/*     */         } 
/* 163 */       } else if (flag == 2) {
/* 164 */         if (inf[i] == ')') {
/*     */           
/* 166 */           insertLink(pane, look, link);
/* 167 */           flag = 0;
/* 168 */           text = "";
/*     */         } else {
/* 170 */           link = link + inf[i];
/*     */         } 
/*     */       } 
/*     */     } 
/* 174 */     insertText(pane, text);
/*     */   }
/*     */   
/*     */   public void changeUpdate(String image) {
/* 178 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/" + image)));
/*     */   }
/*     */   
/*     */   public void tears() {
/* 182 */     this.jLabel6.setVisible(true);
/*     */   }
/*     */   
/*     */   public void tearsOff() {
/* 186 */     this.jLabel6.setVisible(false);
/*     */   }
/*     */   
/*     */   public void changeReset(String image) {
/* 190 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/" + image)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 202 */     this.jDialog1 = new JDialog();
/* 203 */     this.jScrollPane1 = new JScrollPane();
/* 204 */     this.jTextPane1 = new JTextPane();
/* 205 */     this.jTextField1 = new JTextField();
/* 206 */     this.jTextField4 = new JTextField();
/* 207 */     this.jTextField3 = new JTextField();
/* 208 */     this.jTextField2 = new JTextField();
/* 209 */     this.jLabel3 = new JLabel();
/* 210 */     this.jLabel5 = new JLabel();
/* 211 */     this.jLabel2 = new JLabel();
/* 212 */     this.jButton4 = new JButton();
/* 213 */     this.jButton3 = new JButton();
/* 214 */     this.jButton1 = new JButton();
/* 215 */     this.jLabel4 = new JLabel();
/* 216 */     this.jButton2 = new JButton();
/* 217 */     this.jLabel6 = new JLabel();
/* 218 */     this.jLabel1 = new JLabel();
/*     */     
/* 220 */     setDefaultCloseOperation(3);
/* 221 */     setTitle("Portalz DS3 Calculator 0.1");
/* 222 */     setCursor(new Cursor(0));
/* 223 */     setLocation(new Point(400, 480));
/* 224 */     setMinimumSize(new Dimension(350, 478));
/* 225 */     setPreferredSize(new Dimension(350, 450));
/* 226 */     setResizable(false);
/* 227 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 229 */     this.jScrollPane1.setBorder((Border)null);
/* 230 */     this.jScrollPane1.setOpaque(false);
/*     */     
/* 232 */     this.jTextPane1.setEditable(false);
/* 233 */     this.jTextPane1.setBorder((Border)null);
/* 234 */     this.jTextPane1.setFont(new Font("Century Schoolbook", 1, 14));
/* 235 */     this.jTextPane1.setForeground(new Color(30, 30, 30));
/* 236 */     this.jTextPane1.setToolTipText("");
/* 237 */     this.jTextPane1.setCursor(new Cursor(2));
/* 238 */     this.jTextPane1.setDisabledTextColor(new Color(51, 51, 51));
/* 239 */     this.jTextPane1.setMargin(new Insets(20, 20, 7, 7));
/* 240 */     this.jTextPane1.setMinimumSize(new Dimension(210, 15));
/* 241 */     this.jTextPane1.setOpaque(false);
/* 242 */     this.jTextPane1.addMouseMotionListener(new MouseMotionAdapter() {
/*     */           public void mouseMoved(MouseEvent evt) {
/* 244 */             UI.this.jTextPane1MouseMoved(evt);
/*     */           }
/*     */         });
/* 247 */     this.jTextPane1.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 249 */             UI.this.jTextPane1MouseClicked(evt);
/*     */           }
/*     */         });
/* 252 */     this.jScrollPane1.setViewportView(this.jTextPane1);
/*     */     
/* 254 */     getContentPane().add(this.jScrollPane1, new AbsoluteConstraints(6, 10, 330, 360));
/*     */     
/* 256 */     this.jTextField1.setFont(new Font("Felix Titling", 1, 13));
/* 257 */     this.jTextField1.setForeground(new Color(0, 0, 0));
/* 258 */     this.jTextField1.setHorizontalAlignment(0);
/* 259 */     this.jTextField1.setToolTipText("1-1000");
/* 260 */     this.jTextField1.setCaretColor(new Color(0, 0, 0));
/* 261 */     this.jTextField1.setCursor(new Cursor(2));
/* 262 */     this.jTextField1.setOpaque(false);
/* 263 */     this.jTextField1.setRequestFocusEnabled(false);
/* 264 */     this.jTextField1.addMouseMotionListener(new MouseMotionAdapter() {
/*     */           public void mouseDragged(MouseEvent evt) {
/* 266 */             UI.this.jTextField1MouseDragged(evt);
/*     */           }
/*     */         });
/* 269 */     this.jTextField1.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 271 */             UI.this.jTextField1MouseClicked(evt);
/*     */           }
/*     */         });
/* 274 */     this.jTextField1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 276 */             UI.this.jTextField1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 279 */     this.jTextField1.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 281 */             UI.this.jTextField1KeyReleased(evt);
/*     */           }
/*     */         });
/* 284 */     getContentPane().add(this.jTextField1, new AbsoluteConstraints(20, 140, 170, 30));
/*     */     
/* 286 */     this.jTextField4.setFont(new Font("Felix Titling", 1, 13));
/* 287 */     this.jTextField4.setForeground(new Color(0, 0, 0));
/* 288 */     this.jTextField4.setHorizontalAlignment(0);
/* 289 */     this.jTextField4.setToolTipText("");
/* 290 */     this.jTextField4.setCaretColor(new Color(0, 0, 0));
/* 291 */     this.jTextField4.setCursor(new Cursor(2));
/* 292 */     this.jTextField4.setOpaque(false);
/* 293 */     this.jTextField4.setRequestFocusEnabled(false);
/* 294 */     this.jTextField4.addMouseMotionListener(new MouseMotionAdapter() {
/*     */           public void mouseDragged(MouseEvent evt) {
/* 296 */             UI.this.jTextField4MouseDragged(evt);
/*     */           }
/*     */         });
/* 299 */     this.jTextField4.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 301 */             UI.this.jTextField4MouseClicked(evt);
/*     */           }
/*     */         });
/* 304 */     this.jTextField4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 306 */             UI.this.jTextField4ActionPerformed(evt);
/*     */           }
/*     */         });
/* 309 */     this.jTextField4.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 311 */             UI.this.jTextField4KeyReleased(evt);
/*     */           }
/*     */         });
/* 314 */     getContentPane().add(this.jTextField4, new AbsoluteConstraints(20, 200, 170, 30));
/*     */     
/* 316 */     this.jTextField3.setEditable(false);
/* 317 */     this.jTextField3.setFont(new Font("Felix Titling", 1, 24));
/* 318 */     this.jTextField3.setForeground(new Color(0, 0, 0));
/* 319 */     this.jTextField3.setHorizontalAlignment(0);
/* 320 */     this.jTextField3.setToolTipText("");
/* 321 */     this.jTextField3.setCaretColor(new Color(0, 0, 0));
/* 322 */     this.jTextField3.setCursor(new Cursor(2));
/* 323 */     this.jTextField3.setOpaque(false);
/* 324 */     this.jTextField3.setRequestFocusEnabled(false);
/* 325 */     this.jTextField3.addMouseMotionListener(new MouseMotionAdapter() {
/*     */           public void mouseDragged(MouseEvent evt) {
/* 327 */             UI.this.jTextField3MouseDragged(evt);
/*     */           }
/*     */         });
/* 330 */     this.jTextField3.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 332 */             UI.this.jTextField3MouseClicked(evt);
/*     */           }
/*     */         });
/* 335 */     this.jTextField3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 337 */             UI.this.jTextField3ActionPerformed(evt);
/*     */           }
/*     */         });
/* 340 */     getContentPane().add(this.jTextField3, new AbsoluteConstraints(40, 330, 270, 30));
/*     */     
/* 342 */     this.jTextField2.setFont(new Font("Felix Titling", 1, 13));
/* 343 */     this.jTextField2.setForeground(new Color(0, 0, 0));
/* 344 */     this.jTextField2.setHorizontalAlignment(0);
/* 345 */     this.jTextField2.setToolTipText("1-1000");
/* 346 */     this.jTextField2.setCaretColor(new Color(0, 0, 0));
/* 347 */     this.jTextField2.setCursor(new Cursor(2));
/* 348 */     this.jTextField2.setOpaque(false);
/* 349 */     this.jTextField2.setRequestFocusEnabled(false);
/* 350 */     this.jTextField2.addMouseMotionListener(new MouseMotionAdapter() {
/*     */           public void mouseDragged(MouseEvent evt) {
/* 352 */             UI.this.jTextField2MouseDragged(evt);
/*     */           }
/*     */         });
/* 355 */     this.jTextField2.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 357 */             UI.this.jTextField2MouseClicked(evt);
/*     */           }
/*     */         });
/* 360 */     this.jTextField2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 362 */             UI.this.jTextField2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 365 */     this.jTextField2.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 367 */             UI.this.jTextField2KeyReleased(evt);
/*     */           }
/*     */         });
/* 370 */     getContentPane().add(this.jTextField2, new AbsoluteConstraints(20, 260, 170, 30));
/*     */     
/* 372 */     this.jLabel3.setForeground(new Color(0, 0, 0));
/* 373 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/TextFieldCurrentSouls.png")));
/* 374 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(10, 180, 190, 50));
/*     */     
/* 376 */     this.jLabel5.setForeground(new Color(0, 0, 0));
/* 377 */     this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/TextFieldTargetLevel.png")));
/* 378 */     getContentPane().add(this.jLabel5, new AbsoluteConstraints(10, 240, 190, 50));
/*     */     
/* 380 */     this.jLabel2.setForeground(new Color(0, 0, 0));
/* 381 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/TextFieldSoulLevel.png")));
/* 382 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(10, 120, 190, 50));
/*     */     
/* 384 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/info.png")));
/* 385 */     this.jButton4.setOpaque(false);
/* 386 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 388 */             UI.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/* 391 */     getContentPane().add(this.jButton4, new AbsoluteConstraints(280, 380, 59, 59));
/*     */     
/* 393 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/tutorial.png")));
/* 394 */     this.jButton3.setOpaque(false);
/* 395 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 397 */             UI.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/* 400 */     getContentPane().add(this.jButton3, new AbsoluteConstraints(80, 380, 59, 59));
/*     */     
/* 402 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/CheckUpdate.png")));
/* 403 */     this.jButton1.setOpaque(false);
/* 404 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 406 */             UI.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 409 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(10, 380, 59, 59));
/*     */     
/* 411 */     this.jLabel4.setIcon(new ImageIcon(getClass().getResource("/Display.png")));
/* 412 */     getContentPane().add(this.jLabel4, new AbsoluteConstraints(0, 310, 350, 70));
/*     */     
/* 414 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/reset.png")));
/* 415 */     this.jButton2.addMouseListener(new MouseAdapter() {
/*     */           public void mouseEntered(MouseEvent evt) {
/* 417 */             UI.this.jButton2MouseEntered(evt);
/*     */           }
/*     */           public void mouseExited(MouseEvent evt) {
/* 420 */             UI.this.jButton2MouseExited(evt);
/*     */           }
/*     */         });
/* 423 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 425 */             UI.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 428 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(240, 260, 75, 30));
/*     */     
/* 430 */     this.jLabel6.setIcon(new ImageIcon(getClass().getResource("/tear.png")));
/* 431 */     getContentPane().add(this.jLabel6, new AbsoluteConstraints(160, 90, 30, 40));
/*     */     
/* 433 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/Soul Calculator.png")));
/* 434 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(0, 0, 350, 450));
/*     */     
/* 436 */     getAccessibleContext().setAccessibleDescription("");
/*     */     
/* 438 */     pack();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jTextField2ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jTextField2MouseClicked(MouseEvent evt) {
/* 450 */     this.jTextField2.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField1MouseClicked(MouseEvent evt) {
/* 454 */     this.jTextField1.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField1KeyReleased(KeyEvent evt) {
/* 458 */     if (evt.getKeyCode() == 10) {
/* 459 */       this.jTextField4.requestFocus();
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 464 */     if (Main.updateStatus == 0) {
/* 465 */       Main.updateStatus = 10;
/* 466 */       Main.checkUpdate();
/* 467 */     } else if (Main.updateStatus == 1) {
/* 468 */       Main.updateStatus = 0;
/* 469 */       changeUpdate("CheckUpdate.png");
/* 470 */     } else if (Main.updateStatus == 2) {
/* 471 */       Main.updateStatus = 10;
/*     */       try {
/* 473 */         Main.openWebpage(new URL(Main.fetch));
/* 474 */         changeUpdate("CheckUpdate.png");
/* 475 */         Main.updateStatus = 0;
/* 476 */       } catch (MalformedURLException ex) {
/* 477 */         Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 478 */         changeUpdate("Error.png");
/* 479 */         Main.updateStatus = 3;
/*     */       } 
/* 481 */     } else if (Main.updateStatus == 3) {
/* 482 */       Main.updateStatus = 0;
/* 483 */       changeUpdate("CheckUpdate.png");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTextField1MouseDragged(MouseEvent evt) {
/* 491 */     this.jTextField1.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField2MouseDragged(MouseEvent evt) {
/* 495 */     this.jTextField2.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField3MouseDragged(MouseEvent evt) {
/* 499 */     this.jTextField3.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField3MouseClicked(MouseEvent evt) {
/* 503 */     this.jTextField3.requestFocus();
/* 504 */     this.jTextField3.setText(Main.printField(this.jTextField1.getText(), this.jTextField4.getText(), this.jTextField2.getText()));
/* 505 */     this.jTextField3.requestFocus();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jTextField3ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jTextField2KeyReleased(KeyEvent evt) {
/* 513 */     if (evt.getKeyCode() == 10) {
/* 514 */       this.jTextField3.setText(Main.printField(this.jTextField1.getText(), this.jTextField4.getText(), this.jTextField2.getText()));
/* 515 */       this.jTextField3.requestFocus();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jTextField4MouseDragged(MouseEvent evt) {
/* 520 */     this.jTextField4.requestFocus();
/*     */   }
/*     */   
/*     */   private void jTextField4MouseClicked(MouseEvent evt) {
/* 524 */     this.jTextField4.requestFocus();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jTextField4ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jTextField4KeyReleased(KeyEvent evt) {
/* 532 */     if (evt.getKeyCode() == 10) {
/* 533 */       this.jTextField2.requestFocus();
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 538 */     tearsOff();
/* 539 */     this.jTextField1.setText("");
/* 540 */     this.jTextField2.setText("");
/* 541 */     this.jTextField3.setText("");
/* 542 */     this.jTextField4.setText("");
/*     */   }
/*     */   
/*     */   private void jButton2MouseEntered(MouseEvent evt) {
/* 546 */     changeReset("resetHover.png");
/*     */   }
/*     */   
/*     */   private void jButton2MouseExited(MouseEvent evt) {
/* 550 */     changeReset("reset.png");
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 555 */       Main.openWebpage(new URL("https://www.youtube.com/watch?v=0GQzkRJzw4Q&feature=youtu.be"));
/* 556 */     } catch (MalformedURLException ex) {
/* 557 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 562 */     if (this.jScrollPane1.isVisible()) {
/* 563 */       this.jScrollPane1.setVisible(false);
/* 564 */     } else if (Main.info.equals("Loading from database... \n In the meantime enjoy this meme \n░░░░░░░░▄░░░░░░░░░░░░░░▄░░ ░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░ ░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░ ░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░ ░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░ ░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░  ░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌ ░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐ ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄ ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒ ▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒ ▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒ ▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒ ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒")) {
/* 565 */       this.jScrollPane1.setVisible(true);
/* 566 */       Main.fetchDat2();
/* 567 */       (new Thread() {
/*     */           public void run() {
/* 569 */             UI.this.jTextPane1.setText(Main.info);
/* 570 */             int counter = 0;
/*     */             try {
/* 572 */               while (Main.info.equals("Loading from database... \n In the meantime enjoy this meme \n░░░░░░░░▄░░░░░░░░░░░░░░▄░░ ░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░ ░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░ ░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░ ░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░ ░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░  ░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌ ░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐ ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄ ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒ ▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒ ▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒ ▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒ ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒") && counter < 500) {
/* 573 */                 Thread.sleep(100L);
/* 574 */                 counter++;
/*     */               } 
/* 576 */               if (counter < 500) {
/* 577 */                 UI.this.formatInfo(UI.this.jTextPane1, Main.info);
/* 578 */                 Main.parsed = true;
/*     */               } else {
/*     */                 
/* 581 */                 UI.this.jTextPane1.setText("ERROR WHILE LOADING :(");
/*     */               } 
/* 583 */             } catch (InterruptedException ex) {
/* 584 */               Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */             } 
/*     */           }
/* 587 */         }).start();
/* 588 */     } else if (!Main.parsed) {
/*     */       
/* 590 */       formatInfo(this.jTextPane1, Main.info);
/* 591 */       this.jScrollPane1.setVisible(true);
/*     */     } else {
/*     */       
/* 594 */       this.jScrollPane1.setVisible(true);
/*     */     } 
/* 596 */     revalidate();
/* 597 */     repaint();
/*     */   }
/*     */   
/*     */   private void jTextPane1MouseClicked(MouseEvent evt) {
/* 601 */     Element ele = this.jTextPane1.getStyledDocument().getCharacterElement(this.jTextPane1.viewToModel(evt.getPoint()));
/* 602 */     AttributeSet as = ele.getAttributes();
/* 603 */     ChatLinkListener fla = (ChatLinkListener)as.getAttribute("linkact");
/* 604 */     if (fla != null) {
/* 605 */       fla.execute();
/*     */     }
/*     */   }
/*     */   
/*     */   private void jTextPane1MouseMoved(MouseEvent evt) {
/* 610 */     Element ele = this.jTextPane1.getStyledDocument().getCharacterElement(this.jTextPane1.viewToModel(evt.getPoint()));
/* 611 */     AttributeSet as = ele.getAttributes();
/* 612 */     ChatLinkListener fla = (ChatLinkListener)as.getAttribute("linkact");
/* 613 */     if (fla != null) {
/* 614 */       this.jTextPane1.setCursor(new Cursor(0));
/*     */     } else {
/* 616 */       this.jTextPane1.setCursor(new Cursor(2));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 630 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 631 */         if ("Nimbus".equals(info.getName())) {
/* 632 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 636 */     } catch (ClassNotFoundException ex) {
/* 637 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 638 */     } catch (InstantiationException ex) {
/* 639 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 640 */     } catch (IllegalAccessException ex) {
/* 641 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 642 */     } catch (UnsupportedLookAndFeelException ex) {
/* 643 */       Logger.getLogger(UI.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 648 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 650 */             (new UI()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static class CustomTextPane
/*     */     extends JTextPane
/*     */   {
/*     */     public CustomTextPane() {
/* 659 */       setOpaque(false);
/*     */ 
/*     */       
/* 662 */       setBackground(new Color(0, 0, 0, 0));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected void paintComponent(Graphics g) {
/* 672 */       Image img = (new ImageIcon(getClass().getResource("bigParchment.png"))).getImage();
/* 673 */       g.drawImage(img, 0, 0, this);
/* 674 */       super.paintComponent(g);
/*     */     }
/*     */   }
/*     */   
/*     */   class ChatLinkListener
/*     */     extends AbstractAction {
/*     */     private String textLink;
/*     */     
/*     */     ChatLinkListener(String textLink) {
/* 683 */       this.textLink = textLink;
/*     */     }
/*     */     
/*     */     protected void execute() {
/*     */       try {
/* 688 */         Main.openWebpage(new URL(this.textLink));
/* 689 */       } catch (MalformedURLException malformedURLException) {}
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent e) {
/* 694 */       execute();
/*     */     }
/*     */     
/*     */     public void actionPerformedd(ActionEvent e) {
/* 698 */       throw new UnsupportedOperationException("Not supported yet.");
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\UI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */