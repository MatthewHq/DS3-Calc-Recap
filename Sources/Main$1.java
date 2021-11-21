/*     */ import com.google.gson.Gson;
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
/*     */ final class null
/*     */   extends Thread
/*     */ {
/*     */   public void run() {
/* 167 */     String data = "";
/* 168 */     boolean flag = false;
/*     */     try {
/* 170 */       String json = Main.access$000("https://dropbox.com/s/0tyjol3jrd67df8/DS3Calc.json?raw=1");
/* 171 */       Gson gson = new Gson();
/* 172 */       UUIDObj temp = new UUIDObj("");
/* 173 */       temp = (UUIDObj)gson.fromJson(json, UUIDObj.class);
/* 174 */       Main.fetchedVer = temp.id;
/* 175 */       Main.fetch = temp.fetch;
/* 176 */       Main.date = temp.date.longValue();
/* 177 */       Main.info = temp.info;
/* 178 */       if (!Main.version.equals(Main.fetchedVer)) {
/* 179 */         Main.updateStatus = 2;
/* 180 */         Main.needsUpdate(Main.version, Main.fetchedVer, Main.fetch, Main.date);
/*     */       } else {
/* 182 */         Main.updateStatus = 1;
/* 183 */         Main.latestUpdate();
/* 184 */         System.out.println("latest");
/*     */       } 
/* 186 */     } catch (Exception ex) {
/* 187 */       Main.checkFailUpdate();
/* 188 */       Main.updateStatus = 3;
/* 189 */       System.out.println("fail" + ex.getMessage());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\Main$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */