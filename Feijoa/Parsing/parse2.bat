@echo off
cd Parsing
set fei=Feijoa
set projectFolder=../Projects
set arthome=.
set project=%projectFolder%/%1.fj
java -classpath .;%arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %arthome%/%fei%.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java >NUL
java -classpath .;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%project%' +phaseAG
