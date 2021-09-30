package com.ashish.test;

public class Test1234 {
    public static void main(String[] args) {
        String selectDBQuery="SELECT ECAT.ITM_NBR ,ECAT.T028_ITM_TYP_CD ,ECAT.ITM_DES_TXT ,ECAT.T231_ITM_STS_CD ,ECAT.T197_UNT_PAK_ID ,ECAT.T331_MOD_ID ,CHAR(' ') AS MOD_ID_NUL_IDC ,PCM.T2580_GIN_ID ,ECAT.T616_VBU_NBR ,CHAR(' ') AS VBU_NBR_NUL_IDC ,ECAT.ASR_NBR ,CHAR(' ') AS FILLER1 ,ECAT.T851_HZD_MRL_ID ,PCM.T2593_SHT_DES_TXT ,ECAT.VND_LED_TM ,PCM.PRD_DES_TXT ,CASE WHEN (PCM.BRN_NME) IS NULL THEN ECAT.BRN_NME ELSE PCM.BRN_NME END AS BRN_NME ,ECAT.MIN_ORD_QTY ,ECAT.ORD_QTY_MUL_CNT ,CHAR(' ') AS ORD_QTY_MUL_CNT_NUL_IDC ,ECAT.T1313_LBR_ITM_ID ,ECAT.SEL_SHF_QTY ,CHAR(' ') AS FILLER2 ,PCM.MOD_ID ,PCM.T2590_SHT_DES_TXT ,COALESCE(PCM.VBU_HGT,ECAT.HGT_MSR) ,CHAR(' ') AS HGT_MSR_NUL_IDC ,COALESCE(PCM.VBU_LEN,ECAT.LEN_MSR) ,CHAR(' ') AS LEN_MSR_NUL_IDC ,COALESCE(PCM.VBU_WGT,ECAT.WGT_MSR) ,CHAR(' ') AS WGT_MSR_NUL_IDC ,COALESCE(PCM.VBU_WDT,ECAT.WDT_MSR) ,CHAR(' ') AS WDT_MSR_NUL_IDC ,CAST(COALESCE(PCM.T2584_PAK_HRC_CD,1) AS CHAR(2)) ,ECAT.MDV_DES_TXT ,CHAR(' ') AS FILLER3 ,ECAT.DIR_DLV_IDC ,ECAT.CTG_ITM_DES_TXT ,CHAR(' ',11) AS DATE ,INT(0) AS VBU_NBR ,CHAR(' ') AS VBU_NBR_NUL_IDC ,PCM.VBUWGT_BGN_DT ,PCM.VBUHGT_BGN_DT ,PCM.VBULEN_BGN_DT ,PCM.VBUWDT_BGN_DT FROM (SELECT T024.T024_ITM_NBR AS ITM_NBR ,T024.T028_ITM_TYP_CD ,T024.ITM_DES_TXT ,T024.T231_ITM_STS_CD ,T024.T197_UNT_PAK_ID ,T331.T331_MOD_ID ,T331.T616_VBU_NBR ,T133M.ASR_NBR ,CHAR(' ') AS FILLER1 ,T024.T851_HZD_MRL_ID ,T331.VND_LED_TM ,T331.BRN_NME ,T331.MIN_ORD_QTY ,T331.ORD_QTY_MUL_CNT,T024.T1313_LBR_ITM_ID ,T197A.SEL_SHF_QTY ,CHAR(' ') AS FILLER2 ,T331.HGT_MSR ,T331.LEN_MSR ,T331.WGT_MSR ,T331.WDT_MSR ,T331.DIR_DLV_IDC ,T331.CTG_ITM_DES_TXT ,T133M.MDV_DES_TXT ,CHAR(' ') AS FILLER3 ,T331.T331_CTG_SEQ_NBR FROM LOWES.T024_ITM T024, LOWES.T331_CTG_ITM T331 , LOWES.T197A_UNT_PAK_TYP T197A , LOWES.T133M_ITM_BUS_HRC T133M WHERE  T024.T024_ITM_NBR      = T331.SOS_ITM_NBR AND T024.T024_ITM_NBR = T133M.T024_ITM_NBR AND T331.T231_ITM_STS_CD = 1 AND T197A.T197_UNT_PAK_ID = T024.T197_UNT_PAK_ID AND T024.T231_ITM_STS_CD   IN (1,3,4,7,9) AND T024.T028_ITM_TYP_CD   = 1 AND T024.T1313_LBR_ITM_ID  = 'N' AND T024.T024_ITM_NBR IN ('43131', '43135', '42639') AND T331.T331_MOD_ID ='DUMMY_MODELID' AND EXISTS (SELECT 1 FROM LOWES.T333_CTG_ITM_PRC T333, LOWES.T165_LCT_CGY_GRP T165, LOWES.T063A_LCT T063 WHERE T333.T331_CTG_SEQ_NBR = T331.T331_CTG_SEQ_NBR AND T333.T224_LCT_CGY_CD  = T165.T224_LCT_CGY_CD AND T333.T162_CGY_SHT_NME = T165.T162_CGY_SHT_NME AND T333.T162_CGY_ONR_ID  = T165.T162_CGY_ONR_ID AND T165.T164_LCT_GRP_NBR = T063.T063_LCT_NBR AND T063.T1989_CRY_CD = 1 )) ECAT LEFT OUTER JOIN (SELECT  T2580.T2580_GIN_ID ,T2580.T616_VBU_NBR ,T2580.T2584_PAK_HRC_CD , CASE WHEN T2580.MOD_IDF_TXT >  ' ' THEN CHAR(T2580.MOD_IDF_TXT,80) ELSE T2605.SLL_ITM_IDF END AS MOD_ID ,T2593.SHT_DES_TXT  AS T2593_SHT_DES_TXT ,T2610.PRD_DES_TXT ,CASE T2580.T937_LWS_BRN_CD WHEN 9999 THEN T937B.BRN_NME ELSE T937A.BRN_NME END AS BRN_NME ,T2590.SHT_DES_TXT  AS T2590_SHT_DES_TXT ,T024.T024_ITM_NBR ,T2588VK.PRD_MSR AS VBU_WGT ,T2588VH.PRD_MSR AS VBU_HGT ,T2588VW.PRD_MSR AS VBU_WDT ,T2588VL.PRD_MSR AS VBU_LEN ,T2588VK.T2588_MSR_BGN_DT AS VBUWGT_BGN_DT ,T2588VH.T2588_MSR_BGN_DT AS VBUHGT_BGN_DT ,T2588VL.T2588_MSR_BGN_DT AS VBULEN_BGN_DT ,T2588VW.T2588_MSR_BGN_DT AS VBUWDT_BGN_DT FROM LOWES.T024_ITM T024 JOIN LOWES.T2594_GIN_VBU_ITM T2594 ON T024.T024_ITM_NBR = T2594.T024_ITM_NBR AND T024.T231_ITM_STS_CD IN (1,3,4,7,9) AND T024.T028_ITM_TYP_CD = 1  AND T024.T1313_LBR_ITM_ID = 'N' AND T2594.T1989_TGT_CRY_CD = 1 AND T024.T024_ITM_NBR IN ('43131', '43135', '42639') JOIN LOWES.T2580_GIN_VBU T2580 ON T2580.T2580_GIN_ID = T2594.T2580_GIN_ID AND T2580.T616_VBU_NBR = T2594.T616_VBU_NBR AND T2580.T617_FNC_TYP_CD   = T2594.T617_FNC_TYP_CD AND T2580.T1989_TGT_CRY_CD  = T2594.T1989_TGT_CRY_CD JOIN LOWES.T2593_GIN_CSM_UNT T2593 ON T2593.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2593.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2593.T617_FNC_TYP_CD   = T2580.T617_FNC_TYP_CD AND T2593.T1989_TGT_CRY_CD  = T2580.T1989_TGT_CRY_CD JOIN LOWES.T2590_UOM_TYP T2590 ON T2590.T2590_UOM_CD = T2593.T2590_SEL_UOM_CD JOIN LOWES.T2605_GIN_VBU_MRK T2605 ON T2605.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2605.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2605.T617_FNC_TYP_CD = T2580.T617_FNC_TYP_CD AND T2605.T1989_TGT_CRY_CD  = T2580.T1989_TGT_CRY_CD LEFT OUTER JOIN LOWES.T2591_GIN_BAR_CD T2591 ON T2591.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2591.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2591.T617_FNC_TYP_CD = T2580.T617_FNC_TYP_CD AND T2591.T1989_TGT_CRY_CD = T2580.T1989_TGT_CRY_CD LEFT OUTER JOIN LOWES.T2610_GIN_DES T2610 ON T2610.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2610.T616_VBU_NBR      = T2580.T616_VBU_NBR AND T2610.T617_FNC_TYP_CD = T2580.T617_FNC_TYP_CD AND T2610.T1989_TGT_CRY_CD = T2580.T1989_TGT_CRY_CD AND T2610.ADD_PRD_DES_IDC = 'N' LEFT OUTER JOIN LOWES.T937_BRN T937A ON T937A.T937_BRN_CD = T2580.T937_LWS_BRN_CD LEFT OUTER JOIN LOWES.T937_BRN T937B ON T937B.T937_BRN_CD = T2580.T937_BRN_CD LEFT OUTER JOIN LOWES.T2588_GIN_VBU_MSR T2588VK ON T2588VK.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2588VK.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2588VK.T617_FNC_TYP_CD  = T2580.T617_FNC_TYP_CD AND T2588VK.T2589_MSR_TYP_CD = 8 AND T2588VK.T2586_BUS_ARA_CD = 1 AND T2588VK.MSR_END_DT = '9999-12-31' AND T2588VK.T1989_TGT_CRY_CD = 1 LEFT OUTER JOIN LOWES.T2588_GIN_VBU_MSR T2588VH ON T2588VH.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2588VH.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2588VH.T617_FNC_TYP_CD  = T2580.T617_FNC_TYP_CD AND T2588VH.T2589_MSR_TYP_CD = 1 AND T2588VH.T2586_BUS_ARA_CD = 1 AND T2588VH.MSR_END_DT = '9999-12-31' AND T2588VH.T1989_TGT_CRY_CD = 1 LEFT OUTER JOIN LOWES.T2588_GIN_VBU_MSR T2588VW ON T2588VW.T2580_GIN_ID = T2580.T2580_GIN_ID AND T2588VW.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2588VW.T617_FNC_TYP_CD = T2580.T617_FNC_TYP_CD AND T2588VW.T2589_MSR_TYP_CD = 2 AND T2588VW.T2586_BUS_ARA_CD = 1 AND T2588VW.MSR_END_DT = '9999-12-31' AND T2588VW.T1989_TGT_CRY_CD = 1 LEFT OUTER JOIN LOWES.T2588_GIN_VBU_MSR T2588VL ON T2588VL.T2580_GIN_ID = T2580.T2580_GIN_ID  AND T2588VL.T616_VBU_NBR = T2580.T616_VBU_NBR AND T2588VL.T617_FNC_TYP_CD = T2580.T617_FNC_TYP_CD AND T2588VL.T2589_MSR_TYP_CD = 3 AND T2588VL.T2586_BUS_ARA_CD = 1 AND T2588VL.MSR_END_DT = '9999-12-31' AND T2588VL.T1989_TGT_CRY_CD = 1 WHERE T2580.LWS_CSM_UNT_IDC = 'Y' AND T2594.T1989_TGT_CRY_CD  = 1 AND T2580. T2582_GIN_STS_CD = 1 AND T2580.T2580_GIN_ID NOT LIKE ('00828439%') AND T2580.T2580_GIN_ID NOT LIKE ('10828439%') AND T024.T1313_LBR_ITM_ID  = 'N') PCM ON PCM.T616_VBU_NBR = ECAT.T616_VBU_NBR AND PCM.MOD_ID = ECAT.T331_MOD_ID AND PCM.T024_ITM_NBR = ECAT.ITM_NBR AND PCM.T024_ITM_NBR IN ('43131', '43135', '42639') AND PCM.MOD_ID ='DUMMY_MODELID' ORDER BY ITM_NBR ASC,T331_MOD_ID ASC, VBUWGT_BGN_DT DESC,VBUHGT_BGN_DT DESC, VBULEN_BGN_DT DESC, VBUWDT_BGN_DT DESC WITH UR";

        selectDBQuery=selectDBQuery.replaceAll("='DUMMY_MODELID'", "IN ('463623', '464201', '463601')");
        System.out.println(selectDBQuery);
    }


}
