/*     */ import com.google.gson.Gson;
/*     */ import java.awt.Desktop;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
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
/*     */ public class Main
/*     */ {
/*  24 */   public static int[] dat = new int[] { 673, 689, 706, 723, 740, 757, 775, 793, 811, 829, 847, 1038, 1238, 1445, 1659, 1882, 2113, 2353, 2601, 2857, 3122, 3395, 3678, 3969, 4270, 4580, 4899, 5228, 5566, 5915, 6272, 6640, 7018, 7407, 7805, 8214, 8633, 9064, 9505, 9956, 10419, 10893, 11379, 11876, 12384, 12904, 13435, 13979, 14535, 15102, 15682, 16274, 16879, 17497, 18127, 18770, 19425, 20094, 20776, 21472, 22181, 22903, 23640, 24390, 25153, 25931, 26723, 27530, 28351, 29186, 30036, 30900, 31780, 32675, 33584, 34509, 35449, 36405, 37377, 38364, 39367, 40385, 41420, 42472, 43539, 44623, 45723, 46841, 47975, 49125, 50293, 51478, 52681, 53901, 55138, 56393, 57665, 58956, 60264, 61591, 62936, 64299, 65681, 67082, 68501, 69939, 71395, 72871, 74367, 75881, 77415, 78968, 80542, 82134, 83747, 85380, 87033, 88707, 90400, 92115, 93850, 95605, 97382, 99179, 100998, 102838, 104699, 106582, 108486, 110413, 112360, 114330, 116322, 118337, 120373, 122432, 124513, 126618, 128744, 130894, 133066, 135262, 137481, 139724, 141990, 144280, 146594, 148931, 151293, 153679, 156088, 158523, 160981, 163465, 165973, 168506, 171064, 173646, 176255, 178888, 181547, 184231, 186942, 189677, 192439, 195227, 198041, 200882, 203748, 206642, 209561, 212508, 215482, 218482, 221510, 224565, 227647, 230757, 233894, 237059, 240252, 243473, 246722, 249999, 253304, 256638, 260001, 263392, 266812, 270260, 273738, 277245, 280782, 284347, 287943, 291568, 295222, 298907, 302621, 306366, 310141, 313946, 317782, 321648, 325545, 329473, 333432, 337422, 341443, 345495, 349579, 353695, 357842, 362021, 366232, 370475, 374750, 379057, 383397, 387769, 392174, 396611, 401082, 405585, 410122, 414692, 419295, 423932, 428602, 433306, 438044, 442816, 447622, 452462, 457337, 462245, 467189, 472167, 477180, 482228, 487311, 492429, 497582, 502771, 507995, 513255, 518551, 523882, 529250, 534653, 540093, 545569, 551082, 556631, 562218, 567840, 573500, 579197, 584931, 590703, 596512, 602358, 608242, 614164, 620124, 626122, 632158, 638232, 644345, 650496, 656686, 662915, 669182, 675489, 681835, 688220, 694644, 701108, 707611, 714154, 720737, 727360, 734023, 740726, 747469, 754253, 761078, 767943, 774849, 781796, 788783, 795812, 802883, 809995, 817148, 824343, 831579, 838858, 846178, 853541, 860946, 868393, 875883, 883415, 890990, 898608, 906269, 913973, 921720, 929511, 937345, 945222, 953143, 961108, 969117, 977170, 985267, 993409, 1001594, 1009825, 1018099, 1026419, 1034784, 1043193, 1051648, 1060148, 1068693, 1077284, 1085920, 1094602, 1103330, 1112104, 1120924, 1129790, 1138703, 1147662, 1156667, 1165719, 1174818, 1183964, 1193157, 1202397, 1211685, 1221019, 1230402, 1239832, 1249309, 1258835, 1268408, 1278030, 1287700, 1297418, 1307185, 1317001, 1326865, 1336778, 1346740, 1356750, 1366811, 1376920, 1387079, 1397288, 1407546, 1417854, 1428212, 1438620, 1449078, 1459586, 1470145, 1480754, 1491414, 1502125, 1512887, 1523699, 1534563, 1545478, 1556444, 1567462, 1578531, 1589652, 1600825, 1612050, 1623327, 1634657, 1646038, 1657472, 1668959, 1680498, 1692090, 1703735, 1715433, 1727184, 1738988, 1750846, 1762757, 1774722, 1786741, 1798814, 1810940, 1823121, 1835356, 1847645, 1859989, 1872388, 1884841, 1897349, 1909912, 1922530, 1935203, 1947932, 1960716, 1973555, 1986450, 1999401, 2012408, 2025471, 2038591, 2051766, 2064998, 2078286, 2091631, 2105033, 2118492, 2132007, 2145580, 2159210, 2172898, 2186642, 2200445, 2214305, 2228223, 2242199, 2256233, 2270325, 2284476, 2298685, 2312953, 2327279, 2341664, 2356108, 2370611, 2385173, 2399795, 2414476, 2429216, 2444016, 2458876, 2473795, 2488775, 2503815, 2518915, 2534075, 2549296, 2564578, 2579920, 2595323, 2610787, 2626312, 2641899, 2657546, 2673255, 2689026, 2704858, 2720752, 2736708, 2752726, 2768807, 2784949, 2801154, 2817422, 2833752, 2850144, 2866600, 2883119, 2899701, 2916346, 2933054, 2949826, 2966662, 2983561, 3000524, 3017551, 3034642, 3051798, 3069017, 3086302, 3103650, 3121064, 3138542, 3156085, 3173693, 3191366, 3209105, 3226909, 3244778, 3262713, 3280714, 3298781, 3316914, 3335113, 3353378, 3371709, 3390107, 3408572, 3427103, 3445701, 3464366, 3483099, 3501898, 3520765, 3539699, 3558701, 3577770, 3596907, 3616112, 3635386, 3654727, 3674137, 3693615, 3713161, 3732776, 3752460, 3772213, 3792035, 3811926, 3831886, 3851916, 3872015, 3892183, 3912422, 3932730, 3953108, 3973556, 3994075, 4014663, 4035323, 4056052, 4076853, 4097724, 4118666, 4139680, 4160764, 4181920, 4203147, 4224445, 4245816, 4267258, 4288771, 4310357, 4332015, 4353746, 4375548, 4397423, 4419371, 4441391, 4463485, 4485651, 4507890, 4530203, 4552589, 4575048, 4597581, 4620187, 4642868, 4665622, 4688450, 4711353, 4734329, 4757380, 4780506, 4803706, 4826982, 4850331, 4873756, 4897256, 4920832, 4944482, 4968209, 4992010, 5015888, 5039841, 5063871, 5087976, 5112158, 5136415, 5160750, 5185161, 5209648, 5234213, 5258854, 5283572, 5308368, 5333241, 5358191, 5383219, 5408324, 5433507, 5458768, 5484107, 5509524, 5535020, 5560593, 5586246, 5611977, 5637786, 5663675, 5689642, 5715688, 5741814, 5768019, 5794303, 5820667, 5847111, 5873635, 5900238, 5926921, 5953685, 5980529, 6007453, 6034458, 6061543, 6088710, 6115957, 6143285, 6170694, 6198185, 6225756, 6253410, 6281145, 6308961, 6336860, 6364840, 6392903, 6421048, 6449275, 6477584, 6505976, 6534451, 6563008, 6591649, 6620372, 6649179, 6678069, 6707043, 6736099, 6765240, 6794464, 6823772, 6853165, 6882641, 6912202, 6941846, 6971576, 7001390, 7031289, 7061272, 7091341, 7121494, 7151733, 7182057, 7212467, 7242962, 7273543, 7304210, 7334962, 7365801, 7396726, 7427737, 7458834, 7490018, 7521289, 7552646, 7584090, 7615622, 7647240, 7678946, 7710739, 7742619, 7774587, 7806643, 7838787, 7871019, 7903338, 7935746, 7968242, 8000827, 8033500, 8066262, 8099113, 8132053, 8165082, 8198199, 8231407, 8264703, 8298089, 8331565, 8365130, 8398786, 8432531, 8466367, 8500293, 8534309, 8568415, 8602612, 8636900, 8671279, 8705749, 8740310, 8774962, 8809705, 8844540, 8879466, 8914484, 8949594, 8984796, 9020090, 9055476, 9090954, 9126525, 9162188, 9197944, 9233792, 9269734, 9305768, 9341896, 9378117, 9414431, 9450839, 9487340, 9523935, 9560624, 9597407, 9634284, 9671255, 9708321, 9745481, 9782735, 9820084, 9857528, 9895067, 9932701, 9970430, 10008254, 10046174, 10084190, 10122301, 10160507, 10198810, 10237209, 10275703, 10314294, 10352982, 10391765, 10430646, 10469623, 10508697, 10547868, 10587136, 10626501, 10665964, 10705524, 10745182, 10784937, 10824790, 10864741, 10904790, 10944937, 10985183, 11025527, 11065969, 11106510, 11147150, 11187889, 11228727, 11269664, 11310700, 11351835, 11393070, 11434405, 11475839, 11517373, 11559007, 11600742, 11642576, 11684511, 11726546, 11768682, 11810918, 11853255, 11895693, 11938233, 11980873, 12023615, 12066458, 12109402, 12152449, 12195597, 12238846, 12282198, 12325652, 12369209, 12412867, 12456628, 12500492, 12544459, 12588528, 12632700, 12676975, 12721354, 12765836, 12810421, 12855110, 12899903, 12944799, 12989799, 13034904, 13080112, 13125425, 13170842, 13216364, 13261990, 13307721, 13353557, 13399498, 13445545, 13491696, 13537953, 13584315, 13630783, 13677357, 13724036, 13770821, 13817713, 13864711, 13911815, 13959025, 14006342, 14053766, 14101296, 14148934, 14196678, 14244530, 14292489, 14340555, 14388729, 14437011, 14485400, 14533897, 14582502, 14631216, 14680037, 14728967, 14778006, 14827153, 14876408, 14925773, 14975247, 15024829, 15074521, 15124322, 15174233, 15224253, 15274383, 15324623, 15374972, 15425432, 15476002, 15526682, 15577473, 15628374, 15679385, 15730508, 15781741, 15833086, 15884541, 15936108, 15987786, 16039575, 16091477, 16143490, 16195614, 16247851, 16300200, 16352661, 16405234, 16457920, 16510718, 16563630, 16616653, 16669790, 16723040, 16776403, 16829879, 16883469, 16937172, 16990989, 17044920, 17098964, 17153123, 17207396, 17261782, 17316284, 17370900, 17425630, 17480475, 17535435, 17590510, 17645700, 17701005, 17756426, 17811962, 17867613, 17923380, 17979263, 18035262, 18091378, 18147609, 18203956, 18260420, 18317001, 18373698, 18430511, 18487442, 18544490, 18601655, 18658937, 18716336, 18773853, 18831488, 18889240, 18947110, 19005098, 19063205, 19121429, 19179772, 19238233, 19296813, 19355511, 19414328, 19473265, 19532320, 19591494, 19650788, 19710201, 19769734, 19829386, 19889158, 19949050, 20009062, 20069194, 20129446, 20189819, 20250312, 20310926, 20371660, 20432516, 20493492, 20554589, 20615808, 20677148, 20738609, 20800192, 20861897, 20923723, 20985672, 21047742, 21109935, 21172250, 21234687, 21297247, 21359929, 21422734, 21485663, 21548714, 21611888, 21675186, 21738606, 21802151, 21865819, 21929610, 21993526, 22057566, 22121729, 22186017, 22250429, 22314966, 22379627, 22444413, 22509324, 22574359, 22639520, 22704806, 22770217, 22835753, 22901415, 22967203, 23033116, 23099156, 23165321, 23231613 };
/*     */   
/*     */   public static UI x;
/*     */   
/*     */   public static void main(String[] args) {
/*  29 */     x = new UI();
/*  30 */     x.setVisible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean fd2 = false;
/*     */   
/*     */   public static boolean parsed = false;
/*     */   public static final String infoLoading = "Loading from database... \n In the meantime enjoy this meme \n░░░░░░░░▄░░░░░░░░░░░░░░▄░░ ░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░ ░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░ ░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░ ░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░ ░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░  ░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌ ░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐ ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄ ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒ ▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒ ▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒ ▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒ ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒";
/*  38 */   public static int updateStatus = 0;
/*  39 */   public static String version = "0.6";
/*  40 */   public static String fetchedVer = "";
/*  41 */   public static String fetch = "";
/*  42 */   public static String info = "Loading from database... \n In the meantime enjoy this meme \n░░░░░░░░▄░░░░░░░░░░░░░░▄░░ ░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░ ░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░ ░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░ ░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░ ░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░  ░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌ ░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐ ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄ ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒ ▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒ ▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒ ▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒ ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒";
/*  43 */   public static long date = 0L;
/*     */   
/*     */   public static void checkUpdate() {
/*  46 */     fetchDat();
/*     */   }
/*     */   
/*     */   public static void needsUpdate(String version, String fetchedVer, String fetch, long date) {
/*  50 */     x.changeUpdate("UpdateAvailable2.png");
/*  51 */     x.revalidate();
/*  52 */     x.repaint();
/*     */   }
/*     */ 
/*     */   
/*     */   public static long calcSouls(int start, int end, int have) {
/*  57 */     long souls = 0L;
/*  58 */     for (int i = start - 1; i < end - 1; i++) {
/*  59 */       souls += dat[i];
/*     */     }
/*  61 */     return souls - have;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void latestUpdate() {
/*  72 */     x.changeUpdate("NoUpdate.png");
/*  73 */     x.revalidate();
/*  74 */     x.repaint();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isInt(String s) {
/*     */     try {
/*  80 */       Integer.parseInt(s);
/*  81 */     } catch (NumberFormatException nfe) {
/*  82 */       return false;
/*     */     } 
/*  84 */     return true;
/*     */   }
/*     */   
/*     */   public static String printField(String text1, String text2, String text3) {
/*  88 */     boolean[] flags = { false, false, false };
/*     */     
/*  90 */     if (isInt(text1) && Integer.parseInt(text1) > 0 && Integer.parseInt(text1) <= 1000) {
/*  91 */       flags[0] = true;
/*     */     }
/*     */     
/*  94 */     if (isInt(text2) && Integer.parseInt(text2) >= 0) {
/*  95 */       flags[1] = true;
/*     */     }
/*     */     
/*  98 */     if (isInt(text3) && Integer.parseInt(text3) > 0 && Integer.parseInt(text3) <= 1000) {
/*  99 */       flags[2] = true;
/*     */     }
/*     */     
/* 102 */     if (flags[0] && flags[2]) {
/* 103 */       long sulls = calcSouls(Integer.parseInt(text1), Integer.parseInt(text3), flags[1] ? Integer.parseInt(text2) : 0);
/* 104 */       if (sulls > 5000000L) {
/* 105 */         x.tears();
/*     */       }
/* 107 */       if (sulls < 0L) {
/* 108 */         sulls = 0L;
/*     */       }
/* 110 */       return formatNum(sulls) + " SOULS";
/*     */     } 
/* 112 */     return "Err:" + (!flags[0] ? "Field 1" : "") + " " + (!flags[2] ? "Field 3" : "");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String formatNum(long x) {
/* 118 */     char[] parts = (x + "").toCharArray();
/* 119 */     String toRet = "";
/* 120 */     int counter = 0;
/* 121 */     String backwards = ""; int i;
/* 122 */     for (i = parts.length - 1; i >= 0; i--) {
/* 123 */       if (counter == 3) {
/* 124 */         counter = 0;
/* 125 */         backwards = backwards + ",";
/*     */       } 
/* 127 */       backwards = backwards + parts[i];
/* 128 */       counter++;
/*     */     } 
/*     */     
/* 131 */     for (i = backwards.length() - 1; i >= 0; i--) {
/* 132 */       toRet = toRet + backwards.charAt(i);
/*     */     }
/* 134 */     return toRet;
/*     */   }
/*     */   
/*     */   public static void checkFailUpdate() {
/* 138 */     x.changeUpdate("Error.png");
/* 139 */     x.revalidate();
/* 140 */     x.repaint();
/*     */   }
/*     */   
/*     */   public static void openWebpage(URI uri) {
/* 144 */     Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
/* 145 */     if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
/*     */       try {
/* 147 */         desktop.browse(uri);
/* 148 */       } catch (Exception e) {
/* 149 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static void openWebpage(URL url) {
/*     */     try {
/* 156 */       openWebpage(url.toURI());
/* 157 */     } catch (URISyntaxException e) {
/* 158 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void fetchDat() {
/* 163 */     (new Thread()
/*     */       {
/*     */         public void run()
/*     */         {
/* 167 */           String data = "";
/* 168 */           boolean flag = false;
/*     */           try {
/* 170 */             String json = Main.readUrl("https://dropbox.com/s/0tyjol3jrd67df8/DS3Calc.json?raw=1");
/* 171 */             Gson gson = new Gson();
/* 172 */             UUIDObj temp = new UUIDObj("");
/* 173 */             temp = (UUIDObj)gson.fromJson(json, UUIDObj.class);
/* 174 */             Main.fetchedVer = temp.id;
/* 175 */             Main.fetch = temp.fetch;
/* 176 */             Main.date = temp.date.longValue();
/* 177 */             Main.info = temp.info;
/* 178 */             if (!Main.version.equals(Main.fetchedVer)) {
/* 179 */               Main.updateStatus = 2;
/* 180 */               Main.needsUpdate(Main.version, Main.fetchedVer, Main.fetch, Main.date);
/*     */             } else {
/* 182 */               Main.updateStatus = 1;
/* 183 */               Main.latestUpdate();
/* 184 */               System.out.println("latest");
/*     */             } 
/* 186 */           } catch (Exception ex) {
/* 187 */             Main.checkFailUpdate();
/* 188 */             Main.updateStatus = 3;
/* 189 */             System.out.println("fail" + ex.getMessage());
/*     */           
/*     */           }
/*     */         
/*     */         }
/* 194 */       }).start();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void fetchDat2() {
/* 199 */     if (!fd2) {
/* 200 */       fd2 = true;
/* 201 */       (new Thread()
/*     */         {
/*     */           public void run()
/*     */           {
/* 205 */             String data = "";
/* 206 */             boolean flag = false;
/*     */             try {
/* 208 */               String json = Main.readUrl("https://dropbox.com/s/0tyjol3jrd67df8/DS3Calc.json?raw=1");
/* 209 */               Gson gson = new Gson();
/* 210 */               UUIDObj temp = new UUIDObj("");
/* 211 */               temp = (UUIDObj)gson.fromJson(json, UUIDObj.class);
/* 212 */               Main.fetchedVer = temp.id;
/* 213 */               Main.fetch = temp.fetch;
/* 214 */               Main.date = temp.date.longValue();
/* 215 */               Main.info = temp.info;
/* 216 */               if (!Main.version.equals(Main.fetchedVer)) {
/* 217 */                 Main.updateStatus = 2;
/* 218 */                 Main.needsUpdate(Main.version, Main.fetchedVer, Main.fetch, Main.date);
/*     */               } else {
/* 220 */                 Main.updateStatus = 1;
/* 221 */                 Main.latestUpdate();
/* 222 */                 System.out.println("latest");
/*     */               } 
/* 224 */             } catch (Exception ex) {
/* 225 */               Main.checkFailUpdate();
/* 226 */               Main.updateStatus = 3;
/* 227 */               System.out.println("fail" + ex.getMessage());
/*     */             
/*     */             }
/*     */           
/*     */           }
/* 232 */         }).start();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String readUrl(String urlString) throws Exception {
/* 238 */     BufferedReader reader = null;
/*     */     try {
/* 240 */       URL url = new URL(urlString);
/* 241 */       reader = new BufferedReader(new InputStreamReader(url.openStream()));
/* 242 */       StringBuffer buffer = new StringBuffer();
/*     */       
/* 244 */       char[] chars = new char[1024]; int read;
/* 245 */       while ((read = reader.read(chars)) != -1) {
/* 246 */         buffer.append(chars, 0, read);
/*     */       }
/*     */       
/* 249 */       return buffer.toString();
/*     */     } finally {
/* 251 */       if (reader != null)
/* 252 */         reader.close(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Portalz\Desktop\Small Projects\DarkSoulsRecap\Portalz DS3 Calculator v0.6 .jar!\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */