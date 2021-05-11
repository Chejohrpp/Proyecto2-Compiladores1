echo "STARTING JFLEX COMPILING"
java -jar ../jflex-full-1.8.2.jar lexerInsert.flex
echo ""
echo "STARTING CUP COMPILING"
java -jar ../java-cup-11b.jar -parser ParserInsert -symbols symInsert parserInsert.cup
echo "PRESIONE ENTER PARA SALIR"
 read -p "$*"