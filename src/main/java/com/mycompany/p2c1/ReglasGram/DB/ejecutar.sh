echo "STARTING JFLEX COMPILING"
java -jar ../jflex-full-1.8.2.jar lexerDB.flex
echo ""
echo "STARTING CUP COMPILING"
java -jar ../java-cup-11b.jar -parser ParserDB -symbols symDB parserDB.cup
echo "PRESIONE ENTER PARA SALIR"
 read -p "$*"