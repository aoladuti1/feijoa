@echo off
cd Parsing
set projectFolder=../Projects
set arthome=.
set project=%projectFolder%/%1.fj
java -classpath .;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%project%' +phaseAG