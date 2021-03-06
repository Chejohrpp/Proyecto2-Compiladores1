// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexerDB.flex

/*Codigo importado*/
package com.mycompany.p2c1.ReglasGram.DB;
import com.mycompany.p2c1.ReglasGram.Token;
import java_cup.runtime.*;
import static com.mycompany.p2c1.ReglasGram.DB.symDB.*;
import java.util.ArrayList;
import java.util.List;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class LexerDB implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\3\0\1\4\3\0\1\5\1\6\20\0\1\7\1\10"+
    "\1\0\1\11\3\0\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\0\1\32\1\33\1\34\1\35"+
    "\1\36\3\0\1\37\1\40\1\0\1\41\1\0\1\42"+
    "\33\0\1\43\1\0\1\44\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\14\1\1\10\1\11\4\0\1\12\42\0\1\13\1\14"+
    "\5\0\1\15\16\0\1\16\5\0\1\17\10\0\1\20"+
    "\2\0\1\21\11\0\1\22\1\0\1\23\5\0\1\24"+
    "\2\0\1\25\13\0\1\26\5\0\1\27\10\0\1\30"+
    "\3\0\1\31\1\0\1\32\2\0\1\33\1\0\1\34"+
    "\2\0\1\35\7\0\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\45\0\112\0\45\0\45\0\45\0\45"+
    "\0\45\0\157\0\224\0\271\0\336\0\u0103\0\u0128\0\u014d"+
    "\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\45\0\45\0\u022b"+
    "\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4\0\u0309\0\u032e\0\u0353"+
    "\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b"+
    "\0\u04a0\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3"+
    "\0\u05c8\0\u05ed\0\u0612\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb"+
    "\0\u06f0\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9\0\45\0\45"+
    "\0\u07ce\0\u07f3\0\u0818\0\u083d\0\u0862\0\45\0\u0887\0\u08ac"+
    "\0\u08d1\0\u08f6\0\u091b\0\u0940\0\u0965\0\u098a\0\u09af\0\u09d4"+
    "\0\u09f9\0\u0a1e\0\u0a43\0\u0a68\0\45\0\u0a8d\0\u0ab2\0\u0ad7"+
    "\0\u0afc\0\u0b21\0\45\0\u0b46\0\u0b6b\0\u0b90\0\u0bb5\0\u0bda"+
    "\0\u0bff\0\u0c24\0\u0c49\0\45\0\u0c6e\0\u0c93\0\u0cb8\0\u0cdd"+
    "\0\u0d02\0\u0d27\0\u0d4c\0\u0d71\0\u0d96\0\u0dbb\0\u0de0\0\u0e05"+
    "\0\45\0\u0e2a\0\45\0\u0e4f\0\u0e74\0\u0e99\0\u0ebe\0\u0ee3"+
    "\0\45\0\u0f08\0\u0f2d\0\45\0\u0f52\0\u0f77\0\u0f9c\0\u0fc1"+
    "\0\u0fe6\0\u100b\0\u1030\0\u1055\0\u107a\0\u109f\0\u10c4\0\45"+
    "\0\u10e9\0\u110e\0\u1133\0\u1158\0\u117d\0\45\0\u11a2\0\u11c7"+
    "\0\u11ec\0\u1211\0\u1236\0\u125b\0\u1280\0\u12a5\0\45\0\u12ca"+
    "\0\u12ef\0\u1314\0\45\0\u1339\0\45\0\u135e\0\u1383\0\45"+
    "\0\u13a8\0\45\0\u13cd\0\u13f2\0\u1417\0\u143c\0\u1461\0\u1486"+
    "\0\u14ab\0\u14d0\0\u14f5\0\u151a\0\45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\1\13\2\2\1\14\2\2\1\15"+
    "\2\2\1\16\1\17\1\20\1\2\1\21\1\2\1\22"+
    "\1\23\1\2\1\24\1\2\1\25\2\2\1\26\1\27"+
    "\47\0\1\3\56\0\1\30\42\0\1\31\15\0\1\32"+
    "\26\0\1\33\47\0\1\34\41\0\1\35\7\0\1\36"+
    "\52\0\1\37\44\0\1\40\44\0\1\41\1\0\1\42"+
    "\34\0\1\43\44\0\1\44\34\0\1\45\36\0\1\46"+
    "\62\0\1\47\51\0\1\50\1\0\1\51\30\0\1\52"+
    "\54\0\1\53\35\0\1\54\61\0\1\55\40\0\1\56"+
    "\32\0\1\57\55\0\1\60\13\0\1\61\35\0\1\62"+
    "\41\0\1\63\42\0\1\64\47\0\1\65\40\0\1\66"+
    "\60\0\1\67\21\0\1\70\62\0\1\71\44\0\1\72"+
    "\32\0\1\73\47\0\1\74\46\0\1\75\51\0\1\76"+
    "\34\0\1\77\50\0\1\100\27\0\1\101\47\0\1\102"+
    "\50\0\1\103\36\0\1\104\43\0\1\105\61\0\1\106"+
    "\44\0\1\107\14\0\40\67\1\110\4\67\32\0\1\111"+
    "\54\0\1\112\16\0\1\113\50\0\1\114\54\0\1\115"+
    "\50\0\1\116\52\0\1\117\34\0\1\120\35\0\1\121"+
    "\35\0\1\122\46\0\1\123\56\0\1\124\46\0\1\125"+
    "\12\0\4\67\1\126\40\67\34\0\1\127\45\0\1\130"+
    "\30\0\1\131\53\0\1\132\47\0\1\133\33\0\1\134"+
    "\41\0\1\135\43\0\1\136\44\0\1\137\50\0\1\140"+
    "\37\0\1\141\15\0\1\142\36\0\1\143\17\0\41\67"+
    "\1\144\3\67\30\0\1\145\50\0\1\146\22\0\1\147"+
    "\74\0\1\150\21\0\1\151\43\0\1\152\70\0\1\153"+
    "\16\0\1\154\60\0\1\155\36\0\1\156\52\0\1\157"+
    "\44\0\1\160\47\0\1\161\33\0\1\162\55\0\1\163"+
    "\32\0\1\164\45\0\1\165\36\0\1\166\44\0\1\167"+
    "\65\0\1\170\36\0\1\171\43\0\1\172\60\0\1\173"+
    "\35\0\1\174\36\0\1\175\53\0\1\176\24\0\1\177"+
    "\51\0\1\200\35\0\1\201\46\0\1\202\52\0\1\203"+
    "\37\0\1\204\51\0\1\205\50\0\1\206\30\0\1\207"+
    "\44\0\1\210\63\0\1\211\35\0\1\212\40\0\1\213"+
    "\44\0\1\214\65\0\1\215\32\0\1\216\34\0\1\217"+
    "\63\0\1\220\40\0\1\221\43\0\1\222\31\0\1\223"+
    "\42\0\1\224\62\0\1\225\30\0\1\226\57\0\1\227"+
    "\51\0\1\230\35\0\1\231\34\0\1\232\61\0\1\233"+
    "\33\0\1\234\53\0\1\235\26\0\1\236\62\0\1\237"+
    "\26\0\1\240\64\0\1\241\45\0\1\242\23\0\1\243"+
    "\47\0\1\244\57\0\1\245\56\0\1\246\20\0\1\247"+
    "\61\0\1\250\45\0\1\251\42\0\1\252\47\0\1\253"+
    "\23\0\1\254\64\0\1\255\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5439];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\5\11\14\1\2\11\4\0\1\1"+
    "\42\0\2\11\5\0\1\11\16\0\1\11\5\0\1\11"+
    "\10\0\1\11\2\0\1\1\11\0\1\11\1\0\1\11"+
    "\5\0\1\11\2\0\1\11\13\0\1\11\5\0\1\11"+
    "\10\0\1\11\3\0\1\11\1\0\1\11\2\0\1\11"+
    "\1\0\1\11\2\0\1\1\7\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	private String quitar(String text){
		return text = text.substring(3, text.length() - 3);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerDB(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {   return new java_cup.runtime.Symbol(symDB.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Symbol(INVALID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 31: break;
          case 2:
            { /* ignorar */
            }
            // fall through
          case 32: break;
          case 3:
            { return new Symbol(PAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 33: break;
          case 4:
            { return new Symbol(PAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 34: break;
          case 5:
            { return new Symbol(DOS_PUNTOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 35: break;
          case 6:
            { return new Symbol(SEMI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 36: break;
          case 7:
            { return new Symbol(IGUAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 37: break;
          case 8:
            { return new Symbol(LLAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 38: break;
          case 9:
            { return new Symbol(LLAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));
            }
            // fall through
          case 39: break;
          case 10:
            { return new Symbol(ID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 40: break;
          case 11:
            { return new Symbol(LINK,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 41: break;
          case 12:
            { return new Symbol(MODO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 42: break;
          case 13:
            { return new Symbol(TIPO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 43: break;
          case 14:
            { return new Symbol(VALOR,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 44: break;
          case 15:
            { return new Symbol(FALLOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 45: break;
          case 16:
            { return new Symbol(STRING,yyline+1,yycolumn+1, new Token(quitar(yytext()),yyline+1,yycolumn+1));
            }
            // fall through
          case 46: break;
          case 17:
            { return new Symbol(CAPTCHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 47: break;
          case 18:
            { return new Symbol(ACIERTOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 48: break;
          case 19:
            { return new Symbol(CAPTCHAS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 49: break;
          case 20:
            { return new Symbol(POSICION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 50: break;
          case 21:
            { return new Symbol(SIMBOLOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 51: break;
          case 22:
            { return new Symbol(LAST_FECHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 52: break;
          case 23:
            { return new Symbol(CODIGO_HTML,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 53: break;
          case 24:
            { return new Symbol(N_E,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 54: break;
          case 25:
            { return new Symbol(IDENTIFICADOR,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 55: break;
          case 26:
            { return new Symbol(PROCEDIMIENTO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 56: break;
          case 27:
            { return new Symbol(NOMBRE_CAPTCHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 57: break;
          case 28:
            { return new Symbol(CANT_UTILIZADOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 58: break;
          case 29:
            { return new Symbol(P_D,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 59: break;
          case 30:
            { return new Symbol(P_D_E,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 ));
            }
            // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
