-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: alunos
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `matricula` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `idade` varchar(45) NOT NULL,
  `curso` varchar(45) NOT NULL,
  `turma` varchar(45) NOT NULL,
  `dataMatricula` date NOT NULL,
  `ftaluno` longblob,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (54,'Maria Eduarda ','20/03/2003','Eng. Quimica','2021','2022-11-08',NULL),(56,'luiz','12/12/2004','Eng. Eletrica','12312','2022-11-08',NULL),(57,'asdfas','34234','Eng. Eletrica','34234','2022-11-08',_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0x\0x\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0ò¿í™aK´[¨ ‰\âŠ9Y¶  ôÁ	\Ü=\êˆ\'n?*°æž½\Ålk{ž»\à¢F…ÿ\0gú\×RTŒgŒõ\í\\¿‚t\ÝþµÓ–P£¹®In\Ïv\nô°“·\Ä\â¨__[XE\æ\ÜÊ±®p3\É?@95-õõµŒk™\Ò$\ìXòÜŽ\0\êO#õ\é^O\â/¾«©9·b_–cœ\\2ÀsŠqƒ‘kÆšó7õO\Ì>[[@!\r‚\'\Æ¡Á\ì=8$ó\ÔW56¹öø\Î`O;*¡K\í;BrA’>½1¸’j\Ø^H»¹tao³-ó Vlô*£ñžb„.p\è\Ý2?\'ð·QIuJ\Õ$\ï{¼±N¤-\Ì\Ñü1*OÖ¡–+ˆ\Û\ÏrÇž%V\Ï\ê*Œ¡\à«¹Sš–\ÐÜ™¼»d’Gn±¢\î\ÝøUlc\Í\Ì\ì\ÉVþI¤\Îr¿rA÷“\ß\ÜV\î\â9\ì@WfVVý\æ9Rñcò\äzñÖ°\î¬.¢V•\ìn \n@}ñ°\nO¹}*	e±ž7\ØÝ³ŽŸ¦\áRâ™¤*Î›½\Ï]µº[\ÛQ4Dm?{>SŒ\ãüõ©G”pY\Ëv\ï’z~F¸o\n\êž\\B	\åŠ \'\î\ãnMvöÁw‡dóW$˜\Ã`•^[¾Gt\ç\'Ò°”l\ì{\ê©Ã™J@$)}Gz*\'\"Š“ty?n”ñœ·\áL\íW\ï$³’EûRF‚4·ÁF\ãœ	\É\Çj\ì>e§\àsŒ€½=y¦x‹M\Ô-–K\Í\æö\ÝÝ·O\r´¬¡\Ï÷ð¤dôÏ¯\ç—ø÷k®‚(d\áòO¶\à“ô?\äûW+v‘\íY:jý\Õd\Õ/&yo¯^Y>\ã´\Ì\Ûø\ãœŸ\Ì\ÖbK°ˆ\í—\ç<\Ç\'\é\é]\çÄ›¯\'P†\Û÷LÐ¦A\Ìyý~u\Ã\Û~\ê	&$\ïe!N9úþdWD]\Õ\Ï2¬R©d\Í	\îd[KpÑ»kF”\ÈI;N\à\Ì9\'nõ\Çý\Øk6<\íE`¹›\È\Ü\á^I;©\Ç<T\Ñ:È‘X\Í+l-’B)Œ\ày–l\àû\à\àVÏ‡tô\Õ<H\Í9W[p\Æ\àœ€0=°8=Gµ6\í©ƒœ’FÇ†~A©\ØI}{q(ù±\r²\r­*\ämlòH#<`„\ZõMÁVZU°ŒÇ²2KF`	\ë\É$þU§¢ikclE\á\Ç\Ìz\í•z\ïPµ°ö‰‚³\çËŒ\Ï!$*³9À¹ÜœŽ»*ZSû\É!\Ó\ì\à\0Go\ÇC·ŸÏ­`xƒÀZ»\Óý’+k\Ù\ã)ö¨£\ÎrA\àœ“\Ãc#\"µF·kösq\ä\ß\Æpl\'\ßÿ\0|\ì\Ï\éVlu]J–\Ú]Ák£)Gºá‘°\ÊpAÁ­\n\è\ÆM½Ï—Í£\èþ\":~¡ Qkp\ÑHÑž	‚A#§MzK\Ï\ç!„\nøTT\ÆG \ê;sßžI\Íf|\\Ž\âó\ÅN¦Ô¨†\ÝL£>bŒ³7\àKø\r;Oµk=2b¿/ËŒŒ\ç¯Lþ½*¦\î“:ðiÅµÐ¹s:\Å7±\ã$\n*«9\r\Ô\ÑQ¡\Üùº3\Ì95~ksb÷Ž\ÌR$Ž5}\Ä(\'vXeÁ\Ï\Í\éƒGœ_ð®£\çQ\ì~·’\×Jó\r²\ÄYr$\Åt{]\ÈXÕ™\Ï@£&¹¿£\Û\èQy¹-\å	$†‡\èk˜ñ^£e¨],v/ ”9Ò¹XóŽ[9\êx\ï\×9Ü·‘\ìóòSO\È\ÇñTgQÖ®ndšM\Çn\Æß¸\r\Êõkœ~`@\"¹\á2\Æ\Ì\ä*mS\êsœÿ\0:&k‰\Æw‰TvNß…D`”F\\\ÆÊ£û\ÜWBVV<š“nNI-óœ\ã\î0ý\rzw\Ã[+¿M$nÅ£‡\\zÐžŒÀ{^Z3\×ð®“Á\Z\É\ÐüMmvÍˆ÷m“¯+\Ðð:ðIúJj\èxyò\ÈúNR«Y\Ù\0 \äu<ôüzzó\Ç5\Ï\Þx£B\Ñne³…Œ÷\Ûw<6‘5\Ä\ÌT\Ë\íqŽY\ÅnM·V­´\âdIp\Ü÷³\é\×\èzWžx\Êq\á½/\Ã>\ZúX¸\Û%\Íü¨0±Œe\Ý\èÄ°ù¾Q\ÏZ\Â¹½Iò^-[¨Y\ì®!–X¶›‹i!h¥‡wM\Ê\Ç=ñ\ÆzŠ\é\ì\î\ê\Ö9\Ç\×$z\â¸ÿ\0\\¯ˆ4¤\Õ\ï>\É>¥k,¶/ue|\ØþV\ä\ÉÁ\Î:zEv GX\0*(\ÎpÒ‰+;¦§¦¦~©\r½ÿ\0bŸd[™¢\Ú\Íq˜\naR)<3w\ãqõ¯)·c= v\\?–Àcó\ëÖµlüT³=\Õý–®÷$\\\Éop\ÉcwŽF†XX\ÅsA¼“ƒ\È‰#\Z\ZkFt\áZi´$®Y‰ã“ž(¨\ÛA\Ü	=»Š)w<\ìfœœ†\ãš@*õ\ì–e-£´I\0Ž\Ü,­\"\í.å™‰\Æza€¸\Ïz\ê>y½\á\æÝ¦\Úvÿ\0D€sÿ\0\\–¯\ß^Z\Ø\Å\æ\\\Ï*A\ÆöÁ8\ê\0\î~•‘\áW”é±¤Ì¬ñ(‹(r0Ÿ(Á\ïÀ\Ö\í\ÎÛ˜¶Jˆ\ÈWi]£{Žõ\Ë/ˆö\á~E\èy/Œ|I±1	`·»\Û\'\Ìc\Æ\ìv·~\ç®Ñ…oe{©ùV\Ö\Ñ<Ž\çbx\\ô\É\í\ÅzŸˆ4­:\Z\êt³†6Š&q\åFð3ŽúWa¦\êú-‚kh©*\îžØž±Aú÷öü\Åm.]\n”_´÷ï½»\Z—^-á¶±²A=Íº-\Ùe=Kp\Ý@#ùBkˆƒN¾›\Ìk{i]¡`®r\Êy\í×±¯|\Ó[Mm>}c\Ã\ÄjRÆ¥°¹ƒX ö\äg#¡\Ýx>\Ú\ê\â=J\Õÿ\0³õ=¸‘\ãPñ\É\Ç*\éÀq\ÓÓ¦F*F´eU¥Nm8ô8\Ï|Bž\Ê8´­R	\Ù#!@„´]°GqúŽœð¢øŽ\×KñE¬vÚ†›sp6“\Öò\Æy\ÚO\ß`2q\èzEX²Ó¾\Ì	*±>~c\ï´ýß \Î=M[6Ë’H\0ô\Çz‡-t„^\ïR-\Z\ÛN\Óô¨\ì´û,\ãL“…K³p2\ÅI\àzöŸ©Ø¦©¤\ÞX9UK˜^\Ì	¸c8™\Î8\éS¢…õ÷÷¨®þ\ÐmŠÚº¬¤€†BŒŒž¾™ÿ\0\ëô¥}n‰h7Ö´§ðžö(/ ¼\Õ/\æ\Îb„)··A\ZF\èW+\Î3\Ï9\ë\\ñ|õ>‡µv^8Š8u=÷irY\â™-w£¦\È\ì+”†Tž\â8n¤Ž€yÊ^\0«½ÎŠ’:\è¢ðEÔ©†Hƒ®F7¥¬m\Ìq&\Õ\Ö\É.·Ç±\ä1…\rù\0W®9ô<úU›rš†»o,“@\ÓG»(Fh¼‡hœ;Õ‰Œq\ßN\Ö\É$Q-~&r¹ü1]\'‡\Ôõ?q¡B:Z\éÔ‚¬\n©b§›\0~£üýk–ð\é1*\î*\ÊYv’3Á\ÇlŠ\è³\Æk–[ž\Ü\àˆ/`K\Ë9­¥Ý²Th\Ûi\ç`\×)\âý~\Î\Ò\Ò\çOF\ÞJ†?-v†\É?Ó¯J\ëYø5\Åj\Þ0Š\Û_K(-‘€¸Ÿg˜Fz…PÃ‘õ\ë\Çª‚»\"¼”c«µ\Ì?h7ú•õ\ç\Ù\äš\ÒT‹ËŽ_1¢S)‘BG$\í-òA^‘†§\á»\ïµF²\Ã\æ\Ò\à¹$q\ZH<õÝ‚p\Øb2\ÛY\ru\íoRÖµµ¸´Ä„b[}\ÄyŒ[iS\ÕrI\'§¾FÞ³\â\ÍO¾›M¸²KÔ6³¤¿(*À\×\Îî‡¹\ëZ\Í6y\Ô*F]Q\Ö\Øø†\ÚøEŒ°\Ü1Àsþ\É\ïô\ë\×ÒµU°Nk\Í\Ñ-/\ì¤6\ÒÁuP$S\Ôòÿ\0…Cß‰t#6o\í4`¦\Ê\é÷°\çø;‡\07šÇ‘Röm^¦H\â‘RC :€JŸQž+M†m=/µ+\ÝB\âXdUvIÑ”E´°%W\'²8\0t÷¬K_ÿ\0¡\É%þq\Â>\Ó2\Ç)9\É*;ýk_ñL\Ú\Þ\Ø\Ö&··S‘XžÅ±\Æq\Øgòirµ¸à¹´E-sT“V\Ôä»\Æ\È\Æ\Ð\n \Îõ\êOÔš\Éw=3S<\ÃE ›j\ÈT\í\'ž3\ëÁüª£79ª:n’²<dš*6=»QL›œnG¥^e{»/´ª\Êò[¨Y\É;°™\n\×8	\Ó	\ÏÍŸÛ­Y´ºš\Î\àO\ì‘AÁ A ƒÁ9\rnx§§øA‡ö4\à…ü5ºd®G\Ã÷“E¥D¶\Ö\å‹Y\Î\Ô^{­ÁúvÈ­–‚xÀ[\ÙZF`®6¦\Æ0:‚F&¢4%7sÑ–68¥»1üQ\â¨\ì\ÚXL’Ü²\î„þ\äô\ÇO½ü¿Jóf\\’rI>µ\Þø›J\Ó³±%½¬ñåŒ\'™\ê¾\ç=þµ“§ø:ò\à‡»‘-\ã\ë´|\Ì.\çøVª“‹²<úµ\ÝW\Í#—ðH=ðj\ÑG\Ø<\È\Ù\é¸c?Jôko\év\ÑmH2øÇš\Ç-ß‘\Øu\ì+ÄžºµÑ›Pkx\ä\nc9ô#·ÿ\0Z©\Ói\\\Î3G³Z\\	 •\ã‘~\ë£#\èEu>ñn²Ú­•”÷?i‚IV\"%\0²† \ïgóš\äÙ·ŽzŽõ§\áË«[~\Ò\êð•‚6,\Ä\à\àã§¾*\nN\ÏC\Ðü_ª{:;‚\ÖVf…½(\äû\ä{c\Ü\ÖI|ò\rbxŸ\Äš\âiB²\íµFW,\0\ÎvŽ?\ïš|l\Ó-Qæ¦°oõs)\ÜQs€\éùñ\éQ(7ª;h\â_+\Ø\Ö2+a€8\Ï~?*Pu4!\æ\Û\æ›1;W}\0\ÇÒ««†PÀœ2†\àò?6ux\åh\Øa”@=\Ådv]=†¸\Ú\åwƒŒƒÁ¢›¼\íÁ\'‘Eº9\n\é|1¦¤®÷·\îPqaÁ=\Î=»~>\Õ\ÏA\ÜL‘ ùœ\ã\é\ï]å°Š\Ò\Þ(S\nˆ (\î\Ä\×]5ws\Æeû‹\èl\í\ÚY\ä‹Ôš\ãµ/^Ý»%³›xz\r§\æ#\Üöü?Zƒ\Äw—\ßyHc\å½þ×¿ù÷¬qšs›\Ù¢‡³¼²wgv\ä³“õ¯Jð­ô_d–\Êñƒ\Ïi˜›Ê‘X\î\Ã Ž\Ü\ÓÞ¼\Ë5¥¡^5ž­)ùda}	ÿ\0Â¦³£uc\ÓR`\ã*ÀŽ™\âý¦\Îkr\ÅVT(Hí‘Š\ÉÑ®Œ4d’U³Ï¿ù5¤d÷\Åt\'td\ãfyI\è0{Jš\Îsk{„«\"–\à0 0=þ•&ª¯v¤m>k=‰\Èý\rGok-\ì†;h\Ë\Èœ¨þ\ê‚Iü\0&¹v6F®½v/§‚F¸Ê»·6\à\ät\ãw¦sŒúš\é|{ö\É|n…\Ù9<yÌÂ¸B\äd×¡\è>\Z¿Ñ´\èµ	¥¶kKØ£dXÙ‹®F\áFçž¸«„­ œ\\•\È5‹¸´f‚#h’iòg£\rg\'iô9\é\í\ØqY£QŽ\â\ÜZ\ÛÊ­|Ï»µ˜ÿ\0·\î3NN:š»\âðÏ¤©!&\Þ\Ã2+ðõ¸¹½™ù„%\àpr¿—§Ðš*\Æ\î\ÅQ›‡¡Ÿ\Z\áAa\Ï^y¢€0 Ž0{QY”]\Ó\Þ+Zòa—<D½Ï©ÿ\0\ëÿ\0Z\Ò\îf¿\Õ\r\Ä\ßr$;\0<)?ýl\ÑEZzØƒoTµ³¿Œ F\0/O!±\É\Å\\[\Ék;C*\á—Ó¡£ÚŠ)Ï¸XŠ—%NGQÒŠ*\0\îü1,)<\×3\ÜA´Eš`YLŒHQ…\äœlwzô:z†·£À\Â	] 0J\é8Ž&óCd\àa\È, (Á\Â\ã\'<\à’Š®f‚J\ì\â5\é,nuž\Ò\á\ç\ÞAÉhÛ±q\Ô\çvw:š\È(\Êr¦Š*n%Ï¥tö\Þ:\Ô\íôh´¦Ž\ÞKhÂ®â­¿h99Ç·J(¤U\Æ_\ëvº®5¬{\ãšM¡U\×\ïƒŒúS<+av·\Ï#B\Ê50Y€G>ƒùŠ(«\æm\ÜÍ«\"¾µa*\ê·Z®Ö\í\0\ÎW\'\ë\Ô\âŠ(©{—ÿ\Ù');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-08 15:34:49
