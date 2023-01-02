import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.value.*;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/
import java.util.HashMap; import java.util.ArrayList;
@SuppressWarnings("fallthrough") public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;
  private static boolean[] ARTSet57;
  private static boolean[] ARTSet58;
  private static boolean[] ARTSet59;
  private static boolean[] ARTSet60;
  private static boolean[] ARTSet61;
  private static boolean[] ARTSet62;
  private static boolean[] ARTSet63;
  private static boolean[] ARTSet64;
  private static boolean[] ARTSet65;
  private static boolean[] ARTSet66;
  private static boolean[] ARTSet67;
  private static boolean[] ARTSet68;
  private static boolean[] ARTSet69;
  private static boolean[] ARTSet70;
  private static boolean[] ARTSet71;
  private static boolean[] ARTSet72;
  private static boolean[] ARTSet73;
  private static boolean[] ARTSet74;
  private static boolean[] ARTSet75;
  private static boolean[] ARTSet76;
  private static boolean[] ARTSet77;
  private static boolean[] ARTSet78;
  private static boolean[] ARTSet79;
  private static boolean[] ARTSet80;
  private static boolean[] ARTSet81;
  private static boolean[] ARTSet82;
  private static boolean[] ARTSet83;
  private static boolean[] ARTSet84;
  private static boolean[] ARTSet85;
  private static boolean[] ARTSet86;
  private static boolean[] ARTSet87;
  private static boolean[] ARTSet88;
  private static boolean[] ARTSet89;
  private static boolean[] ARTSet90;
  private static boolean[] ARTSet91;
  private static boolean[] ARTSet92;
  private static boolean[] ARTSet93;
  private static boolean[] ARTSet94;
  private static boolean[] ARTSet95;
  private static boolean[] ARTSet96;
  private static boolean[] ARTSet97;
  private static boolean[] ARTSet98;
  private static boolean[] ARTSet99;
  private static boolean[] ARTSet100;
  private static boolean[] ARTSet101;
  private static boolean[] ARTSet102;
  private static boolean[] ARTSet103;
  private static boolean[] ARTSet104;
  private static boolean[] ARTSet105;
  private static boolean[] ARTSet106;
  private static boolean[] ARTSet107;
  private static boolean[] ARTSet108;
  private static boolean[] ARTSet109;
  private static boolean[] ARTSet110;
  private static boolean[] ARTSet111;
  private static boolean[] ARTSet112;
  private static boolean[] ARTSet113;
  private static boolean[] ARTSet114;
  private static boolean[] ARTSet115;
  private static boolean[] ARTSet116;
  private static boolean[] ARTSet117;
  private static boolean[] ARTSet118;
  private static boolean[] ARTSet119;
  private static boolean[] ARTSet120;
  private static boolean[] ARTSet121;
  private static boolean[] ARTSet122;
  private static boolean[] ARTSet123;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_STRING_DQ = 4;
  public static final int ARTTS__SHREIK = 5;
  public static final int ARTTS__AMPERSAND_AMPERSAND = 6;
  public static final int ARTTS__LPAR = 7;
  public static final int ARTTS__RPAR = 8;
  public static final int ARTTS__STAR = 9;
  public static final int ARTTS__STAR_STAR = 10;
  public static final int ARTTS__PLUS = 11;
  public static final int ARTTS__PLUS_EQUAL = 12;
  public static final int ARTTS__COMMA = 13;
  public static final int ARTTS__MINUS = 14;
  public static final int ARTTS__MINUS_EQUAL = 15;
  public static final int ARTTS__PERIOD = 16;
  public static final int ARTTS__SLASH = 17;
  public static final int ARTTS__COLON = 18;
  public static final int ARTTS__SEMICOLON = 19;
  public static final int ARTTS__LT = 20;
  public static final int ARTTS__LT_MINUS = 21;
  public static final int ARTTS__EQUAL = 22;
  public static final int ARTTS__EQUAL_EQUAL = 23;
  public static final int ARTTS__GT = 24;
  public static final int ARTTS_elif = 25;
  public static final int ARTTS_else = 26;
  public static final int ARTTS_false = 27;
  public static final int ARTTS_if = 28;
  public static final int ARTTS_struct = 29;
  public static final int ARTTS_sysline = 30;
  public static final int ARTTS_sysout = 31;
  public static final int ARTTS_true = 32;
  public static final int ARTTS_until = 33;
  public static final int ARTTS_while = 34;
  public static final int ARTTS__LBRACE = 35;
  public static final int ARTTS__BAR_BAR = 36;
  public static final int ARTTS__RBRACE = 37;
  public static final int ARTX_EPSILON = 38;
  public static final int ARTL_ART_AID = 39;
  public static final int ARTL_ART_ID = 40;
  public static final int ARTL_ART_INTEGER = 41;
  public static final int ARTL_ART_REAL = 42;
  public static final int ARTL_ART_STRING_DQ = 43;
  public static final int ARTL_ART_and = 44;
  public static final int ARTL_ART_arg = 45;
  public static final int ARTL_ART_argNote = 46;
  public static final int ARTL_ART_assign = 47;
  public static final int ARTL_ART_compStatements = 48;
  public static final int ARTL_ART_condStatement = 49;
  public static final int ARTL_ART_defStruct = 50;
  public static final int ARTL_ART_deref = 51;
  public static final int ARTL_ART_divide = 52;
  public static final int ARTL_ART_elifExpr = 53;
  public static final int ARTL_ART_equ = 54;
  public static final int ARTL_ART_exponentiate = 55;
  public static final int ARTL_ART_gtr = 56;
  public static final int ARTL_ART_ifExpr = 57;
  public static final int ARTL_ART_loopStatement = 58;
  public static final int ARTL_ART_lss = 59;
  public static final int ARTL_ART_mainExpr = 60;
  public static final int ARTL_ART_memberAssign = 61;
  public static final int ARTL_ART_minus = 62;
  public static final int ARTL_ART_minusEquals = 63;
  public static final int ARTL_ART_multiply = 64;
  public static final int ARTL_ART_negate = 65;
  public static final int ARTL_ART_not = 66;
  public static final int ARTL_ART_operand = 67;
  public static final int ARTL_ART_or = 68;
  public static final int ARTL_ART_plus = 69;
  public static final int ARTL_ART_plusEquals = 70;
  public static final int ARTL_ART_scopeEnter = 71;
  public static final int ARTL_ART_scopeLeave = 72;
  public static final int ARTL_ART_statement = 73;
  public static final int ARTL_ART_statements = 74;
  public static final int ARTL_ART_structArgs = 75;
  public static final int ARTL_ART_structAssign = 76;
  public static final int ARTL_ART_structDefinition = 77;
  public static final int ARTL_ART_structStatement = 78;
  public static final int ARTL_ART_structStatements = 79;
  public static final int ARTL_ART_subExprA = 80;
  public static final int ARTL_ART_subExprB = 81;
  public static final int ARTL_ART_subExprC = 82;
  public static final int ARTL_ART_subExprD = 83;
  public static final int ARTL_ART_subExprE = 84;
  public static final int ARTL_ART_subExprF = 85;
  public static final int ARTL_ART_sysline = 86;
  public static final int ARTL_ART_sysout = 87;
  public static final int ARTL_ART_untilExpr = 88;
  public static final int ARTL_ART_whileExpr = 89;
  public static final int ARTL_ART_AID_651 = 90;
  public static final int ARTL_ART_AID_652 = 91;
  public static final int ARTL_ART_AID_653 = 92;
  public static final int ARTL_ART_AID_654 = 93;
  public static final int ARTL_ART_AID_657 = 94;
  public static final int ARTL_ART_AID_658 = 95;
  public static final int ARTL_ART_AID_659 = 96;
  public static final int ARTL_ART_AID_660 = 97;
  public static final int ARTL_ART_AID_661 = 98;
  public static final int ARTL_ART_AID_662 = 99;
  public static final int ARTL_ART_AID_663 = 100;
  public static final int ARTL_ART_AID_664 = 101;
  public static final int ARTL_ART_ID_667 = 102;
  public static final int ARTL_ART_ID_668 = 103;
  public static final int ARTL_ART_ID_669 = 104;
  public static final int ARTL_ART_ID_670 = 105;
  public static final int ARTL_ART_INTEGER_673 = 106;
  public static final int ARTL_ART_INTEGER_674 = 107;
  public static final int ARTL_ART_INTEGER_675 = 108;
  public static final int ARTL_ART_INTEGER_676 = 109;
  public static final int ARTL_ART_REAL_679 = 110;
  public static final int ARTL_ART_REAL_680 = 111;
  public static final int ARTL_ART_REAL_681 = 112;
  public static final int ARTL_ART_REAL_682 = 113;
  public static final int ARTL_ART_STRING_DQ_685 = 114;
  public static final int ARTL_ART_STRING_DQ_686 = 115;
  public static final int ARTL_ART_STRING_DQ_687 = 116;
  public static final int ARTL_ART_STRING_DQ_688 = 117;
  public static final int ARTL_ART_and_575 = 118;
  public static final int ARTL_ART_and_576 = 119;
  public static final int ARTL_ART_and_577 = 120;
  public static final int ARTL_ART_and_578 = 121;
  public static final int ARTL_ART_and_579 = 122;
  public static final int ARTL_ART_and_580 = 123;
  public static final int ARTL_ART_and_581 = 124;
  public static final int ARTL_ART_and_582 = 125;
  public static final int ARTL_ART_arg_461 = 126;
  public static final int ARTL_ART_arg_462 = 127;
  public static final int ARTL_ART_arg_463 = 128;
  public static final int ARTL_ART_arg_464 = 129;
  public static final int ARTL_ART_arg_467 = 130;
  public static final int ARTL_ART_arg_468 = 131;
  public static final int ARTL_ART_arg_469 = 132;
  public static final int ARTL_ART_arg_470 = 133;
  public static final int ARTL_ART_arg_471 = 134;
  public static final int ARTL_ART_arg_472 = 135;
  public static final int ARTL_ART_argNote_475 = 136;
  public static final int ARTL_ART_argNote_476 = 137;
  public static final int ARTL_ART_argNote_477 = 138;
  public static final int ARTL_ART_argNote_478 = 139;
  public static final int ARTL_ART_argNote_479 = 140;
  public static final int ARTL_ART_argNote_480 = 141;
  public static final int ARTL_ART_argNote_481 = 142;
  public static final int ARTL_ART_argNote_482 = 143;
  public static final int ARTL_ART_argNote_483 = 144;
  public static final int ARTL_ART_argNote_484 = 145;
  public static final int ARTL_ART_assign_397 = 146;
  public static final int ARTL_ART_assign_398 = 147;
  public static final int ARTL_ART_assign_399 = 148;
  public static final int ARTL_ART_assign_400 = 149;
  public static final int ARTL_ART_assign_401 = 150;
  public static final int ARTL_ART_assign_402 = 151;
  public static final int ARTL_ART_assign_403 = 152;
  public static final int ARTL_ART_assign_404 = 153;
  public static final int ARTL_ART_assign_405 = 154;
  public static final int ARTL_ART_assign_406 = 155;
  public static final int ARTL_ART_assign_409 = 156;
  public static final int ARTL_ART_assign_410 = 157;
  public static final int ARTL_ART_assign_411 = 158;
  public static final int ARTL_ART_assign_412 = 159;
  public static final int ARTL_ART_assign_413 = 160;
  public static final int ARTL_ART_assign_414 = 161;
  public static final int ARTL_ART_assign_415 = 162;
  public static final int ARTL_ART_assign_416 = 163;
  public static final int ARTL_ART_assign_417 = 164;
  public static final int ARTL_ART_assign_418 = 165;
  public static final int ARTL_ART_assign_419 = 166;
  public static final int ARTL_ART_assign_420 = 167;
  public static final int ARTL_ART_compStatements_11 = 168;
  public static final int ARTL_ART_compStatements_12 = 169;
  public static final int ARTL_ART_compStatements_13 = 170;
  public static final int ARTL_ART_compStatements_14 = 171;
  public static final int ARTL_ART_compStatements_15 = 172;
  public static final int ARTL_ART_compStatements_16 = 173;
  public static final int ARTL_ART_compStatements_17 = 174;
  public static final int ARTL_ART_compStatements_18 = 175;
  public static final int ARTL_ART_compStatements_19 = 176;
  public static final int ARTL_ART_compStatements_20 = 177;
  public static final int ARTL_ART_compStatements_23 = 178;
  public static final int ARTL_ART_compStatements_24 = 179;
  public static final int ARTL_ART_condStatement_121 = 180;
  public static final int ARTL_ART_condStatement_122 = 181;
  public static final int ARTL_ART_condStatement_123 = 182;
  public static final int ARTL_ART_condStatement_124 = 183;
  public static final int ARTL_ART_condStatement_125 = 184;
  public static final int ARTL_ART_condStatement_126 = 185;
  public static final int ARTL_ART_condStatement_129 = 186;
  public static final int ARTL_ART_condStatement_130 = 187;
  public static final int ARTL_ART_condStatement_131 = 188;
  public static final int ARTL_ART_condStatement_132 = 189;
  public static final int ARTL_ART_condStatement_133 = 190;
  public static final int ARTL_ART_condStatement_134 = 191;
  public static final int ARTL_ART_condStatement_135 = 192;
  public static final int ARTL_ART_condStatement_136 = 193;
  public static final int ARTL_ART_condStatement_137 = 194;
  public static final int ARTL_ART_condStatement_138 = 195;
  public static final int ARTL_ART_condStatement_141 = 196;
  public static final int ARTL_ART_condStatement_142 = 197;
  public static final int ARTL_ART_condStatement_143 = 198;
  public static final int ARTL_ART_condStatement_144 = 199;
  public static final int ARTL_ART_condStatement_145 = 200;
  public static final int ARTL_ART_condStatement_146 = 201;
  public static final int ARTL_ART_condStatement_147 = 202;
  public static final int ARTL_ART_condStatement_148 = 203;
  public static final int ARTL_ART_condStatement_149 = 204;
  public static final int ARTL_ART_condStatement_150 = 205;
  public static final int ARTL_ART_condStatement_153 = 206;
  public static final int ARTL_ART_condStatement_154 = 207;
  public static final int ARTL_ART_condStatement_155 = 208;
  public static final int ARTL_ART_condStatement_156 = 209;
  public static final int ARTL_ART_condStatement_157 = 210;
  public static final int ARTL_ART_condStatement_158 = 211;
  public static final int ARTL_ART_condStatement_159 = 212;
  public static final int ARTL_ART_condStatement_160 = 213;
  public static final int ARTL_ART_condStatement_161 = 214;
  public static final int ARTL_ART_condStatement_162 = 215;
  public static final int ARTL_ART_condStatement_165 = 216;
  public static final int ARTL_ART_condStatement_166 = 217;
  public static final int ARTL_ART_condStatement_167 = 218;
  public static final int ARTL_ART_condStatement_168 = 219;
  public static final int ARTL_ART_condStatement_169 = 220;
  public static final int ARTL_ART_condStatement_170 = 221;
  public static final int ARTL_ART_condStatement_171 = 222;
  public static final int ARTL_ART_condStatement_172 = 223;
  public static final int ARTL_ART_condStatement_173 = 224;
  public static final int ARTL_ART_condStatement_174 = 225;
  public static final int ARTL_ART_defStruct_93 = 226;
  public static final int ARTL_ART_defStruct_94 = 227;
  public static final int ARTL_ART_defStruct_95 = 228;
  public static final int ARTL_ART_defStruct_96 = 229;
  public static final int ARTL_ART_defStruct_97 = 230;
  public static final int ARTL_ART_defStruct_98 = 231;
  public static final int ARTL_ART_defStruct_101 = 232;
  public static final int ARTL_ART_defStruct_102 = 233;
  public static final int ARTL_ART_deref_645 = 234;
  public static final int ARTL_ART_deref_646 = 235;
  public static final int ARTL_ART_deref_647 = 236;
  public static final int ARTL_ART_deref_648 = 237;
  public static final int ARTL_ART_divide_539 = 238;
  public static final int ARTL_ART_divide_540 = 239;
  public static final int ARTL_ART_divide_541 = 240;
  public static final int ARTL_ART_divide_542 = 241;
  public static final int ARTL_ART_divide_543 = 242;
  public static final int ARTL_ART_divide_544 = 243;
  public static final int ARTL_ART_divide_545 = 244;
  public static final int ARTL_ART_divide_546 = 245;
  public static final int ARTL_ART_elifExpr_201 = 246;
  public static final int ARTL_ART_elifExpr_202 = 247;
  public static final int ARTL_ART_elifExpr_203 = 248;
  public static final int ARTL_ART_elifExpr_204 = 249;
  public static final int ARTL_ART_elifExpr_205 = 250;
  public static final int ARTL_ART_elifExpr_206 = 251;
  public static final int ARTL_ART_equ_367 = 252;
  public static final int ARTL_ART_equ_368 = 253;
  public static final int ARTL_ART_equ_369 = 254;
  public static final int ARTL_ART_equ_370 = 255;
  public static final int ARTL_ART_equ_371 = 256;
  public static final int ARTL_ART_equ_372 = 257;
  public static final int ARTL_ART_equ_373 = 258;
  public static final int ARTL_ART_equ_374 = 259;
  public static final int ARTL_ART_exponentiate_549 = 260;
  public static final int ARTL_ART_exponentiate_550 = 261;
  public static final int ARTL_ART_exponentiate_551 = 262;
  public static final int ARTL_ART_exponentiate_552 = 263;
  public static final int ARTL_ART_exponentiate_553 = 264;
  public static final int ARTL_ART_exponentiate_554 = 265;
  public static final int ARTL_ART_exponentiate_555 = 266;
  public static final int ARTL_ART_exponentiate_556 = 267;
  public static final int ARTL_ART_gtr_377 = 268;
  public static final int ARTL_ART_gtr_378 = 269;
  public static final int ARTL_ART_gtr_379 = 270;
  public static final int ARTL_ART_gtr_380 = 271;
  public static final int ARTL_ART_gtr_381 = 272;
  public static final int ARTL_ART_gtr_382 = 273;
  public static final int ARTL_ART_gtr_383 = 274;
  public static final int ARTL_ART_gtr_384 = 275;
  public static final int ARTL_ART_ifExpr_193 = 276;
  public static final int ARTL_ART_ifExpr_194 = 277;
  public static final int ARTL_ART_ifExpr_195 = 278;
  public static final int ARTL_ART_ifExpr_196 = 279;
  public static final int ARTL_ART_ifExpr_197 = 280;
  public static final int ARTL_ART_ifExpr_198 = 281;
  public static final int ARTL_ART_loopStatement_105 = 282;
  public static final int ARTL_ART_loopStatement_106 = 283;
  public static final int ARTL_ART_loopStatement_107 = 284;
  public static final int ARTL_ART_loopStatement_108 = 285;
  public static final int ARTL_ART_loopStatement_109 = 286;
  public static final int ARTL_ART_loopStatement_110 = 287;
  public static final int ARTL_ART_loopStatement_113 = 288;
  public static final int ARTL_ART_loopStatement_114 = 289;
  public static final int ARTL_ART_loopStatement_115 = 290;
  public static final int ARTL_ART_loopStatement_116 = 291;
  public static final int ARTL_ART_loopStatement_117 = 292;
  public static final int ARTL_ART_loopStatement_118 = 293;
  public static final int ARTL_ART_lss_387 = 294;
  public static final int ARTL_ART_lss_388 = 295;
  public static final int ARTL_ART_lss_389 = 296;
  public static final int ARTL_ART_lss_390 = 297;
  public static final int ARTL_ART_lss_391 = 298;
  public static final int ARTL_ART_lss_392 = 299;
  public static final int ARTL_ART_lss_393 = 300;
  public static final int ARTL_ART_lss_394 = 301;
  public static final int ARTL_ART_mainExpr_249 = 302;
  public static final int ARTL_ART_mainExpr_250 = 303;
  public static final int ARTL_ART_mainExpr_251 = 304;
  public static final int ARTL_ART_mainExpr_252 = 305;
  public static final int ARTL_ART_mainExpr_253 = 306;
  public static final int ARTL_ART_mainExpr_254 = 307;
  public static final int ARTL_ART_mainExpr_255 = 308;
  public static final int ARTL_ART_mainExpr_256 = 309;
  public static final int ARTL_ART_memberAssign_237 = 310;
  public static final int ARTL_ART_memberAssign_238 = 311;
  public static final int ARTL_ART_memberAssign_239 = 312;
  public static final int ARTL_ART_memberAssign_240 = 313;
  public static final int ARTL_ART_memberAssign_241 = 314;
  public static final int ARTL_ART_memberAssign_242 = 315;
  public static final int ARTL_ART_memberAssign_243 = 316;
  public static final int ARTL_ART_memberAssign_244 = 317;
  public static final int ARTL_ART_memberAssign_245 = 318;
  public static final int ARTL_ART_memberAssign_246 = 319;
  public static final int ARTL_ART_minus_519 = 320;
  public static final int ARTL_ART_minus_520 = 321;
  public static final int ARTL_ART_minus_521 = 322;
  public static final int ARTL_ART_minus_522 = 323;
  public static final int ARTL_ART_minus_523 = 324;
  public static final int ARTL_ART_minus_524 = 325;
  public static final int ARTL_ART_minus_525 = 326;
  public static final int ARTL_ART_minus_526 = 327;
  public static final int ARTL_ART_minusEquals_497 = 328;
  public static final int ARTL_ART_minusEquals_498 = 329;
  public static final int ARTL_ART_minusEquals_499 = 330;
  public static final int ARTL_ART_minusEquals_500 = 331;
  public static final int ARTL_ART_minusEquals_501 = 332;
  public static final int ARTL_ART_minusEquals_502 = 333;
  public static final int ARTL_ART_minusEquals_503 = 334;
  public static final int ARTL_ART_minusEquals_504 = 335;
  public static final int ARTL_ART_minusEquals_505 = 336;
  public static final int ARTL_ART_minusEquals_506 = 337;
  public static final int ARTL_ART_multiply_529 = 338;
  public static final int ARTL_ART_multiply_530 = 339;
  public static final int ARTL_ART_multiply_531 = 340;
  public static final int ARTL_ART_multiply_532 = 341;
  public static final int ARTL_ART_multiply_533 = 342;
  public static final int ARTL_ART_multiply_534 = 343;
  public static final int ARTL_ART_multiply_535 = 344;
  public static final int ARTL_ART_multiply_536 = 345;
  public static final int ARTL_ART_negate_567 = 346;
  public static final int ARTL_ART_negate_568 = 347;
  public static final int ARTL_ART_negate_569 = 348;
  public static final int ARTL_ART_negate_570 = 349;
  public static final int ARTL_ART_negate_571 = 350;
  public static final int ARTL_ART_negate_572 = 351;
  public static final int ARTL_ART_not_559 = 352;
  public static final int ARTL_ART_not_560 = 353;
  public static final int ARTL_ART_not_561 = 354;
  public static final int ARTL_ART_not_562 = 355;
  public static final int ARTL_ART_not_563 = 356;
  public static final int ARTL_ART_not_564 = 357;
  public static final int ARTL_ART_operand_595 = 358;
  public static final int ARTL_ART_operand_596 = 359;
  public static final int ARTL_ART_operand_597 = 360;
  public static final int ARTL_ART_operand_598 = 361;
  public static final int ARTL_ART_operand_601 = 362;
  public static final int ARTL_ART_operand_602 = 363;
  public static final int ARTL_ART_operand_603 = 364;
  public static final int ARTL_ART_operand_604 = 365;
  public static final int ARTL_ART_operand_607 = 366;
  public static final int ARTL_ART_operand_608 = 367;
  public static final int ARTL_ART_operand_609 = 368;
  public static final int ARTL_ART_operand_610 = 369;
  public static final int ARTL_ART_operand_613 = 370;
  public static final int ARTL_ART_operand_614 = 371;
  public static final int ARTL_ART_operand_615 = 372;
  public static final int ARTL_ART_operand_616 = 373;
  public static final int ARTL_ART_operand_619 = 374;
  public static final int ARTL_ART_operand_620 = 375;
  public static final int ARTL_ART_operand_621 = 376;
  public static final int ARTL_ART_operand_622 = 377;
  public static final int ARTL_ART_operand_625 = 378;
  public static final int ARTL_ART_operand_626 = 379;
  public static final int ARTL_ART_operand_627 = 380;
  public static final int ARTL_ART_operand_628 = 381;
  public static final int ARTL_ART_operand_631 = 382;
  public static final int ARTL_ART_operand_632 = 383;
  public static final int ARTL_ART_operand_633 = 384;
  public static final int ARTL_ART_operand_634 = 385;
  public static final int ARTL_ART_operand_635 = 386;
  public static final int ARTL_ART_operand_636 = 387;
  public static final int ARTL_ART_operand_637 = 388;
  public static final int ARTL_ART_operand_638 = 389;
  public static final int ARTL_ART_operand_641 = 390;
  public static final int ARTL_ART_operand_642 = 391;
  public static final int ARTL_ART_operand_643 = 392;
  public static final int ARTL_ART_operand_644 = 393;
  public static final int ARTL_ART_or_585 = 394;
  public static final int ARTL_ART_or_586 = 395;
  public static final int ARTL_ART_or_587 = 396;
  public static final int ARTL_ART_or_588 = 397;
  public static final int ARTL_ART_or_589 = 398;
  public static final int ARTL_ART_or_590 = 399;
  public static final int ARTL_ART_or_591 = 400;
  public static final int ARTL_ART_or_592 = 401;
  public static final int ARTL_ART_plus_509 = 402;
  public static final int ARTL_ART_plus_510 = 403;
  public static final int ARTL_ART_plus_511 = 404;
  public static final int ARTL_ART_plus_512 = 405;
  public static final int ARTL_ART_plus_513 = 406;
  public static final int ARTL_ART_plus_514 = 407;
  public static final int ARTL_ART_plus_515 = 408;
  public static final int ARTL_ART_plus_516 = 409;
  public static final int ARTL_ART_plusEquals_485 = 410;
  public static final int ARTL_ART_plusEquals_486 = 411;
  public static final int ARTL_ART_plusEquals_487 = 412;
  public static final int ARTL_ART_plusEquals_488 = 413;
  public static final int ARTL_ART_plusEquals_489 = 414;
  public static final int ARTL_ART_plusEquals_490 = 415;
  public static final int ARTL_ART_plusEquals_491 = 416;
  public static final int ARTL_ART_plusEquals_492 = 417;
  public static final int ARTL_ART_plusEquals_493 = 418;
  public static final int ARTL_ART_plusEquals_494 = 419;
  public static final int ARTL_ART_scopeEnter_81 = 420;
  public static final int ARTL_ART_scopeEnter_82 = 421;
  public static final int ARTL_ART_scopeEnter_83 = 422;
  public static final int ARTL_ART_scopeEnter_84 = 423;
  public static final int ARTL_ART_scopeLeave_87 = 424;
  public static final int ARTL_ART_scopeLeave_88 = 425;
  public static final int ARTL_ART_scopeLeave_89 = 426;
  public static final int ARTL_ART_scopeLeave_90 = 427;
  public static final int ARTL_ART_statement_27 = 428;
  public static final int ARTL_ART_statement_28 = 429;
  public static final int ARTL_ART_statement_29 = 430;
  public static final int ARTL_ART_statement_30 = 431;
  public static final int ARTL_ART_statement_31 = 432;
  public static final int ARTL_ART_statement_32 = 433;
  public static final int ARTL_ART_statement_33 = 434;
  public static final int ARTL_ART_statement_34 = 435;
  public static final int ARTL_ART_statement_35 = 436;
  public static final int ARTL_ART_statement_36 = 437;
  public static final int ARTL_ART_statement_37 = 438;
  public static final int ARTL_ART_statement_38 = 439;
  public static final int ARTL_ART_statement_39 = 440;
  public static final int ARTL_ART_statement_40 = 441;
  public static final int ARTL_ART_statement_41 = 442;
  public static final int ARTL_ART_statement_42 = 443;
  public static final int ARTL_ART_statement_43 = 444;
  public static final int ARTL_ART_statement_44 = 445;
  public static final int ARTL_ART_statement_45 = 446;
  public static final int ARTL_ART_statement_46 = 447;
  public static final int ARTL_ART_statement_47 = 448;
  public static final int ARTL_ART_statement_48 = 449;
  public static final int ARTL_ART_statement_49 = 450;
  public static final int ARTL_ART_statement_50 = 451;
  public static final int ARTL_ART_statements_1 = 452;
  public static final int ARTL_ART_statements_2 = 453;
  public static final int ARTL_ART_statements_3 = 454;
  public static final int ARTL_ART_statements_4 = 455;
  public static final int ARTL_ART_statements_5 = 456;
  public static final int ARTL_ART_statements_6 = 457;
  public static final int ARTL_ART_statements_7 = 458;
  public static final int ARTL_ART_statements_8 = 459;
  public static final int ARTL_ART_statements_9 = 460;
  public static final int ARTL_ART_statements_10 = 461;
  public static final int ARTL_ART_structArgs_445 = 462;
  public static final int ARTL_ART_structArgs_446 = 463;
  public static final int ARTL_ART_structArgs_447 = 464;
  public static final int ARTL_ART_structArgs_448 = 465;
  public static final int ARTL_ART_structArgs_449 = 466;
  public static final int ARTL_ART_structArgs_450 = 467;
  public static final int ARTL_ART_structArgs_453 = 468;
  public static final int ARTL_ART_structArgs_454 = 469;
  public static final int ARTL_ART_structArgs_455 = 470;
  public static final int ARTL_ART_structArgs_456 = 471;
  public static final int ARTL_ART_structArgs_457 = 472;
  public static final int ARTL_ART_structArgs_458 = 473;
  public static final int ARTL_ART_structAssign_421 = 474;
  public static final int ARTL_ART_structAssign_422 = 475;
  public static final int ARTL_ART_structAssign_423 = 476;
  public static final int ARTL_ART_structAssign_424 = 477;
  public static final int ARTL_ART_structAssign_427 = 478;
  public static final int ARTL_ART_structAssign_428 = 479;
  public static final int ARTL_ART_structAssign_429 = 480;
  public static final int ARTL_ART_structAssign_430 = 481;
  public static final int ARTL_ART_structAssign_433 = 482;
  public static final int ARTL_ART_structAssign_434 = 483;
  public static final int ARTL_ART_structAssign_435 = 484;
  public static final int ARTL_ART_structAssign_436 = 485;
  public static final int ARTL_ART_structAssign_437 = 486;
  public static final int ARTL_ART_structAssign_438 = 487;
  public static final int ARTL_ART_structAssign_441 = 488;
  public static final int ARTL_ART_structAssign_442 = 489;
  public static final int ARTL_ART_structDefinition_51 = 490;
  public static final int ARTL_ART_structDefinition_52 = 491;
  public static final int ARTL_ART_structDefinition_53 = 492;
  public static final int ARTL_ART_structDefinition_54 = 493;
  public static final int ARTL_ART_structDefinition_55 = 494;
  public static final int ARTL_ART_structDefinition_56 = 495;
  public static final int ARTL_ART_structDefinition_57 = 496;
  public static final int ARTL_ART_structDefinition_58 = 497;
  public static final int ARTL_ART_structDefinition_59 = 498;
  public static final int ARTL_ART_structDefinition_60 = 499;
  public static final int ARTL_ART_structDefinition_61 = 500;
  public static final int ARTL_ART_structDefinition_62 = 501;
  public static final int ARTL_ART_structDefinition_63 = 502;
  public static final int ARTL_ART_structDefinition_64 = 503;
  public static final int ARTL_ART_structDefinition_65 = 504;
  public static final int ARTL_ART_structDefinition_66 = 505;
  public static final int ARTL_ART_structStatement_77 = 506;
  public static final int ARTL_ART_structStatement_78 = 507;
  public static final int ARTL_ART_structStatement_79 = 508;
  public static final int ARTL_ART_structStatement_80 = 509;
  public static final int ARTL_ART_structStatements_67 = 510;
  public static final int ARTL_ART_structStatements_68 = 511;
  public static final int ARTL_ART_structStatements_69 = 512;
  public static final int ARTL_ART_structStatements_70 = 513;
  public static final int ARTL_ART_structStatements_71 = 514;
  public static final int ARTL_ART_structStatements_72 = 515;
  public static final int ARTL_ART_structStatements_73 = 516;
  public static final int ARTL_ART_structStatements_74 = 517;
  public static final int ARTL_ART_structStatements_75 = 518;
  public static final int ARTL_ART_structStatements_76 = 519;
  public static final int ARTL_ART_subExprA_259 = 520;
  public static final int ARTL_ART_subExprA_260 = 521;
  public static final int ARTL_ART_subExprA_261 = 522;
  public static final int ARTL_ART_subExprA_262 = 523;
  public static final int ARTL_ART_subExprA_265 = 524;
  public static final int ARTL_ART_subExprA_266 = 525;
  public static final int ARTL_ART_subExprA_267 = 526;
  public static final int ARTL_ART_subExprA_268 = 527;
  public static final int ARTL_ART_subExprA_271 = 528;
  public static final int ARTL_ART_subExprA_272 = 529;
  public static final int ARTL_ART_subExprA_273 = 530;
  public static final int ARTL_ART_subExprA_274 = 531;
  public static final int ARTL_ART_subExprA_277 = 532;
  public static final int ARTL_ART_subExprA_278 = 533;
  public static final int ARTL_ART_subExprA_279 = 534;
  public static final int ARTL_ART_subExprA_280 = 535;
  public static final int ARTL_ART_subExprA_283 = 536;
  public static final int ARTL_ART_subExprA_284 = 537;
  public static final int ARTL_ART_subExprA_285 = 538;
  public static final int ARTL_ART_subExprA_286 = 539;
  public static final int ARTL_ART_subExprA_289 = 540;
  public static final int ARTL_ART_subExprA_290 = 541;
  public static final int ARTL_ART_subExprA_291 = 542;
  public static final int ARTL_ART_subExprA_292 = 543;
  public static final int ARTL_ART_subExprB_295 = 544;
  public static final int ARTL_ART_subExprB_296 = 545;
  public static final int ARTL_ART_subExprB_297 = 546;
  public static final int ARTL_ART_subExprB_298 = 547;
  public static final int ARTL_ART_subExprB_301 = 548;
  public static final int ARTL_ART_subExprB_302 = 549;
  public static final int ARTL_ART_subExprB_303 = 550;
  public static final int ARTL_ART_subExprB_304 = 551;
  public static final int ARTL_ART_subExprB_307 = 552;
  public static final int ARTL_ART_subExprB_308 = 553;
  public static final int ARTL_ART_subExprB_309 = 554;
  public static final int ARTL_ART_subExprB_310 = 555;
  public static final int ARTL_ART_subExprC_313 = 556;
  public static final int ARTL_ART_subExprC_314 = 557;
  public static final int ARTL_ART_subExprC_315 = 558;
  public static final int ARTL_ART_subExprC_316 = 559;
  public static final int ARTL_ART_subExprC_319 = 560;
  public static final int ARTL_ART_subExprC_320 = 561;
  public static final int ARTL_ART_subExprC_321 = 562;
  public static final int ARTL_ART_subExprC_322 = 563;
  public static final int ARTL_ART_subExprC_325 = 564;
  public static final int ARTL_ART_subExprC_326 = 565;
  public static final int ARTL_ART_subExprC_327 = 566;
  public static final int ARTL_ART_subExprC_328 = 567;
  public static final int ARTL_ART_subExprD_331 = 568;
  public static final int ARTL_ART_subExprD_332 = 569;
  public static final int ARTL_ART_subExprD_333 = 570;
  public static final int ARTL_ART_subExprD_334 = 571;
  public static final int ARTL_ART_subExprD_337 = 572;
  public static final int ARTL_ART_subExprD_338 = 573;
  public static final int ARTL_ART_subExprD_339 = 574;
  public static final int ARTL_ART_subExprD_340 = 575;
  public static final int ARTL_ART_subExprE_343 = 576;
  public static final int ARTL_ART_subExprE_344 = 577;
  public static final int ARTL_ART_subExprE_345 = 578;
  public static final int ARTL_ART_subExprE_346 = 579;
  public static final int ARTL_ART_subExprE_349 = 580;
  public static final int ARTL_ART_subExprE_350 = 581;
  public static final int ARTL_ART_subExprE_351 = 582;
  public static final int ARTL_ART_subExprE_352 = 583;
  public static final int ARTL_ART_subExprE_355 = 584;
  public static final int ARTL_ART_subExprE_356 = 585;
  public static final int ARTL_ART_subExprE_357 = 586;
  public static final int ARTL_ART_subExprE_358 = 587;
  public static final int ARTL_ART_subExprF_361 = 588;
  public static final int ARTL_ART_subExprF_362 = 589;
  public static final int ARTL_ART_subExprF_363 = 590;
  public static final int ARTL_ART_subExprF_364 = 591;
  public static final int ARTL_ART_sysline_223 = 592;
  public static final int ARTL_ART_sysline_224 = 593;
  public static final int ARTL_ART_sysline_225 = 594;
  public static final int ARTL_ART_sysline_226 = 595;
  public static final int ARTL_ART_sysline_227 = 596;
  public static final int ARTL_ART_sysline_228 = 597;
  public static final int ARTL_ART_sysline_229 = 598;
  public static final int ARTL_ART_sysline_230 = 599;
  public static final int ARTL_ART_sysline_231 = 600;
  public static final int ARTL_ART_sysline_232 = 601;
  public static final int ARTL_ART_sysline_235 = 602;
  public static final int ARTL_ART_sysline_236 = 603;
  public static final int ARTL_ART_sysout_209 = 604;
  public static final int ARTL_ART_sysout_210 = 605;
  public static final int ARTL_ART_sysout_211 = 606;
  public static final int ARTL_ART_sysout_212 = 607;
  public static final int ARTL_ART_sysout_213 = 608;
  public static final int ARTL_ART_sysout_214 = 609;
  public static final int ARTL_ART_sysout_215 = 610;
  public static final int ARTL_ART_sysout_216 = 611;
  public static final int ARTL_ART_sysout_217 = 612;
  public static final int ARTL_ART_sysout_218 = 613;
  public static final int ARTL_ART_sysout_221 = 614;
  public static final int ARTL_ART_sysout_222 = 615;
  public static final int ARTL_ART_untilExpr_185 = 616;
  public static final int ARTL_ART_untilExpr_186 = 617;
  public static final int ARTL_ART_untilExpr_187 = 618;
  public static final int ARTL_ART_untilExpr_188 = 619;
  public static final int ARTL_ART_untilExpr_189 = 620;
  public static final int ARTL_ART_untilExpr_190 = 621;
  public static final int ARTL_ART_whileExpr_177 = 622;
  public static final int ARTL_ART_whileExpr_178 = 623;
  public static final int ARTL_ART_whileExpr_179 = 624;
  public static final int ARTL_ART_whileExpr_180 = 625;
  public static final int ARTL_ART_whileExpr_181 = 626;
  public static final int ARTL_ART_whileExpr_182 = 627;
  public static final int ARTX_DESPATCH = 628;
  public static final int ARTX_DUMMY = 629;
  public static final int ARTX_LABEL_EXTENT = 630;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_AID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal AID production descriptor loads*/
      case ARTL_ART_AID: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AID_652, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AID_658, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal AID: match production*/
      case ARTL_ART_AID_652: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AID_654, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AID_654: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AID: match production*/
      case ARTL_ART_AID_658: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AID_660, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AID_660: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AID_662, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AID_664, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AID_664: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_668, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_668: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_670, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_674, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_674: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_676, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_REAL() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal REAL production descriptor loads*/
      case ARTL_ART_REAL: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_REAL_680, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_680: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_682, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_686, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_686: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_688, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_and() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal and production descriptor loads*/
      case ARTL_ART_and: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_and_576, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal and: match production*/
      case ARTL_ART_and_576: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_578, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_and_578: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND_AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_and_580, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_582, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_and_582: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_arg() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal arg production descriptor loads*/
      case ARTL_ART_arg: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_arg_462, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_arg_468, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal arg: match production*/
      case ARTL_ART_arg_462: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_arg_464, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal arg: match production*/
      case ARTL_ART_arg_468: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_arg_470, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_arg_470: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_arg_472, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_argNote; return; }
      case ARTL_ART_arg_472: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_argNote() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal argNote production descriptor loads*/
      case ARTL_ART_argNote: 
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_argNote_476, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_argNote_482, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal argNote: match production*/
      case ARTL_ART_argNote_476: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_argNote_478, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_argNote_480, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_argNote_480: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal argNote: match production*/
      case ARTL_ART_argNote_482: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_argNote_484, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_assign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal assign production descriptor loads*/
      case ARTL_ART_assign: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_398, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_410, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_414, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_418, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_398: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_400, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AID; return; }
      case ARTL_ART_assign_400: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_402, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_404, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_assign_404: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_406, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_410: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_412, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structAssign; return; }
      case ARTL_ART_assign_412: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_414: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_416, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_plusEquals; return; }
      case ARTL_ART_assign_416: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_418: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_420, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_minusEquals; return; }
      case ARTL_ART_assign_420: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_compStatements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal compStatements production descriptor loads*/
      case ARTL_ART_compStatements: 
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_compStatements_12, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_compStatements_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal compStatements: match production*/
      case ARTL_ART_compStatements_12: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compStatements_14, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_scopeEnter; return; }
      case ARTL_ART_compStatements_14: 
        /* Nonterminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compStatements_16, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_compStatements_16: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compStatements_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_scopeLeave; return; }
      case ARTL_ART_compStatements_18: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal compStatements: match production*/
      case ARTL_ART_compStatements_20: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compStatements_24, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_compStatements_24: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_condStatement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal condStatement production descriptor loads*/
      case ARTL_ART_condStatement: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condStatement_122, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condStatement_130, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condStatement_142, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condStatement_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condStatement_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal condStatement: match production*/
      case ARTL_ART_condStatement_122: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ifExpr; return; }
      case ARTL_ART_condStatement_124: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_126, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_126: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condStatement: match production*/
      case ARTL_ART_condStatement_130: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ifExpr; return; }
      case ARTL_ART_condStatement_132: 
        /* Nonterminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_134, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_134: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_136, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elifExpr; return; }
      case ARTL_ART_condStatement_136: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_138: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condStatement: match production*/
      case ARTL_ART_condStatement_142: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_144, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elifExpr; return; }
      case ARTL_ART_condStatement_144: 
        /* Nonterminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_146: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_148, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elifExpr; return; }
      case ARTL_ART_condStatement_148: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_150: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condStatement: match production*/
      case ARTL_ART_condStatement_154: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ifExpr; return; }
      case ARTL_ART_condStatement_156: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_158, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_158: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condStatement_160, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_162, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_162: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condStatement: match production*/
      case ARTL_ART_condStatement_166: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elifExpr; return; }
      case ARTL_ART_condStatement_168: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_170: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condStatement_172, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condStatement_174, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_condStatement_174: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_defStruct() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal defStruct production descriptor loads*/
      case ARTL_ART_defStruct: 
        if (ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_defStruct_94, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal defStruct: match production*/
      case ARTL_ART_defStruct_94: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_struct, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_defStruct_96, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_defStruct_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_defStruct_98: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_defStruct_102, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structDefinition; return; }
      case ARTL_ART_defStruct_102: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_646, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_646: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_648, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AID; return; }
      case ARTL_ART_deref_648: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_divide() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal divide production descriptor loads*/
      case ARTL_ART_divide: 
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_divide_540, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal divide: match production*/
      case ARTL_ART_divide_540: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_divide_542, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_divide_542: 
        /* Nonterminal template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_divide_544, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_divide_546, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprD; return; }
      case ARTL_ART_divide_546: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_elifExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal elifExpr production descriptor loads*/
      case ARTL_ART_elifExpr: 
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_elifExpr_202, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal elifExpr: match production*/
      case ARTL_ART_elifExpr_202: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_elif, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_elifExpr_204, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_elifExpr_206, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_elifExpr_206: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_equ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal equ production descriptor loads*/
      case ARTL_ART_equ: 
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_equ_368, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal equ: match production*/
      case ARTL_ART_equ_368: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_equ_370, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_equ_370: 
        /* Nonterminal template end */
        if (!ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_equ_372, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_equ_374, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_equ_374: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_exponentiate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal exponentiate production descriptor loads*/
      case ARTL_ART_exponentiate: 
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_exponentiate_550, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal exponentiate: match production*/
      case ARTL_ART_exponentiate_550: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exponentiate_552, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprE; return; }
      case ARTL_ART_exponentiate_552: 
        /* Nonterminal template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_exponentiate_554, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exponentiate_556, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprD; return; }
      case ARTL_ART_exponentiate_556: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gtr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gtr production descriptor loads*/
      case ARTL_ART_gtr: 
        if (ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gtr_378, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gtr: match production*/
      case ARTL_ART_gtr_378: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gtr_380, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_gtr_380: 
        /* Nonterminal template end */
        if (!ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gtr_382, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gtr_384, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_gtr_384: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ifExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ifExpr production descriptor loads*/
      case ARTL_ART_ifExpr: 
        if (ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ifExpr_194, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ifExpr: match production*/
      case ARTL_ART_ifExpr_194: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ifExpr_196, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ifExpr_198, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_ifExpr_198: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_loopStatement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal loopStatement production descriptor loads*/
      case ARTL_ART_loopStatement: 
        if (ARTSet64[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_loopStatement_106, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_loopStatement_114, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal loopStatement: match production*/
      case ARTL_ART_loopStatement_106: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_loopStatement_108, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_whileExpr; return; }
      case ARTL_ART_loopStatement_108: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_loopStatement_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_loopStatement_110: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal loopStatement: match production*/
      case ARTL_ART_loopStatement_114: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_loopStatement_116, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_untilExpr; return; }
      case ARTL_ART_loopStatement_116: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_loopStatement_118, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_compStatements; return; }
      case ARTL_ART_loopStatement_118: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_lss() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal lss production descriptor loads*/
      case ARTL_ART_lss: 
        if (ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lss_388, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lss: match production*/
      case ARTL_ART_lss_388: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lss_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_lss_390: 
        /* Nonterminal template end */
        if (!ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lss_392, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lss_394, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_lss_394: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mainExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mainExpr production descriptor loads*/
      case ARTL_ART_mainExpr: 
        if (ARTSet69[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainExpr_250, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainExpr_254, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mainExpr: match production*/
      case ARTL_ART_mainExpr_250: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainExpr_252, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_assign; return; }
      case ARTL_ART_mainExpr_252: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal mainExpr: match production*/
      case ARTL_ART_mainExpr_254: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainExpr_256, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_mainExpr_256: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_memberAssign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal memberAssign production descriptor loads*/
      case ARTL_ART_memberAssign: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_memberAssign_238, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal memberAssign: match production*/
      case ARTL_ART_memberAssign_238: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_memberAssign_240, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_memberAssign_240: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_memberAssign_242, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_memberAssign_244, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_memberAssign_244: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_memberAssign_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_minus() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal minus production descriptor loads*/
      case ARTL_ART_minus: 
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_minus_520, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal minus: match production*/
      case ARTL_ART_minus_520: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_minus_522, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_minus_522: 
        /* Nonterminal template end */
        if (!ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_minus_524, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_minus_526, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_minus_526: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_minusEquals() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal minusEquals production descriptor loads*/
      case ARTL_ART_minusEquals: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_minusEquals_498, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal minusEquals: match production*/
      case ARTL_ART_minusEquals_498: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_minusEquals_500, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AID; return; }
      case ARTL_ART_minusEquals_500: 
        /* Nonterminal template end */
        if (!ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_minusEquals_502, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_minusEquals_504, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_minusEquals_504: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_minusEquals_506, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_multiply() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal multiply production descriptor loads*/
      case ARTL_ART_multiply: 
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_multiply_530, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal multiply: match production*/
      case ARTL_ART_multiply_530: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_multiply_532, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_multiply_532: 
        /* Nonterminal template end */
        if (!ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_multiply_534, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_multiply_536, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprD; return; }
      case ARTL_ART_multiply_536: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_negate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal negate production descriptor loads*/
      case ARTL_ART_negate: 
        if (ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_negate_568, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal negate: match production*/
      case ARTL_ART_negate_568: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_negate_570, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_negate_572, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprE; return; }
      case ARTL_ART_negate_572: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_not() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal not production descriptor loads*/
      case ARTL_ART_not: 
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_not_560, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal not: match production*/
      case ARTL_ART_not_560: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_not_562, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_not_564, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprE; return; }
      case ARTL_ART_not_564: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet78[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_596, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_602, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_608, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_614, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet82[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_620, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet83[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_626, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_632, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_642, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_596: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_598, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_598: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_602: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_604, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_604: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_608: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_610, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_610: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_614: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_true, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_616, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_620: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_false, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_622, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_626: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_628, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_operand_628: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_632: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_634, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_636, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_operand_636: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_638, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_642: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_644, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_or() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal or production descriptor loads*/
      case ARTL_ART_or: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_or_586, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal or: match production*/
      case ARTL_ART_or_586: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_588, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_or_588: 
        /* Nonterminal template end */
        if (!ARTSet87[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR_BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_or_590, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_592, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprA; return; }
      case ARTL_ART_or_592: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_plus() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal plus production descriptor loads*/
      case ARTL_ART_plus: 
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_plus_510, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal plus: match production*/
      case ARTL_ART_plus_510: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_plus_512, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_plus_512: 
        /* Nonterminal template end */
        if (!ARTSet88[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_plus_514, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_plus_516, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_plus_516: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_plusEquals() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal plusEquals production descriptor loads*/
      case ARTL_ART_plusEquals: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_plusEquals_486, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal plusEquals: match production*/
      case ARTL_ART_plusEquals_486: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_plusEquals_488, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AID; return; }
      case ARTL_ART_plusEquals_488: 
        /* Nonterminal template end */
        if (!ARTSet89[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_plusEquals_490, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_plusEquals_492, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_plusEquals_492: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_plusEquals_494, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_scopeEnter() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal scopeEnter production descriptor loads*/
      case ARTL_ART_scopeEnter: 
        if (ARTSet90[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_scopeEnter_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal scopeEnter: match production*/
      case ARTL_ART_scopeEnter_82: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scopeEnter_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_scopeLeave() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal scopeLeave production descriptor loads*/
      case ARTL_ART_scopeLeave: 
        if (ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_scopeLeave_88, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal scopeLeave: match production*/
      case ARTL_ART_scopeLeave_88: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scopeLeave_90, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet93[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_28, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet94[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_32, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet95[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_36, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_40, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet96[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_44, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet97[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_48, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_28: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_30, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_defStruct; return; }
      case ARTL_ART_statement_30: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_32: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_loopStatement; return; }
      case ARTL_ART_statement_34: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_36: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condStatement; return; }
      case ARTL_ART_statement_38: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_40: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_statement_42: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_44: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sysout; return; }
      case ARTL_ART_statement_46: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_48: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_50, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sysline; return; }
      case ARTL_ART_statement_50: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statements production descriptor loads*/
      case ARTL_ART_statements: 
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_8: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statements_10: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_structArgs() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal structArgs production descriptor loads*/
      case ARTL_ART_structArgs: 
        if (ARTSet99[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structArgs_446, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet104[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structArgs_456, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal structArgs: match production*/
      case ARTL_ART_structArgs_446: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structArgs_448, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_arg; return; }
      case ARTL_ART_structArgs_448: 
        /* Nonterminal template end */
        if (!ARTSet101[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structArgs_450, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structArgs_454, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structArgs; return; }
      case ARTL_ART_structArgs_454: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal structArgs: match production*/
      case ARTL_ART_structArgs_456: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structArgs_458, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_arg; return; }
      case ARTL_ART_structArgs_458: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_structAssign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal structAssign production descriptor loads*/
      case ARTL_ART_structAssign: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structAssign_422, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal structAssign: match production*/
      case ARTL_ART_structAssign_422: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structAssign_424, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_structAssign_424: 
        /* Nonterminal template end */
        if (!ARTSet105[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structAssign_428, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structAssign_430, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_structAssign_430: 
        /* Nonterminal template end */
        if (!ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structAssign_434, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structAssign_436, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structArgs; return; }
      case ARTL_ART_structAssign_436: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structAssign_438, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structAssign_442, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_structDefinition() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal structDefinition production descriptor loads*/
      case ARTL_ART_structDefinition: 
        if (ARTSet90[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structDefinition_52, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structDefinition_62, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal structDefinition: match production*/
      case ARTL_ART_structDefinition_52: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structDefinition_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet107[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structDefinition_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structStatements; return; }
      case ARTL_ART_structDefinition_56: 
        /* Nonterminal template end */
        if (!ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_structDefinition_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structDefinition_60, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_structDefinition_60: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal structDefinition: match production*/
      case ARTL_ART_structDefinition_62: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structDefinition_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structStatement; return; }
      case ARTL_ART_structDefinition_64: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structDefinition_66, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_structDefinition_66: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_structStatement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal structStatement production descriptor loads*/
      case ARTL_ART_structStatement: 
        if (ARTSet109[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structStatement_78, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal structStatement: match production*/
      case ARTL_ART_structStatement_78: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structStatement_80, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_memberAssign; return; }
      case ARTL_ART_structStatement_80: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_structStatements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal structStatements production descriptor loads*/
      case ARTL_ART_structStatements: 
        if (ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structStatements_68, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_structStatements_72, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal structStatements: match production*/
      case ARTL_ART_structStatements_68: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structStatements_70, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structStatement; return; }
      case ARTL_ART_structStatements_70: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal structStatements: match production*/
      case ARTL_ART_structStatements_72: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structStatements_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structStatement; return; }
      case ARTL_ART_structStatements_74: 
        /* Nonterminal template end */
        if (!ARTSet107[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_structStatements_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_structStatements; return; }
      case ARTL_ART_structStatements_76: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprA() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprA production descriptor loads*/
      case ARTL_ART_subExprA: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_260, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_266, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_272, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet110[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_278, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet111[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_284, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet112[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprA_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_260: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_262, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprB; return; }
      case ARTL_ART_subExprA_262: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_266: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_268, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_and; return; }
      case ARTL_ART_subExprA_268: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_272: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_274, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_or; return; }
      case ARTL_ART_subExprA_274: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_278: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_280, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gtr; return; }
      case ARTL_ART_subExprA_280: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_284: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_286, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lss; return; }
      case ARTL_ART_subExprA_286: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprA: match production*/
      case ARTL_ART_subExprA_290: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprA_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_equ; return; }
      case ARTL_ART_subExprA_292: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprB() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprB production descriptor loads*/
      case ARTL_ART_subExprB: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprB_296, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprB_302, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprB_308, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprB: match production*/
      case ARTL_ART_subExprB_296: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprB_298, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprC; return; }
      case ARTL_ART_subExprB_298: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprB: match production*/
      case ARTL_ART_subExprB_302: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprB_304, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_plus; return; }
      case ARTL_ART_subExprB_304: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprB: match production*/
      case ARTL_ART_subExprB_308: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprB_310, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_minus; return; }
      case ARTL_ART_subExprB_310: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprC() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprC production descriptor loads*/
      case ARTL_ART_subExprC: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprC_314, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprC_320, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprC_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprC: match production*/
      case ARTL_ART_subExprC_314: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprC_316, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprD; return; }
      case ARTL_ART_subExprC_316: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprC: match production*/
      case ARTL_ART_subExprC_320: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprC_322, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_multiply; return; }
      case ARTL_ART_subExprC_322: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprC: match production*/
      case ARTL_ART_subExprC_326: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprC_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_divide; return; }
      case ARTL_ART_subExprC_328: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprD() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprD production descriptor loads*/
      case ARTL_ART_subExprD: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprD_332, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet114[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprD_338, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprD: match production*/
      case ARTL_ART_subExprD_332: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprD_334, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprE; return; }
      case ARTL_ART_subExprD_334: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprD: match production*/
      case ARTL_ART_subExprD_338: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprD_340, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_exponentiate; return; }
      case ARTL_ART_subExprD_340: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprE() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprE production descriptor loads*/
      case ARTL_ART_subExprE: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprE_344, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet117[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprE_350, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet118[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprE_356, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprE: match production*/
      case ARTL_ART_subExprE_344: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprE_346, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExprF; return; }
      case ARTL_ART_subExprE_346: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprE: match production*/
      case ARTL_ART_subExprE_350: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprE_352, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_not; return; }
      case ARTL_ART_subExprE_352: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExprE: match production*/
      case ARTL_ART_subExprE_356: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprE_358, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_negate; return; }
      case ARTL_ART_subExprE_358: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExprF() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExprF production descriptor loads*/
      case ARTL_ART_subExprF: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExprF_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExprF: match production*/
      case ARTL_ART_subExprF_362: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExprF_364, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExprF_364: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sysline() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sysline production descriptor loads*/
      case ARTL_ART_sysline: 
        if (ARTSet120[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sysline_224, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sysline: match production*/
      case ARTL_ART_sysline_224: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_sysline, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysline_226, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysline_228, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sysline_230, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_sysline_230: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysline_232, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysline_236, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sysout() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sysout production descriptor loads*/
      case ARTL_ART_sysout: 
        if (ARTSet121[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sysout_210, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sysout: match production*/
      case ARTL_ART_sysout_210: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_sysout, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysout_212, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysout_214, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sysout_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_sysout_216: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysout_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sysout_222, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_untilExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal untilExpr production descriptor loads*/
      case ARTL_ART_untilExpr: 
        if (ARTSet122[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_untilExpr_186, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal untilExpr: match production*/
      case ARTL_ART_untilExpr_186: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_until, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_untilExpr_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_untilExpr_190, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_untilExpr_190: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_whileExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal whileExpr production descriptor loads*/
      case ARTL_ART_whileExpr: 
        if (ARTSet123[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_whileExpr_178, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal whileExpr: match production*/
      case ARTL_ART_whileExpr_178: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_whileExpr_180, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_whileExpr_182, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainExpr; return; }
      case ARTL_ART_whileExpr_182: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 90;
    artLexicaliseForV3GLL(artInputString, null);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_AID: 
          ARTPF_ART_AID();
          break;
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_REAL: 
          ARTPF_ART_REAL();
          break;
        case ARTL_ART_STRING_DQ: 
          ARTPF_ART_STRING_DQ();
          break;
        case ARTL_ART_and: 
          ARTPF_ART_and();
          break;
        case ARTL_ART_arg: 
          ARTPF_ART_arg();
          break;
        case ARTL_ART_argNote: 
          ARTPF_ART_argNote();
          break;
        case ARTL_ART_assign: 
          ARTPF_ART_assign();
          break;
        case ARTL_ART_compStatements: 
          ARTPF_ART_compStatements();
          break;
        case ARTL_ART_condStatement: 
          ARTPF_ART_condStatement();
          break;
        case ARTL_ART_defStruct: 
          ARTPF_ART_defStruct();
          break;
        case ARTL_ART_deref: 
          ARTPF_ART_deref();
          break;
        case ARTL_ART_divide: 
          ARTPF_ART_divide();
          break;
        case ARTL_ART_elifExpr: 
          ARTPF_ART_elifExpr();
          break;
        case ARTL_ART_equ: 
          ARTPF_ART_equ();
          break;
        case ARTL_ART_exponentiate: 
          ARTPF_ART_exponentiate();
          break;
        case ARTL_ART_gtr: 
          ARTPF_ART_gtr();
          break;
        case ARTL_ART_ifExpr: 
          ARTPF_ART_ifExpr();
          break;
        case ARTL_ART_loopStatement: 
          ARTPF_ART_loopStatement();
          break;
        case ARTL_ART_lss: 
          ARTPF_ART_lss();
          break;
        case ARTL_ART_mainExpr: 
          ARTPF_ART_mainExpr();
          break;
        case ARTL_ART_memberAssign: 
          ARTPF_ART_memberAssign();
          break;
        case ARTL_ART_minus: 
          ARTPF_ART_minus();
          break;
        case ARTL_ART_minusEquals: 
          ARTPF_ART_minusEquals();
          break;
        case ARTL_ART_multiply: 
          ARTPF_ART_multiply();
          break;
        case ARTL_ART_negate: 
          ARTPF_ART_negate();
          break;
        case ARTL_ART_not: 
          ARTPF_ART_not();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_or: 
          ARTPF_ART_or();
          break;
        case ARTL_ART_plus: 
          ARTPF_ART_plus();
          break;
        case ARTL_ART_plusEquals: 
          ARTPF_ART_plusEquals();
          break;
        case ARTL_ART_scopeEnter: 
          ARTPF_ART_scopeEnter();
          break;
        case ARTL_ART_scopeLeave: 
          ARTPF_ART_scopeLeave();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_statements: 
          ARTPF_ART_statements();
          break;
        case ARTL_ART_structArgs: 
          ARTPF_ART_structArgs();
          break;
        case ARTL_ART_structAssign: 
          ARTPF_ART_structAssign();
          break;
        case ARTL_ART_structDefinition: 
          ARTPF_ART_structDefinition();
          break;
        case ARTL_ART_structStatement: 
          ARTPF_ART_structStatement();
          break;
        case ARTL_ART_structStatements: 
          ARTPF_ART_structStatements();
          break;
        case ARTL_ART_subExprA: 
          ARTPF_ART_subExprA();
          break;
        case ARTL_ART_subExprB: 
          ARTPF_ART_subExprB();
          break;
        case ARTL_ART_subExprC: 
          ARTPF_ART_subExprC();
          break;
        case ARTL_ART_subExprD: 
          ARTPF_ART_subExprD();
          break;
        case ARTL_ART_subExprE: 
          ARTPF_ART_subExprE();
          break;
        case ARTL_ART_subExprF: 
          ARTPF_ART_subExprF();
          break;
        case ARTL_ART_sysline: 
          ARTPF_ART_sysline();
          break;
        case ARTL_ART_sysout: 
          ARTPF_ART_sysout();
          break;
        case ARTL_ART_untilExpr: 
          ARTPF_ART_untilExpr();
          break;
        case ARTL_ART_whileExpr: 
          ARTPF_ART_whileExpr();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTX_EOS] = true;
    ARTSet9[ARTTB_ID] = true;
    ARTSet9[ARTTB_INTEGER] = true;
    ARTSet9[ARTTB_REAL] = true;
    ARTSet9[ARTTB_STRING_DQ] = true;
    ARTSet9[ARTTS__SHREIK] = true;
    ARTSet9[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet9[ARTTS__LPAR] = true;
    ARTSet9[ARTTS__RPAR] = true;
    ARTSet9[ARTTS__STAR] = true;
    ARTSet9[ARTTS__STAR_STAR] = true;
    ARTSet9[ARTTS__PLUS] = true;
    ARTSet9[ARTTS__COMMA] = true;
    ARTSet9[ARTTS__MINUS] = true;
    ARTSet9[ARTTS__SLASH] = true;
    ARTSet9[ARTTS__COLON] = true;
    ARTSet9[ARTTS__SEMICOLON] = true;
    ARTSet9[ARTTS__LT] = true;
    ARTSet9[ARTTS__EQUAL_EQUAL] = true;
    ARTSet9[ARTTS__GT] = true;
    ARTSet9[ARTTS_elif] = true;
    ARTSet9[ARTTS_else] = true;
    ARTSet9[ARTTS_false] = true;
    ARTSet9[ARTTS_if] = true;
    ARTSet9[ARTTS_struct] = true;
    ARTSet9[ARTTS_sysline] = true;
    ARTSet9[ARTTS_sysout] = true;
    ARTSet9[ARTTS_true] = true;
    ARTSet9[ARTTS_until] = true;
    ARTSet9[ARTTS_while] = true;
    ARTSet9[ARTTS__LBRACE] = true;
    ARTSet9[ARTTS__BAR_BAR] = true;
    ARTSet9[ARTTS__RBRACE] = true;
    ARTSet9[ARTL_ART_AID] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_INTEGER] = true;
    ARTSet9[ARTL_ART_REAL] = true;
    ARTSet9[ARTL_ART_STRING_DQ] = true;
    ARTSet9[ARTL_ART_and] = true;
    ARTSet9[ARTL_ART_argNote] = true;
    ARTSet9[ARTL_ART_assign] = true;
    ARTSet9[ARTL_ART_compStatements] = true;
    ARTSet9[ARTL_ART_condStatement] = true;
    ARTSet9[ARTL_ART_defStruct] = true;
    ARTSet9[ARTL_ART_deref] = true;
    ARTSet9[ARTL_ART_divide] = true;
    ARTSet9[ARTL_ART_elifExpr] = true;
    ARTSet9[ARTL_ART_equ] = true;
    ARTSet9[ARTL_ART_exponentiate] = true;
    ARTSet9[ARTL_ART_gtr] = true;
    ARTSet9[ARTL_ART_ifExpr] = true;
    ARTSet9[ARTL_ART_loopStatement] = true;
    ARTSet9[ARTL_ART_lss] = true;
    ARTSet9[ARTL_ART_mainExpr] = true;
    ARTSet9[ARTL_ART_minus] = true;
    ARTSet9[ARTL_ART_minusEquals] = true;
    ARTSet9[ARTL_ART_multiply] = true;
    ARTSet9[ARTL_ART_negate] = true;
    ARTSet9[ARTL_ART_not] = true;
    ARTSet9[ARTL_ART_operand] = true;
    ARTSet9[ARTL_ART_or] = true;
    ARTSet9[ARTL_ART_plus] = true;
    ARTSet9[ARTL_ART_plusEquals] = true;
    ARTSet9[ARTL_ART_scopeEnter] = true;
    ARTSet9[ARTL_ART_scopeLeave] = true;
    ARTSet9[ARTL_ART_statement] = true;
    ARTSet9[ARTL_ART_statements] = true;
    ARTSet9[ARTL_ART_structAssign] = true;
    ARTSet9[ARTL_ART_subExprA] = true;
    ARTSet9[ARTL_ART_subExprB] = true;
    ARTSet9[ARTL_ART_subExprC] = true;
    ARTSet9[ARTL_ART_subExprD] = true;
    ARTSet9[ARTL_ART_subExprE] = true;
    ARTSet9[ARTL_ART_subExprF] = true;
    ARTSet9[ARTL_ART_sysline] = true;
    ARTSet9[ARTL_ART_sysout] = true;
    ARTSet9[ARTL_ART_untilExpr] = true;
    ARTSet9[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTB_ID] = true;
    ARTSet42[ARTTB_INTEGER] = true;
    ARTSet42[ARTTB_REAL] = true;
    ARTSet42[ARTTB_STRING_DQ] = true;
    ARTSet42[ARTTS__SHREIK] = true;
    ARTSet42[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet42[ARTTS__LPAR] = true;
    ARTSet42[ARTTS__STAR] = true;
    ARTSet42[ARTTS__STAR_STAR] = true;
    ARTSet42[ARTTS__PLUS] = true;
    ARTSet42[ARTTS__MINUS] = true;
    ARTSet42[ARTTS__SLASH] = true;
    ARTSet42[ARTTS__LT] = true;
    ARTSet42[ARTTS__EQUAL_EQUAL] = true;
    ARTSet42[ARTTS__GT] = true;
    ARTSet42[ARTTS_elif] = true;
    ARTSet42[ARTTS_false] = true;
    ARTSet42[ARTTS_if] = true;
    ARTSet42[ARTTS_struct] = true;
    ARTSet42[ARTTS_sysline] = true;
    ARTSet42[ARTTS_sysout] = true;
    ARTSet42[ARTTS_true] = true;
    ARTSet42[ARTTS_until] = true;
    ARTSet42[ARTTS_while] = true;
    ARTSet42[ARTTS__LBRACE] = true;
    ARTSet42[ARTTS__BAR_BAR] = true;
    ARTSet42[ARTL_ART_AID] = true;
    ARTSet42[ARTL_ART_ID] = true;
    ARTSet42[ARTL_ART_INTEGER] = true;
    ARTSet42[ARTL_ART_REAL] = true;
    ARTSet42[ARTL_ART_STRING_DQ] = true;
    ARTSet42[ARTL_ART_and] = true;
    ARTSet42[ARTL_ART_assign] = true;
    ARTSet42[ARTL_ART_compStatements] = true;
    ARTSet42[ARTL_ART_condStatement] = true;
    ARTSet42[ARTL_ART_defStruct] = true;
    ARTSet42[ARTL_ART_deref] = true;
    ARTSet42[ARTL_ART_divide] = true;
    ARTSet42[ARTL_ART_elifExpr] = true;
    ARTSet42[ARTL_ART_equ] = true;
    ARTSet42[ARTL_ART_exponentiate] = true;
    ARTSet42[ARTL_ART_gtr] = true;
    ARTSet42[ARTL_ART_ifExpr] = true;
    ARTSet42[ARTL_ART_loopStatement] = true;
    ARTSet42[ARTL_ART_lss] = true;
    ARTSet42[ARTL_ART_mainExpr] = true;
    ARTSet42[ARTL_ART_minus] = true;
    ARTSet42[ARTL_ART_minusEquals] = true;
    ARTSet42[ARTL_ART_multiply] = true;
    ARTSet42[ARTL_ART_negate] = true;
    ARTSet42[ARTL_ART_not] = true;
    ARTSet42[ARTL_ART_operand] = true;
    ARTSet42[ARTL_ART_or] = true;
    ARTSet42[ARTL_ART_plus] = true;
    ARTSet42[ARTL_ART_plusEquals] = true;
    ARTSet42[ARTL_ART_scopeEnter] = true;
    ARTSet42[ARTL_ART_statement] = true;
    ARTSet42[ARTL_ART_structAssign] = true;
    ARTSet42[ARTL_ART_subExprA] = true;
    ARTSet42[ARTL_ART_subExprB] = true;
    ARTSet42[ARTL_ART_subExprC] = true;
    ARTSet42[ARTL_ART_subExprD] = true;
    ARTSet42[ARTL_ART_subExprE] = true;
    ARTSet42[ARTL_ART_subExprF] = true;
    ARTSet42[ARTL_ART_sysline] = true;
    ARTSet42[ARTL_ART_sysout] = true;
    ARTSet42[ARTL_ART_untilExpr] = true;
    ARTSet42[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet99initialise() {
    ARTSet99 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet99, 0, artSetExtent, false);
    ARTSet99[ARTTB_ID] = true;
    ARTSet99[ARTTB_INTEGER] = true;
    ARTSet99[ARTTB_REAL] = true;
    ARTSet99[ARTTB_STRING_DQ] = true;
    ARTSet99[ARTTS__SHREIK] = true;
    ARTSet99[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet99[ARTTS__LPAR] = true;
    ARTSet99[ARTTS__STAR] = true;
    ARTSet99[ARTTS__STAR_STAR] = true;
    ARTSet99[ARTTS__PLUS] = true;
    ARTSet99[ARTTS__COMMA] = true;
    ARTSet99[ARTTS__MINUS] = true;
    ARTSet99[ARTTS__SLASH] = true;
    ARTSet99[ARTTS__COLON] = true;
    ARTSet99[ARTTS__LT] = true;
    ARTSet99[ARTTS__EQUAL_EQUAL] = true;
    ARTSet99[ARTTS__GT] = true;
    ARTSet99[ARTTS_false] = true;
    ARTSet99[ARTTS_true] = true;
    ARTSet99[ARTTS__BAR_BAR] = true;
    ARTSet99[ARTL_ART_AID] = true;
    ARTSet99[ARTL_ART_ID] = true;
    ARTSet99[ARTL_ART_INTEGER] = true;
    ARTSet99[ARTL_ART_REAL] = true;
    ARTSet99[ARTL_ART_STRING_DQ] = true;
    ARTSet99[ARTL_ART_and] = true;
    ARTSet99[ARTL_ART_arg] = true;
    ARTSet99[ARTL_ART_argNote] = true;
    ARTSet99[ARTL_ART_deref] = true;
    ARTSet99[ARTL_ART_divide] = true;
    ARTSet99[ARTL_ART_equ] = true;
    ARTSet99[ARTL_ART_exponentiate] = true;
    ARTSet99[ARTL_ART_gtr] = true;
    ARTSet99[ARTL_ART_lss] = true;
    ARTSet99[ARTL_ART_minus] = true;
    ARTSet99[ARTL_ART_multiply] = true;
    ARTSet99[ARTL_ART_negate] = true;
    ARTSet99[ARTL_ART_not] = true;
    ARTSet99[ARTL_ART_operand] = true;
    ARTSet99[ARTL_ART_or] = true;
    ARTSet99[ARTL_ART_plus] = true;
    ARTSet99[ARTL_ART_subExprA] = true;
    ARTSet99[ARTL_ART_subExprB] = true;
    ARTSet99[ARTL_ART_subExprC] = true;
    ARTSet99[ARTL_ART_subExprD] = true;
    ARTSet99[ARTL_ART_subExprE] = true;
    ARTSet99[ARTL_ART_subExprF] = true;
  }

  public void ARTSet103initialise() {
    ARTSet103 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet103, 0, artSetExtent, false);
    ARTSet103[ARTTB_ID] = true;
    ARTSet103[ARTTB_INTEGER] = true;
    ARTSet103[ARTTB_REAL] = true;
    ARTSet103[ARTTB_STRING_DQ] = true;
    ARTSet103[ARTTS__SHREIK] = true;
    ARTSet103[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet103[ARTTS__LPAR] = true;
    ARTSet103[ARTTS__RPAR] = true;
    ARTSet103[ARTTS__STAR] = true;
    ARTSet103[ARTTS__STAR_STAR] = true;
    ARTSet103[ARTTS__PLUS] = true;
    ARTSet103[ARTTS__COMMA] = true;
    ARTSet103[ARTTS__MINUS] = true;
    ARTSet103[ARTTS__SLASH] = true;
    ARTSet103[ARTTS__COLON] = true;
    ARTSet103[ARTTS__LT] = true;
    ARTSet103[ARTTS__EQUAL_EQUAL] = true;
    ARTSet103[ARTTS__GT] = true;
    ARTSet103[ARTTS_false] = true;
    ARTSet103[ARTTS_true] = true;
    ARTSet103[ARTTS__BAR_BAR] = true;
    ARTSet103[ARTL_ART_AID] = true;
    ARTSet103[ARTL_ART_ID] = true;
    ARTSet103[ARTL_ART_INTEGER] = true;
    ARTSet103[ARTL_ART_REAL] = true;
    ARTSet103[ARTL_ART_STRING_DQ] = true;
    ARTSet103[ARTL_ART_and] = true;
    ARTSet103[ARTL_ART_arg] = true;
    ARTSet103[ARTL_ART_argNote] = true;
    ARTSet103[ARTL_ART_deref] = true;
    ARTSet103[ARTL_ART_divide] = true;
    ARTSet103[ARTL_ART_equ] = true;
    ARTSet103[ARTL_ART_exponentiate] = true;
    ARTSet103[ARTL_ART_gtr] = true;
    ARTSet103[ARTL_ART_lss] = true;
    ARTSet103[ARTL_ART_minus] = true;
    ARTSet103[ARTL_ART_multiply] = true;
    ARTSet103[ARTL_ART_negate] = true;
    ARTSet103[ARTL_ART_not] = true;
    ARTSet103[ARTL_ART_operand] = true;
    ARTSet103[ARTL_ART_or] = true;
    ARTSet103[ARTL_ART_plus] = true;
    ARTSet103[ARTL_ART_structArgs] = true;
    ARTSet103[ARTL_ART_subExprA] = true;
    ARTSet103[ARTL_ART_subExprB] = true;
    ARTSet103[ARTL_ART_subExprC] = true;
    ARTSet103[ARTL_ART_subExprD] = true;
    ARTSet103[ARTL_ART_subExprE] = true;
    ARTSet103[ARTL_ART_subExprF] = true;
  }

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTB_ID] = true;
    ARTSet74[ARTTB_INTEGER] = true;
    ARTSet74[ARTTB_REAL] = true;
    ARTSet74[ARTTB_STRING_DQ] = true;
    ARTSet74[ARTTS__SHREIK] = true;
    ARTSet74[ARTTS__LPAR] = true;
    ARTSet74[ARTTS__STAR] = true;
    ARTSet74[ARTTS__STAR_STAR] = true;
    ARTSet74[ARTTS__MINUS] = true;
    ARTSet74[ARTTS__SLASH] = true;
    ARTSet74[ARTTS__SEMICOLON] = true;
    ARTSet74[ARTTS_false] = true;
    ARTSet74[ARTTS_true] = true;
    ARTSet74[ARTL_ART_AID] = true;
    ARTSet74[ARTL_ART_ID] = true;
    ARTSet74[ARTL_ART_INTEGER] = true;
    ARTSet74[ARTL_ART_REAL] = true;
    ARTSet74[ARTL_ART_STRING_DQ] = true;
    ARTSet74[ARTL_ART_deref] = true;
    ARTSet74[ARTL_ART_divide] = true;
    ARTSet74[ARTL_ART_exponentiate] = true;
    ARTSet74[ARTL_ART_multiply] = true;
    ARTSet74[ARTL_ART_negate] = true;
    ARTSet74[ARTL_ART_not] = true;
    ARTSet74[ARTL_ART_operand] = true;
    ARTSet74[ARTL_ART_subExprC] = true;
    ARTSet74[ARTL_ART_subExprD] = true;
    ARTSet74[ARTL_ART_subExprE] = true;
    ARTSet74[ARTL_ART_subExprF] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTB_ID] = true;
    ARTSet49[ARTTB_INTEGER] = true;
    ARTSet49[ARTTB_REAL] = true;
    ARTSet49[ARTTB_STRING_DQ] = true;
    ARTSet49[ARTTS__SHREIK] = true;
    ARTSet49[ARTTS__LPAR] = true;
    ARTSet49[ARTTS__STAR] = true;
    ARTSet49[ARTTS__STAR_STAR] = true;
    ARTSet49[ARTTS__MINUS] = true;
    ARTSet49[ARTTS__SLASH] = true;
    ARTSet49[ARTTS_false] = true;
    ARTSet49[ARTTS_true] = true;
    ARTSet49[ARTL_ART_AID] = true;
    ARTSet49[ARTL_ART_ID] = true;
    ARTSet49[ARTL_ART_INTEGER] = true;
    ARTSet49[ARTL_ART_REAL] = true;
    ARTSet49[ARTL_ART_STRING_DQ] = true;
    ARTSet49[ARTL_ART_deref] = true;
    ARTSet49[ARTL_ART_divide] = true;
    ARTSet49[ARTL_ART_exponentiate] = true;
    ARTSet49[ARTL_ART_multiply] = true;
    ARTSet49[ARTL_ART_negate] = true;
    ARTSet49[ARTL_ART_not] = true;
    ARTSet49[ARTL_ART_operand] = true;
    ARTSet49[ARTL_ART_subExprC] = true;
    ARTSet49[ARTL_ART_subExprD] = true;
    ARTSet49[ARTL_ART_subExprE] = true;
    ARTSet49[ARTL_ART_subExprF] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTB_ID] = true;
    ARTSet53[ARTTB_INTEGER] = true;
    ARTSet53[ARTTB_REAL] = true;
    ARTSet53[ARTTB_STRING_DQ] = true;
    ARTSet53[ARTTS__SHREIK] = true;
    ARTSet53[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet53[ARTTS__LPAR] = true;
    ARTSet53[ARTTS__STAR] = true;
    ARTSet53[ARTTS__STAR_STAR] = true;
    ARTSet53[ARTTS__PLUS] = true;
    ARTSet53[ARTTS__MINUS] = true;
    ARTSet53[ARTTS__SLASH] = true;
    ARTSet53[ARTTS__LT] = true;
    ARTSet53[ARTTS__EQUAL_EQUAL] = true;
    ARTSet53[ARTTS__GT] = true;
    ARTSet53[ARTTS_false] = true;
    ARTSet53[ARTTS_true] = true;
    ARTSet53[ARTTS__BAR_BAR] = true;
    ARTSet53[ARTL_ART_AID] = true;
    ARTSet53[ARTL_ART_ID] = true;
    ARTSet53[ARTL_ART_INTEGER] = true;
    ARTSet53[ARTL_ART_REAL] = true;
    ARTSet53[ARTL_ART_STRING_DQ] = true;
    ARTSet53[ARTL_ART_and] = true;
    ARTSet53[ARTL_ART_assign] = true;
    ARTSet53[ARTL_ART_deref] = true;
    ARTSet53[ARTL_ART_divide] = true;
    ARTSet53[ARTL_ART_equ] = true;
    ARTSet53[ARTL_ART_exponentiate] = true;
    ARTSet53[ARTL_ART_gtr] = true;
    ARTSet53[ARTL_ART_lss] = true;
    ARTSet53[ARTL_ART_mainExpr] = true;
    ARTSet53[ARTL_ART_minus] = true;
    ARTSet53[ARTL_ART_minusEquals] = true;
    ARTSet53[ARTL_ART_multiply] = true;
    ARTSet53[ARTL_ART_negate] = true;
    ARTSet53[ARTL_ART_not] = true;
    ARTSet53[ARTL_ART_operand] = true;
    ARTSet53[ARTL_ART_or] = true;
    ARTSet53[ARTL_ART_plus] = true;
    ARTSet53[ARTL_ART_plusEquals] = true;
    ARTSet53[ARTL_ART_structAssign] = true;
    ARTSet53[ARTL_ART_subExprA] = true;
    ARTSet53[ARTL_ART_subExprB] = true;
    ARTSet53[ARTL_ART_subExprC] = true;
    ARTSet53[ARTL_ART_subExprD] = true;
    ARTSet53[ARTL_ART_subExprE] = true;
    ARTSet53[ARTL_ART_subExprF] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__LBRACE] = true;
    ARTSet33[ARTL_ART_scopeEnter] = true;
  }

  public void ARTSet123initialise() {
    ARTSet123 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet123, 0, artSetExtent, false);
    ARTSet123[ARTTS_while] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTS_until] = true;
    ARTSet65[ARTL_ART_untilExpr] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTX_EOS] = true;
    ARTSet7[ARTTB_ID] = true;
    ARTSet7[ARTTB_INTEGER] = true;
    ARTSet7[ARTTB_REAL] = true;
    ARTSet7[ARTTB_STRING_DQ] = true;
    ARTSet7[ARTTS__SHREIK] = true;
    ARTSet7[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet7[ARTTS__LPAR] = true;
    ARTSet7[ARTTS__RPAR] = true;
    ARTSet7[ARTTS__STAR] = true;
    ARTSet7[ARTTS__STAR_STAR] = true;
    ARTSet7[ARTTS__PLUS] = true;
    ARTSet7[ARTTS__PLUS_EQUAL] = true;
    ARTSet7[ARTTS__COMMA] = true;
    ARTSet7[ARTTS__MINUS] = true;
    ARTSet7[ARTTS__MINUS_EQUAL] = true;
    ARTSet7[ARTTS__PERIOD] = true;
    ARTSet7[ARTTS__SLASH] = true;
    ARTSet7[ARTTS__COLON] = true;
    ARTSet7[ARTTS__SEMICOLON] = true;
    ARTSet7[ARTTS__LT] = true;
    ARTSet7[ARTTS__LT_MINUS] = true;
    ARTSet7[ARTTS__EQUAL] = true;
    ARTSet7[ARTTS__EQUAL_EQUAL] = true;
    ARTSet7[ARTTS__GT] = true;
    ARTSet7[ARTTS_elif] = true;
    ARTSet7[ARTTS_else] = true;
    ARTSet7[ARTTS_false] = true;
    ARTSet7[ARTTS_if] = true;
    ARTSet7[ARTTS_struct] = true;
    ARTSet7[ARTTS_sysline] = true;
    ARTSet7[ARTTS_sysout] = true;
    ARTSet7[ARTTS_true] = true;
    ARTSet7[ARTTS_until] = true;
    ARTSet7[ARTTS_while] = true;
    ARTSet7[ARTTS__LBRACE] = true;
    ARTSet7[ARTTS__BAR_BAR] = true;
    ARTSet7[ARTTS__RBRACE] = true;
    ARTSet7[ARTL_ART_AID] = true;
    ARTSet7[ARTL_ART_ID] = true;
    ARTSet7[ARTL_ART_INTEGER] = true;
    ARTSet7[ARTL_ART_REAL] = true;
    ARTSet7[ARTL_ART_STRING_DQ] = true;
    ARTSet7[ARTL_ART_and] = true;
    ARTSet7[ARTL_ART_argNote] = true;
    ARTSet7[ARTL_ART_assign] = true;
    ARTSet7[ARTL_ART_compStatements] = true;
    ARTSet7[ARTL_ART_condStatement] = true;
    ARTSet7[ARTL_ART_defStruct] = true;
    ARTSet7[ARTL_ART_deref] = true;
    ARTSet7[ARTL_ART_divide] = true;
    ARTSet7[ARTL_ART_elifExpr] = true;
    ARTSet7[ARTL_ART_equ] = true;
    ARTSet7[ARTL_ART_exponentiate] = true;
    ARTSet7[ARTL_ART_gtr] = true;
    ARTSet7[ARTL_ART_ifExpr] = true;
    ARTSet7[ARTL_ART_loopStatement] = true;
    ARTSet7[ARTL_ART_lss] = true;
    ARTSet7[ARTL_ART_mainExpr] = true;
    ARTSet7[ARTL_ART_memberAssign] = true;
    ARTSet7[ARTL_ART_minus] = true;
    ARTSet7[ARTL_ART_minusEquals] = true;
    ARTSet7[ARTL_ART_multiply] = true;
    ARTSet7[ARTL_ART_negate] = true;
    ARTSet7[ARTL_ART_not] = true;
    ARTSet7[ARTL_ART_operand] = true;
    ARTSet7[ARTL_ART_or] = true;
    ARTSet7[ARTL_ART_plus] = true;
    ARTSet7[ARTL_ART_plusEquals] = true;
    ARTSet7[ARTL_ART_scopeEnter] = true;
    ARTSet7[ARTL_ART_scopeLeave] = true;
    ARTSet7[ARTL_ART_statement] = true;
    ARTSet7[ARTL_ART_statements] = true;
    ARTSet7[ARTL_ART_structAssign] = true;
    ARTSet7[ARTL_ART_structDefinition] = true;
    ARTSet7[ARTL_ART_structStatement] = true;
    ARTSet7[ARTL_ART_subExprA] = true;
    ARTSet7[ARTL_ART_subExprB] = true;
    ARTSet7[ARTL_ART_subExprC] = true;
    ARTSet7[ARTL_ART_subExprD] = true;
    ARTSet7[ARTL_ART_subExprE] = true;
    ARTSet7[ARTL_ART_subExprF] = true;
    ARTSet7[ARTL_ART_sysline] = true;
    ARTSet7[ARTL_ART_sysout] = true;
    ARTSet7[ARTL_ART_untilExpr] = true;
    ARTSet7[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet100initialise() {
    ARTSet100 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet100, 0, artSetExtent, false);
    ARTSet100[ARTTB_ID] = true;
    ARTSet100[ARTTB_INTEGER] = true;
    ARTSet100[ARTTB_REAL] = true;
    ARTSet100[ARTTB_STRING_DQ] = true;
    ARTSet100[ARTTS__SHREIK] = true;
    ARTSet100[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet100[ARTTS__LPAR] = true;
    ARTSet100[ARTTS__STAR] = true;
    ARTSet100[ARTTS__STAR_STAR] = true;
    ARTSet100[ARTTS__PLUS] = true;
    ARTSet100[ARTTS__MINUS] = true;
    ARTSet100[ARTTS__SLASH] = true;
    ARTSet100[ARTTS__COLON] = true;
    ARTSet100[ARTTS__LT] = true;
    ARTSet100[ARTTS__EQUAL_EQUAL] = true;
    ARTSet100[ARTTS__GT] = true;
    ARTSet100[ARTTS_false] = true;
    ARTSet100[ARTTS_true] = true;
    ARTSet100[ARTTS__BAR_BAR] = true;
    ARTSet100[ARTL_ART_AID] = true;
    ARTSet100[ARTL_ART_ID] = true;
    ARTSet100[ARTL_ART_INTEGER] = true;
    ARTSet100[ARTL_ART_REAL] = true;
    ARTSet100[ARTL_ART_STRING_DQ] = true;
    ARTSet100[ARTL_ART_and] = true;
    ARTSet100[ARTL_ART_arg] = true;
    ARTSet100[ARTL_ART_argNote] = true;
    ARTSet100[ARTL_ART_deref] = true;
    ARTSet100[ARTL_ART_divide] = true;
    ARTSet100[ARTL_ART_equ] = true;
    ARTSet100[ARTL_ART_exponentiate] = true;
    ARTSet100[ARTL_ART_gtr] = true;
    ARTSet100[ARTL_ART_lss] = true;
    ARTSet100[ARTL_ART_minus] = true;
    ARTSet100[ARTL_ART_multiply] = true;
    ARTSet100[ARTL_ART_negate] = true;
    ARTSet100[ARTL_ART_not] = true;
    ARTSet100[ARTL_ART_operand] = true;
    ARTSet100[ARTL_ART_or] = true;
    ARTSet100[ARTL_ART_plus] = true;
    ARTSet100[ARTL_ART_subExprA] = true;
    ARTSet100[ARTL_ART_subExprB] = true;
    ARTSet100[ARTL_ART_subExprC] = true;
    ARTSet100[ARTL_ART_subExprD] = true;
    ARTSet100[ARTL_ART_subExprE] = true;
    ARTSet100[ARTL_ART_subExprF] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTX_EOS] = true;
    ARTSet32[ARTTB_ID] = true;
    ARTSet32[ARTTB_INTEGER] = true;
    ARTSet32[ARTTB_REAL] = true;
    ARTSet32[ARTTB_STRING_DQ] = true;
    ARTSet32[ARTTS__SHREIK] = true;
    ARTSet32[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet32[ARTTS__LPAR] = true;
    ARTSet32[ARTTS__STAR] = true;
    ARTSet32[ARTTS__STAR_STAR] = true;
    ARTSet32[ARTTS__PLUS] = true;
    ARTSet32[ARTTS__MINUS] = true;
    ARTSet32[ARTTS__SLASH] = true;
    ARTSet32[ARTTS__LT] = true;
    ARTSet32[ARTTS__EQUAL_EQUAL] = true;
    ARTSet32[ARTTS__GT] = true;
    ARTSet32[ARTTS_elif] = true;
    ARTSet32[ARTTS_else] = true;
    ARTSet32[ARTTS_false] = true;
    ARTSet32[ARTTS_if] = true;
    ARTSet32[ARTTS_struct] = true;
    ARTSet32[ARTTS_sysline] = true;
    ARTSet32[ARTTS_sysout] = true;
    ARTSet32[ARTTS_true] = true;
    ARTSet32[ARTTS_until] = true;
    ARTSet32[ARTTS_while] = true;
    ARTSet32[ARTTS__BAR_BAR] = true;
    ARTSet32[ARTTS__RBRACE] = true;
    ARTSet32[ARTL_ART_AID] = true;
    ARTSet32[ARTL_ART_ID] = true;
    ARTSet32[ARTL_ART_INTEGER] = true;
    ARTSet32[ARTL_ART_REAL] = true;
    ARTSet32[ARTL_ART_STRING_DQ] = true;
    ARTSet32[ARTL_ART_and] = true;
    ARTSet32[ARTL_ART_assign] = true;
    ARTSet32[ARTL_ART_condStatement] = true;
    ARTSet32[ARTL_ART_defStruct] = true;
    ARTSet32[ARTL_ART_deref] = true;
    ARTSet32[ARTL_ART_divide] = true;
    ARTSet32[ARTL_ART_elifExpr] = true;
    ARTSet32[ARTL_ART_equ] = true;
    ARTSet32[ARTL_ART_exponentiate] = true;
    ARTSet32[ARTL_ART_gtr] = true;
    ARTSet32[ARTL_ART_ifExpr] = true;
    ARTSet32[ARTL_ART_loopStatement] = true;
    ARTSet32[ARTL_ART_lss] = true;
    ARTSet32[ARTL_ART_mainExpr] = true;
    ARTSet32[ARTL_ART_minus] = true;
    ARTSet32[ARTL_ART_minusEquals] = true;
    ARTSet32[ARTL_ART_multiply] = true;
    ARTSet32[ARTL_ART_negate] = true;
    ARTSet32[ARTL_ART_not] = true;
    ARTSet32[ARTL_ART_operand] = true;
    ARTSet32[ARTL_ART_or] = true;
    ARTSet32[ARTL_ART_plus] = true;
    ARTSet32[ARTL_ART_plusEquals] = true;
    ARTSet32[ARTL_ART_scopeLeave] = true;
    ARTSet32[ARTL_ART_statement] = true;
    ARTSet32[ARTL_ART_statements] = true;
    ARTSet32[ARTL_ART_structAssign] = true;
    ARTSet32[ARTL_ART_subExprA] = true;
    ARTSet32[ARTL_ART_subExprB] = true;
    ARTSet32[ARTL_ART_subExprC] = true;
    ARTSet32[ARTL_ART_subExprD] = true;
    ARTSet32[ARTL_ART_subExprE] = true;
    ARTSet32[ARTL_ART_subExprF] = true;
    ARTSet32[ARTL_ART_sysline] = true;
    ARTSet32[ARTL_ART_sysout] = true;
    ARTSet32[ARTL_ART_untilExpr] = true;
    ARTSet32[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet102initialise() {
    ARTSet102 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet102, 0, artSetExtent, false);
    ARTSet102[ARTTB_ID] = true;
    ARTSet102[ARTTB_INTEGER] = true;
    ARTSet102[ARTTB_REAL] = true;
    ARTSet102[ARTTB_STRING_DQ] = true;
    ARTSet102[ARTTS__SHREIK] = true;
    ARTSet102[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet102[ARTTS__LPAR] = true;
    ARTSet102[ARTTS__STAR] = true;
    ARTSet102[ARTTS__STAR_STAR] = true;
    ARTSet102[ARTTS__PLUS] = true;
    ARTSet102[ARTTS__COMMA] = true;
    ARTSet102[ARTTS__MINUS] = true;
    ARTSet102[ARTTS__SLASH] = true;
    ARTSet102[ARTTS__COLON] = true;
    ARTSet102[ARTTS__LT] = true;
    ARTSet102[ARTTS__EQUAL_EQUAL] = true;
    ARTSet102[ARTTS__GT] = true;
    ARTSet102[ARTTS_false] = true;
    ARTSet102[ARTTS_true] = true;
    ARTSet102[ARTTS__BAR_BAR] = true;
    ARTSet102[ARTL_ART_AID] = true;
    ARTSet102[ARTL_ART_ID] = true;
    ARTSet102[ARTL_ART_INTEGER] = true;
    ARTSet102[ARTL_ART_REAL] = true;
    ARTSet102[ARTL_ART_STRING_DQ] = true;
    ARTSet102[ARTL_ART_and] = true;
    ARTSet102[ARTL_ART_arg] = true;
    ARTSet102[ARTL_ART_argNote] = true;
    ARTSet102[ARTL_ART_deref] = true;
    ARTSet102[ARTL_ART_divide] = true;
    ARTSet102[ARTL_ART_equ] = true;
    ARTSet102[ARTL_ART_exponentiate] = true;
    ARTSet102[ARTL_ART_gtr] = true;
    ARTSet102[ARTL_ART_lss] = true;
    ARTSet102[ARTL_ART_minus] = true;
    ARTSet102[ARTL_ART_multiply] = true;
    ARTSet102[ARTL_ART_negate] = true;
    ARTSet102[ARTL_ART_not] = true;
    ARTSet102[ARTL_ART_operand] = true;
    ARTSet102[ARTL_ART_or] = true;
    ARTSet102[ARTL_ART_plus] = true;
    ARTSet102[ARTL_ART_structArgs] = true;
    ARTSet102[ARTL_ART_subExprA] = true;
    ARTSet102[ARTL_ART_subExprB] = true;
    ARTSet102[ARTL_ART_subExprC] = true;
    ARTSet102[ARTL_ART_subExprD] = true;
    ARTSet102[ARTL_ART_subExprE] = true;
    ARTSet102[ARTL_ART_subExprF] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS__MINUS_EQUAL] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTS_until] = true;
    ARTSet63[ARTTS_while] = true;
    ARTSet63[ARTL_ART_untilExpr] = true;
    ARTSet63[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTB_ID] = true;
    ARTSet28[ARTL_ART_ID] = true;
    ARTSet28[ARTL_ART_structAssign] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS_elif] = true;
    ARTSet38[ARTTS_if] = true;
    ARTSet38[ARTL_ART_elifExpr] = true;
    ARTSet38[ARTL_ART_ifExpr] = true;
  }

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTX_EOS] = true;
    ARTSet70[ARTTB_ID] = true;
    ARTSet70[ARTTB_INTEGER] = true;
    ARTSet70[ARTTB_REAL] = true;
    ARTSet70[ARTTB_STRING_DQ] = true;
    ARTSet70[ARTTS__SHREIK] = true;
    ARTSet70[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet70[ARTTS__LPAR] = true;
    ARTSet70[ARTTS__STAR] = true;
    ARTSet70[ARTTS__STAR_STAR] = true;
    ARTSet70[ARTTS__PLUS] = true;
    ARTSet70[ARTTS__MINUS] = true;
    ARTSet70[ARTTS__SLASH] = true;
    ARTSet70[ARTTS__LT] = true;
    ARTSet70[ARTTS__EQUAL_EQUAL] = true;
    ARTSet70[ARTTS__GT] = true;
    ARTSet70[ARTTS_elif] = true;
    ARTSet70[ARTTS_else] = true;
    ARTSet70[ARTTS_false] = true;
    ARTSet70[ARTTS_if] = true;
    ARTSet70[ARTTS_struct] = true;
    ARTSet70[ARTTS_sysline] = true;
    ARTSet70[ARTTS_sysout] = true;
    ARTSet70[ARTTS_true] = true;
    ARTSet70[ARTTS_until] = true;
    ARTSet70[ARTTS_while] = true;
    ARTSet70[ARTTS__BAR_BAR] = true;
    ARTSet70[ARTTS__RBRACE] = true;
    ARTSet70[ARTL_ART_AID] = true;
    ARTSet70[ARTL_ART_ID] = true;
    ARTSet70[ARTL_ART_INTEGER] = true;
    ARTSet70[ARTL_ART_REAL] = true;
    ARTSet70[ARTL_ART_STRING_DQ] = true;
    ARTSet70[ARTL_ART_and] = true;
    ARTSet70[ARTL_ART_assign] = true;
    ARTSet70[ARTL_ART_condStatement] = true;
    ARTSet70[ARTL_ART_defStruct] = true;
    ARTSet70[ARTL_ART_deref] = true;
    ARTSet70[ARTL_ART_divide] = true;
    ARTSet70[ARTL_ART_elifExpr] = true;
    ARTSet70[ARTL_ART_equ] = true;
    ARTSet70[ARTL_ART_exponentiate] = true;
    ARTSet70[ARTL_ART_gtr] = true;
    ARTSet70[ARTL_ART_ifExpr] = true;
    ARTSet70[ARTL_ART_loopStatement] = true;
    ARTSet70[ARTL_ART_lss] = true;
    ARTSet70[ARTL_ART_mainExpr] = true;
    ARTSet70[ARTL_ART_memberAssign] = true;
    ARTSet70[ARTL_ART_minus] = true;
    ARTSet70[ARTL_ART_minusEquals] = true;
    ARTSet70[ARTL_ART_multiply] = true;
    ARTSet70[ARTL_ART_negate] = true;
    ARTSet70[ARTL_ART_not] = true;
    ARTSet70[ARTL_ART_operand] = true;
    ARTSet70[ARTL_ART_or] = true;
    ARTSet70[ARTL_ART_plus] = true;
    ARTSet70[ARTL_ART_plusEquals] = true;
    ARTSet70[ARTL_ART_scopeLeave] = true;
    ARTSet70[ARTL_ART_statement] = true;
    ARTSet70[ARTL_ART_statements] = true;
    ARTSet70[ARTL_ART_structAssign] = true;
    ARTSet70[ARTL_ART_structStatement] = true;
    ARTSet70[ARTL_ART_structStatements] = true;
    ARTSet70[ARTL_ART_subExprA] = true;
    ARTSet70[ARTL_ART_subExprB] = true;
    ARTSet70[ARTL_ART_subExprC] = true;
    ARTSet70[ARTL_ART_subExprD] = true;
    ARTSet70[ARTL_ART_subExprE] = true;
    ARTSet70[ARTL_ART_subExprF] = true;
    ARTSet70[ARTL_ART_sysline] = true;
    ARTSet70[ARTL_ART_sysout] = true;
    ARTSet70[ARTL_ART_untilExpr] = true;
    ARTSet70[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet104initialise() {
    ARTSet104 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet104, 0, artSetExtent, false);
    ARTSet104[ARTTB_ID] = true;
    ARTSet104[ARTTB_INTEGER] = true;
    ARTSet104[ARTTB_REAL] = true;
    ARTSet104[ARTTB_STRING_DQ] = true;
    ARTSet104[ARTTS__SHREIK] = true;
    ARTSet104[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet104[ARTTS__LPAR] = true;
    ARTSet104[ARTTS__RPAR] = true;
    ARTSet104[ARTTS__STAR] = true;
    ARTSet104[ARTTS__STAR_STAR] = true;
    ARTSet104[ARTTS__PLUS] = true;
    ARTSet104[ARTTS__MINUS] = true;
    ARTSet104[ARTTS__SLASH] = true;
    ARTSet104[ARTTS__COLON] = true;
    ARTSet104[ARTTS__LT] = true;
    ARTSet104[ARTTS__EQUAL_EQUAL] = true;
    ARTSet104[ARTTS__GT] = true;
    ARTSet104[ARTTS_false] = true;
    ARTSet104[ARTTS_true] = true;
    ARTSet104[ARTTS__BAR_BAR] = true;
    ARTSet104[ARTL_ART_AID] = true;
    ARTSet104[ARTL_ART_ID] = true;
    ARTSet104[ARTL_ART_INTEGER] = true;
    ARTSet104[ARTL_ART_REAL] = true;
    ARTSet104[ARTL_ART_STRING_DQ] = true;
    ARTSet104[ARTL_ART_and] = true;
    ARTSet104[ARTL_ART_arg] = true;
    ARTSet104[ARTL_ART_argNote] = true;
    ARTSet104[ARTL_ART_deref] = true;
    ARTSet104[ARTL_ART_divide] = true;
    ARTSet104[ARTL_ART_equ] = true;
    ARTSet104[ARTL_ART_exponentiate] = true;
    ARTSet104[ARTL_ART_gtr] = true;
    ARTSet104[ARTL_ART_lss] = true;
    ARTSet104[ARTL_ART_minus] = true;
    ARTSet104[ARTL_ART_multiply] = true;
    ARTSet104[ARTL_ART_negate] = true;
    ARTSet104[ARTL_ART_not] = true;
    ARTSet104[ARTL_ART_operand] = true;
    ARTSet104[ARTL_ART_or] = true;
    ARTSet104[ARTL_ART_plus] = true;
    ARTSet104[ARTL_ART_subExprA] = true;
    ARTSet104[ARTL_ART_subExprB] = true;
    ARTSet104[ARTL_ART_subExprC] = true;
    ARTSet104[ARTL_ART_subExprD] = true;
    ARTSet104[ARTL_ART_subExprE] = true;
    ARTSet104[ARTL_ART_subExprF] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTX_EOS] = true;
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTB_INTEGER] = true;
    ARTSet3[ARTTB_REAL] = true;
    ARTSet3[ARTTB_STRING_DQ] = true;
    ARTSet3[ARTTS__SHREIK] = true;
    ARTSet3[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet3[ARTTS__LPAR] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__PLUS_EQUAL] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__MINUS_EQUAL] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__COLON] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS_elif] = true;
    ARTSet3[ARTTS_else] = true;
    ARTSet3[ARTTS_false] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_struct] = true;
    ARTSet3[ARTTS_sysline] = true;
    ARTSet3[ARTTS_sysout] = true;
    ARTSet3[ARTTS_true] = true;
    ARTSet3[ARTTS_until] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTTS__LBRACE] = true;
    ARTSet3[ARTTS__BAR_BAR] = true;
    ARTSet3[ARTTS__RBRACE] = true;
    ARTSet3[ARTL_ART_AID] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_INTEGER] = true;
    ARTSet3[ARTL_ART_REAL] = true;
    ARTSet3[ARTL_ART_STRING_DQ] = true;
    ARTSet3[ARTL_ART_and] = true;
    ARTSet3[ARTL_ART_argNote] = true;
    ARTSet3[ARTL_ART_assign] = true;
    ARTSet3[ARTL_ART_compStatements] = true;
    ARTSet3[ARTL_ART_condStatement] = true;
    ARTSet3[ARTL_ART_defStruct] = true;
    ARTSet3[ARTL_ART_deref] = true;
    ARTSet3[ARTL_ART_divide] = true;
    ARTSet3[ARTL_ART_elifExpr] = true;
    ARTSet3[ARTL_ART_equ] = true;
    ARTSet3[ARTL_ART_exponentiate] = true;
    ARTSet3[ARTL_ART_gtr] = true;
    ARTSet3[ARTL_ART_ifExpr] = true;
    ARTSet3[ARTL_ART_loopStatement] = true;
    ARTSet3[ARTL_ART_lss] = true;
    ARTSet3[ARTL_ART_mainExpr] = true;
    ARTSet3[ARTL_ART_minus] = true;
    ARTSet3[ARTL_ART_minusEquals] = true;
    ARTSet3[ARTL_ART_multiply] = true;
    ARTSet3[ARTL_ART_negate] = true;
    ARTSet3[ARTL_ART_not] = true;
    ARTSet3[ARTL_ART_operand] = true;
    ARTSet3[ARTL_ART_or] = true;
    ARTSet3[ARTL_ART_plus] = true;
    ARTSet3[ARTL_ART_plusEquals] = true;
    ARTSet3[ARTL_ART_scopeEnter] = true;
    ARTSet3[ARTL_ART_scopeLeave] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_statements] = true;
    ARTSet3[ARTL_ART_structAssign] = true;
    ARTSet3[ARTL_ART_subExprA] = true;
    ARTSet3[ARTL_ART_subExprB] = true;
    ARTSet3[ARTL_ART_subExprC] = true;
    ARTSet3[ARTL_ART_subExprD] = true;
    ARTSet3[ARTL_ART_subExprE] = true;
    ARTSet3[ARTL_ART_subExprF] = true;
    ARTSet3[ARTL_ART_sysline] = true;
    ARTSet3[ARTL_ART_sysout] = true;
    ARTSet3[ARTL_ART_untilExpr] = true;
    ARTSet3[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTB_ID] = true;
    ARTSet47[ARTTS__LBRACE] = true;
    ARTSet47[ARTL_ART_ID] = true;
    ARTSet47[ARTL_ART_memberAssign] = true;
    ARTSet47[ARTL_ART_structDefinition] = true;
    ARTSet47[ARTL_ART_structStatement] = true;
  }

  public void ARTSet85initialise() {
    ARTSet85 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet85, 0, artSetExtent, false);
    ARTSet85[ARTTB_ID] = true;
    ARTSet85[ARTTB_INTEGER] = true;
    ARTSet85[ARTTB_REAL] = true;
    ARTSet85[ARTTB_STRING_DQ] = true;
    ARTSet85[ARTTS__SHREIK] = true;
    ARTSet85[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet85[ARTTS__LPAR] = true;
    ARTSet85[ARTTS__RPAR] = true;
    ARTSet85[ARTTS__STAR] = true;
    ARTSet85[ARTTS__STAR_STAR] = true;
    ARTSet85[ARTTS__PLUS] = true;
    ARTSet85[ARTTS__MINUS] = true;
    ARTSet85[ARTTS__SLASH] = true;
    ARTSet85[ARTTS__LT] = true;
    ARTSet85[ARTTS__EQUAL_EQUAL] = true;
    ARTSet85[ARTTS__GT] = true;
    ARTSet85[ARTTS_false] = true;
    ARTSet85[ARTTS_true] = true;
    ARTSet85[ARTTS__BAR_BAR] = true;
    ARTSet85[ARTL_ART_AID] = true;
    ARTSet85[ARTL_ART_ID] = true;
    ARTSet85[ARTL_ART_INTEGER] = true;
    ARTSet85[ARTL_ART_REAL] = true;
    ARTSet85[ARTL_ART_STRING_DQ] = true;
    ARTSet85[ARTL_ART_and] = true;
    ARTSet85[ARTL_ART_assign] = true;
    ARTSet85[ARTL_ART_deref] = true;
    ARTSet85[ARTL_ART_divide] = true;
    ARTSet85[ARTL_ART_equ] = true;
    ARTSet85[ARTL_ART_exponentiate] = true;
    ARTSet85[ARTL_ART_gtr] = true;
    ARTSet85[ARTL_ART_lss] = true;
    ARTSet85[ARTL_ART_mainExpr] = true;
    ARTSet85[ARTL_ART_minus] = true;
    ARTSet85[ARTL_ART_minusEquals] = true;
    ARTSet85[ARTL_ART_multiply] = true;
    ARTSet85[ARTL_ART_negate] = true;
    ARTSet85[ARTL_ART_not] = true;
    ARTSet85[ARTL_ART_operand] = true;
    ARTSet85[ARTL_ART_or] = true;
    ARTSet85[ARTL_ART_plus] = true;
    ARTSet85[ARTL_ART_plusEquals] = true;
    ARTSet85[ARTL_ART_structAssign] = true;
    ARTSet85[ARTL_ART_subExprA] = true;
    ARTSet85[ARTL_ART_subExprB] = true;
    ARTSet85[ARTL_ART_subExprC] = true;
    ARTSet85[ARTL_ART_subExprD] = true;
    ARTSet85[ARTL_ART_subExprE] = true;
    ARTSet85[ARTL_ART_subExprF] = true;
  }

  public void ARTSet109initialise() {
    ARTSet109 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet109, 0, artSetExtent, false);
    ARTSet109[ARTTB_ID] = true;
    ARTSet109[ARTL_ART_ID] = true;
    ARTSet109[ARTL_ART_memberAssign] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__AMPERSAND_AMPERSAND] = true;
  }

  public void ARTSet81initialise() {
    ARTSet81 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet81, 0, artSetExtent, false);
    ARTSet81[ARTTS_true] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTB_ID] = true;
    ARTSet29[ARTL_ART_AID] = true;
    ARTSet29[ARTL_ART_ID] = true;
    ARTSet29[ARTL_ART_plusEquals] = true;
  }

  public void ARTSet112initialise() {
    ARTSet112 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet112, 0, artSetExtent, false);
    ARTSet112[ARTTB_ID] = true;
    ARTSet112[ARTTB_INTEGER] = true;
    ARTSet112[ARTTB_REAL] = true;
    ARTSet112[ARTTB_STRING_DQ] = true;
    ARTSet112[ARTTS__SHREIK] = true;
    ARTSet112[ARTTS__LPAR] = true;
    ARTSet112[ARTTS__STAR] = true;
    ARTSet112[ARTTS__STAR_STAR] = true;
    ARTSet112[ARTTS__PLUS] = true;
    ARTSet112[ARTTS__MINUS] = true;
    ARTSet112[ARTTS__SLASH] = true;
    ARTSet112[ARTTS__EQUAL_EQUAL] = true;
    ARTSet112[ARTTS_false] = true;
    ARTSet112[ARTTS_true] = true;
    ARTSet112[ARTL_ART_AID] = true;
    ARTSet112[ARTL_ART_ID] = true;
    ARTSet112[ARTL_ART_INTEGER] = true;
    ARTSet112[ARTL_ART_REAL] = true;
    ARTSet112[ARTL_ART_STRING_DQ] = true;
    ARTSet112[ARTL_ART_deref] = true;
    ARTSet112[ARTL_ART_divide] = true;
    ARTSet112[ARTL_ART_equ] = true;
    ARTSet112[ARTL_ART_exponentiate] = true;
    ARTSet112[ARTL_ART_minus] = true;
    ARTSet112[ARTL_ART_multiply] = true;
    ARTSet112[ARTL_ART_negate] = true;
    ARTSet112[ARTL_ART_not] = true;
    ARTSet112[ARTL_ART_operand] = true;
    ARTSet112[ARTL_ART_plus] = true;
    ARTSet112[ARTL_ART_subExprB] = true;
    ARTSet112[ARTL_ART_subExprC] = true;
    ARTSet112[ARTL_ART_subExprD] = true;
    ARTSet112[ARTL_ART_subExprE] = true;
    ARTSet112[ARTL_ART_subExprF] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
    ARTSet2[ARTL_ART_ID] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTB_ID] = true;
    ARTSet78[ARTL_ART_AID] = true;
    ARTSet78[ARTL_ART_ID] = true;
    ARTSet78[ARTL_ART_deref] = true;
  }

  public void ARTSet83initialise() {
    ARTSet83 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet83, 0, artSetExtent, false);
    ARTSet83[ARTTB_STRING_DQ] = true;
    ARTSet83[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS__RPAR] = true;
    ARTSet16[ARTTS__COMMA] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS_if] = true;
    ARTSet39[ARTL_ART_ifExpr] = true;
  }

  public void ARTSet93initialise() {
    ARTSet93 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet93, 0, artSetExtent, false);
    ARTSet93[ARTTS_struct] = true;
    ARTSet93[ARTL_ART_defStruct] = true;
  }

  public void ARTSet82initialise() {
    ARTSet82 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet82, 0, artSetExtent, false);
    ARTSet82[ARTTS_false] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__RPAR] = true;
    ARTSet18[ARTTS__COMMA] = true;
    ARTSet18[ARTTS__COLON] = true;
    ARTSet18[ARTL_ART_argNote] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTB_ID] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTTB_INTEGER] = true;
    ARTSet15[ARTTB_REAL] = true;
    ARTSet15[ARTTB_STRING_DQ] = true;
    ARTSet15[ARTTS__SHREIK] = true;
    ARTSet15[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet15[ARTTS__LPAR] = true;
    ARTSet15[ARTTS__STAR] = true;
    ARTSet15[ARTTS__STAR_STAR] = true;
    ARTSet15[ARTTS__PLUS] = true;
    ARTSet15[ARTTS__MINUS] = true;
    ARTSet15[ARTTS__SLASH] = true;
    ARTSet15[ARTTS__COLON] = true;
    ARTSet15[ARTTS__LT] = true;
    ARTSet15[ARTTS__EQUAL_EQUAL] = true;
    ARTSet15[ARTTS__GT] = true;
    ARTSet15[ARTTS_false] = true;
    ARTSet15[ARTTS_true] = true;
    ARTSet15[ARTTS__BAR_BAR] = true;
    ARTSet15[ARTL_ART_AID] = true;
    ARTSet15[ARTL_ART_ID] = true;
    ARTSet15[ARTL_ART_INTEGER] = true;
    ARTSet15[ARTL_ART_REAL] = true;
    ARTSet15[ARTL_ART_STRING_DQ] = true;
    ARTSet15[ARTL_ART_and] = true;
    ARTSet15[ARTL_ART_argNote] = true;
    ARTSet15[ARTL_ART_deref] = true;
    ARTSet15[ARTL_ART_divide] = true;
    ARTSet15[ARTL_ART_equ] = true;
    ARTSet15[ARTL_ART_exponentiate] = true;
    ARTSet15[ARTL_ART_gtr] = true;
    ARTSet15[ARTL_ART_lss] = true;
    ARTSet15[ARTL_ART_minus] = true;
    ARTSet15[ARTL_ART_multiply] = true;
    ARTSet15[ARTL_ART_negate] = true;
    ARTSet15[ARTL_ART_not] = true;
    ARTSet15[ARTL_ART_operand] = true;
    ARTSet15[ARTL_ART_or] = true;
    ARTSet15[ARTL_ART_plus] = true;
    ARTSet15[ARTL_ART_subExprA] = true;
    ARTSet15[ARTL_ART_subExprB] = true;
    ARTSet15[ARTL_ART_subExprC] = true;
    ARTSet15[ARTL_ART_subExprD] = true;
    ARTSet15[ARTL_ART_subExprE] = true;
    ARTSet15[ARTL_ART_subExprF] = true;
  }

  public void ARTSet106initialise() {
    ARTSet106 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet106, 0, artSetExtent, false);
    ARTSet106[ARTTB_ID] = true;
    ARTSet106[ARTTS__LBRACE] = true;
    ARTSet106[ARTL_ART_ID] = true;
    ARTSet106[ARTL_ART_memberAssign] = true;
    ARTSet106[ARTL_ART_structStatement] = true;
  }

  public void ARTSet115initialise() {
    ARTSet115 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet115, 0, artSetExtent, false);
    ARTSet115[ARTTB_ID] = true;
    ARTSet115[ARTTB_INTEGER] = true;
    ARTSet115[ARTTB_REAL] = true;
    ARTSet115[ARTTB_STRING_DQ] = true;
    ARTSet115[ARTTS__SHREIK] = true;
    ARTSet115[ARTTS__LPAR] = true;
    ARTSet115[ARTTS__MINUS] = true;
    ARTSet115[ARTTS_false] = true;
    ARTSet115[ARTTS_true] = true;
    ARTSet115[ARTL_ART_AID] = true;
    ARTSet115[ARTL_ART_ID] = true;
    ARTSet115[ARTL_ART_INTEGER] = true;
    ARTSet115[ARTL_ART_REAL] = true;
    ARTSet115[ARTL_ART_STRING_DQ] = true;
    ARTSet115[ARTL_ART_deref] = true;
    ARTSet115[ARTL_ART_negate] = true;
    ARTSet115[ARTL_ART_not] = true;
    ARTSet115[ARTL_ART_operand] = true;
    ARTSet115[ARTL_ART_subExprF] = true;
  }

  public void ARTSet113initialise() {
    ARTSet113 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet113, 0, artSetExtent, false);
    ARTSet113[ARTTB_ID] = true;
    ARTSet113[ARTTB_INTEGER] = true;
    ARTSet113[ARTTB_REAL] = true;
    ARTSet113[ARTTB_STRING_DQ] = true;
    ARTSet113[ARTTS__SHREIK] = true;
    ARTSet113[ARTTS__LPAR] = true;
    ARTSet113[ARTTS__STAR_STAR] = true;
    ARTSet113[ARTTS__MINUS] = true;
    ARTSet113[ARTTS_false] = true;
    ARTSet113[ARTTS_true] = true;
    ARTSet113[ARTL_ART_AID] = true;
    ARTSet113[ARTL_ART_ID] = true;
    ARTSet113[ARTL_ART_INTEGER] = true;
    ARTSet113[ARTL_ART_REAL] = true;
    ARTSet113[ARTL_ART_STRING_DQ] = true;
    ARTSet113[ARTL_ART_deref] = true;
    ARTSet113[ARTL_ART_exponentiate] = true;
    ARTSet113[ARTL_ART_negate] = true;
    ARTSet113[ARTL_ART_not] = true;
    ARTSet113[ARTL_ART_operand] = true;
    ARTSet113[ARTL_ART_subExprE] = true;
    ARTSet113[ARTL_ART_subExprF] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTTB_REAL] = true;
    ARTSet80[ARTL_ART_REAL] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTB_ID] = true;
    ARTSet54[ARTTB_INTEGER] = true;
    ARTSet54[ARTTB_REAL] = true;
    ARTSet54[ARTTB_STRING_DQ] = true;
    ARTSet54[ARTTS__SHREIK] = true;
    ARTSet54[ARTTS__LPAR] = true;
    ARTSet54[ARTTS__STAR] = true;
    ARTSet54[ARTTS__STAR_STAR] = true;
    ARTSet54[ARTTS__PLUS] = true;
    ARTSet54[ARTTS__MINUS] = true;
    ARTSet54[ARTTS__SLASH] = true;
    ARTSet54[ARTTS__EQUAL_EQUAL] = true;
    ARTSet54[ARTTS_false] = true;
    ARTSet54[ARTTS_true] = true;
    ARTSet54[ARTL_ART_AID] = true;
    ARTSet54[ARTL_ART_ID] = true;
    ARTSet54[ARTL_ART_INTEGER] = true;
    ARTSet54[ARTL_ART_REAL] = true;
    ARTSet54[ARTL_ART_STRING_DQ] = true;
    ARTSet54[ARTL_ART_deref] = true;
    ARTSet54[ARTL_ART_divide] = true;
    ARTSet54[ARTL_ART_exponentiate] = true;
    ARTSet54[ARTL_ART_minus] = true;
    ARTSet54[ARTL_ART_multiply] = true;
    ARTSet54[ARTL_ART_negate] = true;
    ARTSet54[ARTL_ART_not] = true;
    ARTSet54[ARTL_ART_operand] = true;
    ARTSet54[ARTL_ART_plus] = true;
    ARTSet54[ARTL_ART_subExprB] = true;
    ARTSet54[ARTL_ART_subExprC] = true;
    ARTSet54[ARTL_ART_subExprD] = true;
    ARTSet54[ARTL_ART_subExprE] = true;
    ARTSet54[ARTL_ART_subExprF] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__COLON] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTB_ID] = true;
    ARTSet13[ARTTB_INTEGER] = true;
    ARTSet13[ARTTB_REAL] = true;
    ARTSet13[ARTTB_STRING_DQ] = true;
    ARTSet13[ARTTS__SHREIK] = true;
    ARTSet13[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet13[ARTTS__LPAR] = true;
    ARTSet13[ARTTS__STAR] = true;
    ARTSet13[ARTTS__STAR_STAR] = true;
    ARTSet13[ARTTS__PLUS] = true;
    ARTSet13[ARTTS__MINUS] = true;
    ARTSet13[ARTTS__SLASH] = true;
    ARTSet13[ARTTS__LT] = true;
    ARTSet13[ARTTS__EQUAL_EQUAL] = true;
    ARTSet13[ARTTS__GT] = true;
    ARTSet13[ARTTS_false] = true;
    ARTSet13[ARTTS_true] = true;
    ARTSet13[ARTTS__BAR_BAR] = true;
    ARTSet13[ARTL_ART_AID] = true;
    ARTSet13[ARTL_ART_ID] = true;
    ARTSet13[ARTL_ART_INTEGER] = true;
    ARTSet13[ARTL_ART_REAL] = true;
    ARTSet13[ARTL_ART_STRING_DQ] = true;
    ARTSet13[ARTL_ART_and] = true;
    ARTSet13[ARTL_ART_deref] = true;
    ARTSet13[ARTL_ART_divide] = true;
    ARTSet13[ARTL_ART_equ] = true;
    ARTSet13[ARTL_ART_exponentiate] = true;
    ARTSet13[ARTL_ART_gtr] = true;
    ARTSet13[ARTL_ART_lss] = true;
    ARTSet13[ARTL_ART_minus] = true;
    ARTSet13[ARTL_ART_multiply] = true;
    ARTSet13[ARTL_ART_negate] = true;
    ARTSet13[ARTL_ART_not] = true;
    ARTSet13[ARTL_ART_operand] = true;
    ARTSet13[ARTL_ART_or] = true;
    ARTSet13[ARTL_ART_plus] = true;
    ARTSet13[ARTL_ART_subExprA] = true;
    ARTSet13[ARTL_ART_subExprB] = true;
    ARTSet13[ARTL_ART_subExprC] = true;
    ARTSet13[ARTL_ART_subExprD] = true;
    ARTSet13[ARTL_ART_subExprE] = true;
    ARTSet13[ARTL_ART_subExprF] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTB_ID] = true;
    ARTSet24[ARTL_ART_AID] = true;
    ARTSet24[ARTL_ART_ID] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTB_ID] = true;
    ARTSet31[ARTTB_INTEGER] = true;
    ARTSet31[ARTTB_REAL] = true;
    ARTSet31[ARTTB_STRING_DQ] = true;
    ARTSet31[ARTTS__SHREIK] = true;
    ARTSet31[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet31[ARTTS__LPAR] = true;
    ARTSet31[ARTTS__STAR] = true;
    ARTSet31[ARTTS__STAR_STAR] = true;
    ARTSet31[ARTTS__PLUS] = true;
    ARTSet31[ARTTS__MINUS] = true;
    ARTSet31[ARTTS__SLASH] = true;
    ARTSet31[ARTTS__LT] = true;
    ARTSet31[ARTTS__EQUAL_EQUAL] = true;
    ARTSet31[ARTTS__GT] = true;
    ARTSet31[ARTTS_elif] = true;
    ARTSet31[ARTTS_false] = true;
    ARTSet31[ARTTS_if] = true;
    ARTSet31[ARTTS_struct] = true;
    ARTSet31[ARTTS_sysline] = true;
    ARTSet31[ARTTS_sysout] = true;
    ARTSet31[ARTTS_true] = true;
    ARTSet31[ARTTS_until] = true;
    ARTSet31[ARTTS_while] = true;
    ARTSet31[ARTTS__LBRACE] = true;
    ARTSet31[ARTTS__BAR_BAR] = true;
    ARTSet31[ARTL_ART_AID] = true;
    ARTSet31[ARTL_ART_ID] = true;
    ARTSet31[ARTL_ART_INTEGER] = true;
    ARTSet31[ARTL_ART_REAL] = true;
    ARTSet31[ARTL_ART_STRING_DQ] = true;
    ARTSet31[ARTL_ART_and] = true;
    ARTSet31[ARTL_ART_assign] = true;
    ARTSet31[ARTL_ART_condStatement] = true;
    ARTSet31[ARTL_ART_defStruct] = true;
    ARTSet31[ARTL_ART_deref] = true;
    ARTSet31[ARTL_ART_divide] = true;
    ARTSet31[ARTL_ART_elifExpr] = true;
    ARTSet31[ARTL_ART_equ] = true;
    ARTSet31[ARTL_ART_exponentiate] = true;
    ARTSet31[ARTL_ART_gtr] = true;
    ARTSet31[ARTL_ART_ifExpr] = true;
    ARTSet31[ARTL_ART_loopStatement] = true;
    ARTSet31[ARTL_ART_lss] = true;
    ARTSet31[ARTL_ART_mainExpr] = true;
    ARTSet31[ARTL_ART_minus] = true;
    ARTSet31[ARTL_ART_minusEquals] = true;
    ARTSet31[ARTL_ART_multiply] = true;
    ARTSet31[ARTL_ART_negate] = true;
    ARTSet31[ARTL_ART_not] = true;
    ARTSet31[ARTL_ART_operand] = true;
    ARTSet31[ARTL_ART_or] = true;
    ARTSet31[ARTL_ART_plus] = true;
    ARTSet31[ARTL_ART_plusEquals] = true;
    ARTSet31[ARTL_ART_scopeEnter] = true;
    ARTSet31[ARTL_ART_statement] = true;
    ARTSet31[ARTL_ART_structAssign] = true;
    ARTSet31[ARTL_ART_subExprA] = true;
    ARTSet31[ARTL_ART_subExprB] = true;
    ARTSet31[ARTL_ART_subExprC] = true;
    ARTSet31[ARTL_ART_subExprD] = true;
    ARTSet31[ARTL_ART_subExprE] = true;
    ARTSet31[ARTL_ART_subExprF] = true;
    ARTSet31[ARTL_ART_sysline] = true;
    ARTSet31[ARTL_ART_sysout] = true;
    ARTSet31[ARTL_ART_untilExpr] = true;
    ARTSet31[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet98initialise() {
    ARTSet98 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet98, 0, artSetExtent, false);
    ARTSet98[ARTTB_ID] = true;
    ARTSet98[ARTTB_INTEGER] = true;
    ARTSet98[ARTTB_REAL] = true;
    ARTSet98[ARTTB_STRING_DQ] = true;
    ARTSet98[ARTTS__SHREIK] = true;
    ARTSet98[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet98[ARTTS__LPAR] = true;
    ARTSet98[ARTTS__STAR] = true;
    ARTSet98[ARTTS__STAR_STAR] = true;
    ARTSet98[ARTTS__PLUS] = true;
    ARTSet98[ARTTS__COMMA] = true;
    ARTSet98[ARTTS__MINUS] = true;
    ARTSet98[ARTTS__SLASH] = true;
    ARTSet98[ARTTS__COLON] = true;
    ARTSet98[ARTTS__LT] = true;
    ARTSet98[ARTTS__EQUAL_EQUAL] = true;
    ARTSet98[ARTTS__GT] = true;
    ARTSet98[ARTTS_false] = true;
    ARTSet98[ARTTS_true] = true;
    ARTSet98[ARTTS__BAR_BAR] = true;
    ARTSet98[ARTL_ART_AID] = true;
    ARTSet98[ARTL_ART_ID] = true;
    ARTSet98[ARTL_ART_INTEGER] = true;
    ARTSet98[ARTL_ART_REAL] = true;
    ARTSet98[ARTL_ART_STRING_DQ] = true;
    ARTSet98[ARTL_ART_and] = true;
    ARTSet98[ARTL_ART_arg] = true;
    ARTSet98[ARTL_ART_argNote] = true;
    ARTSet98[ARTL_ART_deref] = true;
    ARTSet98[ARTL_ART_divide] = true;
    ARTSet98[ARTL_ART_equ] = true;
    ARTSet98[ARTL_ART_exponentiate] = true;
    ARTSet98[ARTL_ART_gtr] = true;
    ARTSet98[ARTL_ART_lss] = true;
    ARTSet98[ARTL_ART_minus] = true;
    ARTSet98[ARTL_ART_multiply] = true;
    ARTSet98[ARTL_ART_negate] = true;
    ARTSet98[ARTL_ART_not] = true;
    ARTSet98[ARTL_ART_operand] = true;
    ARTSet98[ARTL_ART_or] = true;
    ARTSet98[ARTL_ART_plus] = true;
    ARTSet98[ARTL_ART_subExprA] = true;
    ARTSet98[ARTL_ART_subExprB] = true;
    ARTSet98[ARTL_ART_subExprC] = true;
    ARTSet98[ARTL_ART_subExprD] = true;
    ARTSet98[ARTL_ART_subExprE] = true;
    ARTSet98[ARTL_ART_subExprF] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTTB_INTEGER] = true;
    ARTSet26[ARTTB_REAL] = true;
    ARTSet26[ARTTB_STRING_DQ] = true;
    ARTSet26[ARTTS__SHREIK] = true;
    ARTSet26[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet26[ARTTS__LPAR] = true;
    ARTSet26[ARTTS__STAR] = true;
    ARTSet26[ARTTS__STAR_STAR] = true;
    ARTSet26[ARTTS__PLUS] = true;
    ARTSet26[ARTTS__MINUS] = true;
    ARTSet26[ARTTS__SLASH] = true;
    ARTSet26[ARTTS__SEMICOLON] = true;
    ARTSet26[ARTTS__LT] = true;
    ARTSet26[ARTTS__EQUAL_EQUAL] = true;
    ARTSet26[ARTTS__GT] = true;
    ARTSet26[ARTTS_false] = true;
    ARTSet26[ARTTS_true] = true;
    ARTSet26[ARTTS__BAR_BAR] = true;
    ARTSet26[ARTL_ART_AID] = true;
    ARTSet26[ARTL_ART_ID] = true;
    ARTSet26[ARTL_ART_INTEGER] = true;
    ARTSet26[ARTL_ART_REAL] = true;
    ARTSet26[ARTL_ART_STRING_DQ] = true;
    ARTSet26[ARTL_ART_and] = true;
    ARTSet26[ARTL_ART_deref] = true;
    ARTSet26[ARTL_ART_divide] = true;
    ARTSet26[ARTL_ART_equ] = true;
    ARTSet26[ARTL_ART_exponentiate] = true;
    ARTSet26[ARTL_ART_gtr] = true;
    ARTSet26[ARTL_ART_lss] = true;
    ARTSet26[ARTL_ART_minus] = true;
    ARTSet26[ARTL_ART_multiply] = true;
    ARTSet26[ARTL_ART_negate] = true;
    ARTSet26[ARTL_ART_not] = true;
    ARTSet26[ARTL_ART_operand] = true;
    ARTSet26[ARTL_ART_or] = true;
    ARTSet26[ARTL_ART_plus] = true;
    ARTSet26[ARTL_ART_subExprA] = true;
    ARTSet26[ARTL_ART_subExprB] = true;
    ARTSet26[ARTL_ART_subExprC] = true;
    ARTSet26[ARTL_ART_subExprD] = true;
    ARTSet26[ARTL_ART_subExprE] = true;
    ARTSet26[ARTL_ART_subExprF] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTB_ID] = true;
    ARTSet69[ARTL_ART_AID] = true;
    ARTSet69[ARTL_ART_ID] = true;
    ARTSet69[ARTL_ART_assign] = true;
    ARTSet69[ARTL_ART_minusEquals] = true;
    ARTSet69[ARTL_ART_plusEquals] = true;
    ARTSet69[ARTL_ART_structAssign] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTX_EOS] = true;
    ARTSet23[ARTTB_ID] = true;
    ARTSet23[ARTTB_INTEGER] = true;
    ARTSet23[ARTTB_REAL] = true;
    ARTSet23[ARTTB_STRING_DQ] = true;
    ARTSet23[ARTTS__SHREIK] = true;
    ARTSet23[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet23[ARTTS__LPAR] = true;
    ARTSet23[ARTTS__RPAR] = true;
    ARTSet23[ARTTS__STAR] = true;
    ARTSet23[ARTTS__STAR_STAR] = true;
    ARTSet23[ARTTS__PLUS] = true;
    ARTSet23[ARTTS__MINUS] = true;
    ARTSet23[ARTTS__SLASH] = true;
    ARTSet23[ARTTS__LT] = true;
    ARTSet23[ARTTS__EQUAL_EQUAL] = true;
    ARTSet23[ARTTS__GT] = true;
    ARTSet23[ARTTS_elif] = true;
    ARTSet23[ARTTS_else] = true;
    ARTSet23[ARTTS_false] = true;
    ARTSet23[ARTTS_if] = true;
    ARTSet23[ARTTS_struct] = true;
    ARTSet23[ARTTS_sysline] = true;
    ARTSet23[ARTTS_sysout] = true;
    ARTSet23[ARTTS_true] = true;
    ARTSet23[ARTTS_until] = true;
    ARTSet23[ARTTS_while] = true;
    ARTSet23[ARTTS__LBRACE] = true;
    ARTSet23[ARTTS__BAR_BAR] = true;
    ARTSet23[ARTTS__RBRACE] = true;
    ARTSet23[ARTL_ART_AID] = true;
    ARTSet23[ARTL_ART_ID] = true;
    ARTSet23[ARTL_ART_INTEGER] = true;
    ARTSet23[ARTL_ART_REAL] = true;
    ARTSet23[ARTL_ART_STRING_DQ] = true;
    ARTSet23[ARTL_ART_and] = true;
    ARTSet23[ARTL_ART_assign] = true;
    ARTSet23[ARTL_ART_compStatements] = true;
    ARTSet23[ARTL_ART_condStatement] = true;
    ARTSet23[ARTL_ART_defStruct] = true;
    ARTSet23[ARTL_ART_deref] = true;
    ARTSet23[ARTL_ART_divide] = true;
    ARTSet23[ARTL_ART_elifExpr] = true;
    ARTSet23[ARTL_ART_equ] = true;
    ARTSet23[ARTL_ART_exponentiate] = true;
    ARTSet23[ARTL_ART_gtr] = true;
    ARTSet23[ARTL_ART_ifExpr] = true;
    ARTSet23[ARTL_ART_loopStatement] = true;
    ARTSet23[ARTL_ART_lss] = true;
    ARTSet23[ARTL_ART_mainExpr] = true;
    ARTSet23[ARTL_ART_minus] = true;
    ARTSet23[ARTL_ART_minusEquals] = true;
    ARTSet23[ARTL_ART_multiply] = true;
    ARTSet23[ARTL_ART_negate] = true;
    ARTSet23[ARTL_ART_not] = true;
    ARTSet23[ARTL_ART_operand] = true;
    ARTSet23[ARTL_ART_or] = true;
    ARTSet23[ARTL_ART_plus] = true;
    ARTSet23[ARTL_ART_plusEquals] = true;
    ARTSet23[ARTL_ART_scopeEnter] = true;
    ARTSet23[ARTL_ART_scopeLeave] = true;
    ARTSet23[ARTL_ART_statement] = true;
    ARTSet23[ARTL_ART_statements] = true;
    ARTSet23[ARTL_ART_structAssign] = true;
    ARTSet23[ARTL_ART_subExprA] = true;
    ARTSet23[ARTL_ART_subExprB] = true;
    ARTSet23[ARTL_ART_subExprC] = true;
    ARTSet23[ARTL_ART_subExprD] = true;
    ARTSet23[ARTL_ART_subExprE] = true;
    ARTSet23[ARTL_ART_subExprF] = true;
    ARTSet23[ARTL_ART_sysline] = true;
    ARTSet23[ARTL_ART_sysout] = true;
    ARTSet23[ARTL_ART_untilExpr] = true;
    ARTSet23[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet108initialise() {
    ARTSet108 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet108, 0, artSetExtent, false);
    ARTSet108[ARTTB_ID] = true;
    ARTSet108[ARTL_ART_ID] = true;
    ARTSet108[ARTL_ART_memberAssign] = true;
    ARTSet108[ARTL_ART_structStatement] = true;
  }

  public void ARTSet110initialise() {
    ARTSet110 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet110, 0, artSetExtent, false);
    ARTSet110[ARTTB_ID] = true;
    ARTSet110[ARTTB_INTEGER] = true;
    ARTSet110[ARTTB_REAL] = true;
    ARTSet110[ARTTB_STRING_DQ] = true;
    ARTSet110[ARTTS__SHREIK] = true;
    ARTSet110[ARTTS__LPAR] = true;
    ARTSet110[ARTTS__STAR] = true;
    ARTSet110[ARTTS__STAR_STAR] = true;
    ARTSet110[ARTTS__PLUS] = true;
    ARTSet110[ARTTS__MINUS] = true;
    ARTSet110[ARTTS__SLASH] = true;
    ARTSet110[ARTTS__GT] = true;
    ARTSet110[ARTTS_false] = true;
    ARTSet110[ARTTS_true] = true;
    ARTSet110[ARTL_ART_AID] = true;
    ARTSet110[ARTL_ART_ID] = true;
    ARTSet110[ARTL_ART_INTEGER] = true;
    ARTSet110[ARTL_ART_REAL] = true;
    ARTSet110[ARTL_ART_STRING_DQ] = true;
    ARTSet110[ARTL_ART_deref] = true;
    ARTSet110[ARTL_ART_divide] = true;
    ARTSet110[ARTL_ART_exponentiate] = true;
    ARTSet110[ARTL_ART_gtr] = true;
    ARTSet110[ARTL_ART_minus] = true;
    ARTSet110[ARTL_ART_multiply] = true;
    ARTSet110[ARTL_ART_negate] = true;
    ARTSet110[ARTL_ART_not] = true;
    ARTSet110[ARTL_ART_operand] = true;
    ARTSet110[ARTL_ART_plus] = true;
    ARTSet110[ARTL_ART_subExprB] = true;
    ARTSet110[ARTL_ART_subExprC] = true;
    ARTSet110[ARTL_ART_subExprD] = true;
    ARTSet110[ARTL_ART_subExprE] = true;
    ARTSet110[ARTL_ART_subExprF] = true;
  }

  public void ARTSet122initialise() {
    ARTSet122 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet122, 0, artSetExtent, false);
    ARTSet122[ARTTS_until] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS_elif] = true;
    ARTSet43[ARTL_ART_elifExpr] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS_struct] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTB_INTEGER] = true;
    ARTSet79[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTTB_ID] = true;
    ARTSet71[ARTTB_INTEGER] = true;
    ARTSet71[ARTTB_REAL] = true;
    ARTSet71[ARTTB_STRING_DQ] = true;
    ARTSet71[ARTTS__SHREIK] = true;
    ARTSet71[ARTTS__LPAR] = true;
    ARTSet71[ARTTS__STAR] = true;
    ARTSet71[ARTTS__STAR_STAR] = true;
    ARTSet71[ARTTS__PLUS] = true;
    ARTSet71[ARTTS__MINUS] = true;
    ARTSet71[ARTTS__SLASH] = true;
    ARTSet71[ARTTS_false] = true;
    ARTSet71[ARTTS_true] = true;
    ARTSet71[ARTL_ART_AID] = true;
    ARTSet71[ARTL_ART_ID] = true;
    ARTSet71[ARTL_ART_INTEGER] = true;
    ARTSet71[ARTL_ART_REAL] = true;
    ARTSet71[ARTL_ART_STRING_DQ] = true;
    ARTSet71[ARTL_ART_deref] = true;
    ARTSet71[ARTL_ART_divide] = true;
    ARTSet71[ARTL_ART_exponentiate] = true;
    ARTSet71[ARTL_ART_minus] = true;
    ARTSet71[ARTL_ART_multiply] = true;
    ARTSet71[ARTL_ART_negate] = true;
    ARTSet71[ARTL_ART_not] = true;
    ARTSet71[ARTL_ART_operand] = true;
    ARTSet71[ARTL_ART_plus] = true;
    ARTSet71[ARTL_ART_subExprB] = true;
    ARTSet71[ARTL_ART_subExprC] = true;
    ARTSet71[ARTL_ART_subExprD] = true;
    ARTSet71[ARTL_ART_subExprE] = true;
    ARTSet71[ARTL_ART_subExprF] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTB_ID] = true;
    ARTSet44[ARTTB_INTEGER] = true;
    ARTSet44[ARTTB_REAL] = true;
    ARTSet44[ARTTB_STRING_DQ] = true;
    ARTSet44[ARTTS__SHREIK] = true;
    ARTSet44[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet44[ARTTS__LPAR] = true;
    ARTSet44[ARTTS__STAR] = true;
    ARTSet44[ARTTS__STAR_STAR] = true;
    ARTSet44[ARTTS__PLUS] = true;
    ARTSet44[ARTTS__MINUS] = true;
    ARTSet44[ARTTS__SLASH] = true;
    ARTSet44[ARTTS__LT] = true;
    ARTSet44[ARTTS__EQUAL_EQUAL] = true;
    ARTSet44[ARTTS__GT] = true;
    ARTSet44[ARTTS_elif] = true;
    ARTSet44[ARTTS_else] = true;
    ARTSet44[ARTTS_false] = true;
    ARTSet44[ARTTS_if] = true;
    ARTSet44[ARTTS_struct] = true;
    ARTSet44[ARTTS_sysline] = true;
    ARTSet44[ARTTS_sysout] = true;
    ARTSet44[ARTTS_true] = true;
    ARTSet44[ARTTS_until] = true;
    ARTSet44[ARTTS_while] = true;
    ARTSet44[ARTTS__LBRACE] = true;
    ARTSet44[ARTTS__BAR_BAR] = true;
    ARTSet44[ARTL_ART_AID] = true;
    ARTSet44[ARTL_ART_ID] = true;
    ARTSet44[ARTL_ART_INTEGER] = true;
    ARTSet44[ARTL_ART_REAL] = true;
    ARTSet44[ARTL_ART_STRING_DQ] = true;
    ARTSet44[ARTL_ART_and] = true;
    ARTSet44[ARTL_ART_assign] = true;
    ARTSet44[ARTL_ART_compStatements] = true;
    ARTSet44[ARTL_ART_condStatement] = true;
    ARTSet44[ARTL_ART_defStruct] = true;
    ARTSet44[ARTL_ART_deref] = true;
    ARTSet44[ARTL_ART_divide] = true;
    ARTSet44[ARTL_ART_elifExpr] = true;
    ARTSet44[ARTL_ART_equ] = true;
    ARTSet44[ARTL_ART_exponentiate] = true;
    ARTSet44[ARTL_ART_gtr] = true;
    ARTSet44[ARTL_ART_ifExpr] = true;
    ARTSet44[ARTL_ART_loopStatement] = true;
    ARTSet44[ARTL_ART_lss] = true;
    ARTSet44[ARTL_ART_mainExpr] = true;
    ARTSet44[ARTL_ART_minus] = true;
    ARTSet44[ARTL_ART_minusEquals] = true;
    ARTSet44[ARTL_ART_multiply] = true;
    ARTSet44[ARTL_ART_negate] = true;
    ARTSet44[ARTL_ART_not] = true;
    ARTSet44[ARTL_ART_operand] = true;
    ARTSet44[ARTL_ART_or] = true;
    ARTSet44[ARTL_ART_plus] = true;
    ARTSet44[ARTL_ART_plusEquals] = true;
    ARTSet44[ARTL_ART_scopeEnter] = true;
    ARTSet44[ARTL_ART_statement] = true;
    ARTSet44[ARTL_ART_structAssign] = true;
    ARTSet44[ARTL_ART_subExprA] = true;
    ARTSet44[ARTL_ART_subExprB] = true;
    ARTSet44[ARTL_ART_subExprC] = true;
    ARTSet44[ARTL_ART_subExprD] = true;
    ARTSet44[ARTL_ART_subExprE] = true;
    ARTSet44[ARTL_ART_subExprF] = true;
    ARTSet44[ARTL_ART_sysline] = true;
    ARTSet44[ARTL_ART_sysout] = true;
    ARTSet44[ARTL_ART_untilExpr] = true;
    ARTSet44[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet107initialise() {
    ARTSet107 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet107, 0, artSetExtent, false);
    ARTSet107[ARTTB_ID] = true;
    ARTSet107[ARTL_ART_ID] = true;
    ARTSet107[ARTL_ART_memberAssign] = true;
    ARTSet107[ARTL_ART_structStatement] = true;
    ARTSet107[ARTL_ART_structStatements] = true;
  }

  public void ARTSet97initialise() {
    ARTSet97 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet97, 0, artSetExtent, false);
    ARTSet97[ARTTS_sysline] = true;
    ARTSet97[ARTL_ART_sysline] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTB_ID] = true;
    ARTSet68[ARTTB_INTEGER] = true;
    ARTSet68[ARTTB_REAL] = true;
    ARTSet68[ARTTB_STRING_DQ] = true;
    ARTSet68[ARTTS__SHREIK] = true;
    ARTSet68[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet68[ARTTS__LPAR] = true;
    ARTSet68[ARTTS__STAR] = true;
    ARTSet68[ARTTS__STAR_STAR] = true;
    ARTSet68[ARTTS__PLUS] = true;
    ARTSet68[ARTTS__MINUS] = true;
    ARTSet68[ARTTS__SLASH] = true;
    ARTSet68[ARTTS__LT] = true;
    ARTSet68[ARTTS__EQUAL_EQUAL] = true;
    ARTSet68[ARTTS__GT] = true;
    ARTSet68[ARTTS_false] = true;
    ARTSet68[ARTTS_true] = true;
    ARTSet68[ARTTS__BAR_BAR] = true;
    ARTSet68[ARTL_ART_AID] = true;
    ARTSet68[ARTL_ART_ID] = true;
    ARTSet68[ARTL_ART_INTEGER] = true;
    ARTSet68[ARTL_ART_REAL] = true;
    ARTSet68[ARTL_ART_STRING_DQ] = true;
    ARTSet68[ARTL_ART_and] = true;
    ARTSet68[ARTL_ART_assign] = true;
    ARTSet68[ARTL_ART_deref] = true;
    ARTSet68[ARTL_ART_divide] = true;
    ARTSet68[ARTL_ART_equ] = true;
    ARTSet68[ARTL_ART_exponentiate] = true;
    ARTSet68[ARTL_ART_gtr] = true;
    ARTSet68[ARTL_ART_lss] = true;
    ARTSet68[ARTL_ART_minus] = true;
    ARTSet68[ARTL_ART_minusEquals] = true;
    ARTSet68[ARTL_ART_multiply] = true;
    ARTSet68[ARTL_ART_negate] = true;
    ARTSet68[ARTL_ART_not] = true;
    ARTSet68[ARTL_ART_operand] = true;
    ARTSet68[ARTL_ART_or] = true;
    ARTSet68[ARTL_ART_plus] = true;
    ARTSet68[ARTL_ART_plusEquals] = true;
    ARTSet68[ARTL_ART_structAssign] = true;
    ARTSet68[ARTL_ART_subExprA] = true;
    ARTSet68[ARTL_ART_subExprB] = true;
    ARTSet68[ARTL_ART_subExprC] = true;
    ARTSet68[ARTL_ART_subExprD] = true;
    ARTSet68[ARTL_ART_subExprE] = true;
    ARTSet68[ARTL_ART_subExprF] = true;
  }

  public void ARTSet92initialise() {
    ARTSet92 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet92, 0, artSetExtent, false);
    ARTSet92[ARTTB_ID] = true;
    ARTSet92[ARTTB_INTEGER] = true;
    ARTSet92[ARTTB_REAL] = true;
    ARTSet92[ARTTB_STRING_DQ] = true;
    ARTSet92[ARTTS__SHREIK] = true;
    ARTSet92[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet92[ARTTS__LPAR] = true;
    ARTSet92[ARTTS__STAR] = true;
    ARTSet92[ARTTS__STAR_STAR] = true;
    ARTSet92[ARTTS__PLUS] = true;
    ARTSet92[ARTTS__MINUS] = true;
    ARTSet92[ARTTS__SLASH] = true;
    ARTSet92[ARTTS__LT] = true;
    ARTSet92[ARTTS__EQUAL_EQUAL] = true;
    ARTSet92[ARTTS__GT] = true;
    ARTSet92[ARTTS_elif] = true;
    ARTSet92[ARTTS_false] = true;
    ARTSet92[ARTTS_if] = true;
    ARTSet92[ARTTS_struct] = true;
    ARTSet92[ARTTS_sysline] = true;
    ARTSet92[ARTTS_sysout] = true;
    ARTSet92[ARTTS_true] = true;
    ARTSet92[ARTTS_until] = true;
    ARTSet92[ARTTS_while] = true;
    ARTSet92[ARTTS__BAR_BAR] = true;
    ARTSet92[ARTL_ART_AID] = true;
    ARTSet92[ARTL_ART_ID] = true;
    ARTSet92[ARTL_ART_INTEGER] = true;
    ARTSet92[ARTL_ART_REAL] = true;
    ARTSet92[ARTL_ART_STRING_DQ] = true;
    ARTSet92[ARTL_ART_and] = true;
    ARTSet92[ARTL_ART_assign] = true;
    ARTSet92[ARTL_ART_condStatement] = true;
    ARTSet92[ARTL_ART_defStruct] = true;
    ARTSet92[ARTL_ART_deref] = true;
    ARTSet92[ARTL_ART_divide] = true;
    ARTSet92[ARTL_ART_elifExpr] = true;
    ARTSet92[ARTL_ART_equ] = true;
    ARTSet92[ARTL_ART_exponentiate] = true;
    ARTSet92[ARTL_ART_gtr] = true;
    ARTSet92[ARTL_ART_ifExpr] = true;
    ARTSet92[ARTL_ART_loopStatement] = true;
    ARTSet92[ARTL_ART_lss] = true;
    ARTSet92[ARTL_ART_mainExpr] = true;
    ARTSet92[ARTL_ART_minus] = true;
    ARTSet92[ARTL_ART_minusEquals] = true;
    ARTSet92[ARTL_ART_multiply] = true;
    ARTSet92[ARTL_ART_negate] = true;
    ARTSet92[ARTL_ART_not] = true;
    ARTSet92[ARTL_ART_operand] = true;
    ARTSet92[ARTL_ART_or] = true;
    ARTSet92[ARTL_ART_plus] = true;
    ARTSet92[ARTL_ART_plusEquals] = true;
    ARTSet92[ARTL_ART_structAssign] = true;
    ARTSet92[ARTL_ART_subExprA] = true;
    ARTSet92[ARTL_ART_subExprB] = true;
    ARTSet92[ARTL_ART_subExprC] = true;
    ARTSet92[ARTL_ART_subExprD] = true;
    ARTSet92[ARTL_ART_subExprE] = true;
    ARTSet92[ARTL_ART_subExprF] = true;
    ARTSet92[ARTL_ART_sysline] = true;
    ARTSet92[ARTL_ART_sysout] = true;
    ARTSet92[ARTL_ART_untilExpr] = true;
    ARTSet92[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet116initialise() {
    ARTSet116 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet116, 0, artSetExtent, false);
    ARTSet116[ARTTB_ID] = true;
    ARTSet116[ARTTB_INTEGER] = true;
    ARTSet116[ARTTB_REAL] = true;
    ARTSet116[ARTTB_STRING_DQ] = true;
    ARTSet116[ARTTS__LPAR] = true;
    ARTSet116[ARTTS_false] = true;
    ARTSet116[ARTTS_true] = true;
    ARTSet116[ARTL_ART_AID] = true;
    ARTSet116[ARTL_ART_ID] = true;
    ARTSet116[ARTL_ART_INTEGER] = true;
    ARTSet116[ARTL_ART_REAL] = true;
    ARTSet116[ARTL_ART_STRING_DQ] = true;
    ARTSet116[ARTL_ART_deref] = true;
    ARTSet116[ARTL_ART_operand] = true;
    ARTSet116[ARTL_ART_subExprF] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTS_if] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS_else] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTS__SHREIK] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTB_ID] = true;
    ARTSet30[ARTL_ART_AID] = true;
    ARTSet30[ARTL_ART_ID] = true;
    ARTSet30[ARTL_ART_minusEquals] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTB_ID] = true;
    ARTSet37[ARTTB_INTEGER] = true;
    ARTSet37[ARTTB_REAL] = true;
    ARTSet37[ARTTB_STRING_DQ] = true;
    ARTSet37[ARTTS__SHREIK] = true;
    ARTSet37[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet37[ARTTS__LPAR] = true;
    ARTSet37[ARTTS__STAR] = true;
    ARTSet37[ARTTS__STAR_STAR] = true;
    ARTSet37[ARTTS__PLUS] = true;
    ARTSet37[ARTTS__MINUS] = true;
    ARTSet37[ARTTS__SLASH] = true;
    ARTSet37[ARTTS__LT] = true;
    ARTSet37[ARTTS__EQUAL_EQUAL] = true;
    ARTSet37[ARTTS__GT] = true;
    ARTSet37[ARTTS_elif] = true;
    ARTSet37[ARTTS_false] = true;
    ARTSet37[ARTTS_if] = true;
    ARTSet37[ARTTS_struct] = true;
    ARTSet37[ARTTS_sysline] = true;
    ARTSet37[ARTTS_sysout] = true;
    ARTSet37[ARTTS_true] = true;
    ARTSet37[ARTTS_until] = true;
    ARTSet37[ARTTS_while] = true;
    ARTSet37[ARTTS__BAR_BAR] = true;
    ARTSet37[ARTL_ART_AID] = true;
    ARTSet37[ARTL_ART_ID] = true;
    ARTSet37[ARTL_ART_INTEGER] = true;
    ARTSet37[ARTL_ART_REAL] = true;
    ARTSet37[ARTL_ART_STRING_DQ] = true;
    ARTSet37[ARTL_ART_and] = true;
    ARTSet37[ARTL_ART_assign] = true;
    ARTSet37[ARTL_ART_condStatement] = true;
    ARTSet37[ARTL_ART_defStruct] = true;
    ARTSet37[ARTL_ART_deref] = true;
    ARTSet37[ARTL_ART_divide] = true;
    ARTSet37[ARTL_ART_elifExpr] = true;
    ARTSet37[ARTL_ART_equ] = true;
    ARTSet37[ARTL_ART_exponentiate] = true;
    ARTSet37[ARTL_ART_gtr] = true;
    ARTSet37[ARTL_ART_ifExpr] = true;
    ARTSet37[ARTL_ART_loopStatement] = true;
    ARTSet37[ARTL_ART_lss] = true;
    ARTSet37[ARTL_ART_mainExpr] = true;
    ARTSet37[ARTL_ART_minus] = true;
    ARTSet37[ARTL_ART_minusEquals] = true;
    ARTSet37[ARTL_ART_multiply] = true;
    ARTSet37[ARTL_ART_negate] = true;
    ARTSet37[ARTL_ART_not] = true;
    ARTSet37[ARTL_ART_operand] = true;
    ARTSet37[ARTL_ART_or] = true;
    ARTSet37[ARTL_ART_plus] = true;
    ARTSet37[ARTL_ART_plusEquals] = true;
    ARTSet37[ARTL_ART_statement] = true;
    ARTSet37[ARTL_ART_structAssign] = true;
    ARTSet37[ARTL_ART_subExprA] = true;
    ARTSet37[ARTL_ART_subExprB] = true;
    ARTSet37[ARTL_ART_subExprC] = true;
    ARTSet37[ARTL_ART_subExprD] = true;
    ARTSet37[ARTL_ART_subExprE] = true;
    ARTSet37[ARTL_ART_subExprF] = true;
    ARTSet37[ARTL_ART_sysline] = true;
    ARTSet37[ARTL_ART_sysout] = true;
    ARTSet37[ARTL_ART_untilExpr] = true;
    ARTSet37[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTB_ID] = true;
    ARTSet58[ARTTB_INTEGER] = true;
    ARTSet58[ARTTB_REAL] = true;
    ARTSet58[ARTTB_STRING_DQ] = true;
    ARTSet58[ARTTS__SHREIK] = true;
    ARTSet58[ARTTS__LPAR] = true;
    ARTSet58[ARTTS__MINUS] = true;
    ARTSet58[ARTTS_false] = true;
    ARTSet58[ARTTS_true] = true;
    ARTSet58[ARTL_ART_AID] = true;
    ARTSet58[ARTL_ART_ID] = true;
    ARTSet58[ARTL_ART_INTEGER] = true;
    ARTSet58[ARTL_ART_REAL] = true;
    ARTSet58[ARTL_ART_STRING_DQ] = true;
    ARTSet58[ARTL_ART_deref] = true;
    ARTSet58[ARTL_ART_negate] = true;
    ARTSet58[ARTL_ART_not] = true;
    ARTSet58[ARTL_ART_operand] = true;
    ARTSet58[ARTL_ART_subExprE] = true;
    ARTSet58[ARTL_ART_subExprF] = true;
  }

  public void ARTSet114initialise() {
    ARTSet114 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet114, 0, artSetExtent, false);
    ARTSet114[ARTTB_ID] = true;
    ARTSet114[ARTTB_INTEGER] = true;
    ARTSet114[ARTTB_REAL] = true;
    ARTSet114[ARTTB_STRING_DQ] = true;
    ARTSet114[ARTTS__SHREIK] = true;
    ARTSet114[ARTTS__LPAR] = true;
    ARTSet114[ARTTS__STAR_STAR] = true;
    ARTSet114[ARTTS__MINUS] = true;
    ARTSet114[ARTTS_false] = true;
    ARTSet114[ARTTS_true] = true;
    ARTSet114[ARTL_ART_AID] = true;
    ARTSet114[ARTL_ART_ID] = true;
    ARTSet114[ARTL_ART_INTEGER] = true;
    ARTSet114[ARTL_ART_REAL] = true;
    ARTSet114[ARTL_ART_STRING_DQ] = true;
    ARTSet114[ARTL_ART_deref] = true;
    ARTSet114[ARTL_ART_exponentiate] = true;
    ARTSet114[ARTL_ART_negate] = true;
    ARTSet114[ARTL_ART_not] = true;
    ARTSet114[ARTL_ART_operand] = true;
    ARTSet114[ARTL_ART_subExprE] = true;
    ARTSet114[ARTL_ART_subExprF] = true;
  }

  public void ARTSet84initialise() {
    ARTSet84 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet84, 0, artSetExtent, false);
    ARTSet84[ARTTS__LPAR] = true;
  }

  public void ARTSet86initialise() {
    ARTSet86 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet86, 0, artSetExtent, false);
    ARTSet86[ARTTS__RPAR] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTB_ID] = true;
    ARTSet57[ARTTB_INTEGER] = true;
    ARTSet57[ARTTB_REAL] = true;
    ARTSet57[ARTTB_STRING_DQ] = true;
    ARTSet57[ARTTS__SHREIK] = true;
    ARTSet57[ARTTS__LPAR] = true;
    ARTSet57[ARTTS__STAR_STAR] = true;
    ARTSet57[ARTTS__MINUS] = true;
    ARTSet57[ARTTS_false] = true;
    ARTSet57[ARTTS_true] = true;
    ARTSet57[ARTL_ART_AID] = true;
    ARTSet57[ARTL_ART_ID] = true;
    ARTSet57[ARTL_ART_INTEGER] = true;
    ARTSet57[ARTL_ART_REAL] = true;
    ARTSet57[ARTL_ART_STRING_DQ] = true;
    ARTSet57[ARTL_ART_deref] = true;
    ARTSet57[ARTL_ART_negate] = true;
    ARTSet57[ARTL_ART_not] = true;
    ARTSet57[ARTL_ART_operand] = true;
    ARTSet57[ARTL_ART_subExprE] = true;
    ARTSet57[ARTL_ART_subExprF] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS__STAR] = true;
  }

  public void ARTSet88initialise() {
    ARTSet88 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet88, 0, artSetExtent, false);
    ARTSet88[ARTTS__PLUS] = true;
  }

  public void ARTSet101initialise() {
    ARTSet101 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet101, 0, artSetExtent, false);
    ARTSet101[ARTTS__COMMA] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__RBRACE] = true;
    ARTSet36[ARTL_ART_scopeLeave] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS__MINUS] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTS__PERIOD] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTS__SLASH] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS__COLON] = true;
    ARTSet19[ARTL_ART_argNote] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTTB_INTEGER] = true;
    ARTSet12[ARTTB_REAL] = true;
    ARTSet12[ARTTB_STRING_DQ] = true;
    ARTSet12[ARTTS__SHREIK] = true;
    ARTSet12[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet12[ARTTS__LPAR] = true;
    ARTSet12[ARTTS__STAR] = true;
    ARTSet12[ARTTS__STAR_STAR] = true;
    ARTSet12[ARTTS__PLUS] = true;
    ARTSet12[ARTTS__MINUS] = true;
    ARTSet12[ARTTS__SLASH] = true;
    ARTSet12[ARTTS__LT] = true;
    ARTSet12[ARTTS__EQUAL_EQUAL] = true;
    ARTSet12[ARTTS__GT] = true;
    ARTSet12[ARTTS_false] = true;
    ARTSet12[ARTTS_true] = true;
    ARTSet12[ARTTS__BAR_BAR] = true;
    ARTSet12[ARTL_ART_AID] = true;
    ARTSet12[ARTL_ART_ID] = true;
    ARTSet12[ARTL_ART_INTEGER] = true;
    ARTSet12[ARTL_ART_REAL] = true;
    ARTSet12[ARTL_ART_STRING_DQ] = true;
    ARTSet12[ARTL_ART_and] = true;
    ARTSet12[ARTL_ART_deref] = true;
    ARTSet12[ARTL_ART_divide] = true;
    ARTSet12[ARTL_ART_equ] = true;
    ARTSet12[ARTL_ART_exponentiate] = true;
    ARTSet12[ARTL_ART_gtr] = true;
    ARTSet12[ARTL_ART_lss] = true;
    ARTSet12[ARTL_ART_minus] = true;
    ARTSet12[ARTL_ART_multiply] = true;
    ARTSet12[ARTL_ART_negate] = true;
    ARTSet12[ARTL_ART_not] = true;
    ARTSet12[ARTL_ART_operand] = true;
    ARTSet12[ARTL_ART_or] = true;
    ARTSet12[ARTL_ART_plus] = true;
    ARTSet12[ARTL_ART_subExprA] = true;
    ARTSet12[ARTL_ART_subExprB] = true;
    ARTSet12[ARTL_ART_subExprC] = true;
    ARTSet12[ARTL_ART_subExprD] = true;
    ARTSet12[ARTL_ART_subExprE] = true;
    ARTSet12[ARTL_ART_subExprF] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS_elif] = true;
  }

  public void ARTSet95initialise() {
    ARTSet95 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet95, 0, artSetExtent, false);
    ARTSet95[ARTTS_elif] = true;
    ARTSet95[ARTTS_if] = true;
    ARTSet95[ARTL_ART_condStatement] = true;
    ARTSet95[ARTL_ART_elifExpr] = true;
    ARTSet95[ARTL_ART_ifExpr] = true;
  }

  public void ARTSet118initialise() {
    ARTSet118 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet118, 0, artSetExtent, false);
    ARTSet118[ARTTS__MINUS] = true;
    ARTSet118[ARTL_ART_negate] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__COLON] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS__LT] = true;
  }

  public void ARTSet111initialise() {
    ARTSet111 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet111, 0, artSetExtent, false);
    ARTSet111[ARTTB_ID] = true;
    ARTSet111[ARTTB_INTEGER] = true;
    ARTSet111[ARTTB_REAL] = true;
    ARTSet111[ARTTB_STRING_DQ] = true;
    ARTSet111[ARTTS__SHREIK] = true;
    ARTSet111[ARTTS__LPAR] = true;
    ARTSet111[ARTTS__STAR] = true;
    ARTSet111[ARTTS__STAR_STAR] = true;
    ARTSet111[ARTTS__PLUS] = true;
    ARTSet111[ARTTS__MINUS] = true;
    ARTSet111[ARTTS__SLASH] = true;
    ARTSet111[ARTTS__LT] = true;
    ARTSet111[ARTTS_false] = true;
    ARTSet111[ARTTS_true] = true;
    ARTSet111[ARTL_ART_AID] = true;
    ARTSet111[ARTL_ART_ID] = true;
    ARTSet111[ARTL_ART_INTEGER] = true;
    ARTSet111[ARTL_ART_REAL] = true;
    ARTSet111[ARTL_ART_STRING_DQ] = true;
    ARTSet111[ARTL_ART_deref] = true;
    ARTSet111[ARTL_ART_divide] = true;
    ARTSet111[ARTL_ART_exponentiate] = true;
    ARTSet111[ARTL_ART_lss] = true;
    ARTSet111[ARTL_ART_minus] = true;
    ARTSet111[ARTL_ART_multiply] = true;
    ARTSet111[ARTL_ART_negate] = true;
    ARTSet111[ARTL_ART_not] = true;
    ARTSet111[ARTL_ART_operand] = true;
    ARTSet111[ARTL_ART_plus] = true;
    ARTSet111[ARTL_ART_subExprB] = true;
    ARTSet111[ARTL_ART_subExprC] = true;
    ARTSet111[ARTL_ART_subExprD] = true;
    ARTSet111[ARTL_ART_subExprE] = true;
    ARTSet111[ARTL_ART_subExprF] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet61initialise() {
    ARTSet61 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet61, 0, artSetExtent, false);
    ARTSet61[ARTTS__GT] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTB_ID] = true;
    ARTSet41[ARTTB_INTEGER] = true;
    ARTSet41[ARTTB_REAL] = true;
    ARTSet41[ARTTB_STRING_DQ] = true;
    ARTSet41[ARTTS__SHREIK] = true;
    ARTSet41[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet41[ARTTS__LPAR] = true;
    ARTSet41[ARTTS__STAR] = true;
    ARTSet41[ARTTS__STAR_STAR] = true;
    ARTSet41[ARTTS__PLUS] = true;
    ARTSet41[ARTTS__MINUS] = true;
    ARTSet41[ARTTS__SLASH] = true;
    ARTSet41[ARTTS__LT] = true;
    ARTSet41[ARTTS__EQUAL_EQUAL] = true;
    ARTSet41[ARTTS__GT] = true;
    ARTSet41[ARTTS_elif] = true;
    ARTSet41[ARTTS_false] = true;
    ARTSet41[ARTTS_if] = true;
    ARTSet41[ARTTS_struct] = true;
    ARTSet41[ARTTS_sysline] = true;
    ARTSet41[ARTTS_sysout] = true;
    ARTSet41[ARTTS_true] = true;
    ARTSet41[ARTTS_until] = true;
    ARTSet41[ARTTS_while] = true;
    ARTSet41[ARTTS__LBRACE] = true;
    ARTSet41[ARTTS__BAR_BAR] = true;
    ARTSet41[ARTL_ART_AID] = true;
    ARTSet41[ARTL_ART_ID] = true;
    ARTSet41[ARTL_ART_INTEGER] = true;
    ARTSet41[ARTL_ART_REAL] = true;
    ARTSet41[ARTL_ART_STRING_DQ] = true;
    ARTSet41[ARTL_ART_and] = true;
    ARTSet41[ARTL_ART_assign] = true;
    ARTSet41[ARTL_ART_compStatements] = true;
    ARTSet41[ARTL_ART_condStatement] = true;
    ARTSet41[ARTL_ART_defStruct] = true;
    ARTSet41[ARTL_ART_deref] = true;
    ARTSet41[ARTL_ART_divide] = true;
    ARTSet41[ARTL_ART_elifExpr] = true;
    ARTSet41[ARTL_ART_equ] = true;
    ARTSet41[ARTL_ART_exponentiate] = true;
    ARTSet41[ARTL_ART_gtr] = true;
    ARTSet41[ARTL_ART_ifExpr] = true;
    ARTSet41[ARTL_ART_loopStatement] = true;
    ARTSet41[ARTL_ART_lss] = true;
    ARTSet41[ARTL_ART_mainExpr] = true;
    ARTSet41[ARTL_ART_minus] = true;
    ARTSet41[ARTL_ART_minusEquals] = true;
    ARTSet41[ARTL_ART_multiply] = true;
    ARTSet41[ARTL_ART_negate] = true;
    ARTSet41[ARTL_ART_not] = true;
    ARTSet41[ARTL_ART_operand] = true;
    ARTSet41[ARTL_ART_or] = true;
    ARTSet41[ARTL_ART_plus] = true;
    ARTSet41[ARTL_ART_plusEquals] = true;
    ARTSet41[ARTL_ART_scopeEnter] = true;
    ARTSet41[ARTL_ART_statement] = true;
    ARTSet41[ARTL_ART_structAssign] = true;
    ARTSet41[ARTL_ART_subExprA] = true;
    ARTSet41[ARTL_ART_subExprB] = true;
    ARTSet41[ARTL_ART_subExprC] = true;
    ARTSet41[ARTL_ART_subExprD] = true;
    ARTSet41[ARTL_ART_subExprE] = true;
    ARTSet41[ARTL_ART_subExprF] = true;
    ARTSet41[ARTL_ART_sysline] = true;
    ARTSet41[ARTL_ART_sysout] = true;
    ARTSet41[ARTL_ART_untilExpr] = true;
    ARTSet41[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTB_ID] = true;
    ARTSet48[ARTTB_INTEGER] = true;
    ARTSet48[ARTTB_REAL] = true;
    ARTSet48[ARTTB_STRING_DQ] = true;
    ARTSet48[ARTTS__SHREIK] = true;
    ARTSet48[ARTTS__LPAR] = true;
    ARTSet48[ARTTS__STAR] = true;
    ARTSet48[ARTTS__STAR_STAR] = true;
    ARTSet48[ARTTS__MINUS] = true;
    ARTSet48[ARTTS__SLASH] = true;
    ARTSet48[ARTTS_false] = true;
    ARTSet48[ARTTS_true] = true;
    ARTSet48[ARTL_ART_AID] = true;
    ARTSet48[ARTL_ART_ID] = true;
    ARTSet48[ARTL_ART_INTEGER] = true;
    ARTSet48[ARTL_ART_REAL] = true;
    ARTSet48[ARTL_ART_STRING_DQ] = true;
    ARTSet48[ARTL_ART_deref] = true;
    ARTSet48[ARTL_ART_divide] = true;
    ARTSet48[ARTL_ART_exponentiate] = true;
    ARTSet48[ARTL_ART_multiply] = true;
    ARTSet48[ARTL_ART_negate] = true;
    ARTSet48[ARTL_ART_not] = true;
    ARTSet48[ARTL_ART_operand] = true;
    ARTSet48[ARTL_ART_subExprC] = true;
    ARTSet48[ARTL_ART_subExprD] = true;
    ARTSet48[ARTL_ART_subExprE] = true;
    ARTSet48[ARTL_ART_subExprF] = true;
  }

  public void ARTSet121initialise() {
    ARTSet121 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet121, 0, artSetExtent, false);
    ARTSet121[ARTTS_sysout] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTB_ID] = true;
    ARTSet51[ARTTB_INTEGER] = true;
    ARTSet51[ARTTB_REAL] = true;
    ARTSet51[ARTTB_STRING_DQ] = true;
    ARTSet51[ARTTS__SHREIK] = true;
    ARTSet51[ARTTS__LPAR] = true;
    ARTSet51[ARTTS__STAR_STAR] = true;
    ARTSet51[ARTTS__MINUS] = true;
    ARTSet51[ARTTS_false] = true;
    ARTSet51[ARTTS_true] = true;
    ARTSet51[ARTL_ART_AID] = true;
    ARTSet51[ARTL_ART_ID] = true;
    ARTSet51[ARTL_ART_INTEGER] = true;
    ARTSet51[ARTL_ART_REAL] = true;
    ARTSet51[ARTL_ART_STRING_DQ] = true;
    ARTSet51[ARTL_ART_deref] = true;
    ARTSet51[ARTL_ART_exponentiate] = true;
    ARTSet51[ARTL_ART_negate] = true;
    ARTSet51[ARTL_ART_not] = true;
    ARTSet51[ARTL_ART_operand] = true;
    ARTSet51[ARTL_ART_subExprD] = true;
    ARTSet51[ARTL_ART_subExprE] = true;
    ARTSet51[ARTL_ART_subExprF] = true;
  }

  public void ARTSet96initialise() {
    ARTSet96 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet96, 0, artSetExtent, false);
    ARTSet96[ARTTS_sysout] = true;
    ARTSet96[ARTL_ART_sysout] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTB_ID] = true;
    ARTSet17[ARTTB_INTEGER] = true;
    ARTSet17[ARTTB_REAL] = true;
    ARTSet17[ARTTB_STRING_DQ] = true;
    ARTSet17[ARTTS__SHREIK] = true;
    ARTSet17[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet17[ARTTS__LPAR] = true;
    ARTSet17[ARTTS__RPAR] = true;
    ARTSet17[ARTTS__STAR] = true;
    ARTSet17[ARTTS__STAR_STAR] = true;
    ARTSet17[ARTTS__PLUS] = true;
    ARTSet17[ARTTS__COMMA] = true;
    ARTSet17[ARTTS__MINUS] = true;
    ARTSet17[ARTTS__SLASH] = true;
    ARTSet17[ARTTS__COLON] = true;
    ARTSet17[ARTTS__LT] = true;
    ARTSet17[ARTTS__EQUAL_EQUAL] = true;
    ARTSet17[ARTTS__GT] = true;
    ARTSet17[ARTTS_false] = true;
    ARTSet17[ARTTS_true] = true;
    ARTSet17[ARTTS__BAR_BAR] = true;
    ARTSet17[ARTL_ART_AID] = true;
    ARTSet17[ARTL_ART_ID] = true;
    ARTSet17[ARTL_ART_INTEGER] = true;
    ARTSet17[ARTL_ART_REAL] = true;
    ARTSet17[ARTL_ART_STRING_DQ] = true;
    ARTSet17[ARTL_ART_and] = true;
    ARTSet17[ARTL_ART_argNote] = true;
    ARTSet17[ARTL_ART_deref] = true;
    ARTSet17[ARTL_ART_divide] = true;
    ARTSet17[ARTL_ART_equ] = true;
    ARTSet17[ARTL_ART_exponentiate] = true;
    ARTSet17[ARTL_ART_gtr] = true;
    ARTSet17[ARTL_ART_lss] = true;
    ARTSet17[ARTL_ART_minus] = true;
    ARTSet17[ARTL_ART_multiply] = true;
    ARTSet17[ARTL_ART_negate] = true;
    ARTSet17[ARTL_ART_not] = true;
    ARTSet17[ARTL_ART_operand] = true;
    ARTSet17[ARTL_ART_or] = true;
    ARTSet17[ARTL_ART_plus] = true;
    ARTSet17[ARTL_ART_subExprA] = true;
    ARTSet17[ARTL_ART_subExprB] = true;
    ARTSet17[ARTL_ART_subExprC] = true;
    ARTSet17[ARTL_ART_subExprD] = true;
    ARTSet17[ARTL_ART_subExprE] = true;
    ARTSet17[ARTL_ART_subExprF] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTB_ID] = true;
    ARTSet66[ARTTB_INTEGER] = true;
    ARTSet66[ARTTB_REAL] = true;
    ARTSet66[ARTTB_STRING_DQ] = true;
    ARTSet66[ARTTS__SHREIK] = true;
    ARTSet66[ARTTS__LPAR] = true;
    ARTSet66[ARTTS__STAR] = true;
    ARTSet66[ARTTS__STAR_STAR] = true;
    ARTSet66[ARTTS__PLUS] = true;
    ARTSet66[ARTTS__MINUS] = true;
    ARTSet66[ARTTS__SLASH] = true;
    ARTSet66[ARTTS__LT] = true;
    ARTSet66[ARTTS_false] = true;
    ARTSet66[ARTTS_true] = true;
    ARTSet66[ARTL_ART_AID] = true;
    ARTSet66[ARTL_ART_ID] = true;
    ARTSet66[ARTL_ART_INTEGER] = true;
    ARTSet66[ARTL_ART_REAL] = true;
    ARTSet66[ARTL_ART_STRING_DQ] = true;
    ARTSet66[ARTL_ART_deref] = true;
    ARTSet66[ARTL_ART_divide] = true;
    ARTSet66[ARTL_ART_exponentiate] = true;
    ARTSet66[ARTL_ART_minus] = true;
    ARTSet66[ARTL_ART_multiply] = true;
    ARTSet66[ARTL_ART_negate] = true;
    ARTSet66[ARTL_ART_not] = true;
    ARTSet66[ARTL_ART_operand] = true;
    ARTSet66[ARTL_ART_plus] = true;
    ARTSet66[ARTL_ART_subExprB] = true;
    ARTSet66[ARTL_ART_subExprC] = true;
    ARTSet66[ARTL_ART_subExprD] = true;
    ARTSet66[ARTL_ART_subExprE] = true;
    ARTSet66[ARTL_ART_subExprF] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTB_ID] = true;
    ARTSet55[ARTTB_INTEGER] = true;
    ARTSet55[ARTTB_REAL] = true;
    ARTSet55[ARTTB_STRING_DQ] = true;
    ARTSet55[ARTTS__SHREIK] = true;
    ARTSet55[ARTTS__LPAR] = true;
    ARTSet55[ARTTS__STAR] = true;
    ARTSet55[ARTTS__STAR_STAR] = true;
    ARTSet55[ARTTS__PLUS] = true;
    ARTSet55[ARTTS__MINUS] = true;
    ARTSet55[ARTTS__SLASH] = true;
    ARTSet55[ARTTS_false] = true;
    ARTSet55[ARTTS_true] = true;
    ARTSet55[ARTL_ART_AID] = true;
    ARTSet55[ARTL_ART_ID] = true;
    ARTSet55[ARTL_ART_INTEGER] = true;
    ARTSet55[ARTL_ART_REAL] = true;
    ARTSet55[ARTL_ART_STRING_DQ] = true;
    ARTSet55[ARTL_ART_deref] = true;
    ARTSet55[ARTL_ART_divide] = true;
    ARTSet55[ARTL_ART_exponentiate] = true;
    ARTSet55[ARTL_ART_minus] = true;
    ARTSet55[ARTL_ART_multiply] = true;
    ARTSet55[ARTL_ART_negate] = true;
    ARTSet55[ARTL_ART_not] = true;
    ARTSet55[ARTL_ART_operand] = true;
    ARTSet55[ARTL_ART_plus] = true;
    ARTSet55[ARTL_ART_subExprB] = true;
    ARTSet55[ARTL_ART_subExprC] = true;
    ARTSet55[ARTL_ART_subExprD] = true;
    ARTSet55[ARTL_ART_subExprE] = true;
    ARTSet55[ARTL_ART_subExprF] = true;
  }

  public void ARTSet60initialise() {
    ARTSet60 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet60, 0, artSetExtent, false);
    ARTSet60[ARTTB_ID] = true;
    ARTSet60[ARTTB_INTEGER] = true;
    ARTSet60[ARTTB_REAL] = true;
    ARTSet60[ARTTB_STRING_DQ] = true;
    ARTSet60[ARTTS__SHREIK] = true;
    ARTSet60[ARTTS__LPAR] = true;
    ARTSet60[ARTTS__STAR] = true;
    ARTSet60[ARTTS__STAR_STAR] = true;
    ARTSet60[ARTTS__PLUS] = true;
    ARTSet60[ARTTS__MINUS] = true;
    ARTSet60[ARTTS__SLASH] = true;
    ARTSet60[ARTTS__GT] = true;
    ARTSet60[ARTTS_false] = true;
    ARTSet60[ARTTS_true] = true;
    ARTSet60[ARTL_ART_AID] = true;
    ARTSet60[ARTL_ART_ID] = true;
    ARTSet60[ARTL_ART_INTEGER] = true;
    ARTSet60[ARTL_ART_REAL] = true;
    ARTSet60[ARTL_ART_STRING_DQ] = true;
    ARTSet60[ARTL_ART_deref] = true;
    ARTSet60[ARTL_ART_divide] = true;
    ARTSet60[ARTL_ART_exponentiate] = true;
    ARTSet60[ARTL_ART_minus] = true;
    ARTSet60[ARTL_ART_multiply] = true;
    ARTSet60[ARTL_ART_negate] = true;
    ARTSet60[ARTL_ART_not] = true;
    ARTSet60[ARTL_ART_operand] = true;
    ARTSet60[ARTL_ART_plus] = true;
    ARTSet60[ARTL_ART_subExprB] = true;
    ARTSet60[ARTL_ART_subExprC] = true;
    ARTSet60[ARTL_ART_subExprD] = true;
    ARTSet60[ARTL_ART_subExprE] = true;
    ARTSet60[ARTL_ART_subExprF] = true;
  }

  public void ARTSet120initialise() {
    ARTSet120 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet120, 0, artSetExtent, false);
    ARTSet120[ARTTS_sysline] = true;
  }

  public void ARTSet119initialise() {
    ARTSet119 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet119, 0, artSetExtent, false);
    ARTSet119[ARTTB_ID] = true;
    ARTSet119[ARTTB_INTEGER] = true;
    ARTSet119[ARTTB_REAL] = true;
    ARTSet119[ARTTB_STRING_DQ] = true;
    ARTSet119[ARTTS__LPAR] = true;
    ARTSet119[ARTTS_false] = true;
    ARTSet119[ARTTS_true] = true;
    ARTSet119[ARTL_ART_AID] = true;
    ARTSet119[ARTL_ART_ID] = true;
    ARTSet119[ARTL_ART_INTEGER] = true;
    ARTSet119[ARTL_ART_REAL] = true;
    ARTSet119[ARTL_ART_STRING_DQ] = true;
    ARTSet119[ARTL_ART_deref] = true;
    ARTSet119[ARTL_ART_operand] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTTS_while] = true;
    ARTSet64[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTX_EOS] = true;
    ARTSet40[ARTTB_ID] = true;
    ARTSet40[ARTTB_INTEGER] = true;
    ARTSet40[ARTTB_REAL] = true;
    ARTSet40[ARTTB_STRING_DQ] = true;
    ARTSet40[ARTTS__SHREIK] = true;
    ARTSet40[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet40[ARTTS__LPAR] = true;
    ARTSet40[ARTTS__STAR] = true;
    ARTSet40[ARTTS__STAR_STAR] = true;
    ARTSet40[ARTTS__PLUS] = true;
    ARTSet40[ARTTS__MINUS] = true;
    ARTSet40[ARTTS__SLASH] = true;
    ARTSet40[ARTTS__LT] = true;
    ARTSet40[ARTTS__EQUAL_EQUAL] = true;
    ARTSet40[ARTTS__GT] = true;
    ARTSet40[ARTTS_elif] = true;
    ARTSet40[ARTTS_else] = true;
    ARTSet40[ARTTS_false] = true;
    ARTSet40[ARTTS_if] = true;
    ARTSet40[ARTTS_struct] = true;
    ARTSet40[ARTTS_sysline] = true;
    ARTSet40[ARTTS_sysout] = true;
    ARTSet40[ARTTS_true] = true;
    ARTSet40[ARTTS_until] = true;
    ARTSet40[ARTTS_while] = true;
    ARTSet40[ARTTS__LBRACE] = true;
    ARTSet40[ARTTS__BAR_BAR] = true;
    ARTSet40[ARTTS__RBRACE] = true;
    ARTSet40[ARTL_ART_AID] = true;
    ARTSet40[ARTL_ART_ID] = true;
    ARTSet40[ARTL_ART_INTEGER] = true;
    ARTSet40[ARTL_ART_REAL] = true;
    ARTSet40[ARTL_ART_STRING_DQ] = true;
    ARTSet40[ARTL_ART_and] = true;
    ARTSet40[ARTL_ART_assign] = true;
    ARTSet40[ARTL_ART_compStatements] = true;
    ARTSet40[ARTL_ART_condStatement] = true;
    ARTSet40[ARTL_ART_defStruct] = true;
    ARTSet40[ARTL_ART_deref] = true;
    ARTSet40[ARTL_ART_divide] = true;
    ARTSet40[ARTL_ART_elifExpr] = true;
    ARTSet40[ARTL_ART_equ] = true;
    ARTSet40[ARTL_ART_exponentiate] = true;
    ARTSet40[ARTL_ART_gtr] = true;
    ARTSet40[ARTL_ART_ifExpr] = true;
    ARTSet40[ARTL_ART_loopStatement] = true;
    ARTSet40[ARTL_ART_lss] = true;
    ARTSet40[ARTL_ART_mainExpr] = true;
    ARTSet40[ARTL_ART_minus] = true;
    ARTSet40[ARTL_ART_minusEquals] = true;
    ARTSet40[ARTL_ART_multiply] = true;
    ARTSet40[ARTL_ART_negate] = true;
    ARTSet40[ARTL_ART_not] = true;
    ARTSet40[ARTL_ART_operand] = true;
    ARTSet40[ARTL_ART_or] = true;
    ARTSet40[ARTL_ART_plus] = true;
    ARTSet40[ARTL_ART_plusEquals] = true;
    ARTSet40[ARTL_ART_scopeEnter] = true;
    ARTSet40[ARTL_ART_scopeLeave] = true;
    ARTSet40[ARTL_ART_statement] = true;
    ARTSet40[ARTL_ART_statements] = true;
    ARTSet40[ARTL_ART_structAssign] = true;
    ARTSet40[ARTL_ART_subExprA] = true;
    ARTSet40[ARTL_ART_subExprB] = true;
    ARTSet40[ARTL_ART_subExprC] = true;
    ARTSet40[ARTL_ART_subExprD] = true;
    ARTSet40[ARTL_ART_subExprE] = true;
    ARTSet40[ARTL_ART_subExprF] = true;
    ARTSet40[ARTL_ART_sysline] = true;
    ARTSet40[ARTL_ART_sysout] = true;
    ARTSet40[ARTL_ART_untilExpr] = true;
    ARTSet40[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_INTEGER] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTB_ID] = true;
    ARTSet77[ARTTB_INTEGER] = true;
    ARTSet77[ARTTB_REAL] = true;
    ARTSet77[ARTTB_STRING_DQ] = true;
    ARTSet77[ARTTS__LPAR] = true;
    ARTSet77[ARTTS_false] = true;
    ARTSet77[ARTTS_true] = true;
    ARTSet77[ARTL_ART_AID] = true;
    ARTSet77[ARTL_ART_ID] = true;
    ARTSet77[ARTL_ART_INTEGER] = true;
    ARTSet77[ARTL_ART_REAL] = true;
    ARTSet77[ARTL_ART_STRING_DQ] = true;
    ARTSet77[ARTL_ART_deref] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTB_ID] = true;
    ARTSet22[ARTL_ART_AID] = true;
    ARTSet22[ARTL_ART_ID] = true;
    ARTSet22[ARTL_ART_minusEquals] = true;
    ARTSet22[ARTL_ART_plusEquals] = true;
    ARTSet22[ARTL_ART_structAssign] = true;
  }

  public void ARTSet117initialise() {
    ARTSet117 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet117, 0, artSetExtent, false);
    ARTSet117[ARTTS__SHREIK] = true;
    ARTSet117[ARTL_ART_not] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_ID] = true;
    ARTSet34[ARTTB_INTEGER] = true;
    ARTSet34[ARTTB_REAL] = true;
    ARTSet34[ARTTB_STRING_DQ] = true;
    ARTSet34[ARTTS__SHREIK] = true;
    ARTSet34[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet34[ARTTS__LPAR] = true;
    ARTSet34[ARTTS__STAR] = true;
    ARTSet34[ARTTS__STAR_STAR] = true;
    ARTSet34[ARTTS__PLUS] = true;
    ARTSet34[ARTTS__MINUS] = true;
    ARTSet34[ARTTS__SLASH] = true;
    ARTSet34[ARTTS__LT] = true;
    ARTSet34[ARTTS__EQUAL_EQUAL] = true;
    ARTSet34[ARTTS__GT] = true;
    ARTSet34[ARTTS_elif] = true;
    ARTSet34[ARTTS_false] = true;
    ARTSet34[ARTTS_if] = true;
    ARTSet34[ARTTS_struct] = true;
    ARTSet34[ARTTS_sysline] = true;
    ARTSet34[ARTTS_sysout] = true;
    ARTSet34[ARTTS_true] = true;
    ARTSet34[ARTTS_until] = true;
    ARTSet34[ARTTS_while] = true;
    ARTSet34[ARTTS__BAR_BAR] = true;
    ARTSet34[ARTTS__RBRACE] = true;
    ARTSet34[ARTL_ART_AID] = true;
    ARTSet34[ARTL_ART_ID] = true;
    ARTSet34[ARTL_ART_INTEGER] = true;
    ARTSet34[ARTL_ART_REAL] = true;
    ARTSet34[ARTL_ART_STRING_DQ] = true;
    ARTSet34[ARTL_ART_and] = true;
    ARTSet34[ARTL_ART_assign] = true;
    ARTSet34[ARTL_ART_condStatement] = true;
    ARTSet34[ARTL_ART_defStruct] = true;
    ARTSet34[ARTL_ART_deref] = true;
    ARTSet34[ARTL_ART_divide] = true;
    ARTSet34[ARTL_ART_elifExpr] = true;
    ARTSet34[ARTL_ART_equ] = true;
    ARTSet34[ARTL_ART_exponentiate] = true;
    ARTSet34[ARTL_ART_gtr] = true;
    ARTSet34[ARTL_ART_ifExpr] = true;
    ARTSet34[ARTL_ART_loopStatement] = true;
    ARTSet34[ARTL_ART_lss] = true;
    ARTSet34[ARTL_ART_mainExpr] = true;
    ARTSet34[ARTL_ART_minus] = true;
    ARTSet34[ARTL_ART_minusEquals] = true;
    ARTSet34[ARTL_ART_multiply] = true;
    ARTSet34[ARTL_ART_negate] = true;
    ARTSet34[ARTL_ART_not] = true;
    ARTSet34[ARTL_ART_operand] = true;
    ARTSet34[ARTL_ART_or] = true;
    ARTSet34[ARTL_ART_plus] = true;
    ARTSet34[ARTL_ART_plusEquals] = true;
    ARTSet34[ARTL_ART_scopeLeave] = true;
    ARTSet34[ARTL_ART_statement] = true;
    ARTSet34[ARTL_ART_statements] = true;
    ARTSet34[ARTL_ART_structAssign] = true;
    ARTSet34[ARTL_ART_subExprA] = true;
    ARTSet34[ARTL_ART_subExprB] = true;
    ARTSet34[ARTL_ART_subExprC] = true;
    ARTSet34[ARTL_ART_subExprD] = true;
    ARTSet34[ARTL_ART_subExprE] = true;
    ARTSet34[ARTL_ART_subExprF] = true;
    ARTSet34[ARTL_ART_sysline] = true;
    ARTSet34[ARTL_ART_sysout] = true;
    ARTSet34[ARTL_ART_untilExpr] = true;
    ARTSet34[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet105initialise() {
    ARTSet105 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet105, 0, artSetExtent, false);
    ARTSet105[ARTTS__LT_MINUS] = true;
  }

  public void ARTSet89initialise() {
    ARTSet89 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet89, 0, artSetExtent, false);
    ARTSet89[ARTTS__PLUS_EQUAL] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_ID] = true;
    ARTSet35[ARTTB_INTEGER] = true;
    ARTSet35[ARTTB_REAL] = true;
    ARTSet35[ARTTB_STRING_DQ] = true;
    ARTSet35[ARTTS__SHREIK] = true;
    ARTSet35[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet35[ARTTS__LPAR] = true;
    ARTSet35[ARTTS__STAR] = true;
    ARTSet35[ARTTS__STAR_STAR] = true;
    ARTSet35[ARTTS__PLUS] = true;
    ARTSet35[ARTTS__MINUS] = true;
    ARTSet35[ARTTS__SLASH] = true;
    ARTSet35[ARTTS__LT] = true;
    ARTSet35[ARTTS__EQUAL_EQUAL] = true;
    ARTSet35[ARTTS__GT] = true;
    ARTSet35[ARTTS_elif] = true;
    ARTSet35[ARTTS_false] = true;
    ARTSet35[ARTTS_if] = true;
    ARTSet35[ARTTS_struct] = true;
    ARTSet35[ARTTS_sysline] = true;
    ARTSet35[ARTTS_sysout] = true;
    ARTSet35[ARTTS_true] = true;
    ARTSet35[ARTTS_until] = true;
    ARTSet35[ARTTS_while] = true;
    ARTSet35[ARTTS__BAR_BAR] = true;
    ARTSet35[ARTL_ART_AID] = true;
    ARTSet35[ARTL_ART_ID] = true;
    ARTSet35[ARTL_ART_INTEGER] = true;
    ARTSet35[ARTL_ART_REAL] = true;
    ARTSet35[ARTL_ART_STRING_DQ] = true;
    ARTSet35[ARTL_ART_and] = true;
    ARTSet35[ARTL_ART_assign] = true;
    ARTSet35[ARTL_ART_condStatement] = true;
    ARTSet35[ARTL_ART_defStruct] = true;
    ARTSet35[ARTL_ART_deref] = true;
    ARTSet35[ARTL_ART_divide] = true;
    ARTSet35[ARTL_ART_elifExpr] = true;
    ARTSet35[ARTL_ART_equ] = true;
    ARTSet35[ARTL_ART_exponentiate] = true;
    ARTSet35[ARTL_ART_gtr] = true;
    ARTSet35[ARTL_ART_ifExpr] = true;
    ARTSet35[ARTL_ART_loopStatement] = true;
    ARTSet35[ARTL_ART_lss] = true;
    ARTSet35[ARTL_ART_mainExpr] = true;
    ARTSet35[ARTL_ART_minus] = true;
    ARTSet35[ARTL_ART_minusEquals] = true;
    ARTSet35[ARTL_ART_multiply] = true;
    ARTSet35[ARTL_ART_negate] = true;
    ARTSet35[ARTL_ART_not] = true;
    ARTSet35[ARTL_ART_operand] = true;
    ARTSet35[ARTL_ART_or] = true;
    ARTSet35[ARTL_ART_plus] = true;
    ARTSet35[ARTL_ART_plusEquals] = true;
    ARTSet35[ARTL_ART_statement] = true;
    ARTSet35[ARTL_ART_statements] = true;
    ARTSet35[ARTL_ART_structAssign] = true;
    ARTSet35[ARTL_ART_subExprA] = true;
    ARTSet35[ARTL_ART_subExprB] = true;
    ARTSet35[ARTL_ART_subExprC] = true;
    ARTSet35[ARTL_ART_subExprD] = true;
    ARTSet35[ARTL_ART_subExprE] = true;
    ARTSet35[ARTL_ART_subExprF] = true;
    ARTSet35[ARTL_ART_sysline] = true;
    ARTSet35[ARTL_ART_sysout] = true;
    ARTSet35[ARTL_ART_untilExpr] = true;
    ARTSet35[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet90initialise() {
    ARTSet90 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet90, 0, artSetExtent, false);
    ARTSet90[ARTTS__LBRACE] = true;
  }

  public void ARTSet91initialise() {
    ARTSet91 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet91, 0, artSetExtent, false);
    ARTSet91[ARTTS__RBRACE] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTB_REAL] = true;
  }

  public void ARTSet94initialise() {
    ARTSet94 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet94, 0, artSetExtent, false);
    ARTSet94[ARTTS_until] = true;
    ARTSet94[ARTTS_while] = true;
    ARTSet94[ARTL_ART_loopStatement] = true;
    ARTSet94[ARTL_ART_untilExpr] = true;
    ARTSet94[ARTL_ART_whileExpr] = true;
  }

  public void ARTSet87initialise() {
    ARTSet87 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet87, 0, artSetExtent, false);
    ARTSet87[ARTTS__BAR_BAR] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet9initialise();
    ARTSet42initialise();
    ARTSet99initialise();
    ARTSet103initialise();
    ARTSet74initialise();
    ARTSet49initialise();
    ARTSet53initialise();
    ARTSet33initialise();
    ARTSet123initialise();
    ARTSet65initialise();
    ARTSet7initialise();
    ARTSet56initialise();
    ARTSet100initialise();
    ARTSet32initialise();
    ARTSet102initialise();
    ARTSet73initialise();
    ARTSet63initialise();
    ARTSet28initialise();
    ARTSet38initialise();
    ARTSet70initialise();
    ARTSet104initialise();
    ARTSet3initialise();
    ARTSet47initialise();
    ARTSet85initialise();
    ARTSet109initialise();
    ARTSet14initialise();
    ARTSet81initialise();
    ARTSet29initialise();
    ARTSet112initialise();
    ARTSet2initialise();
    ARTSet78initialise();
    ARTSet83initialise();
    ARTSet16initialise();
    ARTSet39initialise();
    ARTSet93initialise();
    ARTSet82initialise();
    ARTSet18initialise();
    ARTSet6initialise();
    ARTSet15initialise();
    ARTSet106initialise();
    ARTSet115initialise();
    ARTSet113initialise();
    ARTSet11initialise();
    ARTSet80initialise();
    ARTSet54initialise();
    ARTSet20initialise();
    ARTSet13initialise();
    ARTSet24initialise();
    ARTSet31initialise();
    ARTSet98initialise();
    ARTSet26initialise();
    ARTSet69initialise();
    ARTSet23initialise();
    ARTSet108initialise();
    ARTSet110initialise();
    ARTSet122initialise();
    ARTSet43initialise();
    ARTSet46initialise();
    ARTSet79initialise();
    ARTSet71initialise();
    ARTSet44initialise();
    ARTSet107initialise();
    ARTSet97initialise();
    ARTSet68initialise();
    ARTSet92initialise();
    ARTSet116initialise();
    ARTSet62initialise();
    ARTSet45initialise();
    ARTSet76initialise();
    ARTSet30initialise();
    ARTSet37initialise();
    ARTSet58initialise();
    ARTSet114initialise();
    ARTSet84initialise();
    ARTSet86initialise();
    ARTSet57initialise();
    ARTSet75initialise();
    ARTSet88initialise();
    ARTSet101initialise();
    ARTSet36initialise();
    ARTSet72initialise();
    ARTSet5initialise();
    ARTSet50initialise();
    ARTSet19initialise();
    ARTSet12initialise();
    ARTSet52initialise();
    ARTSet95initialise();
    ARTSet118initialise();
    ARTSet21initialise();
    ARTSet27initialise();
    ARTSet67initialise();
    ARTSet111initialise();
    ARTSet25initialise();
    ARTSet4initialise();
    ARTSet61initialise();
    ARTSet41initialise();
    ARTSet59initialise();
    ARTSet48initialise();
    ARTSet121initialise();
    ARTSet51initialise();
    ARTSet96initialise();
    ARTSet17initialise();
    ARTSet66initialise();
    ARTSet55initialise();
    ARTSet60initialise();
    ARTSet120initialise();
    ARTSet119initialise();
    ARTSet64initialise();
    ARTSet40initialise();
    ARTSet8initialise();
    ARTSet77initialise();
    ARTSet22initialise();
    ARTSet117initialise();
    ARTSet34initialise();
    ARTSet105initialise();
    ARTSet89initialise();
    ARTSet35initialise();
    ARTSet90initialise();
    ARTSet91initialise();
    ARTSet10initialise();
    ARTSet94initialise();
    ARTSet87initialise();
  }

  public void artTableInitialiser_ART_AID() {
    artLabelInternalStrings[ARTL_ART_AID] = "AID";
    artLabelStrings[ARTL_ART_AID] = "AID";
    artKindOfs[ARTL_ART_AID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_AID_652] = "AID ::= . ID ";
    artLabelStrings[ARTL_ART_AID_652] = "";
    artlhsL[ARTL_ART_AID_652] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_AID_652] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AID_654] = "AID ::= ID .";
    artLabelStrings[ARTL_ART_AID_654] = "";
    artlhsL[ARTL_ART_AID_654] = ARTL_ART_AID;
    artSlotInstanceOfs[ARTL_ART_AID_654] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AID_654] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AID_654] = true;
    arteoR_pL[ARTL_ART_AID_654] = true;
    artPopD[ARTL_ART_AID_654] = true;
    artLabelInternalStrings[ARTL_ART_AID_658] = "AID ::= . ID '.'  ID ";
    artLabelStrings[ARTL_ART_AID_658] = "";
    artlhsL[ARTL_ART_AID_658] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_AID_658] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AID_660] = "AID ::= ID . '.'  ID ";
    artLabelStrings[ARTL_ART_AID_660] = "";
    artlhsL[ARTL_ART_AID_660] = ARTL_ART_AID;
    artSlotInstanceOfs[ARTL_ART_AID_660] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AID_660] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_AID_660] = true;
    artLabelInternalStrings[ARTL_ART_AID_661] = "AID ::= ID '.'  ID ";
    artLabelStrings[ARTL_ART_AID_661] = "";
    artlhsL[ARTL_ART_AID_661] = ARTL_ART_AID;
    artLabelInternalStrings[ARTL_ART_AID_662] = "AID ::= ID '.'  . ID ";
    artLabelStrings[ARTL_ART_AID_662] = "";
    artlhsL[ARTL_ART_AID_662] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_AID_662] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AID_664] = "AID ::= ID '.'  ID .";
    artLabelStrings[ARTL_ART_AID_664] = "";
    artlhsL[ARTL_ART_AID_664] = ARTL_ART_AID;
    artSlotInstanceOfs[ARTL_ART_AID_664] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AID_664] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AID_664] = true;
    arteoR_pL[ARTL_ART_AID_664] = true;
    artPopD[ARTL_ART_AID_664] = true;
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_668] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_668] = "";
    artlhsL[ARTL_ART_ID_668] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_668] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_668] = true;
    artLabelInternalStrings[ARTL_ART_ID_669] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_669] = "";
    artlhsL[ARTL_ART_ID_669] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_669] = true;
    artLabelInternalStrings[ARTL_ART_ID_670] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_670] = "";
    artlhsL[ARTL_ART_ID_670] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_670] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_670] = true;
    arteoR_pL[ARTL_ART_ID_670] = true;
    artPopD[ARTL_ART_ID_670] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_674] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_674] = "";
    artlhsL[ARTL_ART_INTEGER_674] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_674] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_674] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_675] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_675] = "";
    artlhsL[ARTL_ART_INTEGER_675] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_675] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_676] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_676] = "";
    artlhsL[ARTL_ART_INTEGER_676] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_676] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_676] = true;
    arteoR_pL[ARTL_ART_INTEGER_676] = true;
    artPopD[ARTL_ART_INTEGER_676] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_680] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_680] = "";
    artlhsL[ARTL_ART_REAL_680] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_680] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_680] = true;
    artLabelInternalStrings[ARTL_ART_REAL_681] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_681] = "";
    artlhsL[ARTL_ART_REAL_681] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_681] = true;
    artLabelInternalStrings[ARTL_ART_REAL_682] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_682] = "";
    artlhsL[ARTL_ART_REAL_682] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_682] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_682] = true;
    arteoR_pL[ARTL_ART_REAL_682] = true;
    artPopD[ARTL_ART_REAL_682] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_686] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_686] = "";
    artlhsL[ARTL_ART_STRING_DQ_686] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_686] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_686] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_687] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_687] = "";
    artlhsL[ARTL_ART_STRING_DQ_687] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_687] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_688] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_688] = "";
    artlhsL[ARTL_ART_STRING_DQ_688] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_688] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_688] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_688] = true;
    artPopD[ARTL_ART_STRING_DQ_688] = true;
  }

  public void artTableInitialiser_ART_and() {
    artLabelInternalStrings[ARTL_ART_and] = "and";
    artLabelStrings[ARTL_ART_and] = "and";
    artKindOfs[ARTL_ART_and] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_and_576] = "and ::= . subExprA '&&'  subExprA ";
    artLabelStrings[ARTL_ART_and_576] = "";
    artlhsL[ARTL_ART_and_576] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_576] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_578] = "and ::= subExprA . '&&'  subExprA ";
    artLabelStrings[ARTL_ART_and_578] = "";
    artlhsL[ARTL_ART_and_578] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_578] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_and_578] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_and_578] = true;
    artLabelInternalStrings[ARTL_ART_and_579] = "and ::= subExprA '&&'  subExprA ";
    artLabelStrings[ARTL_ART_and_579] = "";
    artlhsL[ARTL_ART_and_579] = ARTL_ART_and;
    artLabelInternalStrings[ARTL_ART_and_580] = "and ::= subExprA '&&'  . subExprA ";
    artLabelStrings[ARTL_ART_and_580] = "";
    artlhsL[ARTL_ART_and_580] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_580] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_582] = "and ::= subExprA '&&'  subExprA .";
    artLabelStrings[ARTL_ART_and_582] = "";
    artlhsL[ARTL_ART_and_582] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_582] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_and_582] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_and_582] = true;
    arteoR_pL[ARTL_ART_and_582] = true;
    artPopD[ARTL_ART_and_582] = true;
  }

  public void artTableInitialiser_ART_arg() {
    artLabelInternalStrings[ARTL_ART_arg] = "arg";
    artLabelStrings[ARTL_ART_arg] = "arg";
    artKindOfs[ARTL_ART_arg] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_arg_462] = "arg ::= . # ";
    artLabelStrings[ARTL_ART_arg_462] = "";
    artlhsL[ARTL_ART_arg_462] = ARTL_ART_arg;
    artKindOfs[ARTL_ART_arg_462] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_arg_462] = true;
    artLabelInternalStrings[ARTL_ART_arg_464] = "arg ::= # .";
    artLabelStrings[ARTL_ART_arg_464] = "";
    artlhsL[ARTL_ART_arg_464] = ARTL_ART_arg;
    artKindOfs[ARTL_ART_arg_464] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_arg_464] = true;
    arteoR_pL[ARTL_ART_arg_464] = true;
    artPopD[ARTL_ART_arg_464] = true;
    artLabelInternalStrings[ARTL_ART_arg_468] = "arg ::= . subExprA argNote ";
    artLabelStrings[ARTL_ART_arg_468] = "";
    artlhsL[ARTL_ART_arg_468] = ARTL_ART_arg;
    artKindOfs[ARTL_ART_arg_468] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_arg_470] = "arg ::= subExprA . argNote ";
    artLabelStrings[ARTL_ART_arg_470] = "";
    artlhsL[ARTL_ART_arg_470] = ARTL_ART_arg;
    artSlotInstanceOfs[ARTL_ART_arg_470] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_arg_470] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_arg_470] = true;
    artLabelInternalStrings[ARTL_ART_arg_472] = "arg ::= subExprA argNote .";
    artLabelStrings[ARTL_ART_arg_472] = "";
    artlhsL[ARTL_ART_arg_472] = ARTL_ART_arg;
    artSlotInstanceOfs[ARTL_ART_arg_472] = ARTL_ART_argNote;
    artKindOfs[ARTL_ART_arg_472] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_arg_472] = true;
    arteoR_pL[ARTL_ART_arg_472] = true;
    artPopD[ARTL_ART_arg_472] = true;
  }

  public void artTableInitialiser_ART_argNote() {
    artLabelInternalStrings[ARTL_ART_argNote] = "argNote";
    artLabelStrings[ARTL_ART_argNote] = "argNote";
    artKindOfs[ARTL_ART_argNote] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_argNote_476] = "argNote ::= . ':'  ID ";
    artLabelStrings[ARTL_ART_argNote_476] = "";
    artlhsL[ARTL_ART_argNote_476] = ARTL_ART_argNote;
    artKindOfs[ARTL_ART_argNote_476] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_argNote_477] = "argNote ::= ':'  ID ";
    artLabelStrings[ARTL_ART_argNote_477] = "";
    artlhsL[ARTL_ART_argNote_477] = ARTL_ART_argNote;
    artLabelInternalStrings[ARTL_ART_argNote_478] = "argNote ::= ':'  . ID ";
    artLabelStrings[ARTL_ART_argNote_478] = "";
    artlhsL[ARTL_ART_argNote_478] = ARTL_ART_argNote;
    artKindOfs[ARTL_ART_argNote_478] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_argNote_478] = true;
    artLabelInternalStrings[ARTL_ART_argNote_480] = "argNote ::= ':'  ID .";
    artLabelStrings[ARTL_ART_argNote_480] = "";
    artlhsL[ARTL_ART_argNote_480] = ARTL_ART_argNote;
    artSlotInstanceOfs[ARTL_ART_argNote_480] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_argNote_480] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_argNote_480] = true;
    arteoR_pL[ARTL_ART_argNote_480] = true;
    artPopD[ARTL_ART_argNote_480] = true;
    artLabelInternalStrings[ARTL_ART_argNote_482] = "argNote ::= . # ";
    artLabelStrings[ARTL_ART_argNote_482] = "";
    artlhsL[ARTL_ART_argNote_482] = ARTL_ART_argNote;
    artKindOfs[ARTL_ART_argNote_482] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_argNote_482] = true;
    artLabelInternalStrings[ARTL_ART_argNote_484] = "argNote ::= # .";
    artLabelStrings[ARTL_ART_argNote_484] = "";
    artlhsL[ARTL_ART_argNote_484] = ARTL_ART_argNote;
    artKindOfs[ARTL_ART_argNote_484] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_argNote_484] = true;
    arteoR_pL[ARTL_ART_argNote_484] = true;
    artPopD[ARTL_ART_argNote_484] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_398] = "assign ::= . AID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_assign_398] = "";
    artlhsL[ARTL_ART_assign_398] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_398] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_400] = "assign ::= AID . '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_assign_400] = "";
    artlhsL[ARTL_ART_assign_400] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_400] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_assign_400] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_400] = true;
    artLabelInternalStrings[ARTL_ART_assign_401] = "assign ::= AID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_assign_401] = "";
    artlhsL[ARTL_ART_assign_401] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_402] = "assign ::= AID '='  . subExprA ';'  ";
    artLabelStrings[ARTL_ART_assign_402] = "";
    artlhsL[ARTL_ART_assign_402] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_402] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_404] = "assign ::= AID '='  subExprA . ';'  ";
    artLabelStrings[ARTL_ART_assign_404] = "";
    artlhsL[ARTL_ART_assign_404] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_404] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_assign_404] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_404] = true;
    artLabelInternalStrings[ARTL_ART_assign_405] = "assign ::= AID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_assign_405] = "";
    artlhsL[ARTL_ART_assign_405] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_405] = true;
    artLabelInternalStrings[ARTL_ART_assign_406] = "assign ::= AID '='  subExprA ';'  .";
    artLabelStrings[ARTL_ART_assign_406] = "";
    artlhsL[ARTL_ART_assign_406] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_406] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_406] = true;
    arteoR_pL[ARTL_ART_assign_406] = true;
    artPopD[ARTL_ART_assign_406] = true;
    artLabelInternalStrings[ARTL_ART_assign_410] = "assign ::= . structAssign ";
    artLabelStrings[ARTL_ART_assign_410] = "";
    artlhsL[ARTL_ART_assign_410] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_410] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_412] = "assign ::= structAssign .";
    artLabelStrings[ARTL_ART_assign_412] = "";
    artlhsL[ARTL_ART_assign_412] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_412] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_assign_412] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_412] = true;
    arteoR_pL[ARTL_ART_assign_412] = true;
    artPopD[ARTL_ART_assign_412] = true;
    artLabelInternalStrings[ARTL_ART_assign_414] = "assign ::= . plusEquals ";
    artLabelStrings[ARTL_ART_assign_414] = "";
    artlhsL[ARTL_ART_assign_414] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_414] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_416] = "assign ::= plusEquals .";
    artLabelStrings[ARTL_ART_assign_416] = "";
    artlhsL[ARTL_ART_assign_416] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_416] = ARTL_ART_plusEquals;
    artKindOfs[ARTL_ART_assign_416] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_416] = true;
    arteoR_pL[ARTL_ART_assign_416] = true;
    artPopD[ARTL_ART_assign_416] = true;
    artLabelInternalStrings[ARTL_ART_assign_418] = "assign ::= . minusEquals ";
    artLabelStrings[ARTL_ART_assign_418] = "";
    artlhsL[ARTL_ART_assign_418] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_418] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_420] = "assign ::= minusEquals .";
    artLabelStrings[ARTL_ART_assign_420] = "";
    artlhsL[ARTL_ART_assign_420] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_420] = ARTL_ART_minusEquals;
    artKindOfs[ARTL_ART_assign_420] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_420] = true;
    arteoR_pL[ARTL_ART_assign_420] = true;
    artPopD[ARTL_ART_assign_420] = true;
  }

  public void artTableInitialiser_ART_compStatements() {
    artLabelInternalStrings[ARTL_ART_compStatements] = "compStatements";
    artLabelStrings[ARTL_ART_compStatements] = "compStatements";
    artKindOfs[ARTL_ART_compStatements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_compStatements_12] = "compStatements ::= . scopeEnter statements scopeLeave ";
    artLabelStrings[ARTL_ART_compStatements_12] = "";
    artlhsL[ARTL_ART_compStatements_12] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_compStatements_12] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_compStatements_14] = "compStatements ::= scopeEnter . statements scopeLeave ";
    artLabelStrings[ARTL_ART_compStatements_14] = "";
    artlhsL[ARTL_ART_compStatements_14] = ARTL_ART_compStatements;
    artSlotInstanceOfs[ARTL_ART_compStatements_14] = ARTL_ART_scopeEnter;
    artKindOfs[ARTL_ART_compStatements_14] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_compStatements_14] = true;
    artLabelInternalStrings[ARTL_ART_compStatements_16] = "compStatements ::= scopeEnter statements . scopeLeave ";
    artLabelStrings[ARTL_ART_compStatements_16] = "";
    artlhsL[ARTL_ART_compStatements_16] = ARTL_ART_compStatements;
    artSlotInstanceOfs[ARTL_ART_compStatements_16] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_compStatements_16] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_compStatements_18] = "compStatements ::= scopeEnter statements scopeLeave .";
    artLabelStrings[ARTL_ART_compStatements_18] = "";
    artlhsL[ARTL_ART_compStatements_18] = ARTL_ART_compStatements;
    artSlotInstanceOfs[ARTL_ART_compStatements_18] = ARTL_ART_scopeLeave;
    artKindOfs[ARTL_ART_compStatements_18] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_compStatements_18] = true;
    arteoR_pL[ARTL_ART_compStatements_18] = true;
    artPopD[ARTL_ART_compStatements_18] = true;
    artLabelInternalStrings[ARTL_ART_compStatements_20] = "compStatements ::= . statement ";
    artLabelStrings[ARTL_ART_compStatements_20] = "";
    artlhsL[ARTL_ART_compStatements_20] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_compStatements_20] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_compStatements_24] = "compStatements ::= statement .";
    artLabelStrings[ARTL_ART_compStatements_24] = "";
    artlhsL[ARTL_ART_compStatements_24] = ARTL_ART_compStatements;
    artSlotInstanceOfs[ARTL_ART_compStatements_24] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_compStatements_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_compStatements_24] = true;
    arteoR_pL[ARTL_ART_compStatements_24] = true;
    artPopD[ARTL_ART_compStatements_24] = true;
  }

  public void artTableInitialiser_ART_condStatement() {
    artLabelInternalStrings[ARTL_ART_condStatement] = "condStatement";
    artLabelStrings[ARTL_ART_condStatement] = "condStatement";
    artKindOfs[ARTL_ART_condStatement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_condStatement_122] = "condStatement ::= . ifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_122] = "";
    artlhsL[ARTL_ART_condStatement_122] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_124] = "condStatement ::= ifExpr . compStatements ";
    artLabelStrings[ARTL_ART_condStatement_124] = "";
    artlhsL[ARTL_ART_condStatement_124] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_124] = ARTL_ART_ifExpr;
    artKindOfs[ARTL_ART_condStatement_124] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condStatement_124] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_126] = "condStatement ::= ifExpr compStatements .";
    artLabelStrings[ARTL_ART_condStatement_126] = "";
    artlhsL[ARTL_ART_condStatement_126] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_126] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_126] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condStatement_126] = true;
    arteoR_pL[ARTL_ART_condStatement_126] = true;
    artPopD[ARTL_ART_condStatement_126] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_130] = "condStatement ::= . ifExpr compStatements elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_130] = "";
    artlhsL[ARTL_ART_condStatement_130] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_130] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_132] = "condStatement ::= ifExpr . compStatements elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_132] = "";
    artlhsL[ARTL_ART_condStatement_132] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_132] = ARTL_ART_ifExpr;
    artKindOfs[ARTL_ART_condStatement_132] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condStatement_132] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_134] = "condStatement ::= ifExpr compStatements . elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_134] = "";
    artlhsL[ARTL_ART_condStatement_134] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_134] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_134] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_136] = "condStatement ::= ifExpr compStatements elifExpr . compStatements ";
    artLabelStrings[ARTL_ART_condStatement_136] = "";
    artlhsL[ARTL_ART_condStatement_136] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_136] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_condStatement_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_138] = "condStatement ::= ifExpr compStatements elifExpr compStatements .";
    artLabelStrings[ARTL_ART_condStatement_138] = "";
    artlhsL[ARTL_ART_condStatement_138] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_138] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_138] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condStatement_138] = true;
    arteoR_pL[ARTL_ART_condStatement_138] = true;
    artPopD[ARTL_ART_condStatement_138] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_142] = "condStatement ::= . elifExpr compStatements elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_142] = "";
    artlhsL[ARTL_ART_condStatement_142] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_142] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_144] = "condStatement ::= elifExpr . compStatements elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_144] = "";
    artlhsL[ARTL_ART_condStatement_144] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_144] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_condStatement_144] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condStatement_144] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_146] = "condStatement ::= elifExpr compStatements . elifExpr compStatements ";
    artLabelStrings[ARTL_ART_condStatement_146] = "";
    artlhsL[ARTL_ART_condStatement_146] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_146] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_146] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_148] = "condStatement ::= elifExpr compStatements elifExpr . compStatements ";
    artLabelStrings[ARTL_ART_condStatement_148] = "";
    artlhsL[ARTL_ART_condStatement_148] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_148] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_condStatement_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_150] = "condStatement ::= elifExpr compStatements elifExpr compStatements .";
    artLabelStrings[ARTL_ART_condStatement_150] = "";
    artlhsL[ARTL_ART_condStatement_150] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_150] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condStatement_150] = true;
    arteoR_pL[ARTL_ART_condStatement_150] = true;
    artPopD[ARTL_ART_condStatement_150] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_154] = "condStatement ::= . ifExpr compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_154] = "";
    artlhsL[ARTL_ART_condStatement_154] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_154] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_156] = "condStatement ::= ifExpr . compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_156] = "";
    artlhsL[ARTL_ART_condStatement_156] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_156] = ARTL_ART_ifExpr;
    artKindOfs[ARTL_ART_condStatement_156] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condStatement_156] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_158] = "condStatement ::= ifExpr compStatements . 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_158] = "";
    artlhsL[ARTL_ART_condStatement_158] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_158] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_158] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_159] = "condStatement ::= ifExpr compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_159] = "";
    artlhsL[ARTL_ART_condStatement_159] = ARTL_ART_condStatement;
    artLabelInternalStrings[ARTL_ART_condStatement_160] = "condStatement ::= ifExpr compStatements 'else'  . compStatements ";
    artLabelStrings[ARTL_ART_condStatement_160] = "";
    artlhsL[ARTL_ART_condStatement_160] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_160] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_162] = "condStatement ::= ifExpr compStatements 'else'  compStatements .";
    artLabelStrings[ARTL_ART_condStatement_162] = "";
    artlhsL[ARTL_ART_condStatement_162] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_162] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_162] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condStatement_162] = true;
    arteoR_pL[ARTL_ART_condStatement_162] = true;
    artPopD[ARTL_ART_condStatement_162] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_166] = "condStatement ::= . elifExpr compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_166] = "";
    artlhsL[ARTL_ART_condStatement_166] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_168] = "condStatement ::= elifExpr . compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_168] = "";
    artlhsL[ARTL_ART_condStatement_168] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_168] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_condStatement_168] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condStatement_168] = true;
    artLabelInternalStrings[ARTL_ART_condStatement_170] = "condStatement ::= elifExpr compStatements . 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_170] = "";
    artlhsL[ARTL_ART_condStatement_170] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_170] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_170] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_171] = "condStatement ::= elifExpr compStatements 'else'  compStatements ";
    artLabelStrings[ARTL_ART_condStatement_171] = "";
    artlhsL[ARTL_ART_condStatement_171] = ARTL_ART_condStatement;
    artLabelInternalStrings[ARTL_ART_condStatement_172] = "condStatement ::= elifExpr compStatements 'else'  . compStatements ";
    artLabelStrings[ARTL_ART_condStatement_172] = "";
    artlhsL[ARTL_ART_condStatement_172] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_condStatement_172] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condStatement_174] = "condStatement ::= elifExpr compStatements 'else'  compStatements .";
    artLabelStrings[ARTL_ART_condStatement_174] = "";
    artlhsL[ARTL_ART_condStatement_174] = ARTL_ART_condStatement;
    artSlotInstanceOfs[ARTL_ART_condStatement_174] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_condStatement_174] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condStatement_174] = true;
    arteoR_pL[ARTL_ART_condStatement_174] = true;
    artPopD[ARTL_ART_condStatement_174] = true;
  }

  public void artTableInitialiser_ART_defStruct() {
    artLabelInternalStrings[ARTL_ART_defStruct] = "defStruct";
    artLabelStrings[ARTL_ART_defStruct] = "defStruct";
    artKindOfs[ARTL_ART_defStruct] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_defStruct_94] = "defStruct ::= . 'struct'  ID structDefinition ";
    artLabelStrings[ARTL_ART_defStruct_94] = "";
    artlhsL[ARTL_ART_defStruct_94] = ARTL_ART_defStruct;
    artKindOfs[ARTL_ART_defStruct_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_defStruct_95] = "defStruct ::= 'struct'  ID structDefinition ";
    artLabelStrings[ARTL_ART_defStruct_95] = "";
    artlhsL[ARTL_ART_defStruct_95] = ARTL_ART_defStruct;
    artLabelInternalStrings[ARTL_ART_defStruct_96] = "defStruct ::= 'struct'  . ID structDefinition ";
    artLabelStrings[ARTL_ART_defStruct_96] = "";
    artlhsL[ARTL_ART_defStruct_96] = ARTL_ART_defStruct;
    artKindOfs[ARTL_ART_defStruct_96] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_defStruct_96] = true;
    artLabelInternalStrings[ARTL_ART_defStruct_98] = "defStruct ::= 'struct'  ID . structDefinition ";
    artLabelStrings[ARTL_ART_defStruct_98] = "";
    artlhsL[ARTL_ART_defStruct_98] = ARTL_ART_defStruct;
    artSlotInstanceOfs[ARTL_ART_defStruct_98] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_defStruct_98] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_defStruct_102] = "defStruct ::= 'struct'  ID structDefinition .";
    artLabelStrings[ARTL_ART_defStruct_102] = "";
    artlhsL[ARTL_ART_defStruct_102] = ARTL_ART_defStruct;
    artSlotInstanceOfs[ARTL_ART_defStruct_102] = ARTL_ART_structDefinition;
    artKindOfs[ARTL_ART_defStruct_102] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_defStruct_102] = true;
    arteoR_pL[ARTL_ART_defStruct_102] = true;
    artPopD[ARTL_ART_defStruct_102] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_646] = "deref ::= . AID ";
    artLabelStrings[ARTL_ART_deref_646] = "";
    artlhsL[ARTL_ART_deref_646] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_646] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_648] = "deref ::= AID .";
    artLabelStrings[ARTL_ART_deref_648] = "";
    artlhsL[ARTL_ART_deref_648] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_648] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_deref_648] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_648] = true;
    arteoR_pL[ARTL_ART_deref_648] = true;
    artPopD[ARTL_ART_deref_648] = true;
  }

  public void artTableInitialiser_ART_divide() {
    artLabelInternalStrings[ARTL_ART_divide] = "divide";
    artLabelStrings[ARTL_ART_divide] = "divide";
    artKindOfs[ARTL_ART_divide] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_divide_540] = "divide ::= . subExprC '/'  subExprD ";
    artLabelStrings[ARTL_ART_divide_540] = "";
    artlhsL[ARTL_ART_divide_540] = ARTL_ART_divide;
    artKindOfs[ARTL_ART_divide_540] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_divide_542] = "divide ::= subExprC . '/'  subExprD ";
    artLabelStrings[ARTL_ART_divide_542] = "";
    artlhsL[ARTL_ART_divide_542] = ARTL_ART_divide;
    artSlotInstanceOfs[ARTL_ART_divide_542] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_divide_542] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_divide_542] = true;
    artLabelInternalStrings[ARTL_ART_divide_543] = "divide ::= subExprC '/'  subExprD ";
    artLabelStrings[ARTL_ART_divide_543] = "";
    artlhsL[ARTL_ART_divide_543] = ARTL_ART_divide;
    artLabelInternalStrings[ARTL_ART_divide_544] = "divide ::= subExprC '/'  . subExprD ";
    artLabelStrings[ARTL_ART_divide_544] = "";
    artlhsL[ARTL_ART_divide_544] = ARTL_ART_divide;
    artKindOfs[ARTL_ART_divide_544] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_divide_546] = "divide ::= subExprC '/'  subExprD .";
    artLabelStrings[ARTL_ART_divide_546] = "";
    artlhsL[ARTL_ART_divide_546] = ARTL_ART_divide;
    artSlotInstanceOfs[ARTL_ART_divide_546] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_divide_546] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_divide_546] = true;
    arteoR_pL[ARTL_ART_divide_546] = true;
    artPopD[ARTL_ART_divide_546] = true;
  }

  public void artTableInitialiser_ART_elifExpr() {
    artLabelInternalStrings[ARTL_ART_elifExpr] = "elifExpr";
    artLabelStrings[ARTL_ART_elifExpr] = "elifExpr";
    artKindOfs[ARTL_ART_elifExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_elifExpr_202] = "elifExpr ::= . 'elif'  mainExpr ";
    artLabelStrings[ARTL_ART_elifExpr_202] = "";
    artlhsL[ARTL_ART_elifExpr_202] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_elifExpr_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_elifExpr_203] = "elifExpr ::= 'elif'  mainExpr ";
    artLabelStrings[ARTL_ART_elifExpr_203] = "";
    artlhsL[ARTL_ART_elifExpr_203] = ARTL_ART_elifExpr;
    artLabelInternalStrings[ARTL_ART_elifExpr_204] = "elifExpr ::= 'elif'  . mainExpr ";
    artLabelStrings[ARTL_ART_elifExpr_204] = "";
    artlhsL[ARTL_ART_elifExpr_204] = ARTL_ART_elifExpr;
    artKindOfs[ARTL_ART_elifExpr_204] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_elifExpr_204] = true;
    artLabelInternalStrings[ARTL_ART_elifExpr_206] = "elifExpr ::= 'elif'  mainExpr .";
    artLabelStrings[ARTL_ART_elifExpr_206] = "";
    artlhsL[ARTL_ART_elifExpr_206] = ARTL_ART_elifExpr;
    artSlotInstanceOfs[ARTL_ART_elifExpr_206] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_elifExpr_206] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_elifExpr_206] = true;
    arteoR_pL[ARTL_ART_elifExpr_206] = true;
    artPopD[ARTL_ART_elifExpr_206] = true;
  }

  public void artTableInitialiser_ART_equ() {
    artLabelInternalStrings[ARTL_ART_equ] = "equ";
    artLabelStrings[ARTL_ART_equ] = "equ";
    artKindOfs[ARTL_ART_equ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_equ_368] = "equ ::= . subExprB '=='  subExprB ";
    artLabelStrings[ARTL_ART_equ_368] = "";
    artlhsL[ARTL_ART_equ_368] = ARTL_ART_equ;
    artKindOfs[ARTL_ART_equ_368] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_equ_370] = "equ ::= subExprB . '=='  subExprB ";
    artLabelStrings[ARTL_ART_equ_370] = "";
    artlhsL[ARTL_ART_equ_370] = ARTL_ART_equ;
    artSlotInstanceOfs[ARTL_ART_equ_370] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_equ_370] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_equ_370] = true;
    artLabelInternalStrings[ARTL_ART_equ_371] = "equ ::= subExprB '=='  subExprB ";
    artLabelStrings[ARTL_ART_equ_371] = "";
    artlhsL[ARTL_ART_equ_371] = ARTL_ART_equ;
    artLabelInternalStrings[ARTL_ART_equ_372] = "equ ::= subExprB '=='  . subExprB ";
    artLabelStrings[ARTL_ART_equ_372] = "";
    artlhsL[ARTL_ART_equ_372] = ARTL_ART_equ;
    artKindOfs[ARTL_ART_equ_372] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_equ_374] = "equ ::= subExprB '=='  subExprB .";
    artLabelStrings[ARTL_ART_equ_374] = "";
    artlhsL[ARTL_ART_equ_374] = ARTL_ART_equ;
    artSlotInstanceOfs[ARTL_ART_equ_374] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_equ_374] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_equ_374] = true;
    arteoR_pL[ARTL_ART_equ_374] = true;
    artPopD[ARTL_ART_equ_374] = true;
  }

  public void artTableInitialiser_ART_exponentiate() {
    artLabelInternalStrings[ARTL_ART_exponentiate] = "exponentiate";
    artLabelStrings[ARTL_ART_exponentiate] = "exponentiate";
    artKindOfs[ARTL_ART_exponentiate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_exponentiate_550] = "exponentiate ::= . subExprE '**'  subExprD ";
    artLabelStrings[ARTL_ART_exponentiate_550] = "";
    artlhsL[ARTL_ART_exponentiate_550] = ARTL_ART_exponentiate;
    artKindOfs[ARTL_ART_exponentiate_550] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exponentiate_552] = "exponentiate ::= subExprE . '**'  subExprD ";
    artLabelStrings[ARTL_ART_exponentiate_552] = "";
    artlhsL[ARTL_ART_exponentiate_552] = ARTL_ART_exponentiate;
    artSlotInstanceOfs[ARTL_ART_exponentiate_552] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_exponentiate_552] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_exponentiate_552] = true;
    artLabelInternalStrings[ARTL_ART_exponentiate_553] = "exponentiate ::= subExprE '**'  subExprD ";
    artLabelStrings[ARTL_ART_exponentiate_553] = "";
    artlhsL[ARTL_ART_exponentiate_553] = ARTL_ART_exponentiate;
    artLabelInternalStrings[ARTL_ART_exponentiate_554] = "exponentiate ::= subExprE '**'  . subExprD ";
    artLabelStrings[ARTL_ART_exponentiate_554] = "";
    artlhsL[ARTL_ART_exponentiate_554] = ARTL_ART_exponentiate;
    artKindOfs[ARTL_ART_exponentiate_554] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exponentiate_556] = "exponentiate ::= subExprE '**'  subExprD .";
    artLabelStrings[ARTL_ART_exponentiate_556] = "";
    artlhsL[ARTL_ART_exponentiate_556] = ARTL_ART_exponentiate;
    artSlotInstanceOfs[ARTL_ART_exponentiate_556] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_exponentiate_556] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_exponentiate_556] = true;
    arteoR_pL[ARTL_ART_exponentiate_556] = true;
    artPopD[ARTL_ART_exponentiate_556] = true;
  }

  public void artTableInitialiser_ART_gtr() {
    artLabelInternalStrings[ARTL_ART_gtr] = "gtr";
    artLabelStrings[ARTL_ART_gtr] = "gtr";
    artKindOfs[ARTL_ART_gtr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gtr_378] = "gtr ::= . subExprB '>'  subExprB ";
    artLabelStrings[ARTL_ART_gtr_378] = "";
    artlhsL[ARTL_ART_gtr_378] = ARTL_ART_gtr;
    artKindOfs[ARTL_ART_gtr_378] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gtr_380] = "gtr ::= subExprB . '>'  subExprB ";
    artLabelStrings[ARTL_ART_gtr_380] = "";
    artlhsL[ARTL_ART_gtr_380] = ARTL_ART_gtr;
    artSlotInstanceOfs[ARTL_ART_gtr_380] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_gtr_380] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gtr_380] = true;
    artLabelInternalStrings[ARTL_ART_gtr_381] = "gtr ::= subExprB '>'  subExprB ";
    artLabelStrings[ARTL_ART_gtr_381] = "";
    artlhsL[ARTL_ART_gtr_381] = ARTL_ART_gtr;
    artLabelInternalStrings[ARTL_ART_gtr_382] = "gtr ::= subExprB '>'  . subExprB ";
    artLabelStrings[ARTL_ART_gtr_382] = "";
    artlhsL[ARTL_ART_gtr_382] = ARTL_ART_gtr;
    artKindOfs[ARTL_ART_gtr_382] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gtr_384] = "gtr ::= subExprB '>'  subExprB .";
    artLabelStrings[ARTL_ART_gtr_384] = "";
    artlhsL[ARTL_ART_gtr_384] = ARTL_ART_gtr;
    artSlotInstanceOfs[ARTL_ART_gtr_384] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_gtr_384] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gtr_384] = true;
    arteoR_pL[ARTL_ART_gtr_384] = true;
    artPopD[ARTL_ART_gtr_384] = true;
  }

  public void artTableInitialiser_ART_ifExpr() {
    artLabelInternalStrings[ARTL_ART_ifExpr] = "ifExpr";
    artLabelStrings[ARTL_ART_ifExpr] = "ifExpr";
    artKindOfs[ARTL_ART_ifExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ifExpr_194] = "ifExpr ::= . 'if'  mainExpr ";
    artLabelStrings[ARTL_ART_ifExpr_194] = "";
    artlhsL[ARTL_ART_ifExpr_194] = ARTL_ART_ifExpr;
    artKindOfs[ARTL_ART_ifExpr_194] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ifExpr_195] = "ifExpr ::= 'if'  mainExpr ";
    artLabelStrings[ARTL_ART_ifExpr_195] = "";
    artlhsL[ARTL_ART_ifExpr_195] = ARTL_ART_ifExpr;
    artLabelInternalStrings[ARTL_ART_ifExpr_196] = "ifExpr ::= 'if'  . mainExpr ";
    artLabelStrings[ARTL_ART_ifExpr_196] = "";
    artlhsL[ARTL_ART_ifExpr_196] = ARTL_ART_ifExpr;
    artKindOfs[ARTL_ART_ifExpr_196] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ifExpr_196] = true;
    artLabelInternalStrings[ARTL_ART_ifExpr_198] = "ifExpr ::= 'if'  mainExpr .";
    artLabelStrings[ARTL_ART_ifExpr_198] = "";
    artlhsL[ARTL_ART_ifExpr_198] = ARTL_ART_ifExpr;
    artSlotInstanceOfs[ARTL_ART_ifExpr_198] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_ifExpr_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ifExpr_198] = true;
    arteoR_pL[ARTL_ART_ifExpr_198] = true;
    artPopD[ARTL_ART_ifExpr_198] = true;
  }

  public void artTableInitialiser_ART_loopStatement() {
    artLabelInternalStrings[ARTL_ART_loopStatement] = "loopStatement";
    artLabelStrings[ARTL_ART_loopStatement] = "loopStatement";
    artKindOfs[ARTL_ART_loopStatement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_loopStatement_106] = "loopStatement ::= . whileExpr compStatements ";
    artLabelStrings[ARTL_ART_loopStatement_106] = "";
    artlhsL[ARTL_ART_loopStatement_106] = ARTL_ART_loopStatement;
    artKindOfs[ARTL_ART_loopStatement_106] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_loopStatement_108] = "loopStatement ::= whileExpr . compStatements ";
    artLabelStrings[ARTL_ART_loopStatement_108] = "";
    artlhsL[ARTL_ART_loopStatement_108] = ARTL_ART_loopStatement;
    artSlotInstanceOfs[ARTL_ART_loopStatement_108] = ARTL_ART_whileExpr;
    artKindOfs[ARTL_ART_loopStatement_108] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_loopStatement_108] = true;
    artLabelInternalStrings[ARTL_ART_loopStatement_110] = "loopStatement ::= whileExpr compStatements .";
    artLabelStrings[ARTL_ART_loopStatement_110] = "";
    artlhsL[ARTL_ART_loopStatement_110] = ARTL_ART_loopStatement;
    artSlotInstanceOfs[ARTL_ART_loopStatement_110] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_loopStatement_110] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_loopStatement_110] = true;
    arteoR_pL[ARTL_ART_loopStatement_110] = true;
    artPopD[ARTL_ART_loopStatement_110] = true;
    artLabelInternalStrings[ARTL_ART_loopStatement_114] = "loopStatement ::= . untilExpr compStatements ";
    artLabelStrings[ARTL_ART_loopStatement_114] = "";
    artlhsL[ARTL_ART_loopStatement_114] = ARTL_ART_loopStatement;
    artKindOfs[ARTL_ART_loopStatement_114] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_loopStatement_116] = "loopStatement ::= untilExpr . compStatements ";
    artLabelStrings[ARTL_ART_loopStatement_116] = "";
    artlhsL[ARTL_ART_loopStatement_116] = ARTL_ART_loopStatement;
    artSlotInstanceOfs[ARTL_ART_loopStatement_116] = ARTL_ART_untilExpr;
    artKindOfs[ARTL_ART_loopStatement_116] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_loopStatement_116] = true;
    artLabelInternalStrings[ARTL_ART_loopStatement_118] = "loopStatement ::= untilExpr compStatements .";
    artLabelStrings[ARTL_ART_loopStatement_118] = "";
    artlhsL[ARTL_ART_loopStatement_118] = ARTL_ART_loopStatement;
    artSlotInstanceOfs[ARTL_ART_loopStatement_118] = ARTL_ART_compStatements;
    artKindOfs[ARTL_ART_loopStatement_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_loopStatement_118] = true;
    arteoR_pL[ARTL_ART_loopStatement_118] = true;
    artPopD[ARTL_ART_loopStatement_118] = true;
  }

  public void artTableInitialiser_ART_lss() {
    artLabelInternalStrings[ARTL_ART_lss] = "lss";
    artLabelStrings[ARTL_ART_lss] = "lss";
    artKindOfs[ARTL_ART_lss] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lss_388] = "lss ::= . subExprB '<'  subExprB ";
    artLabelStrings[ARTL_ART_lss_388] = "";
    artlhsL[ARTL_ART_lss_388] = ARTL_ART_lss;
    artKindOfs[ARTL_ART_lss_388] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lss_390] = "lss ::= subExprB . '<'  subExprB ";
    artLabelStrings[ARTL_ART_lss_390] = "";
    artlhsL[ARTL_ART_lss_390] = ARTL_ART_lss;
    artSlotInstanceOfs[ARTL_ART_lss_390] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_lss_390] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lss_390] = true;
    artLabelInternalStrings[ARTL_ART_lss_391] = "lss ::= subExprB '<'  subExprB ";
    artLabelStrings[ARTL_ART_lss_391] = "";
    artlhsL[ARTL_ART_lss_391] = ARTL_ART_lss;
    artLabelInternalStrings[ARTL_ART_lss_392] = "lss ::= subExprB '<'  . subExprB ";
    artLabelStrings[ARTL_ART_lss_392] = "";
    artlhsL[ARTL_ART_lss_392] = ARTL_ART_lss;
    artKindOfs[ARTL_ART_lss_392] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lss_394] = "lss ::= subExprB '<'  subExprB .";
    artLabelStrings[ARTL_ART_lss_394] = "";
    artlhsL[ARTL_ART_lss_394] = ARTL_ART_lss;
    artSlotInstanceOfs[ARTL_ART_lss_394] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_lss_394] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lss_394] = true;
    arteoR_pL[ARTL_ART_lss_394] = true;
    artPopD[ARTL_ART_lss_394] = true;
  }

  public void artTableInitialiser_ART_mainExpr() {
    artLabelInternalStrings[ARTL_ART_mainExpr] = "mainExpr";
    artLabelStrings[ARTL_ART_mainExpr] = "mainExpr";
    artKindOfs[ARTL_ART_mainExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mainExpr_250] = "mainExpr ::= . assign ";
    artLabelStrings[ARTL_ART_mainExpr_250] = "";
    artlhsL[ARTL_ART_mainExpr_250] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_mainExpr_250] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainExpr_252] = "mainExpr ::= assign .";
    artLabelStrings[ARTL_ART_mainExpr_252] = "";
    artlhsL[ARTL_ART_mainExpr_252] = ARTL_ART_mainExpr;
    artSlotInstanceOfs[ARTL_ART_mainExpr_252] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_mainExpr_252] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainExpr_252] = true;
    arteoR_pL[ARTL_ART_mainExpr_252] = true;
    artPopD[ARTL_ART_mainExpr_252] = true;
    artLabelInternalStrings[ARTL_ART_mainExpr_254] = "mainExpr ::= . subExprA ";
    artLabelStrings[ARTL_ART_mainExpr_254] = "";
    artlhsL[ARTL_ART_mainExpr_254] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_mainExpr_254] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainExpr_256] = "mainExpr ::= subExprA .";
    artLabelStrings[ARTL_ART_mainExpr_256] = "";
    artlhsL[ARTL_ART_mainExpr_256] = ARTL_ART_mainExpr;
    artSlotInstanceOfs[ARTL_ART_mainExpr_256] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_mainExpr_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainExpr_256] = true;
    arteoR_pL[ARTL_ART_mainExpr_256] = true;
    artPopD[ARTL_ART_mainExpr_256] = true;
  }

  public void artTableInitialiser_ART_memberAssign() {
    artLabelInternalStrings[ARTL_ART_memberAssign] = "memberAssign";
    artLabelStrings[ARTL_ART_memberAssign] = "memberAssign";
    artKindOfs[ARTL_ART_memberAssign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_memberAssign_238] = "memberAssign ::= . ID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_238] = "";
    artlhsL[ARTL_ART_memberAssign_238] = ARTL_ART_memberAssign;
    artKindOfs[ARTL_ART_memberAssign_238] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_memberAssign_240] = "memberAssign ::= ID . '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_240] = "";
    artlhsL[ARTL_ART_memberAssign_240] = ARTL_ART_memberAssign;
    artSlotInstanceOfs[ARTL_ART_memberAssign_240] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_memberAssign_240] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_memberAssign_240] = true;
    artLabelInternalStrings[ARTL_ART_memberAssign_241] = "memberAssign ::= ID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_241] = "";
    artlhsL[ARTL_ART_memberAssign_241] = ARTL_ART_memberAssign;
    artLabelInternalStrings[ARTL_ART_memberAssign_242] = "memberAssign ::= ID '='  . subExprA ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_242] = "";
    artlhsL[ARTL_ART_memberAssign_242] = ARTL_ART_memberAssign;
    artKindOfs[ARTL_ART_memberAssign_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_memberAssign_244] = "memberAssign ::= ID '='  subExprA . ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_244] = "";
    artlhsL[ARTL_ART_memberAssign_244] = ARTL_ART_memberAssign;
    artSlotInstanceOfs[ARTL_ART_memberAssign_244] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_memberAssign_244] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_memberAssign_244] = true;
    artLabelInternalStrings[ARTL_ART_memberAssign_245] = "memberAssign ::= ID '='  subExprA ';'  ";
    artLabelStrings[ARTL_ART_memberAssign_245] = "";
    artlhsL[ARTL_ART_memberAssign_245] = ARTL_ART_memberAssign;
    artPopD[ARTL_ART_memberAssign_245] = true;
    artLabelInternalStrings[ARTL_ART_memberAssign_246] = "memberAssign ::= ID '='  subExprA ';'  .";
    artLabelStrings[ARTL_ART_memberAssign_246] = "";
    artlhsL[ARTL_ART_memberAssign_246] = ARTL_ART_memberAssign;
    artKindOfs[ARTL_ART_memberAssign_246] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_memberAssign_246] = true;
    arteoR_pL[ARTL_ART_memberAssign_246] = true;
    artPopD[ARTL_ART_memberAssign_246] = true;
  }

  public void artTableInitialiser_ART_minus() {
    artLabelInternalStrings[ARTL_ART_minus] = "minus";
    artLabelStrings[ARTL_ART_minus] = "minus";
    artKindOfs[ARTL_ART_minus] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_minus_520] = "minus ::= . subExprB '-'  subExprC ";
    artLabelStrings[ARTL_ART_minus_520] = "";
    artlhsL[ARTL_ART_minus_520] = ARTL_ART_minus;
    artKindOfs[ARTL_ART_minus_520] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_minus_522] = "minus ::= subExprB . '-'  subExprC ";
    artLabelStrings[ARTL_ART_minus_522] = "";
    artlhsL[ARTL_ART_minus_522] = ARTL_ART_minus;
    artSlotInstanceOfs[ARTL_ART_minus_522] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_minus_522] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_minus_522] = true;
    artLabelInternalStrings[ARTL_ART_minus_523] = "minus ::= subExprB '-'  subExprC ";
    artLabelStrings[ARTL_ART_minus_523] = "";
    artlhsL[ARTL_ART_minus_523] = ARTL_ART_minus;
    artLabelInternalStrings[ARTL_ART_minus_524] = "minus ::= subExprB '-'  . subExprC ";
    artLabelStrings[ARTL_ART_minus_524] = "";
    artlhsL[ARTL_ART_minus_524] = ARTL_ART_minus;
    artKindOfs[ARTL_ART_minus_524] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_minus_526] = "minus ::= subExprB '-'  subExprC .";
    artLabelStrings[ARTL_ART_minus_526] = "";
    artlhsL[ARTL_ART_minus_526] = ARTL_ART_minus;
    artSlotInstanceOfs[ARTL_ART_minus_526] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_minus_526] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_minus_526] = true;
    arteoR_pL[ARTL_ART_minus_526] = true;
    artPopD[ARTL_ART_minus_526] = true;
  }

  public void artTableInitialiser_ART_minusEquals() {
    artLabelInternalStrings[ARTL_ART_minusEquals] = "minusEquals";
    artLabelStrings[ARTL_ART_minusEquals] = "minusEquals";
    artKindOfs[ARTL_ART_minusEquals] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_minusEquals_498] = "minusEquals ::= . AID '-='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_498] = "";
    artlhsL[ARTL_ART_minusEquals_498] = ARTL_ART_minusEquals;
    artKindOfs[ARTL_ART_minusEquals_498] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_minusEquals_500] = "minusEquals ::= AID . '-='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_500] = "";
    artlhsL[ARTL_ART_minusEquals_500] = ARTL_ART_minusEquals;
    artSlotInstanceOfs[ARTL_ART_minusEquals_500] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_minusEquals_500] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_minusEquals_500] = true;
    artLabelInternalStrings[ARTL_ART_minusEquals_501] = "minusEquals ::= AID '-='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_501] = "";
    artlhsL[ARTL_ART_minusEquals_501] = ARTL_ART_minusEquals;
    artLabelInternalStrings[ARTL_ART_minusEquals_502] = "minusEquals ::= AID '-='  . subExprC ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_502] = "";
    artlhsL[ARTL_ART_minusEquals_502] = ARTL_ART_minusEquals;
    artKindOfs[ARTL_ART_minusEquals_502] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_minusEquals_504] = "minusEquals ::= AID '-='  subExprC . ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_504] = "";
    artlhsL[ARTL_ART_minusEquals_504] = ARTL_ART_minusEquals;
    artSlotInstanceOfs[ARTL_ART_minusEquals_504] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_minusEquals_504] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_minusEquals_504] = true;
    artLabelInternalStrings[ARTL_ART_minusEquals_505] = "minusEquals ::= AID '-='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_minusEquals_505] = "";
    artlhsL[ARTL_ART_minusEquals_505] = ARTL_ART_minusEquals;
    artPopD[ARTL_ART_minusEquals_505] = true;
    artLabelInternalStrings[ARTL_ART_minusEquals_506] = "minusEquals ::= AID '-='  subExprC ';'  .";
    artLabelStrings[ARTL_ART_minusEquals_506] = "";
    artlhsL[ARTL_ART_minusEquals_506] = ARTL_ART_minusEquals;
    artKindOfs[ARTL_ART_minusEquals_506] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_minusEquals_506] = true;
    arteoR_pL[ARTL_ART_minusEquals_506] = true;
    artPopD[ARTL_ART_minusEquals_506] = true;
  }

  public void artTableInitialiser_ART_multiply() {
    artLabelInternalStrings[ARTL_ART_multiply] = "multiply";
    artLabelStrings[ARTL_ART_multiply] = "multiply";
    artKindOfs[ARTL_ART_multiply] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_multiply_530] = "multiply ::= . subExprC '*'  subExprD ";
    artLabelStrings[ARTL_ART_multiply_530] = "";
    artlhsL[ARTL_ART_multiply_530] = ARTL_ART_multiply;
    artKindOfs[ARTL_ART_multiply_530] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_multiply_532] = "multiply ::= subExprC . '*'  subExprD ";
    artLabelStrings[ARTL_ART_multiply_532] = "";
    artlhsL[ARTL_ART_multiply_532] = ARTL_ART_multiply;
    artSlotInstanceOfs[ARTL_ART_multiply_532] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_multiply_532] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_multiply_532] = true;
    artLabelInternalStrings[ARTL_ART_multiply_533] = "multiply ::= subExprC '*'  subExprD ";
    artLabelStrings[ARTL_ART_multiply_533] = "";
    artlhsL[ARTL_ART_multiply_533] = ARTL_ART_multiply;
    artLabelInternalStrings[ARTL_ART_multiply_534] = "multiply ::= subExprC '*'  . subExprD ";
    artLabelStrings[ARTL_ART_multiply_534] = "";
    artlhsL[ARTL_ART_multiply_534] = ARTL_ART_multiply;
    artKindOfs[ARTL_ART_multiply_534] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_multiply_536] = "multiply ::= subExprC '*'  subExprD .";
    artLabelStrings[ARTL_ART_multiply_536] = "";
    artlhsL[ARTL_ART_multiply_536] = ARTL_ART_multiply;
    artSlotInstanceOfs[ARTL_ART_multiply_536] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_multiply_536] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_multiply_536] = true;
    arteoR_pL[ARTL_ART_multiply_536] = true;
    artPopD[ARTL_ART_multiply_536] = true;
  }

  public void artTableInitialiser_ART_negate() {
    artLabelInternalStrings[ARTL_ART_negate] = "negate";
    artLabelStrings[ARTL_ART_negate] = "negate";
    artKindOfs[ARTL_ART_negate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_negate_568] = "negate ::= . '-'  subExprE ";
    artLabelStrings[ARTL_ART_negate_568] = "";
    artlhsL[ARTL_ART_negate_568] = ARTL_ART_negate;
    artKindOfs[ARTL_ART_negate_568] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_negate_569] = "negate ::= '-'  subExprE ";
    artLabelStrings[ARTL_ART_negate_569] = "";
    artlhsL[ARTL_ART_negate_569] = ARTL_ART_negate;
    artLabelInternalStrings[ARTL_ART_negate_570] = "negate ::= '-'  . subExprE ";
    artLabelStrings[ARTL_ART_negate_570] = "";
    artlhsL[ARTL_ART_negate_570] = ARTL_ART_negate;
    artKindOfs[ARTL_ART_negate_570] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_negate_570] = true;
    artLabelInternalStrings[ARTL_ART_negate_572] = "negate ::= '-'  subExprE .";
    artLabelStrings[ARTL_ART_negate_572] = "";
    artlhsL[ARTL_ART_negate_572] = ARTL_ART_negate;
    artSlotInstanceOfs[ARTL_ART_negate_572] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_negate_572] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_negate_572] = true;
    arteoR_pL[ARTL_ART_negate_572] = true;
    artPopD[ARTL_ART_negate_572] = true;
  }

  public void artTableInitialiser_ART_not() {
    artLabelInternalStrings[ARTL_ART_not] = "not";
    artLabelStrings[ARTL_ART_not] = "not";
    artKindOfs[ARTL_ART_not] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_not_560] = "not ::= . '!'  subExprE ";
    artLabelStrings[ARTL_ART_not_560] = "";
    artlhsL[ARTL_ART_not_560] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_560] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_not_561] = "not ::= '!'  subExprE ";
    artLabelStrings[ARTL_ART_not_561] = "";
    artlhsL[ARTL_ART_not_561] = ARTL_ART_not;
    artLabelInternalStrings[ARTL_ART_not_562] = "not ::= '!'  . subExprE ";
    artLabelStrings[ARTL_ART_not_562] = "";
    artlhsL[ARTL_ART_not_562] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_562] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_not_562] = true;
    artLabelInternalStrings[ARTL_ART_not_564] = "not ::= '!'  subExprE .";
    artLabelStrings[ARTL_ART_not_564] = "";
    artlhsL[ARTL_ART_not_564] = ARTL_ART_not;
    artSlotInstanceOfs[ARTL_ART_not_564] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_not_564] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_not_564] = true;
    arteoR_pL[ARTL_ART_not_564] = true;
    artPopD[ARTL_ART_not_564] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_596] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_596] = "";
    artlhsL[ARTL_ART_operand_596] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_596] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_598] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_598] = "";
    artlhsL[ARTL_ART_operand_598] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_598] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_598] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_598] = true;
    arteoR_pL[ARTL_ART_operand_598] = true;
    artPopD[ARTL_ART_operand_598] = true;
    artLabelInternalStrings[ARTL_ART_operand_602] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_602] = "";
    artlhsL[ARTL_ART_operand_602] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_602] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_604] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_604] = "";
    artlhsL[ARTL_ART_operand_604] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_604] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_604] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_604] = true;
    arteoR_pL[ARTL_ART_operand_604] = true;
    artPopD[ARTL_ART_operand_604] = true;
    artLabelInternalStrings[ARTL_ART_operand_608] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_608] = "";
    artlhsL[ARTL_ART_operand_608] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_608] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_610] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_610] = "";
    artlhsL[ARTL_ART_operand_610] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_610] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_610] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_610] = true;
    arteoR_pL[ARTL_ART_operand_610] = true;
    artPopD[ARTL_ART_operand_610] = true;
    artLabelInternalStrings[ARTL_ART_operand_614] = "operand ::= . 'true'  ";
    artLabelStrings[ARTL_ART_operand_614] = "";
    artlhsL[ARTL_ART_operand_614] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_614] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_614] = true;
    artLabelInternalStrings[ARTL_ART_operand_615] = "operand ::= 'true'  ";
    artLabelStrings[ARTL_ART_operand_615] = "";
    artlhsL[ARTL_ART_operand_615] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_615] = true;
    artLabelInternalStrings[ARTL_ART_operand_616] = "operand ::= 'true'  .";
    artLabelStrings[ARTL_ART_operand_616] = "";
    artlhsL[ARTL_ART_operand_616] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_616] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_616] = true;
    arteoR_pL[ARTL_ART_operand_616] = true;
    artPopD[ARTL_ART_operand_616] = true;
    artLabelInternalStrings[ARTL_ART_operand_620] = "operand ::= . 'false'  ";
    artLabelStrings[ARTL_ART_operand_620] = "";
    artlhsL[ARTL_ART_operand_620] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_620] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_620] = true;
    artLabelInternalStrings[ARTL_ART_operand_621] = "operand ::= 'false'  ";
    artLabelStrings[ARTL_ART_operand_621] = "";
    artlhsL[ARTL_ART_operand_621] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_621] = true;
    artLabelInternalStrings[ARTL_ART_operand_622] = "operand ::= 'false'  .";
    artLabelStrings[ARTL_ART_operand_622] = "";
    artlhsL[ARTL_ART_operand_622] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_622] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_622] = true;
    arteoR_pL[ARTL_ART_operand_622] = true;
    artPopD[ARTL_ART_operand_622] = true;
    artLabelInternalStrings[ARTL_ART_operand_626] = "operand ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_operand_626] = "";
    artlhsL[ARTL_ART_operand_626] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_626] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_628] = "operand ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_operand_628] = "";
    artlhsL[ARTL_ART_operand_628] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_628] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_operand_628] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_628] = true;
    arteoR_pL[ARTL_ART_operand_628] = true;
    artPopD[ARTL_ART_operand_628] = true;
    artLabelInternalStrings[ARTL_ART_operand_632] = "operand ::= . '('  mainExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_632] = "";
    artlhsL[ARTL_ART_operand_632] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_632] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_633] = "operand ::= '('  mainExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_633] = "";
    artlhsL[ARTL_ART_operand_633] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_634] = "operand ::= '('  . mainExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_634] = "";
    artlhsL[ARTL_ART_operand_634] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_634] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_634] = true;
    artLabelInternalStrings[ARTL_ART_operand_636] = "operand ::= '('  mainExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_636] = "";
    artlhsL[ARTL_ART_operand_636] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_636] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_operand_636] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_636] = true;
    artLabelInternalStrings[ARTL_ART_operand_637] = "operand ::= '('  mainExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_637] = "";
    artlhsL[ARTL_ART_operand_637] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_637] = true;
    artLabelInternalStrings[ARTL_ART_operand_638] = "operand ::= '('  mainExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_638] = "";
    artlhsL[ARTL_ART_operand_638] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_638] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_638] = true;
    arteoR_pL[ARTL_ART_operand_638] = true;
    artPopD[ARTL_ART_operand_638] = true;
    artLabelInternalStrings[ARTL_ART_operand_642] = "operand ::= . # ";
    artLabelStrings[ARTL_ART_operand_642] = "";
    artlhsL[ARTL_ART_operand_642] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_642] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_642] = true;
    artLabelInternalStrings[ARTL_ART_operand_644] = "operand ::= # .";
    artLabelStrings[ARTL_ART_operand_644] = "";
    artlhsL[ARTL_ART_operand_644] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_644] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_644] = true;
    arteoR_pL[ARTL_ART_operand_644] = true;
    artPopD[ARTL_ART_operand_644] = true;
  }

  public void artTableInitialiser_ART_or() {
    artLabelInternalStrings[ARTL_ART_or] = "or";
    artLabelStrings[ARTL_ART_or] = "or";
    artKindOfs[ARTL_ART_or] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_or_586] = "or ::= . subExprA '||'  subExprA ";
    artLabelStrings[ARTL_ART_or_586] = "";
    artlhsL[ARTL_ART_or_586] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_586] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_588] = "or ::= subExprA . '||'  subExprA ";
    artLabelStrings[ARTL_ART_or_588] = "";
    artlhsL[ARTL_ART_or_588] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_588] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_or_588] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_or_588] = true;
    artLabelInternalStrings[ARTL_ART_or_589] = "or ::= subExprA '||'  subExprA ";
    artLabelStrings[ARTL_ART_or_589] = "";
    artlhsL[ARTL_ART_or_589] = ARTL_ART_or;
    artLabelInternalStrings[ARTL_ART_or_590] = "or ::= subExprA '||'  . subExprA ";
    artLabelStrings[ARTL_ART_or_590] = "";
    artlhsL[ARTL_ART_or_590] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_590] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_592] = "or ::= subExprA '||'  subExprA .";
    artLabelStrings[ARTL_ART_or_592] = "";
    artlhsL[ARTL_ART_or_592] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_592] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_or_592] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_or_592] = true;
    arteoR_pL[ARTL_ART_or_592] = true;
    artPopD[ARTL_ART_or_592] = true;
  }

  public void artTableInitialiser_ART_plus() {
    artLabelInternalStrings[ARTL_ART_plus] = "plus";
    artLabelStrings[ARTL_ART_plus] = "plus";
    artKindOfs[ARTL_ART_plus] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_plus_510] = "plus ::= . subExprB '+'  subExprC ";
    artLabelStrings[ARTL_ART_plus_510] = "";
    artlhsL[ARTL_ART_plus_510] = ARTL_ART_plus;
    artKindOfs[ARTL_ART_plus_510] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_plus_512] = "plus ::= subExprB . '+'  subExprC ";
    artLabelStrings[ARTL_ART_plus_512] = "";
    artlhsL[ARTL_ART_plus_512] = ARTL_ART_plus;
    artSlotInstanceOfs[ARTL_ART_plus_512] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_plus_512] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_plus_512] = true;
    artLabelInternalStrings[ARTL_ART_plus_513] = "plus ::= subExprB '+'  subExprC ";
    artLabelStrings[ARTL_ART_plus_513] = "";
    artlhsL[ARTL_ART_plus_513] = ARTL_ART_plus;
    artLabelInternalStrings[ARTL_ART_plus_514] = "plus ::= subExprB '+'  . subExprC ";
    artLabelStrings[ARTL_ART_plus_514] = "";
    artlhsL[ARTL_ART_plus_514] = ARTL_ART_plus;
    artKindOfs[ARTL_ART_plus_514] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_plus_516] = "plus ::= subExprB '+'  subExprC .";
    artLabelStrings[ARTL_ART_plus_516] = "";
    artlhsL[ARTL_ART_plus_516] = ARTL_ART_plus;
    artSlotInstanceOfs[ARTL_ART_plus_516] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_plus_516] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_plus_516] = true;
    arteoR_pL[ARTL_ART_plus_516] = true;
    artPopD[ARTL_ART_plus_516] = true;
  }

  public void artTableInitialiser_ART_plusEquals() {
    artLabelInternalStrings[ARTL_ART_plusEquals] = "plusEquals";
    artLabelStrings[ARTL_ART_plusEquals] = "plusEquals";
    artKindOfs[ARTL_ART_plusEquals] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_plusEquals_486] = "plusEquals ::= . AID '+='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_486] = "";
    artlhsL[ARTL_ART_plusEquals_486] = ARTL_ART_plusEquals;
    artKindOfs[ARTL_ART_plusEquals_486] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_plusEquals_488] = "plusEquals ::= AID . '+='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_488] = "";
    artlhsL[ARTL_ART_plusEquals_488] = ARTL_ART_plusEquals;
    artSlotInstanceOfs[ARTL_ART_plusEquals_488] = ARTL_ART_AID;
    artKindOfs[ARTL_ART_plusEquals_488] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_plusEquals_488] = true;
    artLabelInternalStrings[ARTL_ART_plusEquals_489] = "plusEquals ::= AID '+='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_489] = "";
    artlhsL[ARTL_ART_plusEquals_489] = ARTL_ART_plusEquals;
    artLabelInternalStrings[ARTL_ART_plusEquals_490] = "plusEquals ::= AID '+='  . subExprC ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_490] = "";
    artlhsL[ARTL_ART_plusEquals_490] = ARTL_ART_plusEquals;
    artKindOfs[ARTL_ART_plusEquals_490] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_plusEquals_492] = "plusEquals ::= AID '+='  subExprC . ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_492] = "";
    artlhsL[ARTL_ART_plusEquals_492] = ARTL_ART_plusEquals;
    artSlotInstanceOfs[ARTL_ART_plusEquals_492] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_plusEquals_492] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_plusEquals_492] = true;
    artLabelInternalStrings[ARTL_ART_plusEquals_493] = "plusEquals ::= AID '+='  subExprC ';'  ";
    artLabelStrings[ARTL_ART_plusEquals_493] = "";
    artlhsL[ARTL_ART_plusEquals_493] = ARTL_ART_plusEquals;
    artPopD[ARTL_ART_plusEquals_493] = true;
    artLabelInternalStrings[ARTL_ART_plusEquals_494] = "plusEquals ::= AID '+='  subExprC ';'  .";
    artLabelStrings[ARTL_ART_plusEquals_494] = "";
    artlhsL[ARTL_ART_plusEquals_494] = ARTL_ART_plusEquals;
    artKindOfs[ARTL_ART_plusEquals_494] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_plusEquals_494] = true;
    arteoR_pL[ARTL_ART_plusEquals_494] = true;
    artPopD[ARTL_ART_plusEquals_494] = true;
  }

  public void artTableInitialiser_ART_scopeEnter() {
    artLabelInternalStrings[ARTL_ART_scopeEnter] = "scopeEnter";
    artLabelStrings[ARTL_ART_scopeEnter] = "scopeEnter";
    artKindOfs[ARTL_ART_scopeEnter] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_scopeEnter_82] = "scopeEnter ::= . '{'  ";
    artLabelStrings[ARTL_ART_scopeEnter_82] = "";
    artlhsL[ARTL_ART_scopeEnter_82] = ARTL_ART_scopeEnter;
    artKindOfs[ARTL_ART_scopeEnter_82] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scopeEnter_82] = true;
    artLabelInternalStrings[ARTL_ART_scopeEnter_83] = "scopeEnter ::= '{'  ";
    artLabelStrings[ARTL_ART_scopeEnter_83] = "";
    artlhsL[ARTL_ART_scopeEnter_83] = ARTL_ART_scopeEnter;
    artPopD[ARTL_ART_scopeEnter_83] = true;
    artLabelInternalStrings[ARTL_ART_scopeEnter_84] = "scopeEnter ::= '{'  .";
    artLabelStrings[ARTL_ART_scopeEnter_84] = "";
    artlhsL[ARTL_ART_scopeEnter_84] = ARTL_ART_scopeEnter;
    artKindOfs[ARTL_ART_scopeEnter_84] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_scopeEnter_84] = true;
    arteoR_pL[ARTL_ART_scopeEnter_84] = true;
    artPopD[ARTL_ART_scopeEnter_84] = true;
  }

  public void artTableInitialiser_ART_scopeLeave() {
    artLabelInternalStrings[ARTL_ART_scopeLeave] = "scopeLeave";
    artLabelStrings[ARTL_ART_scopeLeave] = "scopeLeave";
    artKindOfs[ARTL_ART_scopeLeave] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_scopeLeave_88] = "scopeLeave ::= . '}'  ";
    artLabelStrings[ARTL_ART_scopeLeave_88] = "";
    artlhsL[ARTL_ART_scopeLeave_88] = ARTL_ART_scopeLeave;
    artKindOfs[ARTL_ART_scopeLeave_88] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scopeLeave_88] = true;
    artLabelInternalStrings[ARTL_ART_scopeLeave_89] = "scopeLeave ::= '}'  ";
    artLabelStrings[ARTL_ART_scopeLeave_89] = "";
    artlhsL[ARTL_ART_scopeLeave_89] = ARTL_ART_scopeLeave;
    artPopD[ARTL_ART_scopeLeave_89] = true;
    artLabelInternalStrings[ARTL_ART_scopeLeave_90] = "scopeLeave ::= '}'  .";
    artLabelStrings[ARTL_ART_scopeLeave_90] = "";
    artlhsL[ARTL_ART_scopeLeave_90] = ARTL_ART_scopeLeave;
    artKindOfs[ARTL_ART_scopeLeave_90] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_scopeLeave_90] = true;
    arteoR_pL[ARTL_ART_scopeLeave_90] = true;
    artPopD[ARTL_ART_scopeLeave_90] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= . defStruct ";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= defStruct .";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_30] = ARTL_ART_defStruct;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_30] = true;
    arteoR_pL[ARTL_ART_statement_30] = true;
    artPopD[ARTL_ART_statement_30] = true;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= . loopStatement ";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_34] = "statement ::= loopStatement .";
    artLabelStrings[ARTL_ART_statement_34] = "";
    artlhsL[ARTL_ART_statement_34] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_34] = ARTL_ART_loopStatement;
    artKindOfs[ARTL_ART_statement_34] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_34] = true;
    arteoR_pL[ARTL_ART_statement_34] = true;
    artPopD[ARTL_ART_statement_34] = true;
    artLabelInternalStrings[ARTL_ART_statement_36] = "statement ::= . condStatement ";
    artLabelStrings[ARTL_ART_statement_36] = "";
    artlhsL[ARTL_ART_statement_36] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_38] = "statement ::= condStatement .";
    artLabelStrings[ARTL_ART_statement_38] = "";
    artlhsL[ARTL_ART_statement_38] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_38] = ARTL_ART_condStatement;
    artKindOfs[ARTL_ART_statement_38] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_38] = true;
    arteoR_pL[ARTL_ART_statement_38] = true;
    artPopD[ARTL_ART_statement_38] = true;
    artLabelInternalStrings[ARTL_ART_statement_40] = "statement ::= . mainExpr ";
    artLabelStrings[ARTL_ART_statement_40] = "";
    artlhsL[ARTL_ART_statement_40] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_40] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_42] = "statement ::= mainExpr .";
    artLabelStrings[ARTL_ART_statement_42] = "";
    artlhsL[ARTL_ART_statement_42] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_42] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_statement_42] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_42] = true;
    arteoR_pL[ARTL_ART_statement_42] = true;
    artPopD[ARTL_ART_statement_42] = true;
    artLabelInternalStrings[ARTL_ART_statement_44] = "statement ::= . sysout ";
    artLabelStrings[ARTL_ART_statement_44] = "";
    artlhsL[ARTL_ART_statement_44] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_46] = "statement ::= sysout .";
    artLabelStrings[ARTL_ART_statement_46] = "";
    artlhsL[ARTL_ART_statement_46] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_46] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_statement_46] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_46] = true;
    arteoR_pL[ARTL_ART_statement_46] = true;
    artPopD[ARTL_ART_statement_46] = true;
    artLabelInternalStrings[ARTL_ART_statement_48] = "statement ::= . sysline ";
    artLabelStrings[ARTL_ART_statement_48] = "";
    artlhsL[ARTL_ART_statement_48] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_48] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_50] = "statement ::= sysline .";
    artLabelStrings[ARTL_ART_statement_50] = "";
    artlhsL[ARTL_ART_statement_50] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_50] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_statement_50] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_50] = true;
    arteoR_pL[ARTL_ART_statement_50] = true;
    artPopD[ARTL_ART_statement_50] = true;
  }

  public void artTableInitialiser_ART_statements() {
    artLabelInternalStrings[ARTL_ART_statements] = "statements";
    artLabelStrings[ARTL_ART_statements] = "statements";
    artKindOfs[ARTL_ART_statements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statements_2] = "statements ::= . statement ";
    artLabelStrings[ARTL_ART_statements_2] = "";
    artlhsL[ARTL_ART_statements_2] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_4] = "statements ::= statement .";
    artLabelStrings[ARTL_ART_statements_4] = "";
    artlhsL[ARTL_ART_statements_4] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_4] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_4] = true;
    arteoR_pL[ARTL_ART_statements_4] = true;
    artPopD[ARTL_ART_statements_4] = true;
    artLabelInternalStrings[ARTL_ART_statements_6] = "statements ::= . statement statements ";
    artLabelStrings[ARTL_ART_statements_6] = "";
    artlhsL[ARTL_ART_statements_6] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_8] = "statements ::= statement . statements ";
    artLabelStrings[ARTL_ART_statements_8] = "";
    artlhsL[ARTL_ART_statements_8] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_8] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_8] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statements_8] = true;
    artLabelInternalStrings[ARTL_ART_statements_10] = "statements ::= statement statements .";
    artLabelStrings[ARTL_ART_statements_10] = "";
    artlhsL[ARTL_ART_statements_10] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_10] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_10] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_10] = true;
    arteoR_pL[ARTL_ART_statements_10] = true;
    artPopD[ARTL_ART_statements_10] = true;
  }

  public void artTableInitialiser_ART_structArgs() {
    artLabelInternalStrings[ARTL_ART_structArgs] = "structArgs";
    artLabelStrings[ARTL_ART_structArgs] = "structArgs";
    artKindOfs[ARTL_ART_structArgs] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_structArgs_446] = "structArgs ::= . arg ','  structArgs ";
    artLabelStrings[ARTL_ART_structArgs_446] = "";
    artlhsL[ARTL_ART_structArgs_446] = ARTL_ART_structArgs;
    artKindOfs[ARTL_ART_structArgs_446] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structArgs_448] = "structArgs ::= arg . ','  structArgs ";
    artLabelStrings[ARTL_ART_structArgs_448] = "";
    artlhsL[ARTL_ART_structArgs_448] = ARTL_ART_structArgs;
    artSlotInstanceOfs[ARTL_ART_structArgs_448] = ARTL_ART_arg;
    artKindOfs[ARTL_ART_structArgs_448] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_structArgs_448] = true;
    artLabelInternalStrings[ARTL_ART_structArgs_449] = "structArgs ::= arg ','  structArgs ";
    artLabelStrings[ARTL_ART_structArgs_449] = "";
    artlhsL[ARTL_ART_structArgs_449] = ARTL_ART_structArgs;
    artLabelInternalStrings[ARTL_ART_structArgs_450] = "structArgs ::= arg ','  . structArgs ";
    artLabelStrings[ARTL_ART_structArgs_450] = "";
    artlhsL[ARTL_ART_structArgs_450] = ARTL_ART_structArgs;
    artKindOfs[ARTL_ART_structArgs_450] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structArgs_454] = "structArgs ::= arg ','  structArgs .";
    artLabelStrings[ARTL_ART_structArgs_454] = "";
    artlhsL[ARTL_ART_structArgs_454] = ARTL_ART_structArgs;
    artSlotInstanceOfs[ARTL_ART_structArgs_454] = ARTL_ART_structArgs;
    artKindOfs[ARTL_ART_structArgs_454] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structArgs_454] = true;
    arteoR_pL[ARTL_ART_structArgs_454] = true;
    artPopD[ARTL_ART_structArgs_454] = true;
    artLabelInternalStrings[ARTL_ART_structArgs_456] = "structArgs ::= . arg ";
    artLabelStrings[ARTL_ART_structArgs_456] = "";
    artlhsL[ARTL_ART_structArgs_456] = ARTL_ART_structArgs;
    artKindOfs[ARTL_ART_structArgs_456] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structArgs_458] = "structArgs ::= arg .";
    artLabelStrings[ARTL_ART_structArgs_458] = "";
    artlhsL[ARTL_ART_structArgs_458] = ARTL_ART_structArgs;
    artSlotInstanceOfs[ARTL_ART_structArgs_458] = ARTL_ART_arg;
    artKindOfs[ARTL_ART_structArgs_458] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structArgs_458] = true;
    arteoR_pL[ARTL_ART_structArgs_458] = true;
    artPopD[ARTL_ART_structArgs_458] = true;
  }

  public void artTableInitialiser_ART_structAssign() {
    artLabelInternalStrings[ARTL_ART_structAssign] = "structAssign";
    artLabelStrings[ARTL_ART_structAssign] = "structAssign";
    artKindOfs[ARTL_ART_structAssign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_structAssign_422] = "structAssign ::= . ID '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_422] = "";
    artlhsL[ARTL_ART_structAssign_422] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_structAssign_422] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structAssign_424] = "structAssign ::= ID . '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_424] = "";
    artlhsL[ARTL_ART_structAssign_424] = ARTL_ART_structAssign;
    artSlotInstanceOfs[ARTL_ART_structAssign_424] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_structAssign_424] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_structAssign_424] = true;
    artLabelInternalStrings[ARTL_ART_structAssign_427] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_427] = "";
    artlhsL[ARTL_ART_structAssign_427] = ARTL_ART_structAssign;
    artLabelInternalStrings[ARTL_ART_structAssign_428] = "structAssign ::= ID '<-'  . ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_428] = "";
    artlhsL[ARTL_ART_structAssign_428] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_structAssign_428] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structAssign_430] = "structAssign ::= ID '<-'  ID . '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_430] = "";
    artlhsL[ARTL_ART_structAssign_430] = ARTL_ART_structAssign;
    artSlotInstanceOfs[ARTL_ART_structAssign_430] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_structAssign_430] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structAssign_433] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_433] = "";
    artlhsL[ARTL_ART_structAssign_433] = ARTL_ART_structAssign;
    artLabelInternalStrings[ARTL_ART_structAssign_434] = "structAssign ::= ID '<-'  ID '('  . structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_434] = "";
    artlhsL[ARTL_ART_structAssign_434] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_structAssign_434] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structAssign_436] = "structAssign ::= ID '<-'  ID '('  structArgs . ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_436] = "";
    artlhsL[ARTL_ART_structAssign_436] = ARTL_ART_structAssign;
    artSlotInstanceOfs[ARTL_ART_structAssign_436] = ARTL_ART_structArgs;
    artKindOfs[ARTL_ART_structAssign_436] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_structAssign_436] = true;
    artLabelInternalStrings[ARTL_ART_structAssign_437] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_437] = "";
    artlhsL[ARTL_ART_structAssign_437] = ARTL_ART_structAssign;
    artPopD[ARTL_ART_structAssign_437] = true;
    artLabelInternalStrings[ARTL_ART_structAssign_438] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  . ';'  ";
    artLabelStrings[ARTL_ART_structAssign_438] = "";
    artlhsL[ARTL_ART_structAssign_438] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_structAssign_438] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_structAssign_438] = true;
    artLabelInternalStrings[ARTL_ART_structAssign_441] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  ";
    artLabelStrings[ARTL_ART_structAssign_441] = "";
    artlhsL[ARTL_ART_structAssign_441] = ARTL_ART_structAssign;
    artPopD[ARTL_ART_structAssign_441] = true;
    artLabelInternalStrings[ARTL_ART_structAssign_442] = "structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  .";
    artLabelStrings[ARTL_ART_structAssign_442] = "";
    artlhsL[ARTL_ART_structAssign_442] = ARTL_ART_structAssign;
    artKindOfs[ARTL_ART_structAssign_442] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structAssign_442] = true;
    arteoR_pL[ARTL_ART_structAssign_442] = true;
    artPopD[ARTL_ART_structAssign_442] = true;
  }

  public void artTableInitialiser_ART_structDefinition() {
    artLabelInternalStrings[ARTL_ART_structDefinition] = "structDefinition";
    artLabelStrings[ARTL_ART_structDefinition] = "structDefinition";
    artKindOfs[ARTL_ART_structDefinition] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_structDefinition_52] = "structDefinition ::= . '{'  structStatements '}'  statements ";
    artLabelStrings[ARTL_ART_structDefinition_52] = "";
    artlhsL[ARTL_ART_structDefinition_52] = ARTL_ART_structDefinition;
    artKindOfs[ARTL_ART_structDefinition_52] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structDefinition_53] = "structDefinition ::= '{'  structStatements '}'  statements ";
    artLabelStrings[ARTL_ART_structDefinition_53] = "";
    artlhsL[ARTL_ART_structDefinition_53] = ARTL_ART_structDefinition;
    artLabelInternalStrings[ARTL_ART_structDefinition_54] = "structDefinition ::= '{'  . structStatements '}'  statements ";
    artLabelStrings[ARTL_ART_structDefinition_54] = "";
    artlhsL[ARTL_ART_structDefinition_54] = ARTL_ART_structDefinition;
    artKindOfs[ARTL_ART_structDefinition_54] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_structDefinition_54] = true;
    artLabelInternalStrings[ARTL_ART_structDefinition_56] = "structDefinition ::= '{'  structStatements . '}'  statements ";
    artLabelStrings[ARTL_ART_structDefinition_56] = "";
    artlhsL[ARTL_ART_structDefinition_56] = ARTL_ART_structDefinition;
    artSlotInstanceOfs[ARTL_ART_structDefinition_56] = ARTL_ART_structStatements;
    artKindOfs[ARTL_ART_structDefinition_56] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structDefinition_57] = "structDefinition ::= '{'  structStatements '}'  statements ";
    artLabelStrings[ARTL_ART_structDefinition_57] = "";
    artlhsL[ARTL_ART_structDefinition_57] = ARTL_ART_structDefinition;
    artLabelInternalStrings[ARTL_ART_structDefinition_58] = "structDefinition ::= '{'  structStatements '}'  . statements ";
    artLabelStrings[ARTL_ART_structDefinition_58] = "";
    artlhsL[ARTL_ART_structDefinition_58] = ARTL_ART_structDefinition;
    artKindOfs[ARTL_ART_structDefinition_58] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structDefinition_60] = "structDefinition ::= '{'  structStatements '}'  statements .";
    artLabelStrings[ARTL_ART_structDefinition_60] = "";
    artlhsL[ARTL_ART_structDefinition_60] = ARTL_ART_structDefinition;
    artSlotInstanceOfs[ARTL_ART_structDefinition_60] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_structDefinition_60] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structDefinition_60] = true;
    arteoR_pL[ARTL_ART_structDefinition_60] = true;
    artPopD[ARTL_ART_structDefinition_60] = true;
    artLabelInternalStrings[ARTL_ART_structDefinition_62] = "structDefinition ::= . structStatement statements ";
    artLabelStrings[ARTL_ART_structDefinition_62] = "";
    artlhsL[ARTL_ART_structDefinition_62] = ARTL_ART_structDefinition;
    artKindOfs[ARTL_ART_structDefinition_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structDefinition_64] = "structDefinition ::= structStatement . statements ";
    artLabelStrings[ARTL_ART_structDefinition_64] = "";
    artlhsL[ARTL_ART_structDefinition_64] = ARTL_ART_structDefinition;
    artSlotInstanceOfs[ARTL_ART_structDefinition_64] = ARTL_ART_structStatement;
    artKindOfs[ARTL_ART_structDefinition_64] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_structDefinition_64] = true;
    artLabelInternalStrings[ARTL_ART_structDefinition_66] = "structDefinition ::= structStatement statements .";
    artLabelStrings[ARTL_ART_structDefinition_66] = "";
    artlhsL[ARTL_ART_structDefinition_66] = ARTL_ART_structDefinition;
    artSlotInstanceOfs[ARTL_ART_structDefinition_66] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_structDefinition_66] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structDefinition_66] = true;
    arteoR_pL[ARTL_ART_structDefinition_66] = true;
    artPopD[ARTL_ART_structDefinition_66] = true;
  }

  public void artTableInitialiser_ART_structStatement() {
    artLabelInternalStrings[ARTL_ART_structStatement] = "structStatement";
    artLabelStrings[ARTL_ART_structStatement] = "structStatement";
    artKindOfs[ARTL_ART_structStatement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_structStatement_78] = "structStatement ::= . memberAssign ";
    artLabelStrings[ARTL_ART_structStatement_78] = "";
    artlhsL[ARTL_ART_structStatement_78] = ARTL_ART_structStatement;
    artKindOfs[ARTL_ART_structStatement_78] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structStatement_80] = "structStatement ::= memberAssign .";
    artLabelStrings[ARTL_ART_structStatement_80] = "";
    artlhsL[ARTL_ART_structStatement_80] = ARTL_ART_structStatement;
    artSlotInstanceOfs[ARTL_ART_structStatement_80] = ARTL_ART_memberAssign;
    artKindOfs[ARTL_ART_structStatement_80] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structStatement_80] = true;
    arteoR_pL[ARTL_ART_structStatement_80] = true;
    artPopD[ARTL_ART_structStatement_80] = true;
  }

  public void artTableInitialiser_ART_structStatements() {
    artLabelInternalStrings[ARTL_ART_structStatements] = "structStatements";
    artLabelStrings[ARTL_ART_structStatements] = "structStatements";
    artKindOfs[ARTL_ART_structStatements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_structStatements_68] = "structStatements ::= . structStatement ";
    artLabelStrings[ARTL_ART_structStatements_68] = "";
    artlhsL[ARTL_ART_structStatements_68] = ARTL_ART_structStatements;
    artKindOfs[ARTL_ART_structStatements_68] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structStatements_70] = "structStatements ::= structStatement .";
    artLabelStrings[ARTL_ART_structStatements_70] = "";
    artlhsL[ARTL_ART_structStatements_70] = ARTL_ART_structStatements;
    artSlotInstanceOfs[ARTL_ART_structStatements_70] = ARTL_ART_structStatement;
    artKindOfs[ARTL_ART_structStatements_70] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structStatements_70] = true;
    arteoR_pL[ARTL_ART_structStatements_70] = true;
    artPopD[ARTL_ART_structStatements_70] = true;
    artLabelInternalStrings[ARTL_ART_structStatements_72] = "structStatements ::= . structStatement structStatements ";
    artLabelStrings[ARTL_ART_structStatements_72] = "";
    artlhsL[ARTL_ART_structStatements_72] = ARTL_ART_structStatements;
    artKindOfs[ARTL_ART_structStatements_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_structStatements_74] = "structStatements ::= structStatement . structStatements ";
    artLabelStrings[ARTL_ART_structStatements_74] = "";
    artlhsL[ARTL_ART_structStatements_74] = ARTL_ART_structStatements;
    artSlotInstanceOfs[ARTL_ART_structStatements_74] = ARTL_ART_structStatement;
    artKindOfs[ARTL_ART_structStatements_74] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_structStatements_74] = true;
    artLabelInternalStrings[ARTL_ART_structStatements_76] = "structStatements ::= structStatement structStatements .";
    artLabelStrings[ARTL_ART_structStatements_76] = "";
    artlhsL[ARTL_ART_structStatements_76] = ARTL_ART_structStatements;
    artSlotInstanceOfs[ARTL_ART_structStatements_76] = ARTL_ART_structStatements;
    artKindOfs[ARTL_ART_structStatements_76] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_structStatements_76] = true;
    arteoR_pL[ARTL_ART_structStatements_76] = true;
    artPopD[ARTL_ART_structStatements_76] = true;
  }

  public void artTableInitialiser_ART_subExprA() {
    artLabelInternalStrings[ARTL_ART_subExprA] = "subExprA";
    artLabelStrings[ARTL_ART_subExprA] = "subExprA";
    artKindOfs[ARTL_ART_subExprA] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprA_260] = "subExprA ::= . subExprB ";
    artLabelStrings[ARTL_ART_subExprA_260] = "";
    artlhsL[ARTL_ART_subExprA_260] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_260] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_262] = "subExprA ::= subExprB .";
    artLabelStrings[ARTL_ART_subExprA_262] = "";
    artlhsL[ARTL_ART_subExprA_262] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_262] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_subExprA_262] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_262] = true;
    arteoR_pL[ARTL_ART_subExprA_262] = true;
    artPopD[ARTL_ART_subExprA_262] = true;
    artLabelInternalStrings[ARTL_ART_subExprA_266] = "subExprA ::= . and ";
    artLabelStrings[ARTL_ART_subExprA_266] = "";
    artlhsL[ARTL_ART_subExprA_266] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_266] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_268] = "subExprA ::= and .";
    artLabelStrings[ARTL_ART_subExprA_268] = "";
    artlhsL[ARTL_ART_subExprA_268] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_268] = ARTL_ART_and;
    artKindOfs[ARTL_ART_subExprA_268] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_268] = true;
    arteoR_pL[ARTL_ART_subExprA_268] = true;
    artPopD[ARTL_ART_subExprA_268] = true;
    artLabelInternalStrings[ARTL_ART_subExprA_272] = "subExprA ::= . or ";
    artLabelStrings[ARTL_ART_subExprA_272] = "";
    artlhsL[ARTL_ART_subExprA_272] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_272] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_274] = "subExprA ::= or .";
    artLabelStrings[ARTL_ART_subExprA_274] = "";
    artlhsL[ARTL_ART_subExprA_274] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_274] = ARTL_ART_or;
    artKindOfs[ARTL_ART_subExprA_274] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_274] = true;
    arteoR_pL[ARTL_ART_subExprA_274] = true;
    artPopD[ARTL_ART_subExprA_274] = true;
    artLabelInternalStrings[ARTL_ART_subExprA_278] = "subExprA ::= . gtr ";
    artLabelStrings[ARTL_ART_subExprA_278] = "";
    artlhsL[ARTL_ART_subExprA_278] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_278] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_280] = "subExprA ::= gtr .";
    artLabelStrings[ARTL_ART_subExprA_280] = "";
    artlhsL[ARTL_ART_subExprA_280] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_280] = ARTL_ART_gtr;
    artKindOfs[ARTL_ART_subExprA_280] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_280] = true;
    arteoR_pL[ARTL_ART_subExprA_280] = true;
    artPopD[ARTL_ART_subExprA_280] = true;
    artLabelInternalStrings[ARTL_ART_subExprA_284] = "subExprA ::= . lss ";
    artLabelStrings[ARTL_ART_subExprA_284] = "";
    artlhsL[ARTL_ART_subExprA_284] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_284] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_286] = "subExprA ::= lss .";
    artLabelStrings[ARTL_ART_subExprA_286] = "";
    artlhsL[ARTL_ART_subExprA_286] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_286] = ARTL_ART_lss;
    artKindOfs[ARTL_ART_subExprA_286] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_286] = true;
    arteoR_pL[ARTL_ART_subExprA_286] = true;
    artPopD[ARTL_ART_subExprA_286] = true;
    artLabelInternalStrings[ARTL_ART_subExprA_290] = "subExprA ::= . equ ";
    artLabelStrings[ARTL_ART_subExprA_290] = "";
    artlhsL[ARTL_ART_subExprA_290] = ARTL_ART_subExprA;
    artKindOfs[ARTL_ART_subExprA_290] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprA_292] = "subExprA ::= equ .";
    artLabelStrings[ARTL_ART_subExprA_292] = "";
    artlhsL[ARTL_ART_subExprA_292] = ARTL_ART_subExprA;
    artSlotInstanceOfs[ARTL_ART_subExprA_292] = ARTL_ART_equ;
    artKindOfs[ARTL_ART_subExprA_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprA_292] = true;
    arteoR_pL[ARTL_ART_subExprA_292] = true;
    artPopD[ARTL_ART_subExprA_292] = true;
  }

  public void artTableInitialiser_ART_subExprB() {
    artLabelInternalStrings[ARTL_ART_subExprB] = "subExprB";
    artLabelStrings[ARTL_ART_subExprB] = "subExprB";
    artKindOfs[ARTL_ART_subExprB] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprB_296] = "subExprB ::= . subExprC ";
    artLabelStrings[ARTL_ART_subExprB_296] = "";
    artlhsL[ARTL_ART_subExprB_296] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_subExprB_296] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprB_298] = "subExprB ::= subExprC .";
    artLabelStrings[ARTL_ART_subExprB_298] = "";
    artlhsL[ARTL_ART_subExprB_298] = ARTL_ART_subExprB;
    artSlotInstanceOfs[ARTL_ART_subExprB_298] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_subExprB_298] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprB_298] = true;
    arteoR_pL[ARTL_ART_subExprB_298] = true;
    artPopD[ARTL_ART_subExprB_298] = true;
    artLabelInternalStrings[ARTL_ART_subExprB_302] = "subExprB ::= . plus ";
    artLabelStrings[ARTL_ART_subExprB_302] = "";
    artlhsL[ARTL_ART_subExprB_302] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_subExprB_302] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprB_304] = "subExprB ::= plus .";
    artLabelStrings[ARTL_ART_subExprB_304] = "";
    artlhsL[ARTL_ART_subExprB_304] = ARTL_ART_subExprB;
    artSlotInstanceOfs[ARTL_ART_subExprB_304] = ARTL_ART_plus;
    artKindOfs[ARTL_ART_subExprB_304] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprB_304] = true;
    arteoR_pL[ARTL_ART_subExprB_304] = true;
    artPopD[ARTL_ART_subExprB_304] = true;
    artLabelInternalStrings[ARTL_ART_subExprB_308] = "subExprB ::= . minus ";
    artLabelStrings[ARTL_ART_subExprB_308] = "";
    artlhsL[ARTL_ART_subExprB_308] = ARTL_ART_subExprB;
    artKindOfs[ARTL_ART_subExprB_308] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprB_310] = "subExprB ::= minus .";
    artLabelStrings[ARTL_ART_subExprB_310] = "";
    artlhsL[ARTL_ART_subExprB_310] = ARTL_ART_subExprB;
    artSlotInstanceOfs[ARTL_ART_subExprB_310] = ARTL_ART_minus;
    artKindOfs[ARTL_ART_subExprB_310] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprB_310] = true;
    arteoR_pL[ARTL_ART_subExprB_310] = true;
    artPopD[ARTL_ART_subExprB_310] = true;
  }

  public void artTableInitialiser_ART_subExprC() {
    artLabelInternalStrings[ARTL_ART_subExprC] = "subExprC";
    artLabelStrings[ARTL_ART_subExprC] = "subExprC";
    artKindOfs[ARTL_ART_subExprC] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprC_314] = "subExprC ::= . subExprD ";
    artLabelStrings[ARTL_ART_subExprC_314] = "";
    artlhsL[ARTL_ART_subExprC_314] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_subExprC_314] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprC_316] = "subExprC ::= subExprD .";
    artLabelStrings[ARTL_ART_subExprC_316] = "";
    artlhsL[ARTL_ART_subExprC_316] = ARTL_ART_subExprC;
    artSlotInstanceOfs[ARTL_ART_subExprC_316] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_subExprC_316] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprC_316] = true;
    arteoR_pL[ARTL_ART_subExprC_316] = true;
    artPopD[ARTL_ART_subExprC_316] = true;
    artLabelInternalStrings[ARTL_ART_subExprC_320] = "subExprC ::= . multiply ";
    artLabelStrings[ARTL_ART_subExprC_320] = "";
    artlhsL[ARTL_ART_subExprC_320] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_subExprC_320] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprC_322] = "subExprC ::= multiply .";
    artLabelStrings[ARTL_ART_subExprC_322] = "";
    artlhsL[ARTL_ART_subExprC_322] = ARTL_ART_subExprC;
    artSlotInstanceOfs[ARTL_ART_subExprC_322] = ARTL_ART_multiply;
    artKindOfs[ARTL_ART_subExprC_322] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprC_322] = true;
    arteoR_pL[ARTL_ART_subExprC_322] = true;
    artPopD[ARTL_ART_subExprC_322] = true;
    artLabelInternalStrings[ARTL_ART_subExprC_326] = "subExprC ::= . divide ";
    artLabelStrings[ARTL_ART_subExprC_326] = "";
    artlhsL[ARTL_ART_subExprC_326] = ARTL_ART_subExprC;
    artKindOfs[ARTL_ART_subExprC_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprC_328] = "subExprC ::= divide .";
    artLabelStrings[ARTL_ART_subExprC_328] = "";
    artlhsL[ARTL_ART_subExprC_328] = ARTL_ART_subExprC;
    artSlotInstanceOfs[ARTL_ART_subExprC_328] = ARTL_ART_divide;
    artKindOfs[ARTL_ART_subExprC_328] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprC_328] = true;
    arteoR_pL[ARTL_ART_subExprC_328] = true;
    artPopD[ARTL_ART_subExprC_328] = true;
  }

  public void artTableInitialiser_ART_subExprD() {
    artLabelInternalStrings[ARTL_ART_subExprD] = "subExprD";
    artLabelStrings[ARTL_ART_subExprD] = "subExprD";
    artKindOfs[ARTL_ART_subExprD] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprD_332] = "subExprD ::= . subExprE ";
    artLabelStrings[ARTL_ART_subExprD_332] = "";
    artlhsL[ARTL_ART_subExprD_332] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_subExprD_332] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprD_334] = "subExprD ::= subExprE .";
    artLabelStrings[ARTL_ART_subExprD_334] = "";
    artlhsL[ARTL_ART_subExprD_334] = ARTL_ART_subExprD;
    artSlotInstanceOfs[ARTL_ART_subExprD_334] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_subExprD_334] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprD_334] = true;
    arteoR_pL[ARTL_ART_subExprD_334] = true;
    artPopD[ARTL_ART_subExprD_334] = true;
    artLabelInternalStrings[ARTL_ART_subExprD_338] = "subExprD ::= . exponentiate ";
    artLabelStrings[ARTL_ART_subExprD_338] = "";
    artlhsL[ARTL_ART_subExprD_338] = ARTL_ART_subExprD;
    artKindOfs[ARTL_ART_subExprD_338] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprD_340] = "subExprD ::= exponentiate .";
    artLabelStrings[ARTL_ART_subExprD_340] = "";
    artlhsL[ARTL_ART_subExprD_340] = ARTL_ART_subExprD;
    artSlotInstanceOfs[ARTL_ART_subExprD_340] = ARTL_ART_exponentiate;
    artKindOfs[ARTL_ART_subExprD_340] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprD_340] = true;
    arteoR_pL[ARTL_ART_subExprD_340] = true;
    artPopD[ARTL_ART_subExprD_340] = true;
  }

  public void artTableInitialiser_ART_subExprE() {
    artLabelInternalStrings[ARTL_ART_subExprE] = "subExprE";
    artLabelStrings[ARTL_ART_subExprE] = "subExprE";
    artKindOfs[ARTL_ART_subExprE] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprE_344] = "subExprE ::= . subExprF ";
    artLabelStrings[ARTL_ART_subExprE_344] = "";
    artlhsL[ARTL_ART_subExprE_344] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_subExprE_344] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprE_346] = "subExprE ::= subExprF .";
    artLabelStrings[ARTL_ART_subExprE_346] = "";
    artlhsL[ARTL_ART_subExprE_346] = ARTL_ART_subExprE;
    artSlotInstanceOfs[ARTL_ART_subExprE_346] = ARTL_ART_subExprF;
    artKindOfs[ARTL_ART_subExprE_346] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprE_346] = true;
    arteoR_pL[ARTL_ART_subExprE_346] = true;
    artPopD[ARTL_ART_subExprE_346] = true;
    artLabelInternalStrings[ARTL_ART_subExprE_350] = "subExprE ::= . not ";
    artLabelStrings[ARTL_ART_subExprE_350] = "";
    artlhsL[ARTL_ART_subExprE_350] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_subExprE_350] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprE_352] = "subExprE ::= not .";
    artLabelStrings[ARTL_ART_subExprE_352] = "";
    artlhsL[ARTL_ART_subExprE_352] = ARTL_ART_subExprE;
    artSlotInstanceOfs[ARTL_ART_subExprE_352] = ARTL_ART_not;
    artKindOfs[ARTL_ART_subExprE_352] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprE_352] = true;
    arteoR_pL[ARTL_ART_subExprE_352] = true;
    artPopD[ARTL_ART_subExprE_352] = true;
    artLabelInternalStrings[ARTL_ART_subExprE_356] = "subExprE ::= . negate ";
    artLabelStrings[ARTL_ART_subExprE_356] = "";
    artlhsL[ARTL_ART_subExprE_356] = ARTL_ART_subExprE;
    artKindOfs[ARTL_ART_subExprE_356] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprE_358] = "subExprE ::= negate .";
    artLabelStrings[ARTL_ART_subExprE_358] = "";
    artlhsL[ARTL_ART_subExprE_358] = ARTL_ART_subExprE;
    artSlotInstanceOfs[ARTL_ART_subExprE_358] = ARTL_ART_negate;
    artKindOfs[ARTL_ART_subExprE_358] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprE_358] = true;
    arteoR_pL[ARTL_ART_subExprE_358] = true;
    artPopD[ARTL_ART_subExprE_358] = true;
  }

  public void artTableInitialiser_ART_subExprF() {
    artLabelInternalStrings[ARTL_ART_subExprF] = "subExprF";
    artLabelStrings[ARTL_ART_subExprF] = "subExprF";
    artKindOfs[ARTL_ART_subExprF] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExprF_362] = "subExprF ::= . operand ";
    artLabelStrings[ARTL_ART_subExprF_362] = "";
    artlhsL[ARTL_ART_subExprF_362] = ARTL_ART_subExprF;
    artKindOfs[ARTL_ART_subExprF_362] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExprF_364] = "subExprF ::= operand .";
    artLabelStrings[ARTL_ART_subExprF_364] = "";
    artlhsL[ARTL_ART_subExprF_364] = ARTL_ART_subExprF;
    artSlotInstanceOfs[ARTL_ART_subExprF_364] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExprF_364] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExprF_364] = true;
    arteoR_pL[ARTL_ART_subExprF_364] = true;
    artPopD[ARTL_ART_subExprF_364] = true;
  }

  public void artTableInitialiser_ART_sysline() {
    artLabelInternalStrings[ARTL_ART_sysline] = "sysline";
    artLabelStrings[ARTL_ART_sysline] = "sysline";
    artKindOfs[ARTL_ART_sysline] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sysline_224] = "sysline ::= . 'sysline'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_224] = "";
    artlhsL[ARTL_ART_sysline_224] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_sysline_224] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sysline_225] = "sysline ::= 'sysline'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_225] = "";
    artlhsL[ARTL_ART_sysline_225] = ARTL_ART_sysline;
    artLabelInternalStrings[ARTL_ART_sysline_226] = "sysline ::= 'sysline'  . '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_226] = "";
    artlhsL[ARTL_ART_sysline_226] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_sysline_226] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sysline_226] = true;
    artLabelInternalStrings[ARTL_ART_sysline_227] = "sysline ::= 'sysline'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_227] = "";
    artlhsL[ARTL_ART_sysline_227] = ARTL_ART_sysline;
    artLabelInternalStrings[ARTL_ART_sysline_228] = "sysline ::= 'sysline'  '('  . mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_228] = "";
    artlhsL[ARTL_ART_sysline_228] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_sysline_228] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sysline_230] = "sysline ::= 'sysline'  '('  mainExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_230] = "";
    artlhsL[ARTL_ART_sysline_230] = ARTL_ART_sysline;
    artSlotInstanceOfs[ARTL_ART_sysline_230] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_sysline_230] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sysline_230] = true;
    artLabelInternalStrings[ARTL_ART_sysline_231] = "sysline ::= 'sysline'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_231] = "";
    artlhsL[ARTL_ART_sysline_231] = ARTL_ART_sysline;
    artPopD[ARTL_ART_sysline_231] = true;
    artLabelInternalStrings[ARTL_ART_sysline_232] = "sysline ::= 'sysline'  '('  mainExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_sysline_232] = "";
    artlhsL[ARTL_ART_sysline_232] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_sysline_232] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sysline_232] = true;
    artLabelInternalStrings[ARTL_ART_sysline_235] = "sysline ::= 'sysline'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysline_235] = "";
    artlhsL[ARTL_ART_sysline_235] = ARTL_ART_sysline;
    artPopD[ARTL_ART_sysline_235] = true;
    artLabelInternalStrings[ARTL_ART_sysline_236] = "sysline ::= 'sysline'  '('  mainExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_sysline_236] = "";
    artlhsL[ARTL_ART_sysline_236] = ARTL_ART_sysline;
    artKindOfs[ARTL_ART_sysline_236] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sysline_236] = true;
    arteoR_pL[ARTL_ART_sysline_236] = true;
    artPopD[ARTL_ART_sysline_236] = true;
  }

  public void artTableInitialiser_ART_sysout() {
    artLabelInternalStrings[ARTL_ART_sysout] = "sysout";
    artLabelStrings[ARTL_ART_sysout] = "sysout";
    artKindOfs[ARTL_ART_sysout] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sysout_210] = "sysout ::= . 'sysout'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_210] = "";
    artlhsL[ARTL_ART_sysout_210] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_sysout_210] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sysout_211] = "sysout ::= 'sysout'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_211] = "";
    artlhsL[ARTL_ART_sysout_211] = ARTL_ART_sysout;
    artLabelInternalStrings[ARTL_ART_sysout_212] = "sysout ::= 'sysout'  . '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_212] = "";
    artlhsL[ARTL_ART_sysout_212] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_sysout_212] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sysout_212] = true;
    artLabelInternalStrings[ARTL_ART_sysout_213] = "sysout ::= 'sysout'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_213] = "";
    artlhsL[ARTL_ART_sysout_213] = ARTL_ART_sysout;
    artLabelInternalStrings[ARTL_ART_sysout_214] = "sysout ::= 'sysout'  '('  . mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_214] = "";
    artlhsL[ARTL_ART_sysout_214] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_sysout_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sysout_216] = "sysout ::= 'sysout'  '('  mainExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_216] = "";
    artlhsL[ARTL_ART_sysout_216] = ARTL_ART_sysout;
    artSlotInstanceOfs[ARTL_ART_sysout_216] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_sysout_216] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sysout_216] = true;
    artLabelInternalStrings[ARTL_ART_sysout_217] = "sysout ::= 'sysout'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_217] = "";
    artlhsL[ARTL_ART_sysout_217] = ARTL_ART_sysout;
    artPopD[ARTL_ART_sysout_217] = true;
    artLabelInternalStrings[ARTL_ART_sysout_218] = "sysout ::= 'sysout'  '('  mainExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_sysout_218] = "";
    artlhsL[ARTL_ART_sysout_218] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_sysout_218] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sysout_218] = true;
    artLabelInternalStrings[ARTL_ART_sysout_221] = "sysout ::= 'sysout'  '('  mainExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_sysout_221] = "";
    artlhsL[ARTL_ART_sysout_221] = ARTL_ART_sysout;
    artPopD[ARTL_ART_sysout_221] = true;
    artLabelInternalStrings[ARTL_ART_sysout_222] = "sysout ::= 'sysout'  '('  mainExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_sysout_222] = "";
    artlhsL[ARTL_ART_sysout_222] = ARTL_ART_sysout;
    artKindOfs[ARTL_ART_sysout_222] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sysout_222] = true;
    arteoR_pL[ARTL_ART_sysout_222] = true;
    artPopD[ARTL_ART_sysout_222] = true;
  }

  public void artTableInitialiser_ART_untilExpr() {
    artLabelInternalStrings[ARTL_ART_untilExpr] = "untilExpr";
    artLabelStrings[ARTL_ART_untilExpr] = "untilExpr";
    artKindOfs[ARTL_ART_untilExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_untilExpr_186] = "untilExpr ::= . 'until'  mainExpr ";
    artLabelStrings[ARTL_ART_untilExpr_186] = "";
    artlhsL[ARTL_ART_untilExpr_186] = ARTL_ART_untilExpr;
    artKindOfs[ARTL_ART_untilExpr_186] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_untilExpr_187] = "untilExpr ::= 'until'  mainExpr ";
    artLabelStrings[ARTL_ART_untilExpr_187] = "";
    artlhsL[ARTL_ART_untilExpr_187] = ARTL_ART_untilExpr;
    artLabelInternalStrings[ARTL_ART_untilExpr_188] = "untilExpr ::= 'until'  . mainExpr ";
    artLabelStrings[ARTL_ART_untilExpr_188] = "";
    artlhsL[ARTL_ART_untilExpr_188] = ARTL_ART_untilExpr;
    artKindOfs[ARTL_ART_untilExpr_188] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_untilExpr_188] = true;
    artLabelInternalStrings[ARTL_ART_untilExpr_190] = "untilExpr ::= 'until'  mainExpr .";
    artLabelStrings[ARTL_ART_untilExpr_190] = "";
    artlhsL[ARTL_ART_untilExpr_190] = ARTL_ART_untilExpr;
    artSlotInstanceOfs[ARTL_ART_untilExpr_190] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_untilExpr_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_untilExpr_190] = true;
    arteoR_pL[ARTL_ART_untilExpr_190] = true;
    artPopD[ARTL_ART_untilExpr_190] = true;
  }

  public void artTableInitialiser_ART_whileExpr() {
    artLabelInternalStrings[ARTL_ART_whileExpr] = "whileExpr";
    artLabelStrings[ARTL_ART_whileExpr] = "whileExpr";
    artKindOfs[ARTL_ART_whileExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_whileExpr_178] = "whileExpr ::= . 'while'  mainExpr ";
    artLabelStrings[ARTL_ART_whileExpr_178] = "";
    artlhsL[ARTL_ART_whileExpr_178] = ARTL_ART_whileExpr;
    artKindOfs[ARTL_ART_whileExpr_178] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_whileExpr_179] = "whileExpr ::= 'while'  mainExpr ";
    artLabelStrings[ARTL_ART_whileExpr_179] = "";
    artlhsL[ARTL_ART_whileExpr_179] = ARTL_ART_whileExpr;
    artLabelInternalStrings[ARTL_ART_whileExpr_180] = "whileExpr ::= 'while'  . mainExpr ";
    artLabelStrings[ARTL_ART_whileExpr_180] = "";
    artlhsL[ARTL_ART_whileExpr_180] = ARTL_ART_whileExpr;
    artKindOfs[ARTL_ART_whileExpr_180] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_whileExpr_180] = true;
    artLabelInternalStrings[ARTL_ART_whileExpr_182] = "whileExpr ::= 'while'  mainExpr .";
    artLabelStrings[ARTL_ART_whileExpr_182] = "";
    artlhsL[ARTL_ART_whileExpr_182] = ARTL_ART_whileExpr;
    artSlotInstanceOfs[ARTL_ART_whileExpr_182] = ARTL_ART_mainExpr;
    artKindOfs[ARTL_ART_whileExpr_182] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_whileExpr_182] = true;
    arteoR_pL[ARTL_ART_whileExpr_182] = true;
    artPopD[ARTL_ART_whileExpr_182] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artShorter = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_REAL] = "REAL";
    artLabelInternalStrings[ARTTB_REAL] = "&REAL";
    artKindOfs[ARTTB_REAL] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_REAL] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTS__SHREIK] = "!";
    artLabelInternalStrings[ARTTS__SHREIK] = "'!'";
    artKindOfs[ARTTS__SHREIK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK] = true;
    artLabelStrings[ARTTS__AMPERSAND_AMPERSAND] = "&&";
    artLabelInternalStrings[ARTTS__AMPERSAND_AMPERSAND] = "'&&'";
    artKindOfs[ARTTS__AMPERSAND_AMPERSAND] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSAND_AMPERSAND] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__STAR] = "*";
    artLabelInternalStrings[ARTTS__STAR] = "'*'";
    artKindOfs[ARTTS__STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR] = true;
    artLabelStrings[ARTTS__STAR_STAR] = "**";
    artLabelInternalStrings[ARTTS__STAR_STAR] = "'**'";
    artKindOfs[ARTTS__STAR_STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR_STAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__PLUS_EQUAL] = "+=";
    artLabelInternalStrings[ARTTS__PLUS_EQUAL] = "'+='";
    artKindOfs[ARTTS__PLUS_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS_EQUAL] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__MINUS_EQUAL] = "-=";
    artLabelInternalStrings[ARTTS__MINUS_EQUAL] = "'-='";
    artKindOfs[ARTTS__MINUS_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS_EQUAL] = true;
    artLabelStrings[ARTTS__PERIOD] = ".";
    artLabelInternalStrings[ARTTS__PERIOD] = "'.'";
    artKindOfs[ARTTS__PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD] = true;
    artLabelStrings[ARTTS__SLASH] = "/";
    artLabelInternalStrings[ARTTS__SLASH] = "'/'";
    artKindOfs[ARTTS__SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH] = true;
    artLabelStrings[ARTTS__COLON] = ":";
    artLabelInternalStrings[ARTTS__COLON] = "':'";
    artKindOfs[ARTTS__COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__LT_MINUS] = "<-";
    artLabelInternalStrings[ARTTS__LT_MINUS] = "'<-'";
    artKindOfs[ARTTS__LT_MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_MINUS] = true;
    artLabelStrings[ARTTS__EQUAL] = "=";
    artLabelInternalStrings[ARTTS__EQUAL] = "'='";
    artKindOfs[ARTTS__EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL_EQUAL] = "==";
    artLabelInternalStrings[ARTTS__EQUAL_EQUAL] = "'=='";
    artKindOfs[ARTTS__EQUAL_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS_elif] = "elif";
    artLabelInternalStrings[ARTTS_elif] = "'elif'";
    artKindOfs[ARTTS_elif] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_elif] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_false] = "false";
    artLabelInternalStrings[ARTTS_false] = "'false'";
    artKindOfs[ARTTS_false] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_false] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_struct] = "struct";
    artLabelInternalStrings[ARTTS_struct] = "'struct'";
    artKindOfs[ARTTS_struct] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_struct] = true;
    artLabelStrings[ARTTS_sysline] = "sysline";
    artLabelInternalStrings[ARTTS_sysline] = "'sysline'";
    artKindOfs[ARTTS_sysline] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_sysline] = true;
    artLabelStrings[ARTTS_sysout] = "sysout";
    artLabelInternalStrings[ARTTS_sysout] = "'sysout'";
    artKindOfs[ARTTS_sysout] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_sysout] = true;
    artLabelStrings[ARTTS_true] = "true";
    artLabelInternalStrings[ARTTS_true] = "'true'";
    artKindOfs[ARTTS_true] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_true] = true;
    artLabelStrings[ARTTS_until] = "until";
    artLabelInternalStrings[ARTTS_until] = "'until'";
    artKindOfs[ARTTS_until] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_until] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__BAR_BAR] = "||";
    artLabelInternalStrings[ARTTS__BAR_BAR] = "'||'";
    artKindOfs[ARTTS__BAR_BAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__BAR_BAR] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artTableInitialiser_ART_AID();
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_and();
    artTableInitialiser_ART_arg();
    artTableInitialiser_ART_argNote();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_compStatements();
    artTableInitialiser_ART_condStatement();
    artTableInitialiser_ART_defStruct();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_divide();
    artTableInitialiser_ART_elifExpr();
    artTableInitialiser_ART_equ();
    artTableInitialiser_ART_exponentiate();
    artTableInitialiser_ART_gtr();
    artTableInitialiser_ART_ifExpr();
    artTableInitialiser_ART_loopStatement();
    artTableInitialiser_ART_lss();
    artTableInitialiser_ART_mainExpr();
    artTableInitialiser_ART_memberAssign();
    artTableInitialiser_ART_minus();
    artTableInitialiser_ART_minusEquals();
    artTableInitialiser_ART_multiply();
    artTableInitialiser_ART_negate();
    artTableInitialiser_ART_not();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_or();
    artTableInitialiser_ART_plus();
    artTableInitialiser_ART_plusEquals();
    artTableInitialiser_ART_scopeEnter();
    artTableInitialiser_ART_scopeLeave();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_statements();
    artTableInitialiser_ART_structArgs();
    artTableInitialiser_ART_structAssign();
    artTableInitialiser_ART_structDefinition();
    artTableInitialiser_ART_structStatement();
    artTableInitialiser_ART_structStatements();
    artTableInitialiser_ART_subExprA();
    artTableInitialiser_ART_subExprB();
    artTableInitialiser_ART_subExprC();
    artTableInitialiser_ART_subExprD();
    artTableInitialiser_ART_subExprE();
    artTableInitialiser_ART_subExprF();
    artTableInitialiser_ART_sysline();
    artTableInitialiser_ART_sysout();
    artTableInitialiser_ART_untilExpr();
    artTableInitialiser_ART_whileExpr();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 90;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statements;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
 
	final String NO_ARG = "|__FJNOARG__|";
	// Helper classes: FJ.java
	STable symbols = new STable();

  public static class ARTAT_ART_AID extends ARTGLLAttributeBlock {
    public String v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle ID2;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public int v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_REAL extends ARTGLLAttributeBlock {
    public Double v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_STRING_DQ extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_and extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprA1;
    ARTGLLRDTHandle subExprA2;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_arg extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprA1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_compStatements extends ARTGLLAttributeBlock {
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_condStatement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle compStatements1;
    ARTGLLRDTHandle compStatements2;
    ARTGLLRDTHandle elifExpr1;
    ARTGLLRDTHandle elifExpr2;
    ARTGLLRDTHandle ifExpr1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_deref extends ARTGLLAttributeBlock {
    public String v;
    ARTGLLRDTHandle AID1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_divide extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprC1;
    ARTGLLRDTHandle subExprD1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_elifExpr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle mainExpr1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_equ extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprB1;
    ARTGLLRDTHandle subExprB2;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_exponentiate extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprD1;
    ARTGLLRDTHandle subExprE1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_gtr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprB1;
    ARTGLLRDTHandle subExprB2;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_ifExpr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle mainExpr1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_loopStatement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle compStatements1;
    ARTGLLRDTHandle untilExpr1;
    ARTGLLRDTHandle whileExpr1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_lss extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprB1;
    ARTGLLRDTHandle subExprB2;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_mainExpr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprA1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_minus extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprB1;
    ARTGLLRDTHandle subExprC1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_minusEquals extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle AID1;
    ARTGLLRDTHandle subExprC1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_multiply extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprC1;
    ARTGLLRDTHandle subExprD1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_negate extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprE1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_not extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprE1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_operand extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle REAL1;
    ARTGLLRDTHandle STRING_DQ1;
    ARTGLLRDTHandle deref1;
    ARTGLLRDTHandle mainExpr1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_or extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprA1;
    ARTGLLRDTHandle subExprA2;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_plus extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle subExprB1;
    ARTGLLRDTHandle subExprC1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_plusEquals extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle AID1;
    ARTGLLRDTHandle subExprC1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_structArgs extends ARTGLLAttributeBlock {
    public int c;
    ARTGLLRDTHandle arg1;
    ARTGLLRDTHandle structArgs1;
    public String toString() {
      String ret = "";
    ret += " c=" + c;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprA extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle and1;
    ARTGLLRDTHandle equ1;
    ARTGLLRDTHandle gtr1;
    ARTGLLRDTHandle lss1;
    ARTGLLRDTHandle or1;
    ARTGLLRDTHandle subExprB1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprB extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle minus1;
    ARTGLLRDTHandle plus1;
    ARTGLLRDTHandle subExprC1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprC extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle divide1;
    ARTGLLRDTHandle multiply1;
    ARTGLLRDTHandle subExprD1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprD extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle exponentiate1;
    ARTGLLRDTHandle subExprE1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprE extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle negate1;
    ARTGLLRDTHandle not1;
    ARTGLLRDTHandle subExprF1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExprF extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle operand1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_untilExpr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle mainExpr1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public static class ARTAT_ART_whileExpr extends ARTGLLAttributeBlock {
    public Object o;
    ARTGLLRDTHandle mainExpr1;
    public String toString() {
      String ret = "";
    ret += " o=" + o;
      return ret + " ";
}
  }

  public void ARTRD_AID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_AID AID, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*AID ::= ID .*/
      case ARTL_ART_AID_654: 
        ID1 = new ARTAT_ART_ID();
        ID2 = new ARTAT_ART_ID();
                ARTRD_AID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID, ID1, ID2);
        ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
        ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
        ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
         AID.v = ID1.v; 
        break;
      /*AID ::= ID '.'  . ID */
      case ARTL_ART_AID_662: 
        ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
        ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
        ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
                break;
      /*AID ::= ID '.'  ID .*/
      case ARTL_ART_AID_664: 
        ID1 = new ARTAT_ART_ID();
        ID2 = new ARTAT_ART_ID();
                ARTRD_AID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID, ID1, ID2);
        ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
        ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
        ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
         AID.v = ID1.v + '.' + ID2.v; 
        break;
        default:
          throw new ARTException("ARTRD_AID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ID ::= &ID  .*/
    case ARTL_ART_ID_670: 
            ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); ID.v = artLexemeAsID(ID.leftExtent, ID.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER  .*/
    case ARTL_ART_INTEGER_676: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_REAL(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*REAL ::= &REAL  .*/
    case ARTL_ART_REAL_682: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent); REAL.v = artLexemeAsReal(REAL.leftExtent, REAL.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_REAL: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_STRING_DQ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*STRING_DQ ::= &STRING_DQ  .*/
    case ARTL_ART_STRING_DQ_688: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent); STRING_DQ.v = artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_and(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_and and, ARTAT_ART_subExprA subExprA1, ARTAT_ART_subExprA subExprA2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*and ::= subExprA '&&'  . subExprA */
    case ARTL_ART_and_580: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*and ::= subExprA '&&'  subExprA .*/
    case ARTL_ART_and_582: 
      subExprA1 = new ARTAT_ART_subExprA();
      subExprA2 = new ARTAT_ART_subExprA();
            ARTRD_and(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, and, subExprA1, subExprA2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprA2));
      ARTRD_subExprA(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprA2, null, null, null, null, null, null);
       and.o = (FJ.bv(subExprA1.o)
			&& FJ.bv(subExprA2.o)); 
      break;
        default:
          throw new ARTException("ARTRD_and: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_arg(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_arg arg, ARTAT_ART_subExprA subExprA1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*arg ::= # .*/
    case ARTL_ART_arg_464: 
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_arg(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, arg, subExprA1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       arg.o = NO_ARG; 
      break;
    /*arg ::= subExprA argNote .*/
    case ARTL_ART_arg_472: 
      subExprA1 = new ARTAT_ART_subExprA();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_argNote(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
       arg.o = subExprA1.o; FJArgStack.incrArgCount(); 
      break;
        default:
          throw new ARTException("ARTRD_arg: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_argNote(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*argNote ::= ':'  ID .*/
    case ARTL_ART_argNote_480: 
      ID1 = new ARTAT_ART_ID();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*argNote ::= # .*/
    case ARTL_ART_argNote_484: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_argNote(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_argNote: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_assign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_AID AID1, ARTAT_ART_minusEquals minusEquals1, ARTAT_ART_plusEquals plusEquals1, ARTAT_ART_subExprA subExprA1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*assign ::= AID '='  . subExprA ';'  */
    case ARTL_ART_assign_402: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AID1));
      ARTRD_AID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AID1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*assign ::= AID '='  subExprA . ';'  */
    case ARTL_ART_assign_404: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID1, minusEquals1, plusEquals1, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
            break;
    /*assign ::= AID '='  subExprA ';'  .*/
    case ARTL_ART_assign_406: 
      AID1 = new ARTAT_ART_AID();
      minusEquals1 = new ARTAT_ART_minusEquals();
      plusEquals1 = new ARTAT_ART_plusEquals();
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID1, minusEquals1, plusEquals1, subExprA1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       symbols.put(AID1.v, subExprA1.o); 
      break;
    /*assign ::= structAssign .*/
    case ARTL_ART_assign_412: 
      AID1 = new ARTAT_ART_AID();
      minusEquals1 = new ARTAT_ART_minusEquals();
      plusEquals1 = new ARTAT_ART_plusEquals();
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID1, minusEquals1, plusEquals1, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_structAssign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*assign ::= plusEquals .*/
    case ARTL_ART_assign_416: 
      AID1 = new ARTAT_ART_AID();
      minusEquals1 = new ARTAT_ART_minusEquals();
      plusEquals1 = new ARTAT_ART_plusEquals();
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID1, minusEquals1, plusEquals1, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), plusEquals1));
      ARTRD_plusEquals(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, plusEquals1, null, null);
            break;
    /*assign ::= minusEquals .*/
    case ARTL_ART_assign_420: 
      AID1 = new ARTAT_ART_AID();
      minusEquals1 = new ARTAT_ART_minusEquals();
      plusEquals1 = new ARTAT_ART_plusEquals();
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AID1, minusEquals1, plusEquals1, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), minusEquals1));
      ARTRD_minusEquals(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, minusEquals1, null, null);
            break;
        default:
          throw new ARTException("ARTRD_assign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_compStatements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*compStatements ::= scopeEnter statements . scopeLeave */
    case ARTL_ART_compStatements_16: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_scopeEnter(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*compStatements ::= scopeEnter statements scopeLeave .*/
    case ARTL_ART_compStatements_18: 
            ARTRD_compStatements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_scopeLeave(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*compStatements ::= statement .*/
    case ARTL_ART_compStatements_24: 
       symbols.newScope(); 
      ARTRD_compStatements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
       symbols.oldScope(); 
      break;
        default:
          throw new ARTException("ARTRD_compStatements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_condStatement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_condStatement condStatement, ARTAT_ART_compStatements compStatements1, ARTAT_ART_compStatements compStatements2, ARTAT_ART_elifExpr elifExpr1, ARTAT_ART_elifExpr elifExpr2, ARTAT_ART_ifExpr ifExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*condStatement ::= ifExpr compStatements .*/
    case ARTL_ART_condStatement_126: 
      compStatements1 = new ARTAT_ART_compStatements();
      compStatements2 = new ARTAT_ART_compStatements();
      elifExpr1 = new ARTAT_ART_elifExpr();
      elifExpr2 = new ARTAT_ART_elifExpr();
      ifExpr1 = new ARTAT_ART_ifExpr();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ifExpr1));
      ARTRD_ifExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ifExpr1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      	if (FJ.bv(ifExpr1.o) == true) {
				artEvaluate(condStatement.compStatements1, compStatements1); 
			}
		
      break;
    /*condStatement ::= ifExpr compStatements . elifExpr compStatements */
    case ARTL_ART_condStatement_134: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ifExpr1));
      ARTRD_ifExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ifExpr1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*condStatement ::= ifExpr compStatements elifExpr . compStatements */
    case ARTL_ART_condStatement_136: 
      ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), elifExpr1));
      ARTRD_elifExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, elifExpr1, null);
            break;
    /*condStatement ::= ifExpr compStatements elifExpr compStatements .*/
    case ARTL_ART_condStatement_138: 
      compStatements1 = new ARTAT_ART_compStatements();
      compStatements2 = new ARTAT_ART_compStatements();
      elifExpr1 = new ARTAT_ART_elifExpr();
      elifExpr2 = new ARTAT_ART_elifExpr();
      ifExpr1 = new ARTAT_ART_ifExpr();
            ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       if (FJ.bv(ifExpr1.o) == true) {
			artEvaluate(condStatement.compStatements1, compStatements1); 
			}
		  else if (FJ.bv(elifExpr1.o)== true){
			artEvaluate(condStatement.compStatements2, compStatements2);  
		  }
		
      break;
    /*condStatement ::= elifExpr compStatements . elifExpr compStatements */
    case ARTL_ART_condStatement_146: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), elifExpr1));
      ARTRD_elifExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, elifExpr1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*condStatement ::= elifExpr compStatements elifExpr . compStatements */
    case ARTL_ART_condStatement_148: 
      ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), elifExpr2));
      ARTRD_elifExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, elifExpr2, null);
            break;
    /*condStatement ::= elifExpr compStatements elifExpr compStatements .*/
    case ARTL_ART_condStatement_150: 
      compStatements1 = new ARTAT_ART_compStatements();
      compStatements2 = new ARTAT_ART_compStatements();
      elifExpr1 = new ARTAT_ART_elifExpr();
      elifExpr2 = new ARTAT_ART_elifExpr();
      ifExpr1 = new ARTAT_ART_ifExpr();
            ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      	
			if (FJ.bv(elifExpr1.o) == false && FJ.bv(elifExpr2.o) == true) {
				artEvaluate(condStatement.compStatements2, compStatements2); 
			}
		
      break;
    /*condStatement ::= ifExpr compStatements . 'else'  compStatements */
    case ARTL_ART_condStatement_158: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ifExpr1));
      ARTRD_ifExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ifExpr1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*condStatement ::= ifExpr compStatements 'else'  . compStatements */
    case ARTL_ART_condStatement_160: 
      ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condStatement ::= ifExpr compStatements 'else'  compStatements .*/
    case ARTL_ART_condStatement_162: 
      compStatements1 = new ARTAT_ART_compStatements();
      compStatements2 = new ARTAT_ART_compStatements();
      elifExpr1 = new ARTAT_ART_elifExpr();
      elifExpr2 = new ARTAT_ART_elifExpr();
      ifExpr1 = new ARTAT_ART_ifExpr();
            ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
			if (FJ.bv(ifExpr1.o) == false) {
				artEvaluate(condStatement.compStatements2, compStatements2);
			} else {
				artEvaluate(condStatement.compStatements1, compStatements1);
			}
		
      break;
    /*condStatement ::= elifExpr compStatements . 'else'  compStatements */
    case ARTL_ART_condStatement_170: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), elifExpr1));
      ARTRD_elifExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, elifExpr1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*condStatement ::= elifExpr compStatements 'else'  . compStatements */
    case ARTL_ART_condStatement_172: 
      ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condStatement ::= elifExpr compStatements 'else'  compStatements .*/
    case ARTL_ART_condStatement_174: 
      compStatements1 = new ARTAT_ART_compStatements();
      compStatements2 = new ARTAT_ART_compStatements();
      elifExpr1 = new ARTAT_ART_elifExpr();
      elifExpr2 = new ARTAT_ART_elifExpr();
      ifExpr1 = new ARTAT_ART_ifExpr();
            ARTRD_condStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement, compStatements1, compStatements2, elifExpr1, elifExpr2, ifExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      condStatement.compStatements2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
			if (FJ.bv(elifExpr1.o) == false) {
				artEvaluate(condStatement.compStatements2, compStatements2);
			}
		
      break;
        default:
          throw new ARTException("ARTRD_condStatement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_defStruct(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*defStruct ::= 'struct'  ID . structDefinition */
    case ARTL_ART_defStruct_98: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      	try { 
				FJ.declareStruct(ID1.v);
			} catch (Exception FJException) {
				System.err.println(FJException);
			} finally {
				FJArgStack.push();
			}
			FJArgStack.setCurType(ID1.v);
		
      break;
    /*defStruct ::= 'struct'  ID structDefinition .*/
    case ARTL_ART_defStruct_102: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_defStruct(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_structDefinition(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       FJArgStack.pop(); 
      break;
        default:
          throw new ARTException("ARTRD_defStruct: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_deref(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_deref deref, ARTAT_ART_AID AID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*deref ::= AID .*/
    case ARTL_ART_deref_648: 
      AID1 = new ARTAT_ART_AID();
            ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, deref, AID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AID1));
      ARTRD_AID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AID1, null, null);
       deref.v = AID1.v; 
      break;
        default:
          throw new ARTException("ARTRD_deref: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_divide(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_divide divide, ARTAT_ART_subExprC subExprC1, ARTAT_ART_subExprD subExprD1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*divide ::= subExprC '/'  . subExprD */
    case ARTL_ART_divide_544: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*divide ::= subExprC '/'  subExprD .*/
    case ARTL_ART_divide_546: 
      subExprC1 = new ARTAT_ART_subExprC();
      subExprD1 = new ARTAT_ART_subExprD();
            ARTRD_divide(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, divide, subExprC1, subExprD1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprD1));
      ARTRD_subExprD(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprD1, null, null);
       divide.o = FJ.divide(subExprC1.o, subExprD1.o); 
      break;
        default:
          throw new ARTException("ARTRD_divide: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_elifExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_elifExpr elifExpr, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*elifExpr ::= 'elif'  mainExpr .*/
    case ARTL_ART_elifExpr_206: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
       elifExpr.o = mainExpr1.o; 
      break;
        default:
          throw new ARTException("ARTRD_elifExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_equ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_equ equ, ARTAT_ART_subExprB subExprB1, ARTAT_ART_subExprB subExprB2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*equ ::= subExprB '=='  . subExprB */
    case ARTL_ART_equ_372: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*equ ::= subExprB '=='  subExprB .*/
    case ARTL_ART_equ_374: 
      subExprB1 = new ARTAT_ART_subExprB();
      subExprB2 = new ARTAT_ART_subExprB();
            ARTRD_equ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, equ, subExprB1, subExprB2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprB2));
      ARTRD_subExprB(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprB2, null, null, null);
       equ.o = FJ.equ(subExprB1.o, subExprB2.o); 
      break;
        default:
          throw new ARTException("ARTRD_equ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_exponentiate(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_exponentiate exponentiate, ARTAT_ART_subExprD subExprD1, ARTAT_ART_subExprE subExprE1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*exponentiate ::= subExprE '**'  . subExprD */
    case ARTL_ART_exponentiate_554: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprE1));
      ARTRD_subExprE(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprE1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*exponentiate ::= subExprE '**'  subExprD .*/
    case ARTL_ART_exponentiate_556: 
      subExprD1 = new ARTAT_ART_subExprD();
      subExprE1 = new ARTAT_ART_subExprE();
            ARTRD_exponentiate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, exponentiate, subExprD1, subExprE1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprD1));
      ARTRD_subExprD(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprD1, null, null);
       exponentiate.o = FJ.exponentiate(subExprE1.o, subExprD1.o); 
      break;
        default:
          throw new ARTException("ARTRD_exponentiate: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_gtr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_gtr gtr, ARTAT_ART_subExprB subExprB1, ARTAT_ART_subExprB subExprB2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*gtr ::= subExprB '>'  . subExprB */
    case ARTL_ART_gtr_382: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*gtr ::= subExprB '>'  subExprB .*/
    case ARTL_ART_gtr_384: 
      subExprB1 = new ARTAT_ART_subExprB();
      subExprB2 = new ARTAT_ART_subExprB();
            ARTRD_gtr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, gtr, subExprB1, subExprB2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprB2));
      ARTRD_subExprB(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprB2, null, null, null);
       gtr.o = FJ.gtr(subExprB1.o, subExprB2.o); 
      break;
        default:
          throw new ARTException("ARTRD_gtr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ifExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ifExpr ifExpr, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ifExpr ::= 'if'  mainExpr .*/
    case ARTL_ART_ifExpr_198: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
       ifExpr.o = mainExpr1.o; 
      break;
        default:
          throw new ARTException("ARTRD_ifExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_loopStatement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_loopStatement loopStatement, ARTAT_ART_compStatements compStatements1, ARTAT_ART_untilExpr untilExpr1, ARTAT_ART_whileExpr whileExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*loopStatement ::= whileExpr compStatements .*/
    case ARTL_ART_loopStatement_110: 
      compStatements1 = new ARTAT_ART_compStatements();
      untilExpr1 = new ARTAT_ART_untilExpr();
      whileExpr1 = new ARTAT_ART_whileExpr();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), whileExpr1));
      loopStatement.whileExpr1 = new ARTGLLRDTHandle(artSPPFPackedNodeLeftChild(artPackedNode));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      loopStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      	artEvaluate(
					loopStatement.whileExpr1, whileExpr1);
			while (FJ.bv(whileExpr1.o) == true) { 
				artEvaluate(
					loopStatement.compStatements1, compStatements1); 
                artEvaluate(
					loopStatement.whileExpr1, whileExpr1); 
            }
		
      break;
    /*loopStatement ::= untilExpr compStatements .*/
    case ARTL_ART_loopStatement_118: 
      compStatements1 = new ARTAT_ART_compStatements();
      untilExpr1 = new ARTAT_ART_untilExpr();
      whileExpr1 = new ARTAT_ART_whileExpr();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), untilExpr1));
      loopStatement.untilExpr1 = new ARTGLLRDTHandle(artSPPFPackedNodeLeftChild(artPackedNode));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      loopStatement.compStatements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      	artEvaluate(
					loopStatement.untilExpr1, untilExpr1);
			while (FJ.bv(untilExpr1.o) == false) { 
				artEvaluate(
					loopStatement.compStatements1, compStatements1); 
                artEvaluate(
					loopStatement.untilExpr1, untilExpr1); 
            }
		
      break;
        default:
          throw new ARTException("ARTRD_loopStatement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_lss(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_lss lss, ARTAT_ART_subExprB subExprB1, ARTAT_ART_subExprB subExprB2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*lss ::= subExprB '<'  . subExprB */
    case ARTL_ART_lss_392: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*lss ::= subExprB '<'  subExprB .*/
    case ARTL_ART_lss_394: 
      subExprB1 = new ARTAT_ART_subExprB();
      subExprB2 = new ARTAT_ART_subExprB();
            ARTRD_lss(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, lss, subExprB1, subExprB2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprB2));
      ARTRD_subExprB(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprB2, null, null, null);
       lss.o = FJ.lss(subExprB1.o, subExprB2.o); 
      break;
        default:
          throw new ARTException("ARTRD_lss: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_mainExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_mainExpr mainExpr, ARTAT_ART_subExprA subExprA1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*mainExpr ::= assign .*/
    case ARTL_ART_mainExpr_252: 
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_mainExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_assign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*mainExpr ::= subExprA .*/
    case ARTL_ART_mainExpr_256: 
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_mainExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
       mainExpr.o = subExprA1.o; 
      break;
        default:
          throw new ARTException("ARTRD_mainExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_memberAssign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1, ARTAT_ART_subExprA subExprA1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*memberAssign ::= ID '='  . subExprA ';'  */
    case ARTL_ART_memberAssign_242: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*memberAssign ::= ID '='  subExprA . ';'  */
    case ARTL_ART_memberAssign_244: 
      ARTRD_memberAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, subExprA1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
            break;
    /*memberAssign ::= ID '='  subExprA ';'  .*/
    case ARTL_ART_memberAssign_246: 
      ID1 = new ARTAT_ART_ID();
      subExprA1 = new ARTAT_ART_subExprA();
            ARTRD_memberAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, subExprA1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       FJ.addMember(FJArgStack.getCurType(), ID1.v, subExprA1.o); 
      break;
        default:
          throw new ARTException("ARTRD_memberAssign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_minus(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_minus minus, ARTAT_ART_subExprB subExprB1, ARTAT_ART_subExprC subExprC1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*minus ::= subExprB '-'  . subExprC */
    case ARTL_ART_minus_524: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*minus ::= subExprB '-'  subExprC .*/
    case ARTL_ART_minus_526: 
      subExprB1 = new ARTAT_ART_subExprB();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_minus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, minus, subExprB1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
       minus.o = FJ.minus(subExprB1.o, subExprC1.o); 
      break;
        default:
          throw new ARTException("ARTRD_minus: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_minusEquals(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_minusEquals minusEquals, ARTAT_ART_AID AID1, ARTAT_ART_subExprC subExprC1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*minusEquals ::= AID '-='  . subExprC ';'  */
    case ARTL_ART_minusEquals_502: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AID1));
      ARTRD_AID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AID1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*minusEquals ::= AID '-='  subExprC . ';'  */
    case ARTL_ART_minusEquals_504: 
      ARTRD_minusEquals(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, minusEquals, AID1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
            break;
    /*minusEquals ::= AID '-='  subExprC ';'  .*/
    case ARTL_ART_minusEquals_506: 
      AID1 = new ARTAT_ART_AID();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_minusEquals(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, minusEquals, AID1, subExprC1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       symbols.put(AID1.v, FJ.minus(symbols.get(AID1.v), subExprC1.o)); 
      break;
        default:
          throw new ARTException("ARTRD_minusEquals: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_multiply(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_multiply multiply, ARTAT_ART_subExprC subExprC1, ARTAT_ART_subExprD subExprD1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*multiply ::= subExprC '*'  . subExprD */
    case ARTL_ART_multiply_534: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*multiply ::= subExprC '*'  subExprD .*/
    case ARTL_ART_multiply_536: 
      subExprC1 = new ARTAT_ART_subExprC();
      subExprD1 = new ARTAT_ART_subExprD();
            ARTRD_multiply(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, multiply, subExprC1, subExprD1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprD1));
      ARTRD_subExprD(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprD1, null, null);
       multiply.o = FJ.multiply(subExprC1.o, subExprD1.o); 
      break;
        default:
          throw new ARTException("ARTRD_multiply: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_negate(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_negate negate, ARTAT_ART_subExprE subExprE1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*negate ::= '-'  subExprE .*/
    case ARTL_ART_negate_572: 
      subExprE1 = new ARTAT_ART_subExprE();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprE1));
      ARTRD_subExprE(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprE1, null, null, null);
      	try {
			negate.o = FJ.iv(subExprE1.o) * -1; 
		} catch (Exception FJException) {
			negate.o = FJ.dv(subExprE1.o) * -1;
		}
	
      break;
        default:
          throw new ARTException("ARTRD_negate: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_not(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_not not, ARTAT_ART_subExprE subExprE1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*not ::= '!'  subExprE .*/
    case ARTL_ART_not_564: 
      subExprE1 = new ARTAT_ART_subExprE();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprE1));
      ARTRD_subExprE(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprE1, null, null, null);
       not.o = !(FJ.bv(subExprE1.o)); 
      break;
        default:
          throw new ARTException("ARTRD_not: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_operand operand, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_REAL REAL1, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_deref deref1, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= deref .*/
    case ARTL_ART_operand_598: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), deref1));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, deref1, null);
       operand.o = symbols.get(deref1.v); 
      break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_604: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
       operand.o = INTEGER1.v; 
      break;
    /*operand ::= REAL .*/
    case ARTL_ART_operand_610: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
       operand.o = REAL1.v; 
      break;
    /*operand ::= 'true'  .*/
    case ARTL_ART_operand_616: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       operand.o = FJ.bv(true); 
      break;
    /*operand ::= 'false'  .*/
    case ARTL_ART_operand_622: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       operand.o = FJ.bv(false); 
      break;
    /*operand ::= STRING_DQ .*/
    case ARTL_ART_operand_628: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       operand.o = STRING_DQ1.v; 
      break;
    /*operand ::= '('  mainExpr . ')'  */
    case ARTL_ART_operand_636: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
            break;
    /*operand ::= '('  mainExpr ')'  .*/
    case ARTL_ART_operand_638: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       operand.o = mainExpr1.o; 
      break;
    /*operand ::= # .*/
    case ARTL_ART_operand_644: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      deref1 = new ARTAT_ART_deref();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, INTEGER1, REAL1, STRING_DQ1, deref1, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_or(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_or or, ARTAT_ART_subExprA subExprA1, ARTAT_ART_subExprA subExprA2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*or ::= subExprA '||'  . subExprA */
    case ARTL_ART_or_590: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprA1));
      ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprA1, null, null, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*or ::= subExprA '||'  subExprA .*/
    case ARTL_ART_or_592: 
      subExprA1 = new ARTAT_ART_subExprA();
      subExprA2 = new ARTAT_ART_subExprA();
            ARTRD_or(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, or, subExprA1, subExprA2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprA2));
      ARTRD_subExprA(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprA2, null, null, null, null, null, null);
       or.o = FJ.bv(subExprA1.o) || FJ.bv(subExprA2.o); 
      break;
        default:
          throw new ARTException("ARTRD_or: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_plus(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_plus plus, ARTAT_ART_subExprB subExprB1, ARTAT_ART_subExprC subExprC1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*plus ::= subExprB '+'  . subExprC */
    case ARTL_ART_plus_514: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*plus ::= subExprB '+'  subExprC .*/
    case ARTL_ART_plus_516: 
      subExprB1 = new ARTAT_ART_subExprB();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_plus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, plus, subExprB1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
       plus.o = FJ.plus(subExprB1.o, subExprC1.o); 
      break;
        default:
          throw new ARTException("ARTRD_plus: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_plusEquals(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_plusEquals plusEquals, ARTAT_ART_AID AID1, ARTAT_ART_subExprC subExprC1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*plusEquals ::= AID '+='  . subExprC ';'  */
    case ARTL_ART_plusEquals_490: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AID1));
      ARTRD_AID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AID1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*plusEquals ::= AID '+='  subExprC . ';'  */
    case ARTL_ART_plusEquals_492: 
      ARTRD_plusEquals(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, plusEquals, AID1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
            break;
    /*plusEquals ::= AID '+='  subExprC ';'  .*/
    case ARTL_ART_plusEquals_494: 
      AID1 = new ARTAT_ART_AID();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_plusEquals(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, plusEquals, AID1, subExprC1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       symbols.put(AID1.v, FJ.plus(symbols.get(AID1.v), subExprC1.o)); 
      break;
        default:
          throw new ARTException("ARTRD_plusEquals: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_scopeEnter(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*scopeEnter ::= '{'  .*/
    case ARTL_ART_scopeEnter_84: 
            ARTRD_scopeEnter(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       symbols.newScope(); 
      break;
        default:
          throw new ARTException("ARTRD_scopeEnter: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_scopeLeave(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*scopeLeave ::= '}'  .*/
    case ARTL_ART_scopeLeave_90: 
            ARTRD_scopeLeave(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       symbols.oldScope(); 
      break;
        default:
          throw new ARTException("ARTRD_scopeLeave: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_condStatement condStatement1, ARTAT_ART_loopStatement loopStatement1, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= defStruct .*/
    case ARTL_ART_statement_30: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_defStruct(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= loopStatement .*/
    case ARTL_ART_statement_34: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_loopStatement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, loopStatement1, null, null, null);
            break;
    /*statement ::= condStatement .*/
    case ARTL_ART_statement_38: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_condStatement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, condStatement1, null, null, null, null, null);
            break;
    /*statement ::= mainExpr .*/
    case ARTL_ART_statement_42: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
            break;
    /*statement ::= sysout .*/
    case ARTL_ART_statement_46: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sysout(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= sysline .*/
    case ARTL_ART_statement_50: 
      condStatement1 = new ARTAT_ART_condStatement();
      loopStatement1 = new ARTAT_ART_loopStatement();
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condStatement1, loopStatement1, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sysline(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statements ::= statement .*/
    case ARTL_ART_statements_4: 
            ARTRD_statements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*statements ::= statement statements .*/
    case ARTL_ART_statements_10: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_statements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_structArgs(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_structArgs structArgs, ARTAT_ART_arg arg1, ARTAT_ART_structArgs structArgs1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*structArgs ::= arg ','  . structArgs */
    case ARTL_ART_structArgs_450: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), arg1));
      ARTRD_arg(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, arg1, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       ArrayList<FJNamedObj> classMemberVars = FJ.structsMValues.get(FJArgStack.getCurType());
	      int maxArgs = classMemberVars.size();
		  FJArgStack.incrArgIndex();
		  FJNamedObj curNamedObj; 
		  try {
			curNamedObj = classMemberVars.get(FJArgStack.getArgIndex());
		  } catch (Exception FJException) {
			return;
		  }
		  String curMemberName = curNamedObj.name;
		  Object curMemberObj = arg1.o;
		  @SuppressWarnings("unchecked")
		  HashMap<String, Object> curIDMembers 
		      = (HashMap<String, Object>) symbols.get(FJArgStack.getCurID());
		  curIDMembers.put(curMemberName, curMemberObj);
		  // curIDMembers is the memberName, memberObject hashmap of the variable
	  
      break;
    /*structArgs ::= arg ','  structArgs .*/
    case ARTL_ART_structArgs_454: 
      arg1 = new ARTAT_ART_arg();
      structArgs1 = new ARTAT_ART_structArgs();
            ARTRD_structArgs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, structArgs, arg1, structArgs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), structArgs1));
      ARTRD_structArgs(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, structArgs1, null, null);
            break;
    /*structArgs ::= arg .*/
    case ARTL_ART_structArgs_458: 
      arg1 = new ARTAT_ART_arg();
      structArgs1 = new ARTAT_ART_structArgs();
            ARTRD_structArgs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, structArgs, arg1, structArgs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), arg1));
      ARTRD_arg(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, arg1, null);
       @SuppressWarnings("unchecked")
		  ArrayList<FJNamedObj> classMemberVars1 
			= FJ.structsMValues.get(FJArgStack.getCurType());
		  String curType = FJArgStack.getCurType();
		  int argc = FJArgStack.getArgCount();
		  int maxArgs1 = classMemberVars1.size();
		  if (argc > maxArgs1) {
			  System.err.println(
			      "ArgError: [" + FJArgStack.getCurID()
				+ "] too many arguments for struct type " + curType
				+ " (got " + argc + "; expected up to " + maxArgs1 + ")");
			  FJArgStack.setArgCount(-1);
			  FJArgStack.incrArgIndex();
			  return;
		  }
		  Object curMemberObj1;
		  if (NO_ARG.equals(arg1.o.toString())) {
			  return;
		  } else {
	          curMemberObj1 = arg1.o;
			  FJArgStack.incrArgIndex();
		  }
		  if (FJArgStack.getArgIndex() > maxArgs1 - 1) {
		      return;
		  }
		  FJNamedObj curNamedObj1 = classMemberVars1.get(FJArgStack.getArgIndex());
		  String curMemberName1 = curNamedObj1.name;
		  @SuppressWarnings("unchecked")
		  HashMap<String, Object> curIDMembers1 
		      = (HashMap<String, Object>) symbols.get(FJArgStack.getCurID());
		  curIDMembers1.put(curMemberName1, curMemberObj1);
	 
      break;
        default:
          throw new ARTException("ARTRD_structArgs: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_structAssign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2, ARTAT_ART_structArgs structArgs1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*structAssign ::= ID '<-'  . ID '('  structArgs ')'  ';'  */
    case ARTL_ART_structAssign_428: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       symbols.put(ID1.v, new HashMap<String, Object>()); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*structAssign ::= ID '<-'  ID . '('  structArgs ')'  ';'  */
    case ARTL_ART_structAssign_430: 
      ARTRD_structAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, structArgs1);
      ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
       FJArgStack.push();
				FJArgStack.setCurType(ID2.v);
				FJArgStack.setCurID(ID1.v); 
      break;
    /*structAssign ::= ID '<-'  ID '('  . structArgs ')'  ';'  */
    case ARTL_ART_structAssign_434: 
      ARTRD_structAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, structArgs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*structAssign ::= ID '<-'  ID '('  structArgs . ')'  ';'  */
    case ARTL_ART_structAssign_436: 
      ARTRD_structAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, structArgs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), structArgs1));
      ARTRD_structArgs(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, structArgs1, null, null);
            break;
    /*structAssign ::= ID '<-'  ID '('  structArgs ')'  . ';'  */
    case ARTL_ART_structAssign_438: 
      ARTRD_structAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, structArgs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
		  int argi = FJArgStack.getArgIndex();
	      ArrayList<FJNamedObj> classMemberVars = FJ.structsMValues.get(FJArgStack.getCurType());
		  int maxArgs = classMemberVars.size();
		  if (argi > maxArgs - 1) {
				FJ.symbols.remove(FJArgStack.getCurID());
				return;
		  }
		  @SuppressWarnings("unchecked")
		  HashMap<String, Object> curIDMembers
			= (HashMap<String, Object>) symbols.get(FJArgStack.getCurID());
		  FJNamedObj classMember;
		  for (int i = argi + 1; i < maxArgs; i++) {
		      classMember = classMemberVars.get(i);
			  curIDMembers.put(classMember.name, classMember.obj);
		  }
		
      break;
    /*structAssign ::= ID '<-'  ID '('  structArgs ')'  ';'  .*/
    case ARTL_ART_structAssign_442: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      structArgs1 = new ARTAT_ART_structArgs();
            ARTRD_structAssign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, structArgs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       FJArgStack.pop(); 
      break;
        default:
          throw new ARTException("ARTRD_structAssign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_structDefinition(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*structDefinition ::= '{'  structStatements . '}'  statements */
    case ARTL_ART_structDefinition_56: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_structStatements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*structDefinition ::= '{'  structStatements '}'  . statements */
    case ARTL_ART_structDefinition_58: 
      ARTRD_structDefinition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*structDefinition ::= '{'  structStatements '}'  statements .*/
    case ARTL_ART_structDefinition_60: 
            ARTRD_structDefinition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*structDefinition ::= structStatement statements .*/
    case ARTL_ART_structDefinition_66: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_structStatement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_structDefinition: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_structStatement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*structStatement ::= memberAssign .*/
    case ARTL_ART_structStatement_80: 
            ARTRD_structStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_memberAssign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_structStatement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_structStatements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*structStatements ::= structStatement .*/
    case ARTL_ART_structStatements_70: 
            ARTRD_structStatements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_structStatement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*structStatements ::= structStatement structStatements .*/
    case ARTL_ART_structStatements_76: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_structStatement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_structStatements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_structStatements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprA(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprA subExprA, ARTAT_ART_and and1, ARTAT_ART_equ equ1, ARTAT_ART_gtr gtr1, ARTAT_ART_lss lss1, ARTAT_ART_or or1, ARTAT_ART_subExprB subExprB1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprA ::= subExprB .*/
    case ARTL_ART_subExprA_262: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprB1));
      ARTRD_subExprB(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprB1, null, null, null);
       subExprA.o = subExprB1.o; 
      break;
    /*subExprA ::= and .*/
    case ARTL_ART_subExprA_268: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), and1));
      ARTRD_and(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, and1, null, null);
       subExprA.o = and1.o; 
      break;
    /*subExprA ::= or .*/
    case ARTL_ART_subExprA_274: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), or1));
      ARTRD_or(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, or1, null, null);
       subExprA.o = or1.o;  
      break;
    /*subExprA ::= gtr .*/
    case ARTL_ART_subExprA_280: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), gtr1));
      ARTRD_gtr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, gtr1, null, null);
       subExprA.o = gtr1.o; 
      break;
    /*subExprA ::= lss .*/
    case ARTL_ART_subExprA_286: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), lss1));
      ARTRD_lss(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, lss1, null, null);
       subExprA.o = lss1.o; 
      break;
    /*subExprA ::= equ .*/
    case ARTL_ART_subExprA_292: 
      and1 = new ARTAT_ART_and();
      equ1 = new ARTAT_ART_equ();
      gtr1 = new ARTAT_ART_gtr();
      lss1 = new ARTAT_ART_lss();
      or1 = new ARTAT_ART_or();
      subExprB1 = new ARTAT_ART_subExprB();
            ARTRD_subExprA(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprA, and1, equ1, gtr1, lss1, or1, subExprB1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), equ1));
      ARTRD_equ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, equ1, null, null);
       subExprA.o = equ1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprA: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprB(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprB subExprB, ARTAT_ART_minus minus1, ARTAT_ART_plus plus1, ARTAT_ART_subExprC subExprC1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprB ::= subExprC .*/
    case ARTL_ART_subExprB_298: 
      minus1 = new ARTAT_ART_minus();
      plus1 = new ARTAT_ART_plus();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprB, minus1, plus1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprC1));
      ARTRD_subExprC(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprC1, null, null, null);
       subExprB.o = subExprC1.o; 
      break;
    /*subExprB ::= plus .*/
    case ARTL_ART_subExprB_304: 
      minus1 = new ARTAT_ART_minus();
      plus1 = new ARTAT_ART_plus();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprB, minus1, plus1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), plus1));
      ARTRD_plus(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, plus1, null, null);
       subExprB.o = plus1.o; 
      break;
    /*subExprB ::= minus .*/
    case ARTL_ART_subExprB_310: 
      minus1 = new ARTAT_ART_minus();
      plus1 = new ARTAT_ART_plus();
      subExprC1 = new ARTAT_ART_subExprC();
            ARTRD_subExprB(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprB, minus1, plus1, subExprC1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), minus1));
      ARTRD_minus(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, minus1, null, null);
       subExprB.o = minus1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprB: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprC(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprC subExprC, ARTAT_ART_divide divide1, ARTAT_ART_multiply multiply1, ARTAT_ART_subExprD subExprD1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprC ::= subExprD .*/
    case ARTL_ART_subExprC_316: 
      divide1 = new ARTAT_ART_divide();
      multiply1 = new ARTAT_ART_multiply();
      subExprD1 = new ARTAT_ART_subExprD();
            ARTRD_subExprC(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprC, divide1, multiply1, subExprD1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprD1));
      ARTRD_subExprD(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprD1, null, null);
       subExprC.o = subExprD1.o; 
      break;
    /*subExprC ::= multiply .*/
    case ARTL_ART_subExprC_322: 
      divide1 = new ARTAT_ART_divide();
      multiply1 = new ARTAT_ART_multiply();
      subExprD1 = new ARTAT_ART_subExprD();
            ARTRD_subExprC(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprC, divide1, multiply1, subExprD1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), multiply1));
      ARTRD_multiply(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, multiply1, null, null);
       subExprC.o = multiply1.o; 
      break;
    /*subExprC ::= divide .*/
    case ARTL_ART_subExprC_328: 
      divide1 = new ARTAT_ART_divide();
      multiply1 = new ARTAT_ART_multiply();
      subExprD1 = new ARTAT_ART_subExprD();
            ARTRD_subExprC(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprC, divide1, multiply1, subExprD1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), divide1));
      ARTRD_divide(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, divide1, null, null);
       subExprC.o = divide1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprC: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprD(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprD subExprD, ARTAT_ART_exponentiate exponentiate1, ARTAT_ART_subExprE subExprE1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprD ::= subExprE .*/
    case ARTL_ART_subExprD_334: 
      exponentiate1 = new ARTAT_ART_exponentiate();
      subExprE1 = new ARTAT_ART_subExprE();
            ARTRD_subExprD(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprD, exponentiate1, subExprE1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprE1));
      ARTRD_subExprE(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprE1, null, null, null);
       subExprD.o = subExprE1.o; 
      break;
    /*subExprD ::= exponentiate .*/
    case ARTL_ART_subExprD_340: 
      exponentiate1 = new ARTAT_ART_exponentiate();
      subExprE1 = new ARTAT_ART_subExprE();
            ARTRD_subExprD(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprD, exponentiate1, subExprE1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), exponentiate1));
      ARTRD_exponentiate(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, exponentiate1, null, null);
       subExprD.o = exponentiate1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprD: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprE(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprE subExprE, ARTAT_ART_negate negate1, ARTAT_ART_not not1, ARTAT_ART_subExprF subExprF1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprE ::= subExprF .*/
    case ARTL_ART_subExprE_346: 
      negate1 = new ARTAT_ART_negate();
      not1 = new ARTAT_ART_not();
      subExprF1 = new ARTAT_ART_subExprF();
            ARTRD_subExprE(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprE, negate1, not1, subExprF1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExprF1));
      ARTRD_subExprF(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExprF1, null);
       subExprE.o = subExprF1.o; 
      break;
    /*subExprE ::= not .*/
    case ARTL_ART_subExprE_352: 
      negate1 = new ARTAT_ART_negate();
      not1 = new ARTAT_ART_not();
      subExprF1 = new ARTAT_ART_subExprF();
            ARTRD_subExprE(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprE, negate1, not1, subExprF1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), not1));
      ARTRD_not(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, not1, null);
       subExprE.o = not1.o; 
      break;
    /*subExprE ::= negate .*/
    case ARTL_ART_subExprE_358: 
      negate1 = new ARTAT_ART_negate();
      not1 = new ARTAT_ART_not();
      subExprF1 = new ARTAT_ART_subExprF();
            ARTRD_subExprE(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprE, negate1, not1, subExprF1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), negate1));
      ARTRD_negate(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, negate1, null);
       subExprE.o = negate1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprE: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExprF(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExprF subExprF, ARTAT_ART_operand operand1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExprF ::= operand .*/
    case ARTL_ART_subExprF_364: 
      operand1 = new ARTAT_ART_operand();
            ARTRD_subExprF(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExprF, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null, null, null);
       subExprF.o = operand1.o; 
      break;
        default:
          throw new ARTException("ARTRD_subExprF: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_sysline(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*sysline ::= 'sysline'  '('  . mainExpr ')'  ';'  */
    case ARTL_ART_sysline_228: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*sysline ::= 'sysline'  '('  mainExpr . ')'  ';'  */
    case ARTL_ART_sysline_230: 
      ARTRD_sysline(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
            break;
    /*sysline ::= 'sysline'  '('  mainExpr ')'  . ';'  */
    case ARTL_ART_sysline_232: 
      ARTRD_sysline(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       System.out.println(mainExpr1.o); 
      break;
    /*sysline ::= 'sysline'  '('  mainExpr ')'  ';'  .*/
    case ARTL_ART_sysline_236: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_sysline(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_sysline: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_sysout(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*sysout ::= 'sysout'  '('  . mainExpr ')'  ';'  */
    case ARTL_ART_sysout_214: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*sysout ::= 'sysout'  '('  mainExpr . ')'  ';'  */
    case ARTL_ART_sysout_216: 
      ARTRD_sysout(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
            break;
    /*sysout ::= 'sysout'  '('  mainExpr ')'  . ';'  */
    case ARTL_ART_sysout_218: 
      ARTRD_sysout(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       System.out.print(mainExpr1.o); 
      break;
    /*sysout ::= 'sysout'  '('  mainExpr ')'  ';'  .*/
    case ARTL_ART_sysout_222: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            ARTRD_sysout(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, mainExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_sysout: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_untilExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_untilExpr untilExpr, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*untilExpr ::= 'until'  mainExpr .*/
    case ARTL_ART_untilExpr_190: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
       untilExpr.o = mainExpr1.o; 
      break;
        default:
          throw new ARTException("ARTRD_untilExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_whileExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_whileExpr whileExpr, ARTAT_ART_mainExpr mainExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*whileExpr ::= 'while'  mainExpr .*/
    case ARTL_ART_whileExpr_182: 
      mainExpr1 = new ARTAT_ART_mainExpr();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), mainExpr1));
      ARTRD_mainExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, mainExpr1, null);
       whileExpr.o = mainExpr1.o; 
      break;
        default:
          throw new ARTException("ARTRD_whileExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_AID:  ARTRD_AID(artElement.element, artParent, artWriteable, (ARTAT_ART_AID) artAttributes, null, null); break;
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_REAL:  ARTRD_REAL(artElement.element, artParent, artWriteable, (ARTAT_ART_REAL) artAttributes); break;
    case ARTL_ART_STRING_DQ:  ARTRD_STRING_DQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_DQ) artAttributes); break;
    case ARTL_ART_and:  ARTRD_and(artElement.element, artParent, artWriteable, (ARTAT_ART_and) artAttributes, null, null); break;
    case ARTL_ART_arg:  ARTRD_arg(artElement.element, artParent, artWriteable, (ARTAT_ART_arg) artAttributes, null); break;
    case ARTL_ART_argNote: ARTRD_argNote(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null, null, null, null); break;
    case ARTL_ART_compStatements: ARTRD_compStatements(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_condStatement:  ARTRD_condStatement(artElement.element, artParent, artWriteable, (ARTAT_ART_condStatement) artAttributes, null, null, null, null, null); break;
    case ARTL_ART_defStruct: ARTRD_defStruct(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_deref:  ARTRD_deref(artElement.element, artParent, artWriteable, (ARTAT_ART_deref) artAttributes, null); break;
    case ARTL_ART_divide:  ARTRD_divide(artElement.element, artParent, artWriteable, (ARTAT_ART_divide) artAttributes, null, null); break;
    case ARTL_ART_elifExpr:  ARTRD_elifExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_elifExpr) artAttributes, null); break;
    case ARTL_ART_equ:  ARTRD_equ(artElement.element, artParent, artWriteable, (ARTAT_ART_equ) artAttributes, null, null); break;
    case ARTL_ART_exponentiate:  ARTRD_exponentiate(artElement.element, artParent, artWriteable, (ARTAT_ART_exponentiate) artAttributes, null, null); break;
    case ARTL_ART_gtr:  ARTRD_gtr(artElement.element, artParent, artWriteable, (ARTAT_ART_gtr) artAttributes, null, null); break;
    case ARTL_ART_ifExpr:  ARTRD_ifExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_ifExpr) artAttributes, null); break;
    case ARTL_ART_loopStatement:  ARTRD_loopStatement(artElement.element, artParent, artWriteable, (ARTAT_ART_loopStatement) artAttributes, null, null, null); break;
    case ARTL_ART_lss:  ARTRD_lss(artElement.element, artParent, artWriteable, (ARTAT_ART_lss) artAttributes, null, null); break;
    case ARTL_ART_mainExpr:  ARTRD_mainExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_mainExpr) artAttributes, null); break;
    case ARTL_ART_memberAssign: ARTRD_memberAssign(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_minus:  ARTRD_minus(artElement.element, artParent, artWriteable, (ARTAT_ART_minus) artAttributes, null, null); break;
    case ARTL_ART_minusEquals:  ARTRD_minusEquals(artElement.element, artParent, artWriteable, (ARTAT_ART_minusEquals) artAttributes, null, null); break;
    case ARTL_ART_multiply:  ARTRD_multiply(artElement.element, artParent, artWriteable, (ARTAT_ART_multiply) artAttributes, null, null); break;
    case ARTL_ART_negate:  ARTRD_negate(artElement.element, artParent, artWriteable, (ARTAT_ART_negate) artAttributes, null); break;
    case ARTL_ART_not:  ARTRD_not(artElement.element, artParent, artWriteable, (ARTAT_ART_not) artAttributes, null); break;
    case ARTL_ART_operand:  ARTRD_operand(artElement.element, artParent, artWriteable, (ARTAT_ART_operand) artAttributes, null, null, null, null, null); break;
    case ARTL_ART_or:  ARTRD_or(artElement.element, artParent, artWriteable, (ARTAT_ART_or) artAttributes, null, null); break;
    case ARTL_ART_plus:  ARTRD_plus(artElement.element, artParent, artWriteable, (ARTAT_ART_plus) artAttributes, null, null); break;
    case ARTL_ART_plusEquals:  ARTRD_plusEquals(artElement.element, artParent, artWriteable, (ARTAT_ART_plusEquals) artAttributes, null, null); break;
    case ARTL_ART_scopeEnter: ARTRD_scopeEnter(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_scopeLeave: ARTRD_scopeLeave(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_statements: ARTRD_statements(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_structArgs:  ARTRD_structArgs(artElement.element, artParent, artWriteable, (ARTAT_ART_structArgs) artAttributes, null, null); break;
    case ARTL_ART_structAssign: ARTRD_structAssign(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_structDefinition: ARTRD_structDefinition(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_structStatement: ARTRD_structStatement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_structStatements: ARTRD_structStatements(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_subExprA:  ARTRD_subExprA(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprA) artAttributes, null, null, null, null, null, null); break;
    case ARTL_ART_subExprB:  ARTRD_subExprB(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprB) artAttributes, null, null, null); break;
    case ARTL_ART_subExprC:  ARTRD_subExprC(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprC) artAttributes, null, null, null); break;
    case ARTL_ART_subExprD:  ARTRD_subExprD(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprD) artAttributes, null, null); break;
    case ARTL_ART_subExprE:  ARTRD_subExprE(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprE) artAttributes, null, null, null); break;
    case ARTL_ART_subExprF:  ARTRD_subExprF(artElement.element, artParent, artWriteable, (ARTAT_ART_subExprF) artAttributes, null); break;
    case ARTL_ART_sysline: ARTRD_sysline(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_sysout: ARTRD_sysout(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_untilExpr:  ARTRD_untilExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_untilExpr) artAttributes, null); break;
    case ARTL_ART_whileExpr:  ARTRD_whileExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_whileExpr) artAttributes, null); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
