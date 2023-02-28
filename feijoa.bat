@echo off
set old=%CD%
set fei=Feijoa
for %%Q in ("%~dp0.") DO set "arthome=%%~fQ"
set "arthome=%arthome%\Parsing"
set "project=%cd%\%2"
if /I "%project:~-3%" neq ".fj" (
	set "project=%project%.fj"
)
cd %~dp0\Parsing
if '%1'=='-p' (
java -classpath .;%arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %arthome%\%fei%.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
)
if not '%2'=='' (
	if not '%1'=='-r' (
		java -classpath .;%arthome%/art.jar ARTTest %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%project%' +phaseAG
	)
)
if '%1'=='-r' (
	java -classpath .;%arthome%/art.jar ARTTest %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%project%' +phaseAG
)
cd %old%