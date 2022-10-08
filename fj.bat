@echo off
if '%1'=='-p' call Parsing/parse %2
if '%1'=='-r' call Parsing/run %2